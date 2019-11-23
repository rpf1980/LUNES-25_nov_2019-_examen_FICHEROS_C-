package com.company;

import java.security.InvalidParameterException;

public class Alumno
{
    //Atributos
    private String nombre;
    private int edad;
    private double calificacion;


    //Propiedades
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        if(!nombre.isEmpty())
        {
            this.nombre = nombre;
        }
    }

    //Propiedades
    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        if(edad >= 17 && edad <= 100)
        {
            this.edad = edad;
        }
        else
        {
            throw new InvalidParameterException("No puede ingresar edades mayores de 100");
        }
    }

    //Propiedades
    public double getCalificacion()
    {
        return calificacion;
    }

    public void setCalificacion(double calificacion)
    {
        if(calificacion >= 0 && calificacion <= 10)
        {
            this.calificacion = calificacion;
        }
    }

    //Constructores
    public Alumno()
    {

    }

    public Alumno(String nombre, int edad, double calificacion)
    {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setCalificacion(calificacion);
    }

    //Métodos
    public String toString()
    {
        String contenidoFicha = "Nombre: "       + getNombre() + "\n" +
                                "Edad: "         + getEdad()+   "\n" +
                                "Calificacion: " + getCalificacion();
        return contenidoFicha;
    }
}
