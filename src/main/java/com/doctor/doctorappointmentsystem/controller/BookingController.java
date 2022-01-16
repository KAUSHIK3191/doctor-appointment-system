package com.doctor.doctorappointmentsystem.controller;

import com.doctor.doctorappointmentsystem.model.BookingRequest;
import com.doctor.doctorappointmentsystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookSlot")
    public ResponseEntity<String> bookSlot(@RequestBody BookingRequest bookingRequest)
            throws ParseException {
        return new ResponseEntity<String>(bookingService.bookSlot(bookingRequest),
                HttpStatus.CREATED);
    }
}
