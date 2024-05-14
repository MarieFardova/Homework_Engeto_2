package com.engeto.hotel;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Guest> guests = new ArrayList<>();
        List<Room> rooms = new ArrayList<>();
        List<Booking> bookings = new ArrayList<>();

        //guests - vytvoření a výpis
        guests.add(new Guest("Adéla Malíková", LocalDate.of(1993,3,13)));
        guests.add(new Guest("Jan Dvořáček", LocalDate.of(1995,5,5)));

        System.out.println("\nSeznam hostů:");
        for (Guest guest : guests) {
            System.out.println("Jméno hosta: " + guest.getName() + " (" + guest.getBirthDate() + ")"); }

        //rooms - vytvoření a výpis
        rooms.add(new Room(1, 1, TRUE, TRUE, 1000));
        rooms.add(new Room( 2, 2, TRUE, TRUE, 2000));
        rooms.add(new Room( 3, 3, FALSE, TRUE, 3000));

        System.out.println("\nSeznam pokojů:");
        for (Room room : rooms) {
            System.out.println("Číslo pokoje: " + room.roomId + ", počet lůžek: " + room.numberOfBed + ", cena za noc: " + room.price); }

        //booking- vytvoření a výpis rezervací
        bookings.add(new Booking(guests.get(0), rooms.get(0), LocalDate.of(2021, 7, 19), 7 , TRUE));
        bookings.add(new Booking(guests.get(0), rooms.get(2), LocalDate.of(2021, 9, 1), 13 , FALSE));
        bookings.get(1).getOtherGuests().add(guests.get(1)); // dodatečný host k předchozí rezervaci

        System.out.println("\nSeznam rezervací:");
        for (Booking booking : bookings) {
            System.out.println(new StringBuilder().append("Číslo pokoje: ").append(booking.getRoom().roomId).append(", jméno hosta: ").append(booking.getGuest1().name).append(", datum: ").append(booking.bookingFrom()).append(", počet nocí: ").append(booking.getNumberOfNights()).append(", cena: ").append(booking.getRoom().price).append("Kč").toString());
            for (Guest guest : booking.getOtherGuests()) // výpis dalších hostí (pokud jsou)
                System.out.println("    Jméno dalšího hosta: " + guest.getName() ); }


        }
    }


/*
Vytvoř hosty Adélu Malíkovou (narozena 13. 3. 1993) a Jana Dvořáčka (narozen 5.5.1995).
Vypiš na obrazovku jejich souhrnný popis ve formátu: Adéla Malíková (1993-03-13).
Jestli chceš, můžeš zkusit datum vypsat v českém formátu 13. 3. 1993.
Buď pomocí metod pro získání dne, měsíce a roku, nebo pomocí třídy pro formátování dat.
Obojí je v Javě k dipozici — jestli chceš, zkus použít internetový vyhledávač a najít řešení.
Vytvoř pokoje a vypiš na obrazovku jejich popis:
pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a výhledem
na moře.
pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.
Připrav rezervace:
pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
Vypiš seznam všech rezervací.
ODEVZDÁNÍ ÚKOLU
 */