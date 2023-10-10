package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaMesaRestaurante extends Reserva{

    private String nombreHotel;

    public ReservaMesaRestaurante(LocalDate fechaHoraReserva, String queEstaReservando, Persona persona, String nombreHotel) {
        super(fechaHoraReserva, queEstaReservando, persona);
        this.nombreHotel = nombreHotel;
    }
}
