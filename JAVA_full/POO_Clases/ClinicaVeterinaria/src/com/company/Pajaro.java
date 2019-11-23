package com.company;

import java.time.LocalDate;

enum EspeciePajaro
{
    Canario, Periquito, Agapornis
}

public class Pajaro extends Animal
{
    //Atributos adicionales
    private EspeciePajaro especie;
    private boolean cantor;

    //Constructor
    public Pajaro(String nombre, LocalDate fechaNacimiento, double peso, EspeciePajaro especie, boolean cantor)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.especie = especie;
        this.cantor = cantor;
        this.comentario = "";
    }

    //Propiedades solo de lectura
    public EspeciePajaro getEspecie()
    {
        return especie;
    }

    public boolean getCantor()
    {
        return cantor;
    }

    @Override
    public String toString()
    {
        return "Nombre del Pájaro\n" +
                "Nombre: " + this.nombre +
                "\nEspecie: " + this.especie +
                "\nFecha de nacimiento: " + this.fechaNacimiento +
                "\nPeso: " + this.peso +
                "\nCantor: " + this.cantor +
                "\nComentario: " + this.comentario;
    }
}
