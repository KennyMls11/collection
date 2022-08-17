package domain;

import java.time.LocalDateTime;

public class Paciente extends Persona{
    private String ocupacion;
    private String aseguradora;

    public Paciente(TipoIdentificacion tipoId, String numId, String nombre, String apellido, LocalDateTime fechaNac, String ocupacion, String aseguradora) {
        super(tipoId, numId, nombre, apellido, fechaNac);
        this.ocupacion = ocupacion;
        this.aseguradora = aseguradora;
    }


    public String getOcupacion() {
        return ocupacion;
    }

    public String getAseguradora() {
        return aseguradora;
    }
}
