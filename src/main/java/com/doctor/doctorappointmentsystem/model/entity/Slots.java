package com.doctor.doctorappointmentsystem.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Slots {

    @Id
    private String slotId;
    private String slotTime;
}
