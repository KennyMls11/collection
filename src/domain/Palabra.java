package domain;

import java.util.Objects;

public class Palabra implements Comparable<Palabra>{
    protected String palabra;
    protected String significado;
    protected String idioma;

    public Palabra(String palabra, String significado, String idioma) {
        this.palabra = palabra;
        this.significado = significado;
        this.idioma = idioma;
    }

    public Palabra(String palabra) {
        this.palabra = palabra;

    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Palabra)) return false;
        Palabra palabra1 = (Palabra) o;
        return Objects.equals(palabra, palabra1.palabra);
        /*&& Objects.equals(significado, palabra1.significado) && Objects.equals(idioma, palabra1.idioma);*/
        /*lo dejo validando solo contra el cmapo palabra porq sino me va a dejar agregarlo
        aunq sea la misma palabra solo si el significado es diferente
        si quiero comparar clases hijas con padres uso la palabra instanceof en este ejemplo dice
        si no es una instancia de Palabra return false*/

    }

    @Override
    //sobre escribir el metodo para q se ejecute la comparacion//
    public int hashCode() {
        return Objects.hash(palabra);
        //accion q realiza la colleccion set//
        //si encuentra q el codigo hash es el mismo hace una doble verificacion con el equals//
    }

    @Override
    public String toString() {
        return palabra + ":" + significado;
    }

    @Override
    public int compareTo(Palabra o) {
        /*retorna un -1 cuando el objeto deberia estar en un orden inferior
        0 si son iguales 1 si son el mismo*/
        return this.palabra.compareTo(o.getPalabra());
    }
}