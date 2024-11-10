package com.scalar.alok.oops.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    @ManyToOne
    private User bookedBy;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
    @ManyToMany
    private List<ShowSeat> seats;
    private double amount;
    private Date bookedAt;
    @OneToMany
    private List<Payment> payments;
}
/*

    Booking         User

 */
