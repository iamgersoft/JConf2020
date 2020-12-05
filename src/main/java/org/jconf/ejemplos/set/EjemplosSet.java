/*
 * (c) 2020
 */
package org.jconf.ejemplos.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import org.jconf.ejemplos.pojos.Empleado;

/**
 *
 * @author Gerson P&eacute;rez - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
public class EjemplosSet {

    /*
    * HashSet. No mantiene el orden de inserci&oacute;n.
    */
    public void ejemploHashSet() {
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
        
        Set<Empleado> empleadoSet = new HashSet();
        empleadoSet.add(empleado);
        empleadoSet.add(empleado3);
        empleadoSet.add(empleado2);

        System.out.println();
        Iterator<Empleado> it = empleadoSet.iterator();
        System.out.println("Recorriendo el HashSet con Iterator");
        while (it.hasNext()) {
            Empleado emp = it.next();
            System.out.println("----");
            System.out.println("Empleado: " + emp);
            System.out.println("Empleado id: " + emp.getId());
            System.out.println("Empleado nombre: " + emp.getNombre());
            System.out.println("Empleado salario: " + emp.getSalario());
            System.out.println("Empleado hashCode(): " + emp.hashCode());
        }
        System.out.println("----");
    }

    /*
    * LinkedHashSet. Mantiene el orden de inserci&oacute;n.
    */
    public void ejemploLinkedHashSet() {
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

        Set<Empleado> empleadoSet = new LinkedHashSet();
        empleadoSet.add(empleado3);
        empleadoSet.add(empleado);
        empleadoSet.add(empleado2);

        System.out.println("Recorriendo el LinkedHashSet con ciclo foreach");
        for (Empleado emp : empleadoSet) {
            System.out.println("----");
            System.out.println("Empleado: " + emp);
            System.out.println("Empleado id: " + emp.getId());
            System.out.println("Empleado nombre: " + emp.getNombre());
            System.out.println("Empleado salario: " + emp.getSalario());
            System.out.println("Empleado hashCode(): " + emp.hashCode());
        }
       System.out.println("----");
    }

    /*
    * TreeSet. Orden natural de los objetos.
    */
    public void ejemploTreeSet() {
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

        Set<Empleado> empleadoSet = new TreeSet();
        empleadoSet.add(empleado);
        empleadoSet.add(empleado3);
        empleadoSet.add(empleado2);

        System.out.println();
        System.out.println("Recorriendo el TreeSet con forEach");
        empleadoSet.forEach(emp -> {
            System.out.println("----");
            System.out.println("Empleado: " + emp);
            System.out.println("Empleado id: " + emp.getId());
            System.out.println("Empleado apellido: " + emp.getApellido());
            System.out.println("Empleado nombre: " + emp.getNombre());
            System.out.println("Empleado salario: " + emp.getSalario());
            System.out.println("Empleado hashCode(): " + emp.hashCode());
        });
    }

    public static void main(String[] args) {
        EjemplosSet ejemploSet = new EjemplosSet();
        ejemploSet.ejemploTreeSet();
    }
}
