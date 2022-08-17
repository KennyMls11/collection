
import domain.*;
import service.GestorUrgencias;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static final void main(String[] args) {

                Map<Integer, String> entries = new HashMap<>();
                entries.put(0, "Valor 1");
                entries.put(1, "Valor 2");
                entries.put(2, "Valor 3");
                entries.put(1, "Valor 4");
                entries.put(0, "Valor 5");
                entries.put(null, "Valor nulo");
                entries.put(5, null);
                entries.put(null, null);
                entries.put(6, null);
                entries.put(0, "Nuevo valor");
                entries.put(0, "Valor definitivo para 0");

                System.out.println(entries);
                System.out.println("NÃºmero de entradas en el mapa: " + entries.size());
                System.out.println("Reemplazando: " + entries.replace(0, "Nuevo valor para cero"));
                System.out.println("Reemplazando con valor anterior: " + entries.replace(0, "Nuevo valor para cero", "Nuevo valor para cero"));

                System.out.println("Objeto removido: " + entries.remove(2));
                System.out.println("Objeto que corresponde a la llave: " + entries.get(0));

                System.out.println(entries);

                for (Map.Entry<Integer, String> entry : entries.entrySet()) {
                    if (entry.getValue() != null && entry.getValue().equals("Valor 4")) {
                        System.out.println(entry.getKey());
                    }
                }
            }
        }






        /*Persona medico= new Medico(TipoIdentificacion.DNI, "236785229","Pepito","Perez",
                LocalDateTime.of(1993,1,7,0,0),12345);

        Persona juan= new Paciente(TipoIdentificacion.PASAPORTE, "AS611","juan", "furcade",
                LocalDateTime.of(1994,06,7,1,0),"Estudiante","Sura");

        Persona fabiola= new Paciente(TipoIdentificacion.PASAPORTE, "AS6771","Fabi", "soto",
                LocalDateTime.of(1800,1,6,8,3),"Cocinera","Hosp");

        GestorUrgencias gestorUrgencias= new GestorUrgencias(medico);
        gestorUrgencias. registrarUrgencia(juan, "cefalea", ClasificacionTriage.BLANCO);
        gestorUrgencias. registrarUrgencia(fabiola, "FX DE CRANEO", ClasificacionTriage.AZUL);
        gestorUrgencias. imprimirUrgencias();

        System.out.println(gestorUrgencias.asignarUrgencia());
        gestorUrgencias. imprimirUrgencias();


    }



}




        /*Diccionario diccionarioEspañol= new Diccionario("español");
        diccionarioEspañol.ingresarPalabra(new Palabra("Programacion", "accion y efecto de programar", "Ingles"));
        diccionarioEspañol.ingresarPalabra(new Palabra("saludo", "accion y efecto de saludar", "Español"));
        diccionarioEspañol.ingresarPalabra(new Palabra("abeja", "animal","Español"));

        diccionarioEspañol.ingresarPalabra (new Palabra("corazon", "organo del cuerpo encargado de bombear sangre","español"));
        diccionarioEspañol.buscarPalabra("Programacion");
        diccionarioEspañol.removerPalabra("corazon");
        System.out.println(" El diccionario despues de remover");
        diccionarioEspañol.imprimirPalabras();*/

        /*Diccionario diccionarioIngles= new Diccionario("Ingles");
        diccionarioIngles.ingresarPalabra(new PalabraNoEsp("Love","Loveeee","ingles","lov"));
        diccionarioIngles.ingresarPalabra(new PalabraNoEsp("Bee","animal","ingles","bi"));
        diccionarioIngles.ingresarPalabra(new PalabraNoEsp("Greeting","he action of giving a sing of welcome","ingles","gritin"));
        diccionarioIngles.ingresarPalabra(new PalabraNoEsp("Apple","fruit","ingles","fruit"));
        diccionarioIngles.buscarPalabra("love");
        diccionarioIngles. imprimirPalabras();

    }
}


    /*

        public static void main(String[] args) {
            Employee juan = new Employee("Juan", 123456, 31);
            Employee ximena = new Employee("Ximena", 478596, 28);
            Employee kenny = new Employee("Kenny", 78956, 25);
            Employee ana = new Employee("Ana Milena", 789654, 38);
            Employee lucia = new Employee("LucÃ­a", 519684, 24);
            Employee aylen = new Employee("Aylen", 78912, 24);

            //creo el arraylist//
            List<Employee> employees = new ArrayList<>();
            employees.add(juan);
            employees.add(ximena);
            employees.add(kenny);
            employees.add(ana);
            employees.add(lucia);
            employees.add(aylen);

            //el metodo reportEmployeeData es static asi q puedo usarlo sin instanciar un objeto, al ser metodo de la clase//
            AppCompany.reportEmployeeData(employees); //no necesito instancia//
            AppCompany appCompany = new AppCompany();//necesito instanciar//
            List<Employee> employeeLessThanThirty = appCompany.getFromEmployeesLessThanThirty(employees);
            System.out.println("Empleados menores de 30: ");
            AppCompany.reportEmployeeData(employeeLessThanThirty); //el metodo imprime, y como es de la clase no debo instanciar//
            System.out.println("El nÃºmero de empleados en la empresa es: " + appCompany.countEmployees(employees) );
        }
    }*/


                /*Biblioteca bibliotecaDeCali= new Biblioteca();
                bibliotecaDeCali. registrarLibro(new Libro("Harry Potter", "JK Rowling", 2001));
                bibliotecaDeCali. registrarLibro(new Libro("el poder del ahora", "Ekhar tholle", 2017));
                bibliotecaDeCali. imprimirLibro();
                bibliotecaDeCali. etiquetarLibros();
                bibliotecaDeCali. imprimirLibro();
                System.out.println(bibliotecaDeCali.buscarLibro("Harry Potter"));*/



                //
                /*Queue<Solicitud> solicitudes= new PriorityQueue<>(new NombreSolicitudComparator());
                solicitudes.add(new Solicitud(5,"Brenda"));
                solicitudes.add(new Solicitud(2,"Mariana"));
                solicitudes.add(new Solicitud(0,"Luciana"));
                solicitudes.add(new Solicitud(1,"Kenny"));


                while (solicitudes.size() > 0) {
                    System.out.println(solicitudes.poll());*/





