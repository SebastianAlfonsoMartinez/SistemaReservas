package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public abstract class Reserva {

    private static int contadorId = 0;
    private Integer id;
    private LocalDate fechaHoraReserva;

    private String queEstaReservando;
    private Persona persona;

    public Reserva(LocalDate fechaHoraReserva, String queEstaReservando, Persona persona) {
        this.id = ++contadorId;
        this.fechaHoraReserva = LocalDate.now();
        this.queEstaReservando = queEstaReservando;
        this.persona = persona;
    }

    public LocalDate getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(LocalDate fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public String getQueEstaReservando() {
        return queEstaReservando;
    }

    public void setQueEstaReservando(String queEstaReservando) {
        this.queEstaReservando = queEstaReservando;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

/*    public void verDatosReserva() {

        System.out.println("Estos son los datos de tu reserva: \n Reserva a nombre de: "+ getPersona().getNombre() + "\nNumero documento: " + getPersona().getNumeroDocumento() +
                "\n " );
    }*/

}
