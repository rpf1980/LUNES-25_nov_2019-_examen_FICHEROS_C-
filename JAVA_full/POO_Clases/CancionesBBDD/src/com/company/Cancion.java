package com.company;

public class Cancion
{
    //Atributos
    public int id;
    public String ruta;
    public String titulo;
    public int idArtista;
    public int idEstilo;
    public int anno;
    public int estrellas;

    //toString
    public String toString()
    {
        return "----------------" + "\n" +
               "//DATOS CANCIÓN//" + "\n" +
               "----------------" + "\n" +
               "TÍTULO: " + titulo + "\n"+
               "AÑO: " + anno + "\n" +
               "ESTRELLAS: " + estrellas + "\n\n";
    }
}
