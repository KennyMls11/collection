package Util;

import domain.Solicitud;

import java.util.Comparator;

public class NombreSolicitudComparator implements Comparator<Solicitud> {

    @Override
    public int compare(Solicitud solicitud1, Solicitud solicitud2) {
        /*int comparatorResult=0;
        if (solicitud1.getNombreSolicitante().compareTo(solicitud2.getNombreSolicitante()) > 0){
            comparatorResult= 1;
        }else if (solicitud1.getNombreSolicitante().compareTo(solicitud2.getNombreSolicitante()) < 0){
            comparatorResult= -1; */
    // NO NECESARIA LA LOGICA PORQ EL ORDEN NATURAL DE LOS STRINGS ES ALFABETICO, LO ORDENA DE ACUERDO A LO Q RETORNA ESTE COMPARE TO//

        return solicitud1.getNombreSolicitante().compareTo(solicitud2.getNombreSolicitante());
    }
}

