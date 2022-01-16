package com.doctor.doctorappointmentsystem.repository;

import com.doctor.doctorappointmentsystem.model.entity.Booking;
import com.doctor.doctorappointmentsystem.model.entity.BookingKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, BookingKey> {
}
