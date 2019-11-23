package com.company;

import java.time.LocalDate;

public class Actor
{
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;

    public String toString()
    {
        return  "//FICHA DE ACTOR//" + "\n\n" +
                "ID: " + id + "\n" +
                " Nombre: " + nombre + "\n" +
                " Fecha Nacimiento: " + fechaNacimiento + "\n";
    }
}


