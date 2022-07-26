package domain;

public class PalabraNoEsp extends Palabra {

    private String pronunciacion;


    public PalabraNoEsp(String palabra, String significado, String idioma, String pronunciacion) {
        super(palabra, significado, idioma);
        this.pronunciacion = pronunciacion;
    }

    public String getPronunciacion() {
        return pronunciacion;
    }

    public void setPronunciacion(String pronunciacion) {
        this.pronunciacion = pronunciacion;
    }
}
