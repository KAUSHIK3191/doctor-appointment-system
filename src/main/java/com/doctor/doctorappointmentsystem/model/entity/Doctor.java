package com.doctor.doctorappointmentsystem.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Doctor implements Serializable {

    @Id
    private String doctorId;
    private String doctorName;
    private String daysOfWeek;
}
