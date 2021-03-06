/*
 * (c) 2020
 */
package org.jconf.ejemplos.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;
import org.jconf.ejemplos.pojos.Album;
import org.jconf.ejemplos.pojos.Empleado;

/**
 * Ejemplos utilizando las implementaciones de List de Java Collections Framework.
 * @author Gerson P&eacute;rez Ortega - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class EjemplosList {

    public void ejemploVector() {
        System.out.println("INICIO - Ejemplo Vector");
        Album album = new Album();
        album.setTitulo("What's Going On");
        album.setArtista("Marvin Gaye");
        album.setAnioLanzamiento(1971);

        Album album2 = new Album();
        album2.setTitulo("Pet Sounds");
        album2.setArtista("The Beach Boys");
        album2.setAnioLanzamiento(1966);

        Album album3 = new Album();
        album3.setTitulo("Blue");
        album3.setArtista("Joni Mitchell");
        album3.setAnioLanzamiento(1971);

        Vector<Album> albumVec = new Vector();
        albumVec.add(album);
        albumVec.add(null);
        albumVec.add(album2);
        albumVec.add(null);
        albumVec.add(null);
        albumVec.add(album3);
        
        System.out.println("Iterando el Vector con for");
        for (int i = 0; i < albumVec.size(); i++) {
            Album alb = albumVec.elementAt(i);
            if (alb != null) {
                System.out.printf("Album %d: %s%n", i, alb);
                System.out.printf("Album %d t\u00edtulo: %s%n", i, alb.getTitulo());
                System.out.printf("Album %d artista: %s%n", i, alb.getArtista());
                System.out.printf("Album %d a\u00f1o de lanzamiento: %s%n", i, alb.getAnioLanzamiento());
                System.out.printf("Album %d hashCode(): %s%n", i, alb.hashCode());
            } else {
                System.out.printf("Elemento en la posici\u00f3n %d es nulo.%n", i);
            }
        }
        System.out.println("FIN - Ejemplo Vector\n");
    }

    public void ejemploStack() {
        System.out.println("INICIO - Ejemplo Stack");
        Empleado empleado = new Empleado();
        empleado.setId(1);
        empleado.setNombre("Duke");
        empleado.setApellido("Jar");
        empleado.setEmail("duke@jconf.org");
        empleado.setSalario(10000.00);

        Empleado empleado2 = new Empleado();
        empleado2.setId(2);
        empleado2.setNombre("Foo");
        empleado2.setApellido("Bar");
        empleado2.setEmail("foo.bar@jconf.org");
        empleado2.setSalario(15000.00);

        Empleado empleado3 = new Empleado();
        empleado3.setId(3);
        empleado3.setNombre("Fat");
        empleado3.setApellido("Jar");
        empleado3.setEmail("fat-jar@jconf.org");
        empleado3.setSalario(30000.00);

        Stack<Empleado> empleadoStack = new Stack();
        empleadoStack.add(null); // Elemento 1 - null
        empleadoStack.add(empleado); // Elemento 2 - empleado ID 1
        System.out.println("PUSH DOS: " + empleadoStack.push(empleado2)); // Elemento 3 - empleado ID 2
        empleadoStack.push(empleado3); // Elemento 4 - empleado ID 3
        System.out.println("Tama\u00f1o del stack: " + empleadoStack.size()); // 4
        System.out.println("Primer elemento: " + empleadoStack.firstElement()); // Elemento 1
        System.out.println("Extrayendo \u00faltimo elemento: " + empleadoStack.pop()); // Elemento 4
        System.out.println("Extrayendo \u00faltimo elemento: " + empleadoStack.pop()); // Elemento 3

        // Iterando Stack con Stream y aplicando filtro
        empleadoStack.stream()
                .filter(emp -> emp != null)
                .forEach(emp -> {
            System.out.println("Empleado ID: " + emp.getId());
        });
        System.out.println("Tama\u00f1o del stack: " + empleadoStack.size());
        System.out.println("FIN - Ejemplo Stack\n");
    }

    /**
     * Ejemplo de lista doblemente enlazada. Colecci&oacute;n que permite,
     * para cada elemento, contar con referencias a sus elementos vecinos,
     * as&iacute; como el manejo de una estructura de cola.
     */
    public void ejemploLinkedList() {
        System.out.println("INICIO - Ejemplo LinkedList");
        Album album = new Album();
        album.setTitulo("What's Going On");
        album.setArtista("Marvin Gaye");
        album.setAnioLanzamiento(1971);

        Album album2 = new Album();
        album2.setTitulo("Pet Sounds");
        album2.setArtista("The Beach Boys");
        album2.setAnioLanzamiento(1966);

        Album album3 = new Album();
        album3.setTitulo("Blue");
        album3.setArtista("Joni Mitchell");
        album3.setAnioLanzamiento(1971);

        LinkedList<Album> albumLinkedList = new LinkedList();
        albumLinkedList.push(album);
        albumLinkedList.add(album2);
        albumLinkedList.add(album3);

        System.out.println(album.getTitulo()); // Album 1
        System.out.println(albumLinkedList.peek().getTitulo()); // El mismo album 1
        System.out.println(albumLinkedList.pop().getTitulo()); // Album 1, con operación pop
        System.out.println(albumLinkedList.peek().getTitulo()); // Album 2
        System.out.println("FIN - Ejemplo LinkedList\n");
    }

    /**
    * Ejemplo de uso de ArrayList. Orden de iteraci&oacute;n sujeto al orden de inserci&oacute;n.
    * Se complementa el ejemplo con el uso de Java Streams con filtros y paso hacia lista inmutable.
    */
    public void ejemploArrayList() {
        System.out.println("INICIO - Ejemplo ArrayList");
        Album album = new Album();
        album.setTitulo("What's Going On");
        album.setArtista("Marvin Gaye");
        album.setAnioLanzamiento(1971);

        Album album2 = new Album();
        album2.setTitulo("Pet Sounds");
        album2.setArtista("The Beach Boys");
        album2.setAnioLanzamiento(1966);

        Album album3 = new Album();
        album3.setTitulo("Blue");
        album3.setArtista("Joni Mitchell");
        album3.setAnioLanzamiento(1971);

        ArrayList<Album> albumArrayList = new ArrayList();
        albumArrayList.add(album);
        albumArrayList.add(null);
        albumArrayList.add(null);
        albumArrayList.add(album2);
        albumArrayList.add(null);
        albumArrayList.add(album3);

        /*
        Se recorre lista utilizando Stream
        Se filtran los elementos que no son nulos
        Los resultados son recolectados a la lista (notNullAlbums) por medio
        de un Collector Collectors.toUnmodifiableList() (Java10+)
        */
        List<Album> notNullAlbums = albumArrayList
                .stream()
                .filter(alb -> alb != null)
                .collect(Collectors.toUnmodifiableList());

        // Iterando lista no modificable (inmutable) con foreach
        for (Album alb : notNullAlbums) {
            System.out.println(alb.getTitulo());
            System.out.println(alb.getArtista());
            System.out.println(alb.getAnioLanzamiento());
            System.out.println();
        }
        Album album4 = new Album();
        album4.setTitulo("Songs in the Key of Life");
        album4.setArtista("Stevie Wonder");
        album4.setAnioLanzamiento(1976);
        try {
            notNullAlbums.add(album4); // Fallará porque la lista notAllAlbums es inmutable
        } catch (UnsupportedOperationException ex) {
            System.out.println("Fall\u00f3 porque la lista notNullAlbums es inmutable.");
            ex.printStackTrace();
        }
        System.out.println("FIN - Ejemplo ArrayList\n");
    }

    public static void main(String[] args) {
        EjemplosList ejemploList = new EjemplosList();
        ejemploList.ejemploVector();
        ejemploList.ejemploStack();
        ejemploList.ejemploLinkedList();
        ejemploList.ejemploArrayList();
    }
}
