package com.scalar.alok.oops.bookmyshow.models;

import java.util.Date;
import java.util.List;

public class Booking extends BaseModel {
    private User bookedBy;
    private BookingStatus status;
    private List<ShowSeat> seats;
    private double amount;
    private Date bookedAt;
}
