package com.company;

public class Pelicula
{
    public int id;
    public String titulo;
    public int anno;
    public boolean tieneOscar;
    public double valoracion;

    public String toString()
    {
        return "//FICHA PELÍCULA//" + "\n\n" +
                "ID: " + id + "\n" +
               "TITULO: " + titulo + "\n" +
                "AÑO: " + anno + "\n" +
                "TIENE OSCAR: " + tieneOscar + "\n" +
                "VALORACION: " + valoracion + "\n";
    }
}
