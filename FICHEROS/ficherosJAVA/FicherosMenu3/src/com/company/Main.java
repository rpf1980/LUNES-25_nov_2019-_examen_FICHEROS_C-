package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void leeAlumnoLista(List<FichaAlumno> li)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.println();
        System.out.print("Calificación: ");
        double calificacion = sc.nextDouble();


        FichaAlumno f = new FichaAlumno();
        f.nombre = nombre;
        f.edad = edad;
        f.calificacion = calificacion;

        li.add(f);
    }

    public static void imprimeListaAlumnos(List<FichaAlumno> li)
    {
        int i;
        for (i = 0; i < li.size(); i++)
        {
            System.out.println(li.get(i).nombre);
            System.out.println(li.get(i).edad);
            System.out.println(li.get(i).calificacion);
        }
    }

    public static void escribeFicheroAlumnosBinario(List<FichaAlumno> li, String nombreFichero)
    {
        int numeroAlunos;

        try
        {
            numeroAlunos = li.size();
            FileOutputStream fos = new FileOutputStream(nombreFichero);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(numeroAlunos);

            for (int i = 0; i < li.size(); i++)
            {
                dos.writeUTF(li.get(i).nombre);
                dos.writeInt(li.get(i).edad);
                dos.writeDouble(li.get(i).calificacion);
            }

            dos.close();
            fos.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroAlumnosBinario(List<FichaAlumno> li, String fichero)
    {
        int n;
        li.clear();

        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            n = dis.readInt();

            for (int i = 0; i < n; i++)
            {
                FichaAlumno fa = new FichaAlumno();

                fa.nombre = dis.readUTF();
                fa.edad = dis.readInt();
                fa.calificacion = dis.readDouble();

                li.add(fa);
            }

            dis.close();
            fis.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroAlumnosTexto(List<FichaAlumno> li, String fichero)
    {

        int numeroAlumnos;

        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            numeroAlumnos = li.size();
            bw.write(String.valueOf(numeroAlumnos));
            bw.newLine();

            for (int i = 0; i < numeroAlumnos; i++)
            {
                bw.write(li.get(i).nombre);
                bw.newLine();
                bw.write(String.valueOf(li.get(i).edad));
                bw.newLine();
                bw.write(String.valueOf(li.get(i).calificacion));
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroAlumnosTexto(List<FichaAlumno> li, String fichero)
    {
        int n;
        li.clear();

        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            n = Integer.valueOf(br.readLine());  //Número de alumnos en la lista
            for (int i = 0; i < n; i++)
            {
                FichaAlumno fa = new FichaAlumno();

                fa.nombre = br.readLine();
                fa.edad = Integer.parseInt(br.readLine());
                fa.calificacion = Double.parseDouble(br.readLine());

                li.add(fa);
            }

            br.close();
            fr.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroAlumnosCSV(List<FichaAlumno> li, String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < li.size(); i++)
            {
                bw.write(li.get(i).nombre + ";" + li.get(i).edad + ";" + li.get(i).calificacion);
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

    public static void leeFicheroAlumnosCSV(List<FichaAlumno> la, String fichero)
    {
        la.clear();
        String linea;
        String[] trozo;
        int i;

        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            linea = br.readLine();
            while(linea != null)
            {
                trozo = linea.split(";");

                FichaAlumno fa = new FichaAlumno();

                fa.nombre = trozo[0];
                fa.edad = Integer.parseInt(trozo[1]);
                fa.calificacion = Double.parseDouble(trozo[2]);

                la.add(fa);
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        List<FichaAlumno> listaAlumnos = new ArrayList<FichaAlumno>();

        int opcion = -1;

        while (opcion != 0)
        {

            System.out.println("=====================");
            System.out.println("OPCIONES FICHA ALUMNO");
            System.out.println("=====================");
            System.out.println("[1] leeAlumnoLista");
            System.out.println("[2] imprimeListaAlumnos");
            System.out.println("[3] escribeFicheroAlumnosBinario");
            System.out.println("[4] leeFicheroAlumnosBinario");
            System.out.println("[5] escribeFicheroAlumnosTexto");
            System.out.println("[6] leeFicheroAlumnosTexto");
            System.out.println("[7] escribeFicheroAlumnosCSV");
            System.out.println("[8] leeFicheroAlumnosCSV");
            System.out.println();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    //leeAlumnoLista

                    //Escribe una función leeAlumnoLista a la que le pasas la lista de alumnos y te pide un
                    //nuevo alumno desde el teclado, cuyos datos se añadirán a la lista.


                    leeAlumnoLista(listaAlumnos);
                }
                break;

                case 2:
                {
                    //imprimeListaAlumnos

                    // Escribe una función imprimeListaAlumnos a la que la pasas la lista de alumnos y te la
                    //imprime por pantalla.

                    imprimeListaAlumnos(listaAlumnos);
                }
                break;

                case 3:
                {
                    //escribeFicheroAlumnosBinario

                    // Escribe  una  función  escribeFicheroAlumnosBinario  a  la  que  le  pasas  la  lista  y  el
                    //nombre del fichero y te escribe la lista en el fichero. La estructura del fichero será la
                    //siguiente:
                    //-  Al principio habrá un entero que será el número de alumnos que hay en la
                    //lista.
                    //-  Después irán los registros, escribiéndose un String para el nombre, un int
                    //para la edad y un double para la nota.
                    //-  Iremos escribiendo todos los registros uno a uno hasta el final.

                    escribeFicheroAlumnosBinario(listaAlumnos, "ficheroAlumnoBinario.bin");

                }
                break;

                case 4:
                {
                    //Escribe una función leeFicheroAlumnosBinario a la que le pasas una lista y el nombre
                    //del fichero y leerá la lista desde el fichero. El fichero tendrá la misma estructura que el
                    //del ejercicio anterior (evidentemente). La lista que nos pasen la borraremos antes de
                    //leer los datos del fichero.
                    //
                    //Para poder meter el alumno en la lista primero tendremos que crear un registro de
                    //tipo FichaAlumno:
                    //FichaAlumno fa = new FichaAlumno();
                    //
                    //Guardaremos los tres valores que hemos leído en el registro


                    leeFicheroAlumnosBinario(listaAlumnos, "ficheroAlumnoBinario.bin");

                    //System.out.println(li);

                }
                break;

                case 5:
                {
                    //Escribe la función escribeFicheroAlumnosTexto similar a la función del ejercicio 3 pero
                    //usando  un  fichero  de  texto.  La  estructura  del  fichero  será  similar,  pero  ahora
                    //guardaremos un valor en cada línea. Ejemplo:

                    // 2
                    // Pedro
                    // 23
                    // 7,2
                    // Juan
                    // 15
                    // 2,1

                    escribeFicheroAlumnosTexto(listaAlumnos, "ejercicio5.txt");

                }
                break;

                case 6:
                {
                    // Escribe la función leeFicheroAlumnosTexto similar a la función del ejercicio 4 pero que
                    //funciona con los ficheros de texto del ejercicio anterior.


                    leeFicheroAlumnosTexto(listaAlumnos, "ejercicio5.txt");


                }
                break;

                case 7:
                {
                    // Escribe  la  función  escribeFicheroAlumnosCSV.  En  este  caso,  no  vamos  a  guardar  el
                    //número de registros en la primera línea, ya que los ficheros CSV estándar no lo hacen.
                    //Como  carácter  separador  usaremos  el  punto  y  coma,  ya  que  uno  de  los  datos  que
                    //usamos ya contiene comas.
                    //Un ejemplo del fichero sería:
                    //
                    //Pedro;23;7,2
                    //Juan;15;2,1

                    escribeFicheroAlumnosCSV(listaAlumnos, "ejer.csv");

                }
                break;

                case 8:
                {
                    //Escribe la función leeFicheroAlumnosCSV que lee los datos del fichero anterior en una
                    //lista. Para separar los datos, lo más fácil es usar la función Split de las cadenas. Con
                    //esto  conseguiremos  un  array  de  cadenas  compuesto  por  tres  cadenas:  “Nombre”,
                    //“Edad”, “Calificación”, que tendremos que convertir al tipo de dato adecuado y meter
                    //en un registro FichaAlumno y luego en la lista.




                }
                break;
            }
        }
    }
}


