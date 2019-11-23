package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void pedirDatosAlumno(Grupo g)
    {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double calificacion;

        System.out.println("))Escribe los datos del alumno((");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        System.out.print("Calificación: ");
        calificacion = sc.nextDouble();
        System.out.println();

        g.insertaAlumnoLista(nombre,edad,calificacion);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Grupo g = new Grupo();

        int opcion = -1;

        while(opcion != 0)
        {
            System.out.println("=========================");
            System.out.println("OPCIONES GRUPO DE ALUMNOS");
            System.out.println("=========================");
            System.out.println("[1] pedirDatosAlumno");
            System.out.println("[2] imprimeLista");
            System.out.println("[3] escribeFicheroBinario");  //Revisar... falla*
            System.out.println("[4] leeFicheroBinario");
            System.out.println("[5] escribeFicheroTexto");
            System.out.println("[6] leeFicheroTexto");
            System.out.println("[7] escribeFicheroCSV");
            System.out.println("[8] leeFicheroCSV");
            System.out.println("[0] SALIR");
            System.out.println();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {
                    //Pide los datos del alumno y los inserta en la lista

                    pedirDatosAlumno(g);
                }
                break;

                case 2:
                {
                    //Imprime por consola lista de alumnos

                    System.out.println(g.toString());
                }
                break;

                case 3:
                {
                    //escribeFicheroBinario

                    System.out.println("Nombre del fichero: ");
                    String nombreFichero = sc.nextLine();

                    g.escribeFicheroBinario(nombreFichero);
                }
                break;

                case 4:
                {
                    //leeFicheroBinario

                    System.out.println("Nombre del fichero: ");
                    String nombreFichero = sc.nextLine();
                    g.leeFicheroBinario(nombreFichero);
                }
                break;

                case 5:
                {
                    //escribeFicheroTexto

                    System.out.print("Nombre del fichero de alumnos: ");
                    String nombreFichero = sc.nextLine();
                    g.escribeFicheroTexto(nombreFichero);
                }
                break;

                case 6:
                {
                    //leeFicheroTexto

                    System.out.print("Nombre del fichero de alumnos: ");
                    String nombreFichero = sc.nextLine();

                    g.leeFicheroTexto(nombreFichero);
                }
                break;

                case 7:
                {
                    //escribeFicheroCSV
                    System.out.println("Nombre de fichero: ");
                    String nombreFichero = sc.nextLine();

                    g.escribeFicheroCSV(nombreFichero);
                }
                break;

                case 8:
                {
                    //leeFicheroCSV
                    System.out.println("Nombre del fichero: ");
                    String nombre = sc.nextLine();

                    g.leeFicheroCSV(nombre);
                 }
                break;

            }

        }
    }

}
