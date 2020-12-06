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
 * @author Gerson P&eacute;rez Ortega - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class EjemplosCollections {

    /**
    * Ejemplo b&aacute;sico de lista vac&iacute;a.
    */
    public void ejemploEmptyList() {
        System.out.println("INICIO - ejemploEmptyList");
        List miLista = Collections.emptyList();
        /*
        // Que también se puede declarar como
        List miLista = Collections.EMPTY_LIST;
        */
        try {
            miLista.add("uno"); //Fallará porque la lista es inmutable y vacía.
        } catch (UnsupportedOperationException ex) {
            System.out.println("Fall\u00f3 porque la lista es inmutable y vac\u00eda.");
            ex.printStackTrace();
        }
        System.out.println("FIN - ejemploEmptyList\n");
    }

    /**
    * Ejemplo b&aacute;sico de paso de Array hacia Vector.
    */
    public void ejemploArrayListToVector() {
        System.out.println("INICIO - ejemploArrayListToVector");
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
        System.out.println("FIN - ejemploArrayListToVector\n");
    }

    /**
     * Ejemplo b&aacute;sico de Stack con elementos de tipo String.
    */
    public void ejemploStack() {
        System.out.println("INICIO - ejemploStack");
        Stack<String> stack = new Stack();
        stack.add(null);
        stack.add("uno");
        System.out.println("PUSH DOS: " + stack.push("dos"));;
        stack.push("tres");
        System.out.println("STACK3: " + stack.firstElement());
        System.out.println("STACK1: " + stack.pop());
        System.out.println("STACK2: " + stack.pop());
        stack.stream().forEach(System.out::println);
        System.out.println("FIN - ejemploStack\n");
    }

    /*
    * Ejemplo b&aacute;sico de LinkedHashSet con 1000 elementos e0 a e9999,
    */
    public void ejemploLinkedHashSet() {
        System.out.println("INICIO - ejemploLinkedHashSet");
        Set<String> miSet = new LinkedHashSet();
        for (int i = 0; i < 1_000; i++) {
            miSet.add(String.format("e%d", i));
        }
        String s = "abc";
        System.out.println("miset " + miSet);
        System.out.println("FIN - ejemploLinkedHashSet");
    }

    /**
     * Ejemplo b&aacute;sico de HashSet con verificaci&oacute;n del hash code
     * para cada elemento de la colecci&oacute;n.
     */
    public void ejemploHashSet() {
        System.out.println("INICIO - ejemploHashSet");
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
        System.out.println("FIN - ejemploHashSet\n");
    }

    /**
     * Ejemplo b&aacute;sico de cola doblemente enlazada (LinkedList).
     */
    public void ejemploLinkedList() {
        System.out.println("INICIO - ejemploLinkedList");
        Queue miQueue = new LinkedList();
        miQueue.add("uno");
        miQueue.add("dos");
        miQueue.add("tres");
        System.out.println("miqueue: " + miQueue);
        System.out.println("FIN - ejemploLinkedList\n");
    }

    public static void main(String[] args) {
        EjemplosCollections ejemplosCollections = new EjemplosCollections();
        ejemplosCollections.ejemploArrayListToVector();
        ejemplosCollections.ejemploEmptyList();
        ejemplosCollections.ejemploHashSet();
        ejemplosCollections.ejemploLinkedHashSet();
        ejemplosCollections.ejemploLinkedList();
        ejemplosCollections.ejemploStack();
    }
}
