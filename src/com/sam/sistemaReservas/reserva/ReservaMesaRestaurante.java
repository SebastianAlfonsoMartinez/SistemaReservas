package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaMesaRestaurante extends Reserva implements ConfirmarReserva {

    private String nombreRestaurante;

    public ReservaMesaRestaurante( Boolean estaActivaLaReserva, String nombreRestaurante, Persona persona) {
        super(estaActivaLaReserva, persona);
        this.nombreRestaurante = nombreRestaurante;
    }

    @Override
    public void verDatosReserva() {
        System.out.println("Estos son los datos de tu reserva: " + "\nID reserva :" + getId() + "\n Reserva a nombre de: "+ getPersona().getNombre() + "\nNumero documento: " + getPersona().getNumeroDocumento() +
                "\nNumero de contacto: " + getPersona().getNumeroContacto() + "\nReservaste una mesa en el restaurante: " + this.nombreRestaurante + "\n Fecha y hora en la que se realizo la reserva " + getFechaHoraReserva() );
    }

    public void confirmarReserva() {
        System.out.println("Reserva de la mesa del restaurante confirmada");

    }

}

