package com.doctor.doctorappointmentsystem.service;

import com.doctor.doctorappointmentsystem.model.entity.Doctor;
import com.doctor.doctorappointmentsystem.model.entity.Slots;
import com.doctor.doctorappointmentsystem.repository.DoctorRepository;
import com.doctor.doctorappointmentsystem.repository.SlotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private SlotsRepository slotsRepository;

    public List<Slots> getSlotsByDoctorIdAndDate(String doctorId, String bookingDate) throws ParseException {
        Doctor doctor = doctorRepository.getById(doctorId);
        LocalDate date = LocalDate.parse(bookingDate);
        List<String> doctorDays = Arrays.asList(doctor.getDaysOfWeek().split(","));
        if(doctorDays.contains(date.getDayOfWeek().toString())){
            return slotsRepository
                    .findSlots(doctorId, new SimpleDateFormat("yyyy-mm-dd").parse(bookingDate));
        }
        return null;
    }
}
