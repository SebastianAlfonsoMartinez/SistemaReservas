package com.sam.sistemaReservas.reserva;

import com.sam.sistemaReservas.persona.Persona;

public class ReservaVuelo extends Reserva implements  ConfirmarReserva{

    private String aerolinea;

    public ReservaVuelo(Boolean estaActivaLaReserva, String aerolinea, Persona persona ) {
        super(estaActivaLaReserva, persona);
        this.aerolinea = aerolinea;
    }

    @Override
    public void verDatosReserva() {
        System.out.println("Estos son los datos de tu reserva: " + "\nID reserva :" + getId() + "\n Reserva a nombre de: "+ getPersona().getNombre() + "\nNumero documento: " + getPersona().getNumeroDocumento() +
                "\nNumero de contacto: " + getPersona().getNumeroContacto() + "\nReservaste un vuelo en la aerolinea: " +
                this.aerolinea + "\n Fecha y hora en la que se realizo la reserva " + getFechaHoraReserva());
    }

    @Override
    public void confirmarReserva() {
        System.out.println("Reserva del vuelo confirmada");

    }
}
