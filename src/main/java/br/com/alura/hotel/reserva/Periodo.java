package br.com.alura.hotel.reserva;

import java.time.LocalDate;

public class Periodo {

    private LocalDate checkin;
    private LocalDate checkout;

    public Periodo(LocalDate checkin, LocalDate checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Periodo{" +
                "checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }
}
