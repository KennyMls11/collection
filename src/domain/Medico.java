package domain;

import java.time.LocalDateTime;

public class Medico extends Persona{
    private int tarjetaProfesional;


    public Medico(String tipoId, String numId, String nombre, String apellido, LocalDateTime fechaNac, int tarjetaProfesional) {
        super(tipoId, numId, nombre, apellido, fechaNac);
        this.tarjetaProfesional= tarjetaProfesional;
    }

    public int getTarjetaProfesional() {
        return tarjetaProfesional;
    }
}

