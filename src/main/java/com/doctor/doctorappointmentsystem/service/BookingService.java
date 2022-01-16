package com.doctor.doctorappointmentsystem.service;

import com.doctor.doctorappointmentsystem.exception.SlotNotFoundException;
import com.doctor.doctorappointmentsystem.model.BookingRequest;
import com.doctor.doctorappointmentsystem.model.entity.Booking;
import com.doctor.doctorappointmentsystem.model.entity.BookingKey;
import com.doctor.doctorappointmentsystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public String bookSlot(BookingRequest bookingRequest) throws ParseException {
        BookingKey bookingKey = bookingKey(bookingRequest);
        Booking booking = new Booking(null
                , bookingRequest.getPatientId()
                , bookingKey);
        Optional<Booking> bookingExists = bookingRepository.findById(bookingKey);
        if (bookingExists.isPresent()) {
            throw new SlotNotFoundException("Booking Already exists for particular doctor. Please try with different time slot");
        } else {
            bookingRepository.saveAndFlush(booking);
        }
        return "Booking Completed";
    }

    private BookingKey bookingKey(BookingRequest bookingRequest) throws ParseException {
        return new BookingKey(
                bookingRequest.getDoctorId(),
                new SimpleDateFormat("yyyy-mm-dd").parse(bookingRequest.getBookingDate()),
                bookingRequest.getSlotId());
    }
}
