package service;

import Util.TriageComparator;
import domain.ClasificacionTriage;
import domain.Persona;
import domain.Urgencia;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

public class GestorUrgencias {
    private long consecutivoUrgencia;
    private Queue<Urgencia> urgencias;
    private Persona medicoDeTurno;

    public GestorUrgencias(Persona medicoDeTurno) {
        this.medicoDeTurno = medicoDeTurno;
        this.urgencias = new PriorityQueue<>(new TriageComparator()); //le digo que uso para comparar//
    }

    public void setMedicoDeTurno(Persona medicoDeTurno) {
        this.medicoDeTurno = medicoDeTurno;
    }

    public void registrarUrgencia(Persona paciente, String sintomas, ClasificacionTriage triage) {
        Urgencia urgencia = new Urgencia(consecutivoUrgencia, LocalDateTime.now(), medicoDeTurno, paciente
                , sintomas, triage);
        urgencias.add(urgencia);//se ejecuta el TriageComparator//
        consecutivoUrgencia++;
    }

    public Urgencia asignarUrgencia() {
        //le voy asignando a la variable local una referencia en memoria y despues le saco el set, con poll/
        Urgencia urgencia = urgencias.poll();
        urgencia.setFechaAsignacion(LocalDateTime.now());
        return urgencia;

    }

    public void imprimirUrgencias(){
        System.out.println(urgencias);

    }

}
