package com.company;

import java.time.LocalDate;

public class ActorPelicula
{
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;
    public boolean principal;


    public String toString()
    {
        String categoria;

        if(principal)
        {
            categoria = "PRINCIPAL";
        }
        else
        {
            categoria = "SECUNDARI@";
        }

        return "ID: " + id + " " +
        "NOMBRE: " + nombre + " " +
        "FECHA NAC: " + fechaNacimiento + " " + categoria + "\n";

    }
}
