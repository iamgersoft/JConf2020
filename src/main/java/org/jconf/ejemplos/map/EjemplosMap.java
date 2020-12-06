/*
 * (c) 2020
 */
package org.jconf.ejemplos.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import org.jconf.ejemplos.pojos.Album;
import org.jconf.ejemplos.pojos.Empleado;

/**
 * @author Gerson P&eacute;rez Ortega - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class EjemplosMap {

    /**
    * TreeMap. Mapa con ordenamiento basado en orden natural de sus llaves.
    */
    public void ejemploTreeMap() {
        System.out.println("INICIO - ejemploTreeMap");
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

        TreeMap<Integer, Album> albumTreeMap = new TreeMap();
        albumTreeMap.put(2, album3);
        albumTreeMap.put(3, album);
        albumTreeMap.put(1, album2);

        System.out.println(albumTreeMap.firstEntry().getKey());
        System.out.println("FIN - ejemploTreeMap\n");
    }

    /**
    * HashTable. Mapa thread-safe. No acepta llaves ni valores nulos.
    */
    public void ejemploHashTable() {
        System.out.println("INICIO - ejemploHashTable");
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

        Hashtable<String, Empleado> albumHashTable = new Hashtable();
        albumHashTable.put("Enero", empleado);
        albumHashTable.put("Febrero", empleado2);
        albumHashTable.put("Marzo", empleado3);

        System.out.println(albumHashTable.keySet());
        System.out.println("FIN - ejemploHashTable\n");
    }

    /**
    * Ejemplo de LinkedHashMap. Estructura llave/valor cuyo orden de iteraci&oacute;n
    * corresponde con el orden de inserci&oacute;n, basado en una estructura
    * de lista doblemente enlazada.
    */
    public void ejemploLinkedHashMap() {
        System.out.println("INICIO - ejemploLinkedHashMap");
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

        LinkedHashMap<String, Empleado> albumLinkedHashMap = new LinkedHashMap();
        albumLinkedHashMap.put("Enero", empleado);
        albumLinkedHashMap.put("Febrero", empleado2);
        albumLinkedHashMap.put("Marzo", empleado3);

        System.out.println(albumLinkedHashMap.keySet());
        System.out.println("FIN - ejemploLinkedHashMap\n");
    }

    /**
    * Ejemplo de HashMap. Estructura llave/valor cuyo orden de iteraci&oacute;n
    * puede no corresponder con el orden de inserci&oacute;n (en su lugar,
    * el ordenamiento est&aacute; sujeto en el hash calculado para la llave).
    */
    public void ejemploHashMap() {
        System.out.println("INICIO - ejemploHashMap");
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

        HashMap<String, Empleado> albumHashMap = new HashMap();
        albumHashMap.put("Marzo", empleado3);
        albumHashMap.put("Enero", empleado);
        albumHashMap.put("Febrero", empleado2);

        System.out.println(albumHashMap.keySet());
        System.out.println("FIN - ejemploHashMap\n");
    }
    
    /**
     * Ejemplo de mapa mutable
     */
    public void ejemploMutableMap() {
        System.out.println("INICIO - ejemploMutableMap");
        Map<String, String> myMap = new HashMap();
        myMap.put("foo", "bar");
        myMap.put("duke", "rocks");
        System.out.println("Mapa: " + myMap);
        myMap.put("jconf", "2020");
        System.out.println("Mapa: " + myMap);
        System.out.println("FIN - ejemploMutableMap\n");
    }

    /**
     * Ejemplo de mapa inmutable con Java 7+
     */
    public void ejemploImmutableMap() {
        System.out.println("INICIO - ejemploImmutableMap");
        // Creación del HashMap myMap
        Map<String, String> myMap = new HashMap();
        myMap.put("foo", "bar");
        myMap.put("duke", "rocks");

        // Declaración del Map myImmutableMap como una colección inmutable a partir de myMap
        Map<String, String> myImmutableMap = Collections.unmodifiableMap(myMap);

        System.out.println("myMap: " + myMap); // foo, duke
        System.out.println("myImmutableMap: " + myImmutableMap); // foo, duke

        // Se agrega un nuevo elemento a myMap
        myMap.put("jconf", "2020"); // foo, duke, jconf

        System.out.println("myImmutableMap: " + myImmutableMap); // foo, duke, jconf (myImmutableMap es una "vista inmutable" de myMap)
        try {
            System.out.println("myImmutableMap: " + myImmutableMap);
            myImmutableMap.put("Guatemala", "502"); // Fallará porque myImmutableMap es inmutable.
        } catch (UnsupportedOperationException ex) {
            System.out.println("Fall\u00f3 porque myImmutableMap es inmutable.");
            ex.printStackTrace();
        }
        System.out.println("FIN - ejemploImmutableMap\n");
    }

    /**
     * Ejemplo de mapa inmutable con Java 9+
     */
    public void ejemploImmutableMapStaticOf() {
        System.out.println("INICIO - ejemploImmutableMapStaticOf");
        Map<String, String> myImmutableMap = Map.of(
                "foo", "bar",
                "duke", "rocks",
                "jconf", "2020"
        );
        System.out.println("Mapa: " + myImmutableMap);
        try {
            System.out.println("myImmutableMap: " + myImmutableMap);
            myImmutableMap.put("Guatemala", "502"); // Fallará porque myImmutableMap es inmutable.
        } catch (UnsupportedOperationException ex) {
            System.out.println("Fall\u00f3 porque myImmutableMap es inmutable.");
            ex.printStackTrace();
        }
        System.out.println("FIN - ejemploImmutableMapStaticOf\n");
    }

    public static void main(String[] args) {
        EjemplosMap ejemplos = new EjemplosMap();
        ejemplos.ejemploHashMap();
        ejemplos.ejemploHashTable();
        ejemplos.ejemploLinkedHashMap();
        ejemplos.ejemploTreeMap();
        ejemplos.ejemploHashMap();
        ejemplos.ejemploImmutableMap();
        ejemplos.ejemploImmutableMapStaticOf();
    }
}
