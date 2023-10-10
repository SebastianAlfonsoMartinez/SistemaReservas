package com.sam.sistemaReservas.persona;

public class Persona {

    private String nombre;
    private Long numeroDocumento;
    private Integer numeroContacto;

    public Persona(String nombre, Long numeroDocumento, Integer numeroContacto) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.numeroContacto = numeroContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(Integer numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public String toString() {
        return "Persona" +
                "nombre='" + nombre + '\n' +
                ", numeroDocumento=" + numeroDocumento +
                ", \nnumeroContacto=" + numeroContacto ;
    }
}
