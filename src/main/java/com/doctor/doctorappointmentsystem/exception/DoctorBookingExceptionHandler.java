package com.doctor.doctorappointmentsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DoctorBookingExceptionHandler {

    @ExceptionHandler(SlotNotFoundException.class)
    public ResponseEntity<String> slotNotFound(SlotNotFoundException exception) {
        return new ResponseEntity<String>(
                exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
