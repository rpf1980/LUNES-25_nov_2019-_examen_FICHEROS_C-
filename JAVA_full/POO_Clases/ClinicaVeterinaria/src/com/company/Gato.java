package com.company;

import java.time.LocalDate;

enum RazaGato
{
    Comun, Siames, Persa, Angora, ScottishFold
}

public class Gato extends Animal
{
    //Atributos gato
    private RazaGato raza;
    private String microchip;

    //Contructor
    public Gato(String nombre, LocalDate fechaNacimiento, double peso, RazaGato raza, String microchip)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.raza = raza;
        this.microchip = microchip;
        this.comentario = "";
    }

    //Propiedades solo lectura
    public RazaGato getRaza()
    {
        return raza;
    }

    public String getMicrochip()
    {
        return microchip;
    }

    //Método toString
    @Override
    public String toString()
    {
        return "Ficha de Gato\n" +
                "Nombre: " + this.nombre +
                "\nRaza: " + this.raza +
                "\nFecha de Nacimiento: " + this.fechaNacimiento +
                "\nPeso: " + this.peso +
                "\nMicrochip: " + this.microchip +
                "\nComentario: " + this.comentario;
    }

}
