package com.company;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static int cuantosFicheros(String extension)
    {
        int cuantosTxt = 0;
        String nombreArchivoCompleto = "";

        int i;
        File dir = new File(".");
        File[] listado = dir.listFiles();

        for (i = 0; i < listado.length; i++)
        {
            if (listado[i].isFile())
            {
                nombreArchivoCompleto = listado[i].getName();

                if(nombreArchivoCompleto.endsWith(".txt"))
                {
                    cuantosTxt++;
                }
            }
        }

        return cuantosTxt;
    }

    public static int cuantosFicherosPro(String extension, String nombreCarpeta)
    {
        int cuantosConEsaExtension = 0;
        String elementoLista = "";
        int i;

        File dir = new File(nombreCarpeta);
        File[] listado = dir.listFiles();

        if(listado == null)
        {
            System.out.println("No hay en archivos en el directorio especificado");
        }
        else
        {
            for(i = 0; i < listado.length; i++)
            {
                if(listado[i].isFile())
                {
                    elementoLista = listado[i].getName();

                    if(elementoLista.endsWith(extension))
                    {
                        cuantosConEsaExtension++;
                    }
                }
            }
        }

        return cuantosConEsaExtension;
    }


    public static void creaBackup(String fichero)
    {
        String copiaBackup = fichero + ".bak";
        try
        {
            if(Files.exists(Path.of(fichero)))
            {
                while(Files.exists(Path.of(copiaBackup)))
                {
                    copiaBackup = copiaBackup + ".bak";
                }
            }
            Files.copy(Path.of(fichero), Path.of(copiaBackup));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void renombraMasivo(String ext1, String ext2)
    {
        File fichero = new File(".");
        File[] listado = fichero.listFiles();
        int i;
        String nombreCompletoFichero;

        for(i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile())
            {
                nombreCompletoFichero = listado[i].getName();

                if(nombreCompletoFichero.endsWith(ext1))
                {
                    int pos;
                    pos = nombreCompletoFichero.lastIndexOf(".");  //Aquí tenemos la posición del punto
                    String nombre = nombreCompletoFichero.substring(0,pos);
                    String renombre = nombre + ext2;  //Aquí hemos renombrado la extension del fichero
                    listado[i].renameTo(new File(renombre));
                }
            }
        }

    }

    public static int cuentaLineasFicheros(String extension)
    {
        int lineas = 0;
        String nombreArchivoCompleta;

        File dir = new File(".");
        File[] listado = dir.listFiles();

        try
        {
            for (int i = 0; i < listado.length; i++)
            {
                if(listado[i].isFile())
                {
                    nombreArchivoCompleta = listado[i].getName();

                    if(nombreArchivoCompleta.endsWith(extension))
                    {
                        FileReader fr = new FileReader(nombreArchivoCompleta);
                        BufferedReader br = new BufferedReader(fr);

                        String s = br.readLine();
                        while(s != null)
                        {
                            lineas++;
                            s = br.readLine();
                        }

                        br.close();
                        fr.close();
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        return lineas;
    }

    public static String ficheroMasGrande()
    {
        String ficheroMasGrande = "";
        String nombreFicheroCompleto = "";
        String nombreFicheroCompleto2 = "";
        int pos = 0;
        long tamanio = 0;  //¿Debemos usar una variable de tipo long para el tamaño del nombre del fichero?

        File dir = new File(".");
        File[] listado = dir.listFiles();

        //Con este primer for tomamos el primer fichero del directorio para poder compararlo con los demás ficheros en el segundo for
        for (int i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile())
            {
                nombreFicheroCompleto = listado[i].getName();
                tamanio = nombreFicheroCompleto.length();
                pos = i+1;
                i = listado.length;
                ficheroMasGrande = nombreFicheroCompleto;
            }
        }
        for(int i = pos; i < listado.length; i++)
        {
            if(listado[i].isFile())
            {
                nombreFicheroCompleto2 = listado[i].getName();
                long tamanio2 = nombreFicheroCompleto2.length();

                if(tamanio2 > tamanio)
                {
                    ficheroMasGrande = nombreFicheroCompleto2;
                    tamanio = tamanio2;
                }
            }
        }

        return ficheroMasGrande;
    }

    public static String dameExtensionFichero(String fichero)
    {
        String extension = "";
        int pos = fichero.lastIndexOf(".");
        extension = fichero.substring(pos);
        return extension;
    }

    public static void clasificaFicheros()
    {
        String extension = "";
        List<String> li = new ArrayList<>();
        List<String> listaExtra = new ArrayList<>();
        int i, j, contador = 0;

        File dir = new File(".");
        File[] listado = dir.listFiles();

        for(i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile())
            {
                extension = dameExtensionFichero(listado[i].getName());

                if(!li.contains(extension))
                {
                    li.add(extension);  //Aquí tendremos extensiones sin repetir
                }

                listaExtra.add(extension);  //Aquí tendremos todas las extensiones aunque se repitan
            }
        }

        int[] listaC = new int[li.size()];
        for(i = 0; i < li.size(); i++)
        {
            contador = 0;
            for(j = 0; j < listaExtra.size(); j++)
            {
                if(li.get(i).equals(listaExtra.get(j)))
                {
                    contador++;
                }
            }

            listaC[i] = contador;
        }

        for(i = 0; i < li.size(); i++)
        {
            System.out.println("La extensión: " + li.get(i) + " ==> " + listaC[i]);
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("MENÚ FICHEROS Y DIRECTORIOS");
        System.out.println("===========================");
        System.out.println("[1] cuantosFicheros");
        System.out.println("[2] cuantosFicherosPro");
        System.out.println("[3] creaBackup");
        System.out.println("[4] renombraMasivo");
        System.out.println("[5] cuentaLineasFicheros");
        System.out.println("[6] ficheroMasGrande");
        System.out.println("[7] clasificaFicheros");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe  la  función  cuantosFicheros  a  la  que  le  pasas  una  extensión  de  archivo  y  te
                //devuelve  un  entero  que  nos  dice  cuántos  ficheros  con  esa  extensión  hay  en  el
                //directorio actual.
                //Ej.: CuantosFicheros(“txt”) nos dirá cuántos ficheros .txt hay.

                int cuantosTxt;

                cuantosTxt = cuantosFicheros(".txt");
                System.out.println(cuantosTxt);

            }
            break;

            case 2:
            {
                //Escribe la función cuantosFicherosPro a la que le pasas una extensión de archivo y una
                //carpeta y te dice cuántos archivos con esa extensión hay en esa carpeta.
                //Ej.: CuantosFicherosPro(“txt”, “C:\\Windows”) nos dirá cuántos ficheros .txt
                //hay en la carpeta C:\Windows.

                String extension = "csv";
                String carpeta = "carpeta";
                int cuantosConExtension;

                cuantosConExtension = cuantosFicherosPro(extension, "E:\\ServerGitHub_java_DAW\\Ficheros4\\carpeta");
                System.out.println(cuantosConExtension);
            }
            break;

            case 3:
            {
                //Escribe  la  función  creaBackup  a  la  que  le  pasas  un  nombre  de  fichero.  La  función
                //copiará ese fichero en otro al que le añadiremos la extensión “.bak” (para tener una
                //copia de seguridad). Si el nuevo fichero existe, le añadiremos otra vez “.bak” hasta que
                //encontremos un nombre de fichero disponible.
                //Ej.: CreaBackup(“texto.txt”) copiará el fichero texto.txt a texto.txt.bak. Si este
                //nombre existe, lo copiará a texto.txt.bak.bak, etc.

                creaBackup("fichero1.txt");

            }
            break;

            case 4:
            {
                // Escribe la función renombraMasivo a la que le pasas dos extensiones de fichero. La
                //función  te  renombrará  todos  los  ficheros  que  haya  en  el  directorio  actual  con  la
                //primera extensión y les pondrá la segunda extensión.
                //Ej.:  RenombraMasivo(“txt”,  “texto”)  renombrará  todos  los  ficheros  *.txt  a
                //*.texto.


                renombraMasivo(".potorro", ".txt");

            }
            break;

            case 5:
            {
                // Escribe la función cuentaLineasFicheros a la que le pasas una extensión y te cuenta el
                //total  de  líneas  que  hay  entre  todos  los  ficheros  con  esa  extensión  que  hay  en  la
                //carpeta  actual  (esos  ficheros  deberían  ser  de  texto,  que  si  no  va  a  contar  poco).  El
                //resultado te lo devolverá en un entero.
                //Ej.:  CuentaLineasFicheros(“txt”)  te  suma  las  líneas  que  tienen  todos  los
                //ficheros .txt de la carpeta actual.

                int lineas;

                lineas = cuentaLineasFicheros(".txt");
                System.out.println(lineas);

            }
            break;

            case 6:
            {
                //Escribe la función ficheroMasGrande que nos devuelve una cadena con el nombre del
                //fichero de mayor tamaño que haya en la carpeta actual

                String nombreFichero;

                nombreFichero = ficheroMasGrande();
                System.out.println(nombreFichero);
            }
            break;

            case 7:
            {
                // Escribe  la  función  clasificaFicheros  que  te  clasifica  todos  los  ficheros  que  hay  en  la
                //carpeta actual de acuerdo a su extensión.
                //Ej.: Si en la carpeta actual están los ficheros: uno.txt, dos.txt, tres.exe, la función nos
                //escribirá: txt => 2, exe => 1.
                //La  función  no  devolverá  nada,  sino  que  lo  escribirá  por  pantalla  con  println
                //directamente.

                clasificaFicheros();

            }
            break;

            case 100:
            {
                String extension = dameExtensionFichero("asdfasd.bin");
                System.out.println(extension);
            }
            break;
        }
    }
}

