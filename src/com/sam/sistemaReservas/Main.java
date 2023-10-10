package com.sam.sistemaReservas;

import com.sam.sistemaReservas.persona.Persona;
import com.sam.sistemaReservas.reserva.*;

public class Main {
    public static void main(String[] args) {
        Persona sebastian = new Persona("Sebastian", 1024558226, 315750688 );
        ReservaVuelo reservaVuelo = new ReservaVuelo(true, "LAN", new Persona("Sebastian", 1024558226, 315750686 ));
        ReservaVehiculo reservaVehiculo = new ReservaVehiculo(true, "Mercedes", sebastian);
        ReservaHotel reservaHotel = new ReservaHotel(true, "Grand Hyatt", sebastian );
        ReservaCitaMedica reservaCitaMedica = new ReservaCitaMedica(true, "Chapatin", sebastian);
        ReservaMesaRestaurante reservaMesaRestaurante = new ReservaMesaRestaurante(true, "matiz", sebastian);

        reservaVuelo.confirmarReserva();
        reservaVuelo.verDatosReserva();
        reservaVuelo.getFechaHoraReserva();

        reservaVehiculo.confirmarReserva();
        reservaVehiculo.esExclusivaLaReserva();
        reservaVehiculo.verDatosReserva();




        System.out.println("Hello world!");
    }
}