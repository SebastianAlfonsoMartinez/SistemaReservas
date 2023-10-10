package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public abstract class Reserva {

    private static int contadorId = 0;
    private Integer id;
    private LocalDate fechaHoraReserva;

    private Boolean estaActivaLaReserva;
    private Persona persona;

    public Reserva(Boolean estaActivaLaReserva, Persona persona) {
        this.id = ++contadorId;
        this.fechaHoraReserva = LocalDate.now();
        this.estaActivaLaReserva = estaActivaLaReserva;
        this.persona = persona;
    }

    public LocalDate getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(LocalDate fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }



    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public abstract void verDatosReserva();



}
