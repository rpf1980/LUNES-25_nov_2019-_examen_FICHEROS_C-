package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Grupo
{
    //Atributos
    private List<Alumno> listaAlumnos;

    //Contructor
    public Grupo()
    {
        this.listaAlumnos = new ArrayList<Alumno>();
    }

    //Métodos
    public void insertaAlumnoLista(Alumno a)
    {
        listaAlumnos.add(a);
    }

    public void insertaAlumnoLista(String nombre, int edad, double calificacion)
    {
        Alumno a = new Alumno(nombre, edad, calificacion);

        listaAlumnos.add(a);
    }

    public String toString()
    {
        int i;
        String imprime = "";

        for(i = 0; i < listaAlumnos.size(); i++)
        {
            imprime = imprime + listaAlumnos.get(i).toString() + "\n\n";
        }

        return imprime;
    }

    public void escribeFicheroBinario(String fichero)
    {
        int numeroAlumnos;

        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            numeroAlumnos = listaAlumnos.size();
            dos.writeInt(numeroAlumnos); //Primera línea escrita para el nº de alumnos de la lista

            for(int i = 0; i < numeroAlumnos; i++)
            {
                dos.writeUTF(listaAlumnos.get(i).getNombre());
                dos.writeInt(listaAlumnos.get(i).getEdad());
                dos.writeDouble(listaAlumnos.get(i).getCalificacion());
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void leeFicheroBinario(String fichero)
    {
        listaAlumnos.clear();
        int n;
        String nombre;
        int edad;
        double calificacion;

        try
        {

            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            n = dis.readInt();  //Número de alumnos en la lista

            for(int i = 0; i < n; i++)
            {
                nombre = dis.readUTF();
                edad = dis.readInt();
                calificacion = dis.readDouble();

                Alumno a = new Alumno(nombre, edad, calificacion);

                listaAlumnos.add(a);
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void escribeFicheroTexto(String fichero)
    {
        try
        {
            int numeroAlumnos;

            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            numeroAlumnos = listaAlumnos.size();  //Nº de alumnos en la lista (n elementos de la lista)
            bw.write(String.valueOf(numeroAlumnos));  //Primera línea escrita en fichero (nº de alumnos o n elementos de la lista de alumnos)
            bw.newLine();

            for(int i = 0; i < numeroAlumnos; i++)
            {
                bw.write(listaAlumnos.get(i).getNombre());
                bw.newLine();
                bw.write(String.valueOf(listaAlumnos.get(i).getEdad()));
                bw.newLine();
                bw.write(String.valueOf(listaAlumnos.get(i).getCalificacion()));
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

    public void leeFicheroTexto(String fichero)
    {
        listaAlumnos.clear();
        int numeroAlumnos;
        int i;

        try
        {
            String nombre = "";
            int edad = 0;
            double calificacion = 0;

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            numeroAlumnos = Integer.parseInt(br.readLine()); //Aquí tengo el nº de alumnos del fichero
            for(i = 0; i < numeroAlumnos; i++)
            {

                nombre = br.readLine();
                edad = Integer.parseInt(br.readLine());
                calificacion = Double.parseDouble(br.readLine());

                Alumno a = new Alumno(nombre, edad, calificacion);


                listaAlumnos.add(a);
            }
            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void escribeFicheroCSV(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < listaAlumnos.size(); i++)
            {
                bw.write(listaAlumnos.get(i).getNombre() + ";");
                bw.write(String.valueOf(listaAlumnos.get(i).getEdad()) + ";");
                bw.write(String.valueOf(listaAlumnos.get(i).getCalificacion()));
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

    public void leeFicheroCSV(String fichero)
    {
        listaAlumnos.clear();

        String linea;
        String[] trozo;

        String nombre = "";
        int edad = 0;
        double calificacion = 0;
        int i;

        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            linea = br.readLine();
            while(linea != null)
            {
                trozo = linea.split(";");

                nombre = trozo[0];
                edad = Integer.parseInt(trozo[1]);
                calificacion = Double.parseDouble(trozo[2]);

                Alumno a = new Alumno(nombre, edad, calificacion);
                listaAlumnos.add(a);

                linea = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}


