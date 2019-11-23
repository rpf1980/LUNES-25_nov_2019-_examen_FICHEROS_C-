package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Baraja baraja = new Baraja(1);
        baraja.barajar();

        String  respuesta = "si";
        double puntos = 0;

        System.out.println(">>>>>>>>>>---<<<<<<<<<");
        System.out.println("JUEGO DE LAS 7 y MEDIA");
        System.out.println(">>>>>>>>>>---<<<<<<<<<");
        System.out.println("Escribe SI para pedir carta");
        System.out.println("Escribe NO para plantarte");
        System.out.println();

        while(respuesta.equals("si"))
        {
            Carta carta = baraja.robar();
            //robo carta
            System.out.println("Carta = " + carta.nombreCarta());

            //pongo puntuacion total
            puntos = puntos + carta.valor7ymedia();
            System.out.println("Llevas " + puntos + " puntos");

            //si no pasado pide carta

            if(puntos < 7.5)
            {
                System.out.println("¿Quieres robar?");
                respuesta = sc.nextLine();
            }
            else
            {
                respuesta = "no";
            }
        }

        //Fuera del whila --> si puntuación es == 7.5... o mayor ---> te has pasado.... o tantos puntos totales

        if(puntos == 7.5)
        {
            System.out.println("Ganas!!!\nLO HAS CLAVAO!!!");
        }
        else
        {
            if(puntos > 7.5)
            {
                System.out.println("TE PASAS !!!");
                System.out.println("Total puntos = " + puntos);
            }
            else
            {
                System.out.println("TE PLANTAS !!!");
                System.out.println("Total puntos = " + puntos);
            }
        }

    }
}
