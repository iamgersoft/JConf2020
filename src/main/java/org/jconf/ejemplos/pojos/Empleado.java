/*
 * (c) 2020
 */
package org.jconf.ejemplos.pojos;

import java.util.Objects;


/**
 * Clase POJO (Plan Old Java Object) para guardar datos de empleados.
 * @author Gerson P&eacute;rez Ortega - <a href="https://twitter.com/iamgersoft">@iamgersoft</a>
 */
// public class Empleado implements Comparable<Empleado> { // compareTo(Object other)
public class Empleado implements Comparable<Empleado> { // compareTo(Empleado other)
    /*
    Se puede definir el mismo tipo Empleado en Comparable, para que la firma del metodo compareTo
    sea otro objeto del mismo tipo, con lo que ya no aplica hacer cast.
    */
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellido);
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    /*
    * Establece un criterio de comparaci&oacute;n entre dos objetos Empleado,
    * basado en el orden lexicogr&aacute;fico
    * de la cadena concatenada apellido,nombre,id
    */
    @Override
    // public int compareTo(Object other) {
    public int compareTo(Empleado other) {
        // Empleado other = (Empleado) o; // por si no definimos el tipo de dato en "implements Comparable" hacemos cast de Object other.
        String thisApNom = this.getApellido() + "," + this.getNombre() + "," + this.getId();
        String otherApNom = other.getApellido() + "," + other.getNombre() + "," + other.getId();
        return thisApNom.compareTo(otherApNom);
        /*
        // Por si deseamos usar el id como criterio de comparaci&oacute;n:
        return Integer.compare(other.getId(), this.getId());
        */
    }
}
