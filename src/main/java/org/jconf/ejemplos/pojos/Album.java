/*
 * (c) 2020
 */
package org.jconf.ejemplos.pojos;

/**
 *
 * @author Gerson P&eacute;rez - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class Album {

    private String titulo;
    private String artista;
    private int anioLanzamiento;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

}
