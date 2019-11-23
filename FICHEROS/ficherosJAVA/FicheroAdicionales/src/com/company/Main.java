package com.company;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static String convierteByteAhexadecimal(String cad, int dec)
    {
        String hexa = Integer.toHexString(dec);
        System.out.println(hexa);

        int cambioTipo = Integer.valueOf(hexa);
        if(cambioTipo >= 0 && cambioTipo < 10)
        {
            cad = "0" + cambioTipo + " ";
        }
        else
        {
            cad = hexa + " ";
        }

        cad = cad.toUpperCase();
        return cad;
    }

    public static String identificador(String fichero)
    {
        String extensionFichero = "";
        List<String> li = new ArrayList<>();
        int i;
        String s = "";
        int b = 0;
        li.add("4D 5A 90 00");

        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            BufferedInputStream dis = new BufferedInputStream(fis);

            while(dis.available() > 0)
            {
                b = dis.read();
                s += convierteByteAhexadecimal(s, b); //4d 5a 90 0 3
                System.out.println(b);
            }

            dis.close();
            fis.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return extensionFichero;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("MENÚ FICHEROS ADICIONALES");
        System.out.println("=========================");
        System.out.println("[1] identificator");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Hacer un programa identificator que te identifique los archivos que le vayas diciendo.
                //Para identificar un archivo leeremos en binario los 4 primeros bytes y dependiendo de
                //lo que encontremos, diremos que es de un tipo u otro.
                //Por ejemplo, los ficheros ejecutables “EXE” empiezan por:
                //exe ---> 4D:5A:90:00
                //pdf ---> 25:50:44:46
                //xlsx --> 50:4B:03:04
                //img ---> 53:43:4D:49
                //Investigad algunos de los archivos más comunes abriendo varios de ellos con un editor
                //hexadecimal (el Total Commander trae uno) (si no os gusta, descargaos el WinHex) y
                //viendo si concuerdan los 4 primeros bytes. Si concuerdan, los añadís a la lista.
                //Premio para el programa que detecte el mayor número de archivos.

                String tipoExtension = identificador("mini.exe");
                System.out.println(tipoExtension);
            }
            break;
        }
    }
}


