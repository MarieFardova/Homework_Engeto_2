package com.engeto.hotel;


import java.time.LocalDate;

public class Guest {

    private String name;
    private LocalDate birthDate;
    private Room room;
    private LocalDate bookingFrom;
    private LocalDate bookingTo;

    //construktor
    public Guest(String name, LocalDate birthDate, Room room, LocalDate bookingFrom, LocalDate bookingTo) {
        this.name = name;
        this.birthDate = birthDate;
        this.room = room;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;
    }

    public Guest(String adélaMalíková, LocalDate of) {

    }

    //Getter, Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getBookingFrom() {
        return bookingFrom;
    }

    public void setBookingFrom(LocalDate bookingFrom) {
        this.bookingFrom = bookingFrom;
    }

    public LocalDate getBookingTo() {
        return bookingTo;
    }

    public void setBookingTo(LocalDate bookingTo) {
        this.bookingTo = bookingTo;
    }
}
