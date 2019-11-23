package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.*;

public class ClasificaMP3
{
    //Métodos aparte
    public String limpiaString(String nombre)
    {
        String limpio = "";
        int i;

        for(i = 0; i < nombre.length(); i++)
        {
            if(nombre.charAt(i) != ' ')
            {
                limpio = limpio + nombre.charAt(i);
            }
        }

        limpio = limpio.replaceAll(".mp3" , "");

        return limpio;
    }

    //Atributos
    private MusicaDB db;

    //Constructor
    public ClasificaMP3(MusicaDB db)
    {
        this.db = db;
    }

    //Métodos
    public void nuevaCancion(String ruta)
    {
        int i;
        String nombreFichero = "";
        String nombreLimpio = "";
        String[] trozos;
        String titulo = "";
        String artista = "";
        String estilo = "";
        int anio = 0;
        int estrellas = 0;
        Scanner sc = new Scanner(System.in);
        int idArtista = 0;

        if(!db.existeFichero(ruta))
        {
            File f = new File(ruta);

            if(f.isFile())
            {
                nombreFichero = f.getName();

                nombreLimpio = limpiaString(nombreFichero);

                if(nombreLimpio.contains("-"))
                {
//                    String trozo1 = nombreLimpio.substring(0, nombreLimpio.indexOf("-"));
//                    String trozo2 = nombreLimpio.substring(nombreLimpio.indexOf("-") + 1);
                    trozos = new String[nombreLimpio.length()];

                    trozos = nombreLimpio.split("-");

                    //Pedimos al usuario los datos de la canción
                    titulo = trozos[1];
                    artista = trozos[0];
                    System.out.println("INGRESE DATOS DE LA CANCIÓN");
                    System.out.println("Título: " + titulo);
                    System.out.println("Artista: " + artista);


                    //Condición para el estilo (si no existe, el usuario puede ingresar estilo) //(titulo,  artista,  estilo,  año  y  estrellas)

                }
                else
                {
                    //Como no contiene "-"... entonces tenemos solo el nombre de la canción
                    titulo = nombreLimpio;

                    //Preguntamos al usuario
                    System.out.println("INGRESE DATOS DE LA CANCIÓN");
                    System.out.println("Título: " + titulo);

                    System.out.print("Inserte artista: ");
                    artista = sc.nextLine();
                }

                idArtista = db.buscaArtista(artista);
                if(idArtista == -1) //Si no encuentra el estilo que lo inserte el usuario
                {
                    idArtista = db.insertaArtista(artista);
                }

                System.out.print("Estilo: ");
                estilo = sc.nextLine();
                int idEstilo = db.buscaEstilo(estilo);
                if(idEstilo == -1) //Si no encuentra el estilo que lo inserte el usuario
                {
                    idEstilo = db.insertaEstilo(estilo);
                }

                System.out.print("Año: ");
                anio = sc.nextInt();
                System.out.print("Estrellas: ");
                estrellas = sc.nextInt();


                db.insertaCancion(ruta, titulo, idArtista, idEstilo, anio, estrellas);
            }
            else
            {
                System.out.println("El fichero no existe");
            }
        }
    }

    public void buscaCanciones(String directorio)
    {
        File dir = new File(directorio);
        File[] listado = dir.listFiles();
        String nombreMP3 = "";
        int i;

        for(i = 0; i < listado.length; i++)
        {
            nombreMP3 = listado[i].getAbsolutePath();

            nuevaCancion(nombreMP3);
        }
    }

    public void buscaCancionesRecursivo(String directorio)
    {
        String nombreFichero = "";

        File dir = new File(directorio);
        File[] listado = dir.listFiles();
        int i;

        for(i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile())
            {
                nombreFichero = listado[i].getAbsolutePath();

                if(nombreFichero.endsWith(".mp3"))
                {
                    nuevaCancion(nombreFichero);
                }
            }
            else
            {
                if(listado[i].isDirectory())
                {
                    buscaCancionesRecursivo(listado[i].getAbsolutePath());
                }
            }
        }

    }

    public void generaListaReproduccion(String fichero)
    {
        List<Cancion> lista = db.listadoCanciones();
        escribeFicheroM3U(fichero, lista);
    }

    private void escribeFicheroM3U(String fichero, List<Cancion> lista)
    {
        int i;

        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("#EXTM3U");
            bw.newLine();
            bw.newLine();

            for(i = 0; i < lista.size(); i++)
            {
                Cancion c = lista.get(i);
                bw.write("#EXTINF:0, " + c.titulo);
                bw.newLine();
                bw.write(c.ruta);
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void generaListaReproduccionAleatoria(String fichero)
    {
        //Primero creamos la lista
        List<Cancion> listaCanciones = db.listadoCanciones();

        //Desordenamos la lista
        Collections.shuffle(listaCanciones);

        //Generamos la reproducción de la lista de canciones
        escribeFicheroM3U(fichero, listaCanciones);
    }

    public boolean generaListaReproduccionArtista(String fichero, String artista, boolean aleatorio)
    {
        boolean existeArtista;
        int idArtista = db.buscaArtista(artista); //Buscamos artista y nos devuelve su id

        List<Cancion> lista = new ArrayList<>();

        if(idArtista != -1) //Si el artista existe (si da -1 es que no existe)
        {
            lista = db.listaCancionesPorArtista(idArtista); //Metemos en lista las canciones de ese artista

            if(aleatorio)
            {
                generaListaReproduccionAleatoria(fichero); //Generamos lista de reproducción aleatoria
            }
            else
            {
                escribeFicheroM3U(fichero, lista); //Generamos lista reproduccion
            }

            existeArtista = true;
        }
        else
        {
            existeArtista = false;
        }

        return existeArtista;
    }

    public boolean generaListaReproduccionEstilo(String fichero, String estilo, boolean aleatorio)
    {
        boolean existeEstilo;
        int idEstilo = db.buscaArtista(estilo); //Buscamos artista y nos devuelve su id

        List<Cancion> lista = new ArrayList<>();

        if(idEstilo != -1) //Si el artista existe (si da -1 es que no existe)
        {
            lista = db.listadoCancionesPorEstilo(idEstilo); //Metemos en lista las canciones de ese artista

            if(aleatorio)
            {
                generaListaReproduccionAleatoria(fichero); //Generamos lista de reproducción aleatoria
            }
            else
            {
                escribeFicheroM3U(fichero, lista); //Generamos lista reproduccion
            }

            existeEstilo = true;
        }
        else
        {
            existeEstilo = false;
        }

        return existeEstilo;
    }

    public void generaListaReproduccionEstrellas(String fichero, int minimo, int maximo, boolean aleatorio)
    {
        List<Cancion> lista = db.listaCancionesPorEstrellas(minimo, maximo);

        if(aleatorio)
        {
            generaListaReproduccionAleatoria(fichero);
        }
        else
        {
            generaListaReproduccion(fichero);
        }
    }
}
