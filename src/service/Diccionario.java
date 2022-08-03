package service;

import domain.Palabra;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Diccionario {
    private Set<Palabra> palabras; //coleccion de palabras//
    private String idioma;

    public Diccionario(String idioma) {

        this.idioma = idioma;
        this.palabras = new TreeSet<>();
    }

    public String getIdioma() {
        return idioma;
    }


    /*a traves de los metodos de instancia puedo modificar los valores que tengo
    para los atributos de esa instancia*/
    /* la implementacion set no permite elementos duplicados*/

    public void ingresarPalabra(Palabra palabraIngresar) {
        palabras.add(palabraIngresar);

    }

    public void buscarPalabra(String palabra) {
        Palabra PalabraABuscar = new Palabra(palabra);
        boolean seEncontro = false;
            /*for ish, sin necesidad de la utilizacion de indices, el set no funciona con indices
         si con TABALAHASH: tabla LLAVE-VALOR// palabra en diccionario es un apuntador a la referencia en memoria
        en la q vamos iterando, obtiene el valor q tenga el objeto en el campo palabra /*for ish tiene 2 partes, tipo de elemento q compone la coleccion, variable local (apuntador)
        donde voy a ir almacenando los elementos de la coleccion en las diferentes iteraciones
        */
        for (Palabra palabraEnDiccionario : palabras) {
            if (palabraEnDiccionario.getPalabra().equals(palabra)) {
                System.out.println(palabraEnDiccionario);
                seEncontro = true;
                break;

            }

        }
        if (!seEncontro) {
            System.out.println(" La palabra" + palabra + " No existe en el diccionario");
        }

    }

    public void removerPalabra(String palabra) {
        //vuelvo un tipo de dato string un tipo de dato objeto del tipo palabra//
        Palabra palabraARemover=new Palabra(palabra);
        boolean seRemovio= palabras.remove(palabraARemover);
        if (seRemovio) {
            System.out.println("la palabra" + palabra+ "removida del diccionario");
        } else {
            System.out.println ("La palabra" + palabra+ "No existe en el diccionario");


        }
    }


    public void imprimirPalabras() {
        //no puedo usar el to String porq ya lo sobre escribi y la consigna me pide solo la palabra//
        for (Palabra auxiliar : palabras){
            System.out.println(auxiliar.getPalabra());
        }


    }
}
