package com.doctor.doctorappointmentsystem.controller;

import com.doctor.doctorappointmentsystem.model.entity.Slots;
import com.doctor.doctorappointmentsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/slots/{doctorId}")
    public List<Slots> getSlotsByDoctorIdAndDate(@PathVariable String doctorId,
                                                 @RequestParam String bookingDate) throws ParseException {
        return doctorService.getSlotsByDoctorIdAndDate(doctorId, bookingDate);

    }

}