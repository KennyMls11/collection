package domain;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String codigo;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    /*constructor q vamos a usar en caso de q instanciemos un libro en el metodo de buscar libro solo con el titulo
    usando internamente el equals sobreescrito donde comparo libro con libro, lo cual me ahorro si es q hago directamente el equals de la coleccion
    con el q me pasen por parametro equals.(titulo)*/

    public Libro(String titulo) {
        this.titulo = titulo;
    }
  // al generar el set del codigo permito que el valor para este atributo cambie despues de ser instanciado, por el contrario los get solo me permiten obtener la info
  // ademas de tener todos los atributos privados//
    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getCodigo() {
        return codigo;


    }

    @Override
        //para comparar objetos si comparo Strings no se usa el equals//
        //si estuviera usando el conteins si lo necesito sobre escribir//
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Libro libro = (Libro) o;
            return añoPublicacion == libro.añoPublicacion && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(codigo, libro.codigo);
        }

    @Override
    public String toString() {

        return titulo +"/"+ autor + "/" + añoPublicacion + "/" +codigo + "/";
    }
}
