package com.company;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        MusicaDB db = new MusicaDB("192.168.134.128", "musica", "usuario", "usuario");

        //ROCK SINFÓNICO
        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Astronomy Domine.mp3", "Astronomy Domine", 1, 1, 1973, 5);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Money.mp3", "Money", 1, 1, 1973, 5);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Wish You Were Here.mp3", "Wish You Were Here", 1, 1, 1979, 5);*/

        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Resistance.mp3", "Resistance", 2, 1, 1973, 5);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Undisclosed Desires.mp3", "Undisclosed Desires", 2, 1, 1973, 5);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Uprising.mp3", "Uprising", 2, 1, 1979, 5);*/

        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Blue Saloon.mp3", "Blue Saloon", 3, 1, 1997, 5);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Moonshine.mp3", "Moonshine", 3, 1, 1997, 5);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\packMP3_ejercicioBBDD\\Sentinel.mp3", "Sentinel", 3, 1, 1997, 5);*/

        //ELECTRÓNICA
        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Firestarter.mp3", "Firestarter", 4, 2, 2000, 2);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Smack My Bitch Up.mp3", "Smack My Bitch Up", 4, 2, 2000, 1);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Their Law.mp3", "Their Law", 4, 2, 2000, 1);*/

        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Neon Lights.mp3", "Neon Lights", 5, 2, 2009, 2);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Spacelab.mp3", "Spacelab", 5, 2, 2009, 1);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\The Robots.mp3", "The Robots", 5, 2, 2009, 1);*/

        //BLUES
        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Got To Reap What You Sow.mp3", "Got To Reap What You Sow", 6, 3, 1973, 2);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Sloppy Drunk Again.mp3", "Sloppy Drunk Again", 6, 3, 1973, 1);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\What You Did Last Night.mp3", "What You Did Last Night", 6, 3, 1973, 1);*/

        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\I've Got a Secret.mp3", "I've Got a Secret", 7, 3, 2008, 2);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Promise Land.mp3", "Promise Land", 7, 3, 2008, 1);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\She's Just Too Fine.mp3", "She's Just Too Fine", 7, 3, 2008, 1);*/

        //METAL
        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Enter Sandman.mp3", "Enter Sandman", 8, 4, 1991, 2);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Nothing Else Matters.mp3", "Nothing Else Matters", 8, 4, 1991, 1);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Whiskey In The Jar.mp3", "Whiskey In The Jar", 8, 4, 1991, 1);*/

        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Iron Man.mp3", "Iron Man", 9, 4, 1979, 2);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Orchid.mp3", "Orchid", 9, 4, 1979, 3);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Paranoid.mp3", "Paranoid", 9, 4, 1979, 4);*/

        //REGGAE
        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Could You Be Loved.mp3", "Could You Be Loved", 10, 5, 2001, 2);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\One Love - People Get Ready.mp3", "One Love - People Get Ready", 10, 5, 2001, 3);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Stir It Up.mp3", "Stir It Up", 10, 5, 2001, 4);*/

        /*db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Rapture.mp3", "Rapture", 11, 5, 2019, 2);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Throne.mp3", "Throne", 11, 5, 2019, 3);
        db.insertaCancion("D:\\DAW1º(REPETIMOS)\\Toast.mp3", "Toast", 11, 5, 2019, 4);*/


        //ARTISTA ESTILO ROCK SINFÓNICO
        /*int id = db.insertaArtista("Pink Floyd");
        int id2 = db.insertaArtista("Muse");
        int id3 = db.insertaArtista("Mike Oldfield");*/

        //ARTISTAS ESTILO ELECTRÓNICA
        /*int id4 = db.insertaArtista("The Prodigy");
        int id5 = db.insertaArtista("Kraftwek");*/

        //ARTISTAS ESTILO BLUES
        /*int id6 = db.insertaArtista("Henry Townsend");
        int id7 = db.insertaArtista("Rick Vito");*/

        //ARTISTAS ESTILO METAL
        /*int id8 = db.insertaArtista("Metallica");
        int id9 = db.insertaArtista("Black Sabbath");*/

        //ARTISTA ESTILO ROCK REGGAE
        /*int id10 = db.insertaArtista("Bob Marley");
        int id11 = db.insertaArtista("Koffe");*/

        //INSERTAMOS ESTILOS
        /*int id = db.insertaEstilo("Rock Progresivo");
        System.out.println(id);
        int id2 = db.insertaEstilo("Electrónica");
        System.out.println(id2);
        int id3 = db.insertaEstilo("Blues");
        System.out.println(id3);
        int id4 = db.insertaEstilo("Metal");
        System.out.println(id4);
        int id5 = db.insertaEstilo("Reggae");
        System.out.println(id5);*/

        //int id = db.buscaArtista("Luis");
        //System.out.println(id);

        /*int id = db.buscaEstilo("Rock sinfonico");
        System.out.println(id);
*/
        //boolean existe = db.existeFichero("C:\\zarbage.mp3");
        //System.out.println(existe);

        //List<Cancion> lista = db.listadoCanciones();
        //System.out.println(lista);

        //List<Cancion> lista = db.listaCancionesPorArtista(1);
        //System.out.println(lista);

        //List<Cancion> lista = db.listadoCancionesPorEstilo(4);
        //System.out.println(lista);

        //List<Cancion> lista = db.listadoCancionesPorAnno(1972, 1987);
        //System.out.println(lista);

        /*List<Cancion> lista = db.listaCancionesPorEstrellas(12, 100);
        System.out.println(lista);*/

       /* ClasificaMP3 mp3 = new ClasificaMP3(db);
        mp3.nuevaCancion("D:\\BORRADOR\\Sorry.mp3");*/

       /*ClasificaMP3 mp3 = new ClasificaMP3(db);
       mp3.buscaCanciones("D:\\BORRADOR");*/

       /*ClasificaMP3 mp3 = new ClasificaMP3(db);
       mp3.buscaCancionesRecursivo("D:\\BORRADOR");*/

        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("CLASIFICADOR DE MP3");
        System.out.println("===================");
        System.out.println("[1] BUSCA CANCIONES");
        System.out.println("[2] BUSCA CANCIONES RECURSIVO");
        System.out.println("[3] GENERA LISTA DE REPRODUCCIÓN");
        System.out.println("[4] GENERA LISTA DE REPRODUCCIÓN ALEATORIA");
        System.out.println("[5] GENERA LISTA DE REPRODUCCIÓN POR ARTISTA");
        System.out.println("[6] GENERA LISTA DE REPRODUCCIÓN POR ESTILO");
        System.out.println("[7] GENERA LISTA DE REPRODUCCIÓN POR ESTRELLAS");
        System.out.println("================================================");

        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                //buscaCanciones

                System.out.print("Escribe ruta de la carpeta: ");
                String ruta = sc.next();

                ClasificaMP3 mp3 = new ClasificaMP3(db);
                mp3.buscaCanciones(ruta);

            }
            break;

            case 2:
            {
                //buscaCancionesRecursivo

                System.out.print("Escribe ruta de la carpeta: ");
                String ruta = sc.next();

                ClasificaMP3 mp3 = new ClasificaMP3(db);
                mp3.buscaCancionesRecursivo(ruta);

            }
            break;

            case 3:
            {
                //generaListaReproduccion

                System.out.print("Nombre fichero: ");
                String fichero = sc.next();

                ClasificaMP3 mp3 = new ClasificaMP3(db);
                mp3.generaListaReproduccion(fichero);
            }
            break;

            case 4:
            {
                //generaListaReproduccionAleatoria

                System.out.print("Nombre fichero: ");
                String fichero = sc.next();

                ClasificaMP3 mp3 = new ClasificaMP3(db);
                mp3.generaListaReproduccionAleatoria(fichero);
            }
            break;

            case 5:
            {
                //generaListaReproduccionArtista

                System.out.print("Nombre artista: ");
                String artista = sc.nextLine();
                System.out.print("Nombre fichero: ");
                String fichero = sc.nextLine();
                System.out.print("Aleatoria: ");
                boolean alea = sc.nextBoolean();
                sc.nextLine();

                ClasificaMP3 mp3 = new ClasificaMP3(db);
                mp3.generaListaReproduccionArtista(fichero, artista, alea);
            }
            break;

            case 6:
            {
                //generaListaReproduccionEstilo

                System.out.println("Estilo: ");
                String estilo = sc.nextLine();
                System.out.println("Nombre fichero: ");
                String fichero = sc.nextLine();
                System.out.println("Aleatorio: ");
                boolean alea = sc.nextBoolean();
                sc.nextLine();

                ClasificaMP3 mp3 = new ClasificaMP3(db);
                mp3.generaListaReproduccionEstilo(fichero, estilo, alea);
            }
            break;

            case 7:
            {
                //generaListaReproduccionEstrellas

                System.out.println("Nombre fichero: ");
                String fichero = sc.nextLine();
                System.out.println("Mínimo estrellas: ");
                int min = sc.nextInt();
                System.out.println("Máximo estrellas: ");
                int max = sc.nextInt();
                System.out.println("Aleatorio: ");
                boolean alea = sc.nextBoolean();
                sc.nextLine();

                ClasificaMP3 mp3 = new ClasificaMP3(db);
                mp3.generaListaReproduccionEstrellas(fichero, min, max, alea);
            }
            break;
        }

    }
}



