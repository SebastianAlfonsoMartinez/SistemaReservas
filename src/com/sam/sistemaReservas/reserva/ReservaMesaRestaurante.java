package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaMesaRestaurante extends Reserva implements ConfirmarReserva , ReservaExclusiva{

    private String nombreRestaurante;

    public ReservaMesaRestaurante( Boolean estaActivaLaReserva, String nombreRestaurante, Persona persona) {
        super(estaActivaLaReserva, persona);
        this.nombreRestaurante = nombreRestaurante;
    }

    @Override
    public void verDatosReserva() {
        System.out.println("Estos son los datos de tu reserva: \n Reserva a nombre de: "+ getPersona().getNombre() + "\nNumero documento: " + getPersona().getNumeroDocumento() +
                "\nNumero de contacto: " + getPersona().getNumeroContacto() + "\nReservaste una mesa en el restaurante: " + this.nombreRestaurante );
    }

    public void confirmarReserva() {
        System.out.println("Reserva de la mesa del restaurante confirmada");

    }

    public void esExclusivaLaReserva() {
        switch (nombreRestaurante.toLowerCase()){
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
