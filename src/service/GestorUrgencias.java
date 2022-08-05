package service;

import domain.Persona;
import domain.Urgencia;

import java.time.LocalDateTime;
import java.util.Queue;

public class GestorUrgencias {
    private long consecutivoUrgencia;
    private Queue<Urgencia> urgencias;
    private Persona medicoDeTurno;

    public GestorUrgencias(Persona medicoDeTurno) {
        this.medicoDeTurno = medicoDeTurno;
    }

    public void setMedicoDeTurno(Persona medicoDeTurno) {
        this.medicoDeTurno = medicoDeTurno;
    }

    public void registrarUrgencia( Persona medicoDeTurno, String sintomas, byte triage){

    }

    public Urgencia asignarUrgencia (){
        return Urgencia
    }

    public void imprimirUrgencias(){

    }

}
