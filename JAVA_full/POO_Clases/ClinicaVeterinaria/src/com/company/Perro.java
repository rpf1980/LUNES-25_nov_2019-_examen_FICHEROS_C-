package com.company;


import java.time.LocalDate;
import java.util.Random;


enum RazaPerro
{
    PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo
}


public class Perro extends Animal
{
    //Atributos perro
    private String microchip;
    private RazaPerro raza;

    //Propiedades solo lectura
    public String getMicrochip()
    {
        return microchip;
    }

    public RazaPerro getRaza()
    {
        return raza;
    }

    //Constructor
    public Perro(String nombre, LocalDate fechaNacimiento, double peso, RazaPerro raza, String microchip)
    {
        //super(nombre,fechaNacimiento, peso, comentario);  ** ERROR EN ESTA LÍNEA
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.raza = raza;
        this.microchip = microchip;
        this.comentario = "";
    }

    //Método toString
    @Override
    public String toString()
    {
        return "Ficha de Perro\n" +
                "Nombre: " + this.nombre +
                "\nRaza: " + this.raza +
                "\nFecha de Nacimiento: " + this.fechaNacimiento +
                "\nPeso: " + this.peso +
                "\nMicrochip: " + this.microchip +
                "\nComentario: " + this.comentario;
    }
}
