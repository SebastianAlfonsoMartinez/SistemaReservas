package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaVehiculo extends Reserva{

    private String MarcaVehiculo;

    public ReservaVehiculo(LocalDate fechaHoraReserva, String queEstaReservando, Persona persona, String marcaVehiculo) {
        super(fechaHoraReserva, queEstaReservando, persona);
        MarcaVehiculo = marcaVehiculo;
    }
}
