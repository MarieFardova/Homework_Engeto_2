package com.engeto.hotel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private Room room;
    private Guest guest1;
    public LocalDate bookingFrom;
    private int numberOfNights;
    private List<Guest> otherGuests;
    private boolean isTourist;

    //constructor
    public Booking(Room room, Guest guest1, LocalDate bookingFrom, int numberOfNights, List<Guest> otherGuests, boolean isTourist) {
        this.room = room;
        this.guest1 = guest1;
        this.bookingFrom = bookingFrom;
        this.numberOfNights = numberOfNights;
        this.otherGuests = new ArrayList<>();
        this.isTourist = isTourist;

    }

    //getter, setter
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest1() {
        return guest1;
    }

    public void setGuest1(Guest guest1) {
        this.guest1 = guest1;
    }

    public LocalDateTime getBookingFrom() {
        return bookingFrom;
    }

    public void setBookingFrom(LocalDate bookingFrom) {
        this.bookingFrom = bookingFrom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }


}
