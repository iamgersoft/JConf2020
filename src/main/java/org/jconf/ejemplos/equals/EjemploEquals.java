/*
 * (c) 2020
 */
package org.jconf.ejemplos.equals;

import java.util.HashSet;
import java.util.Set;
import org.jconf.ejemplos.pojos.Empleado;

/**
 * <p>Clase de ejemplo - Uso de equals en Java.</p>
 * <p>En la jerarqu&iacute;a de clases de Java, todas las clases heredan de java.lang.Object.
 * La clase Object declara un m&eacute;todo equals(), el cual como una buena pr&aacute;ctica
 * en nuestras clases podemos sobrescribir, a manera de garantizar la igualdad entre dos
 * objetos cuyos datos son id&eacute;nticos.
 * Junto con equals(), se sugiere sobrescribir el m&eacute;todo hashCode() mediante el
 * c&aacute;lculo de un valor hash a partir de los datos contenidos en el objeto.</p>
 * @author Gerson P&eacute;rez - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class EjemploEquals {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setId(1);
        empleado.setNombre("Duke");
        empleado.setSalario(10000.00);
        System.out.println("Empleado1 id: " + empleado.getId());
        System.out.println("Empleado1 nombre: " + empleado.getNombre());
        System.out.println("Empleado1 salario: " + empleado.getSalario());
        System.out.println("Empleado1 hashCode: " + empleado);
        System.out.println();

        Empleado empleado2 = new Empleado();
        empleado2.setId(1);
        empleado2.setNombre("Duke");
        empleado2.setSalario(10000.00);
        System.out.println("Empleado2 id: " + empleado2.getId());
        System.out.println("Empleado2 nombre: " + empleado2.getNombre());
        System.out.println("Empleado2 salario: " + empleado2.getSalario());
        System.out.println("Empleado2 hashCode: " + empleado2);
        System.out.println();

        System.out.println("Empleados equals: " + empleado.equals(empleado2));

        Set<Empleado> empleadoSet = new HashSet();
        empleadoSet.add(empleado);
        empleadoSet.add(empleado2);
    }
}
