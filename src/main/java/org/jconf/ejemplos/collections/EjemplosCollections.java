/*
 * (c) 2020
 */
package org.jconf.ejemplos.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import org.jconf.ejemplos.pojos.Empleado;

/**
 *
 * @author Gerson P&eacute;rez - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class EjemplosCollections {

    public void ejemploEmptyList() {
        List miLista = Collections.emptyList();
        /*
        // Que también se puede declarar como
        List miLista = Collections.emptyList();
        */
        miLista.add("uno"); //Fallará porque la lista es inmutable y vacía.
    }

    public void ejemploPrueba() {
        List miLista = new java.util.ArrayList();
        miLista.add("uno");
        miLista.add("dos");
        miLista.add("tres");
        System.out.println("Elemento 1: " + miLista.get(1));
        Vector vec = new Vector(miLista);
        vec.add("cuatro");
        vec.add(null);
        vec.add("cinco");
        vec.add(null);
        vec.add(null);
        vec.add("cinco");
        vec.add("seis");
        System.out.println("Elemento 1: " + vec.get(1));
        System.out.println("Elemento 1: " + vec.elementAt(1));
        System.out.println("miLista: " + vec);
    }

    public void ejemploPrueba2() {
        Stack<String> stack = new Stack();
        stack.add(null);
        stack.add("uno");
        System.out.println("PUSH DOS: " + stack.push("dos"));;
        stack.push("tres");
        System.out.println("STACK3: " + stack.firstElement());
        System.out.println("STACK1: " + stack.pop());
        System.out.println("STACK2: " + stack.pop());
        stack.stream().forEach(System.out::println);
    }

    public void ejemploPrueba3() {
        Set<String> miSet = new LinkedHashSet();
        for (int i = 0; i < 1_000; i++) {
            miSet.add(String.format("e%d", i));
        }
        String s = "abc";
        System.out.println("miset " + miSet);
    }

    public void ejemploPrueba4() {
        Set<Empleado> miSet = new HashSet();

        Empleado empleado1 = new Empleado();
        empleado1.setId(1);
        empleado1.setNombre("Pepito");
        empleado1.setSalario(10000.00);

        Empleado empleado2 = new Empleado();
        empleado2.setId(2);
        empleado2.setNombre("Juanito");
        empleado2.setSalario(15000.00);

        Empleado empleado3 = new Empleado();
        empleado3.setId(3);
        empleado3.setNombre("Luisa");
        empleado3.setSalario(20000.00);

        System.out.println("Equals E1 vs E2: " + empleado1.equals(empleado2));
        System.out.println("HashCode empleado 1: " + empleado1.hashCode());
        System.out.println("HashCode empleado 2: " + empleado2.hashCode());

        miSet.add(empleado3);
        miSet.add(empleado1);
        miSet.add(empleado2);

        System.out.println("miSet: " + miSet);
    }
    
    public void ejemploPrueba5() {
        //Queue miQueue = new PriorityQueue();
        Queue miQueue = new LinkedList();
        miQueue.add("uno");
        miQueue.add("dos");
        miQueue.add("tres");
        System.out.println("miqueue: " + miQueue);
    }

    public static void main(String[] args) {
        EjemplosCollections ejemplosCollections = new EjemplosCollections();
        ejemplosCollections.ejemploPrueba5();
    }
}
