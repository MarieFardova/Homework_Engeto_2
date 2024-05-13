package com.engeto.hotel;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.time.LocalDate;
import java.util.ArrayList;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(new Guest("Adéla Malíková", LocalDate.of(1993, 3, 13)));
        guestList.add(new Guest("Jan Dvořáček", LocalDate.of(1995, 5, 5)));
        for (Guest guest : guestList) {
            System.out.println(guest);


        }
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