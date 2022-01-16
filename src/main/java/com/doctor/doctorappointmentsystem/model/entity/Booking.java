package com.doctor.doctorappointmentsystem.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "booking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer bookingId;
    private String patientId;
    @EmbeddedId
    private BookingKey bookingKey;
}
