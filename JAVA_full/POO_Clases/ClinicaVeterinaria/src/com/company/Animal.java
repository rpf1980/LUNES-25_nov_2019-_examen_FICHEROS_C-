package com.company;

import java.time.LocalDate;

public abstract class Animal
{
    //Atributos
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected double peso;
    protected String comentario;

    public Animal(){}

    //Propiedades
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }


    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso()
    {
        return peso;
    }


    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }

    //Método abstracto
    public abstract String toString();

}
