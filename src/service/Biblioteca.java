package service;

import domain.Libro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {

    private int consecutivo;
    //una coleccion de libros q es un list//
    private List<Libro> libros;

    public Biblioteca() {
        //para q se instancien los libros desde el arraylist
        // al instanciar los libros voy a decir q la colecion de libros es un nuevo  ArrayList//
        //esta coleccion de libros es un nuevo arraylist//
        this.libros = new LinkedList<>( );
    }


    //metodo que pide como parametro  referencia un tipo de dato objeto del tipo libro//
     public void registrarLibro(Libro libroregistrar) {
        //a la coleccion, con su metodo add le agrego el libro q recibo como parametro//
        libros.add(libroregistrar);

    }

    /* no necesito ningun parametro externo porq el metodo usa la coleccion de libros*/
    public void etiquetarLibros() {
        /*PRIMERA LOGICA for (int i=0;  i < libros.size();i++){
            //aplico la logica obteniendo: el indice de donde voy en la coleccion y el codigo, con sus get//
            if (libros.get(i). getCodigo()==null){
                //libros en la iteracion donde voy, le voy a generar la etiqueta//
                libros.get(i). setCodigo(libros.get(i).getTitulo()+ "/"+
                        libros.get(i).getAñoPublicacion()+ consecutivo);
                consecutivo ++; */
            
            
            /* SEGUNDA LOGICA, mas eficiente*/
        for (Libro libro:  libros ) {
            if (libro.getCodigo()==null){
                //con el set asigno el valor a el libro en la iteracion en la q vaya en su campo codigo, accediendo a este por medio del set//
                libro.setCodigo(libro.getTitulo()+ "/" + libro.getAñoPublicacion() + "/" + consecutivo);
                consecutivo ++;
            }
            
        }
    } 
         
    public List <Libro> buscarLibro(String titulo) {
        /*lista auxiliar para ir guardando lo q necesito retornar,en este casi los libros q cumplan con la condicion*/
        List <Libro> librosEncontrados= new ArrayList<>();
        for (Libro libro: libros) {
            if (libro.getTitulo().equals(titulo)){
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;

    }
    public void imprimirLibro(){
        System.out.println(libros);

    }
}
