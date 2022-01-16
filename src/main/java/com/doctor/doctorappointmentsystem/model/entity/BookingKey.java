package com.doctor.doctorappointmentsystem.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Random;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingKey implements Serializable {

    private String doctorId;
    @Temporal(TemporalType.DATE)
    private Date bookingDate;
    private String slotId;

    @Override
    public boolean equals(Object o) {
        BookingKey bookingKey = (BookingKey) o;
        if (this.bookingDate.equals(bookingKey.getBookingDate())
                && this.doctorId.equals(bookingKey.getDoctorId())
                && this.slotId.equals(bookingKey.getSlotId())) {
            return true;
        } else {
            return false;
        }
    }
    //TODO
//    @Override
//    public int hashCode(){
//        return 0;
//    }
}
