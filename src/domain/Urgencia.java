package domain;

import java.time.LocalDateTime;

public class Urgencia {
    private long numero;
    private LocalDateTime fechaLlegada;
    private LocalDateTime fechaAsignacion;
    private Persona medicoClas;
    private String sintomas;
    private byte triage;

    public Urgencia(long numero, LocalDateTime fechaLlegada, Persona medicoClas, String sintomas, byte triage) {
        this.numero = numero;
        this.fechaLlegada = fechaLlegada;
        this.medicoClas = medicoClas;
        this.sintomas = sintomas;
        this.triage = triage;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public void setMedicoClas(Persona medicoClas) {
        this.medicoClas = medicoClas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setTriage(byte triage) {
        this.triage = triage;
    }
}
