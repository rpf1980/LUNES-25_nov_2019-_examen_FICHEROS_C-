package com.company;

import java.time.LocalDate;

enum EspecieReptil
{
    Tortuga, Iguana, DragonDeComodo
}

public class Reptil extends Animal
{
    //Atributos reptil
    private EspecieReptil especie;
    private boolean venenoso;

    //Propiedades solo lectura
    public EspecieReptil getEspecie()
    {
        return especie;
    }

    public boolean getVenenoso()
    {
        return venenoso;
    }

    //Constructor
    public Reptil(String nombre, LocalDate fechaNacimiento, double peso, EspecieReptil especie, boolean venenoso)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.especie = especie;
        this.venenoso = venenoso;
        this.comentario = "";
    }

    @Override
    public String toString()
    {
        return "Ficha de Reptil\n" +
                "Nombre: " + this.nombre +
                "\nEspecie: " + this.especie +
                "\nFecha de Nacimiento: " + this.fechaNacimiento +
                "\nPeso: " + this.peso +
                "\nVenenoso: " + this.venenoso +
                "\nComentario: " + this.comentario;
    }
}
