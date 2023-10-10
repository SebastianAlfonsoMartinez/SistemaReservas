package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

import java.time.LocalDate;

public class ReservaVehiculo extends Reserva implements ConfirmarReserva, ReservaExclusiva{

    private String marcaVehiculo;

    public ReservaVehiculo( Boolean estaActivaLaReserva, String marcaVehiculo, Persona persona ) {
        super(estaActivaLaReserva, persona);
        this.marcaVehiculo = marcaVehiculo;
    }

    @Override
    public void verDatosReserva() {
        System.out.println("Estos son los datos de tu reserva: \n Reserva a nombre de: "+ getPersona().getNombre() + "\nNumero documento: " + getPersona().getNumeroDocumento() +
                "\nNumero de contacto: " + getPersona().getNumeroContacto() + "\nReservaste un vehiculo de marca: " + this.marcaVehiculo );
    }


    public void confirmarReserva() {
        System.out.println("Reserva del vehiculo confirmada");
    }

    public void esExclusivaLaReserva() {
        switch (marcaVehiculo.toLowerCase()) {
            case "mercedes":
            case "bmw":
            case "porshe":
            case "audi":
            case "tesla":
                System.out.println("Reserva Exclusiva de vehiculo premium");
                break;
            default:
                System.out.println("La reserva del vehiculo no es exclusiva");
        }
    }
}
