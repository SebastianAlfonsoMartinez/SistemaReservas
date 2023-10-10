package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaHotel extends Reserva implements ConfirmarReserva{

    private String nombreHotel;

    public ReservaHotel(Boolean estaActivaLaReserva, String nombreHotel, Persona persona ) {
        super(estaActivaLaReserva, persona);
        this.nombreHotel = nombreHotel;
    }

    @Override
    public void verDatosReserva() {
        System.out.println("Estos son los datos de tu reserva: \n Reserva a nombre de: "+ getPersona().getNombre() + "\nNumero documento: " + getPersona().getNumeroDocumento() +
                "\nNumero de contacto: " + getPersona().getNumeroContacto() + "\nReservaste una suit del hotel: " + this.nombreHotel );


    }

    @Override
    public void confirmarReserva() {
        System.out.println("Reserva del hotel confirmada");

    }
}
