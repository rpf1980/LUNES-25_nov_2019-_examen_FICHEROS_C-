package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.event.PaintEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /*CineDB db = new CineDB("cine.db");


        int numeroId = db.insertaPelicula("La Roca", 1990, true, 10);

        System.out.println(numeroId);*/
        //----------------------------------------------


        /*CineDB db = new CineDB("cine.db");

        LocalDate fecha = LocalDate.of(1999, 5, 12);
        int numeroIdActor = db.insertaActor("Concha Reyes",fecha);

        System.out.println(numeroIdActor);*/

        //--------------------------------------------------


       /* CineDB db = new CineDB("cine.db");

        db.asociaActorPelicula(1, 1, true);*/

        //----------------------------------------------------


        /*CineDB db = new CineDB("cine.db");

        int id = db.buscaActor("Loli");

        System.out.println(id);*/

        //--------------------------------------


       /* CineDB db = new CineDB("cine.db");

        int id = db.buscaPelicula("La Huída");

        System.out.println(id);*/


       //------------------------------------------

        /*CineDB db = new CineDB("cine.db");

        List<Pelicula> p;

        p = db.listadoPeliculas();

        System.out.println(p.toString());*/

        //------------------------------------------

        /*CineDB db = new CineDB("cine.db");

        List<Pelicula> listaPelis = db.listadoPeliculas();

        System.out.println(listaPelis.toString());*/

        //----------------------------------------------

        /*CineDB db = new CineDB("cine.db");

        List<Actor> listaActores = db.listadoActores();

        System.out.println(listaActores.toString());*/

        //---------------------------------------------

        /*CineDB db = new CineDB("cine.db");

        List<Pelicula> lista = db.listaPeliculasPorActor(1);

        System.out.println(lista.toString());*/

        //---------------------------------------------

        /*CineDB db = new CineDB("cine.db");

        List<ActorPelicula> lista;

        lista = db.listaActoresPorPelicula(1);

        System.out.println(lista.toString());*/

        //----------------------------------------

        /*CineDB db = new CineDB("cine.db");

        Pelicula p = db.datosPelicula(1);

        System.out.println(p);*/

        //--------------------------------------

        /*CineDB db = new CineDB("cine.db");

        Actor a = db.datosActor(1);

        System.out.println(a.toString());
*/


        //-------------------------------------

        CineDB db = new CineDB("cine.db");

        List<Actor> listaActor;
        List<Pelicula> listaPelicula;
        List<ActorPelicula> listaActorPelicula;

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while(opcion != 6)
        {
            System.out.println("==============================");
            System.out.println("PROGRAMITA PARA PROBAR LA BBDD");
            System.out.println("==============================");
            System.out.println("[1] Insertar una película y actores");
            System.out.println("[2] Listado de todas las películas");
            System.out.println("[3] Listado de los actores");
            System.out.println("[4] Listado de todas las películas de un actor");
            System.out.println("[5] Información de una película");
            System.out.println("[6] SALIR");

            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {

                    Pelicula p = new Pelicula();
                    int idPelicula = 0;
                    String nombreActor = "";
                    int idActor = 0;
                    boolean principal;
                    String opcionInsertarActor;

                    //pedimos datos de peli

                    System.out.println("Inserte los datos de la película: ");
                    System.out.print("TITULO: ");
                    p.titulo = sc.nextLine();
                    System.out.print("AÑO: ");
                    p.anno = sc.nextInt();
                    System.out.print("¿OSCAR?: ");
                    p.tieneOscar = sc.nextBoolean();
                    System.out.print("VALORACIÓN: ");
                    p.valoracion = sc.nextDouble();
                    sc.nextLine();

                    //insertamos datos en la bbdd
                    idPelicula = db.insertaPelicula(p.titulo, p.anno, p.tieneOscar, p.valoracion);


                    //Preguntamos a usuario si quiere insertar actor

                    System.out.println("¿Quieres asociar un actor a la película?");
                    opcionInsertarActor = sc.nextLine();


                    while(opcionInsertarActor.equals("si"))
                    {
                        System.out.println("<< Vamos a asociar el actor  >>");
                        System.out.println();
                        System.out.println("Nombre del actor: ");
                        nombreActor = sc.nextLine();
                        System.out.println("Dime si es actor principal: ");
                        principal = sc.nextBoolean();
                        sc.nextLine();

                        //buscamos al actor por su id
                        idActor = db.buscaActor(nombreActor);

                        if(idActor != -1)
                        {
                            db.asociaActorPelicula(idActor, idPelicula, principal);
                        }
                        else
                        {
                            Actor a = new Actor();

                            System.out.println("Inserta datos del actor ---");
                            System.out.println();
                            System.out.println("NOMBRE: ");
                            nombreActor = sc.nextLine();
                            System.out.println("FECHA: ");
                            String fecha = sc.nextLine();
                            LocalDate fechaNacimiento = LocalDate.parse(fecha);

                            idActor = db.insertaActor(nombreActor, fechaNacimiento);

                            db.asociaActorPelicula(idActor, idPelicula, principal);
                        }

                        System.out.println("¿Quieres asociar otro actor a la película?");
                        opcionInsertarActor = sc.nextLine();


                    }

                }
                break;

                case 2:
                {
                    System.out.println(db.listadoPeliculas());
                }
                break;

                case 3:
                {
                    System.out.println(db.listadoActores());
                }
                break;

                case 4:
                {
                    //listado de todas peliculas de un actor

                    System.out.println("Nombre del actor: ");
                    String nombre = sc.nextLine();

                    int id = db.buscaActor(nombre);

                    System.out.println(db.listaPeliculasPorActor(id));
                }
                break;

                case 5:
                {
                    System.out.println("Título de la película:");
                    String titulo = sc.nextLine();

                    int id = db.buscaPelicula(titulo);

                    //Datos película
                    System.out.println(db.datosPelicula(id));

                    //Actores por película
                    listaActorPelicula = db.listaActoresPorPelicula(id);

                    //Lista actores principales
                    int i;
                    System.out.println("<<:LISTA DE ACTORES PRINCIPALES:>>");
                    for(i = 0; i < listaActorPelicula.size(); i++)
                    {
                        if(listaActorPelicula.get(i).principal)
                        {
                            System.out.println(listaActorPelicula.get(i).nombre);
                        }
                        else
                        {
                            System.out.println("No hay actores principales");
                        }
                    }

                    System.out.println("<<:LISTA DE ACTORES NO PRINCIPALES:>>");
                    for(i = 0; i < listaActorPelicula.size(); i++)
                    {
                        if(!listaActorPelicula.get(i).principal)
                        {
                            System.out.println(listaActorPelicula.get(i).nombre);
                        }
                    }

                }
                break;
            }
        }
    }
}

