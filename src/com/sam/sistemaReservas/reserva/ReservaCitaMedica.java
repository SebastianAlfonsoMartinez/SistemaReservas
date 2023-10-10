package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaCitaMedica extends Reserva implements ConfirmarReserva{

    private String nombreDoctor;

    public ReservaCitaMedica(Boolean estaActivaLaReserva, String nombreDoctor, Persona persona) {
        super(estaActivaLaReserva, persona);
        this.nombreDoctor = nombreDoctor;
    }


    @Override
    public void verDatosReserva() {
        System.out.println("Estos son los datos de tu reserva: " + "\nID reserva :" + getId() + "\n Reserva a nombre de: "+ getPersona().getNombre() + "\nNumero documento: " + getPersona().getNumeroDocumento() +
                "\nNumero de contacto: " + getPersona().getNumeroContacto() + "\nReservaste una cita medica con el doctor: " + this.nombreDoctor +"\n Fecha y hora en la que se realizo la reserva " + getFechaHoraReserva());
    }

    @Override
    public void confirmarReserva() {
        System.out.println("Reserva de cita medica confirmada");

    }
}
