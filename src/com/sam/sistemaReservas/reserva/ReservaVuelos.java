package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaVuelos extends Reserva{

    private String aerolinea;

    public ReservaVuelos(LocalDate fechaHoraReserva, String queEstaReservando, Persona persona, String aerolinea) {
        super(fechaHoraReserva, queEstaReservando, persona);
        this.aerolinea = aerolinea;
    }
}
