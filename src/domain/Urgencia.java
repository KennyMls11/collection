package domain;

import java.time.LocalDateTime;

public class Urgencia {
    private long numero;
    private LocalDateTime fechaLlegada;
    private LocalDateTime fechaAsignacion;
    private Persona medicoClas;
    private Persona paciente;
    private String sintomas;
    private ClasificacionTriage triage;

    public Urgencia(long numero, LocalDateTime fechaLlegada, Persona medicoClas, Persona paciente, String sintomas, ClasificacionTriage triage) {
        this.numero = numero;
        this.fechaLlegada = fechaLlegada;
        this.medicoClas = medicoClas;
        this.sintomas = sintomas;
        this.triage = triage;
        this.paciente = paciente;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalDateTime getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Persona getMedicoClas() {
        return medicoClas;
    }

    public void setMedicoClas(Persona medicoClas) {
        this.medicoClas = medicoClas;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public ClasificacionTriage getTriage() {
        return triage;
    }

    public void setTriage(ClasificacionTriage triage) {
        this.triage = triage;
    }

    @Override
    public String toString() {
        return numero + "/"+ fechaLlegada + "/"+triage+
                "/"+ medicoClas.getNombre()+ medicoClas.getApellido() + "/" + paciente.getNombre()+ "/"
                + paciente.getApellido()+"/"

               ;
    }
}







