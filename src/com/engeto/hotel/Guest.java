package com.engeto.hotel;


import java.time.LocalDate;

public class Guest {

     String name;
     LocalDate birthDate;


    //constructor
    public Guest(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    //getter, setter
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
};




/*
    public void setRoomBook(Rooms room, LocalDate bookRoomFrom, LocalDate bookRoomTo) {
        this.room = room;
        this.bookRoomFrom = bookRoomFrom;
        this.bookRoomTo = bookRoomTo;
    }
    public String getRoomBook() {
        return name + "'s reservation - " + "room number:" + room.roomNumber + " form " + bookRoomFrom + " to " + bookRoomTo;
    }
    public String toString() {
        return String.format("Guest ID:\n name: %s \n date of born: %s \n",name, dateOfBorn );
    }
}*/