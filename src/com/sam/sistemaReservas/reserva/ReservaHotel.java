package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaHotel extends Reserva implements ConfirmarReserva, ReservaExclusiva {

    private String nombreHotel;

    public ReservaHotel(Boolean estaActivaLaReserva, String nombreHotel, Persona persona) {
        super(estaActivaLaReserva, persona);
        this.nombreHotel = nombreHotel;
    }

    @Override
    public void verDatosReserva() {
        System.out.println("Estos son los datos de tu reserva: " + "\nID reserva :" + getId() + "\n Reserva a nombre de: " + getPersona().getNombre() + "\nNumero documento: " + getPersona().getNumeroDocumento() +
                "\nNumero de contacto: " + getPersona().getNumeroContacto() + "\nReservaste una suit del hotel: " + this.nombreHotel + "\n Fecha y hora en la que se realizo la reserva " + getFechaHoraReserva());


    }

    @Override
    public void confirmarReserva() {
        System.out.println("Reserva del hotel confirmada");

    }

    public void esExclusivaLaReserva() {
        switch (nombreHotel.toLowerCase()) {
            case "criterion":
            case "La casa de tus suenos a un clic de distancia":
            case "el Cielo":
            case "matiz":
            case "Leo Cocina y Cava":
                System.out.println("La reserva es exlusiva en uno de los mejores restaurantes de Bogota");
                break;
            default:
                System.out.println("La reserva del restaurante no es exclusiva");

        }
    }
}
