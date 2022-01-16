package com.doctor.doctorappointmentsystem.repository;

import com.doctor.doctorappointmentsystem.model.entity.Slots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface SlotsRepository extends JpaRepository<Slots, String> {

    @Query(value = "select * from slots where slot_Id not in " +
            "(select slot_id from booking where doctor_id= :doctorId and booking_date = :bookingDate)",
            nativeQuery = true)
    List<Slots> findSlots(String doctorId, Date bookingDate);
}
