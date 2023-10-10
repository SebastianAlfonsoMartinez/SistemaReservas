package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaCitaMedica extends Reserva{

    private String nombreDoctor;

    public ReservaCitaMedica(LocalDate fechaHoraReserva, String queEstaReservando, Persona persona, String nombreDoctor) {
        super(fechaHoraReserva, queEstaReservando, persona);
        this.nombreDoctor = nombreDoctor;
    }

}
