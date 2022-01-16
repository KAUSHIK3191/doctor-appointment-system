package com.doctor.doctorappointmentsystem.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table
@Entity
@Getter
@Setter
public class Schedules {

    @Id
    private String doctorId;
    private String daysOfWeek;
}
