/*
 * (c) 2020
 */
package org.jconf.ejemplos.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import org.jconf.ejemplos.pojos.Album;
import org.jconf.ejemplos.pojos.Empleado;

/**
 * Ejemplos utilizando las implementaciones de Queue de Java Collections Framework.
 * @author Gerson P&eacute;rez Ortega - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class EjemplosQueue {

    /**
     * Ejemplo de cola de prioridad. Prioridad basada en la implementaci&oacute;n
     * de la interfaz Comparable (m&eacute;todo compareTo()) en la clase Empleado.
     */
    public void ejemploPriorityQueue() {
        System.out.println("INICIO - ejemploPriorityQueue");
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
        
        PriorityQueue<Empleado> empleadoQueue = new PriorityQueue();
        empleadoQueue.add(empleado3);
        empleadoQueue.add(empleado2);
        empleadoQueue.add(empleado);

        for (int i = 0; i < 3; i++) {
            Empleado emp = empleadoQueue.poll();
            System.out.println(emp.getId());
            System.out.println(emp.getApellido());
            System.out.println(emp.getNombre());
            System.out.println();
        }
        System.out.println("FIN - ejemploPriorityQueue\n");
    }

    public void ejemploArrayDeque() {
        System.out.println("INICIO - ejemploArrayDeque");
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

        ArrayDeque<Album> albumArrayDeque = new ArrayDeque();
        albumArrayDeque.add(album3);
        albumArrayDeque.add(album);
        albumArrayDeque.add(album2);

        for (int i = 0; i < 3; i++) {
            Album alb = albumArrayDeque.poll();
            System.out.println(alb.getTitulo());
            System.out.println(alb.getArtista());
            System.out.println(alb.getAnioLanzamiento());
            System.out.println();
        }
        System.out.println("FIN - ejemploArrayDeque\n");
    }
    
    public static void main(String[] args) {
        EjemplosQueue ejemplosQueue = new EjemplosQueue();
        ejemplosQueue.ejemploPriorityQueue();
        ejemplosQueue.ejemploArrayDeque();
    }
}
