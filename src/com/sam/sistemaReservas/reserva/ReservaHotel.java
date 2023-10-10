package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaHotel extends Reserva{

    private String nombreHotel;

    public ReservaHotel(LocalDate fechaHoraReserva, String queEstaReservando, Persona persona, String nombreHotel) {
        super(fechaHoraReserva, queEstaReservando, persona);
        this.nombreHotel = nombreHotel;
    }
}
