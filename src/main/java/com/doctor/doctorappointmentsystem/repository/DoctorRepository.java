package com.doctor.doctorappointmentsystem.repository;

import com.doctor.doctorappointmentsystem.model.entity.Doctor;
import com.doctor.doctorappointmentsystem.model.entity.Slots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, String> {

}
