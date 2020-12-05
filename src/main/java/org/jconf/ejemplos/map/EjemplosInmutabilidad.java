/*
 * (c) 2020
 */
package org.jconf.ejemplos.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplos de mutabilidad/inmutabilidad en Map:
 * <ul>
 * <li>Mapa mutable</li>
 * <li>Mapa inmutable con Java 9+</li>
 * <li>Mapa inmutable con Java 7+</li>
 * </ul>
 *
 * @author Gerson P&eacute;rez - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class EjemplosInmutabilidad {

    /**
     * Ejemplo de mapa mutable
     */
    public void mutableMap() {
        Map<String, String> myMap = new HashMap();
        myMap.put("foo", "bar");
        myMap.put("duke", "rocks");
        System.out.println("Mapa: " + myMap);
        myMap.put("jconf", "2020");
        System.out.println("Mapa: " + myMap);
    }

    /**
     * Ejemplo de mapa inmutable con Java 7+
     */
    public void immutableMap() {
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
        myImmutableMap.put("Guatemala", "502"); // Fallará porque myImmutableMap es inmutable.
        System.out.println("myImmutableMap: " + myImmutableMap);
    }

    /**
     * Ejemplo de mapa inmutable con Java 9+
     */
    public void immutableMapStaticOf() {
        Map<String, String> myImmutableMap = Map.of(
                "foo", "bar",
                "duke", "rocks",
                "jconf", "2020"
        );
        System.out.println("Mapa: " + myImmutableMap);
        myImmutableMap.put("Guatemala", "502"); // Fallará porque myImmutableMap es inmutable.
        System.out.println("Mapa: " + myImmutableMap);
    }

    public static void main(String[] args) {
        EjemplosInmutabilidad ejemplos = new EjemplosInmutabilidad();
        ejemplos.immutableMap();
    }
}
