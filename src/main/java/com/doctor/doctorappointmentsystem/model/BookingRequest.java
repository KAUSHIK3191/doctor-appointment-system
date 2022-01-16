package com.doctor.doctorappointmentsystem.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookingRequest {

    private String doctorId;
    private String patientId;
    private String slotId;
    private String bookingDate;
}
