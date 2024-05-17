package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {
    int roomId;
    int numberOfBed;
    boolean balcony;
    boolean seaView;
    BigDecimal price;


    //Constructor
    public Room(int roomId, int numberOfBed, boolean balcony, boolean seaView, int price) {
        this.roomId = roomId;
        this.numberOfBed = numberOfBed;
        this.balcony = balcony;
        this.seaView = seaView;
        this.price = BigDecimal.valueOf(price);
    }



    //getter, setter
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}


/* 1/ Potřebujeme evidovat hosty (guest), které ubytováváme v hotelu.
O každém hostu musíme uložit jméno, příjmení a datum narození.

2/ Hosty vždy ubytováváme na pokojích (room). Pokoj je identifikován svým číslem.
O každém pokoji chceme evidovat, kolik lůžek tam je (neřeš přistýlky apod.),
zda má pokoj balkón a zda má výhled na moře a jaká je cena pokoje za jednu noc (předpokládej,
že je cena pevnědaná bez ohledu na sezónu a počet ubytovaných).

3/ V rámci jedné rezervace (booking) vždy přiřazujeme pokoj jednomu nebo více hostům
na časové období mezi dvěma daty (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021).
Pobyt je buď pracovní, nebo rekreační (type of vacation).
Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace
(například list of bookings), které jsme v systému vytvořili a bude mít metodu, která
vypíše informace o všech rezervacích.

Tvým úkolem je:
Připravit třídy pro ukládání dat.
Vytvořit konstruktory a přístupové metody.
Poté vytvoř vzorovou testovací aplikaci v metodě main.*/