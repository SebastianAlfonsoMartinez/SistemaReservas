package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Reserva {

    private static int contadorId = 0;
    private Integer id;
    private LocalDateTime fechaHoraReserva;

    private Boolean estaActivaLaReserva;
    private Persona persona;

    public Reserva(Boolean estaActivaLaReserva, Persona persona) {
        this.id = ++contadorId;
        this.fechaHoraReserva = LocalDateTime.now();
        this.estaActivaLaReserva = estaActivaLaReserva;
        this.persona = persona;
    }

    public LocalDateTime getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(LocalDateTime fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public Integer getId() {
        return id;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public abstract void verDatosReserva();



}
