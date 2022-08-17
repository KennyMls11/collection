package domain;

import java.time.LocalDateTime;

public class Persona {
    protected TipoIdentificacion tipoId ;
    protected String numId;
    protected String nombre;
    protected String apellido;
    protected LocalDateTime fechaNac;

    public Persona(TipoIdentificacion tipoId, String numId, String nombre, String apellido, LocalDateTime fechaNac) {
        this.tipoId = tipoId;
        this.numId = numId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public TipoIdentificacion getTipoId() {
        return tipoId;
    }

    public String getNumId() {
        return numId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDateTime getFechaNac() {
        return fechaNac;
    }
}


