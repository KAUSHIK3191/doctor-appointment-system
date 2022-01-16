package com.doctor.doctorappointmentsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SlotNotFoundException extends RuntimeException{

    private String message;
}
