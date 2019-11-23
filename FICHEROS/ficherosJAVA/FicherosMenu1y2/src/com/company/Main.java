package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.lang.*;

public class Main
{

    public static void escribeFicheroNumRandom10(String nombreFichero)
    {
        try
        {
            Random rd = new Random();
            int alea;
            int i;
            FileWriter fw = new FileWriter(nombreFichero);
            BufferedWriter bw = new BufferedWriter(fw);

            i = 0;
            while(i < 10)
            {
                alea = rd.nextInt(10)+1;
                bw.write(String.valueOf(alea));
                bw.newLine();
                i++;
            }

            bw.close();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt10(String fichero10)
    {
        int suma = 0;
        try
        {
            FileReader fr = new FileReader(fichero10);
            BufferedReader br = new BufferedReader(fr);

            for(int i = 0; i < 10; i++)
            {
                suma = suma + Integer.parseInt(br.readLine());
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    public static void escribeFicheroNumRandom(String fichero, int n)
    {
        try
        {
            FileWriter fr = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fr);

            Random rd = new Random();
            int alea;
            int i;

            for(i = 0; i < n; i++)
            {
                alea = rd.nextInt(100);
                bw.write(String.valueOf(alea));
                bw.newLine();
            }
            bw.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt(String fichero)
    {
        int suma = 0;

        try
        {
            String s;

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();
            while(s != null)
            {
                suma = suma + Integer.valueOf(s);
                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return suma;
    }

    public static void escribeFicheroTexto(String fichero)
    {
        Scanner escribe = new Scanner(System.in);
        String texto = "";

        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Escribe texto: ");
            texto = escribe.nextLine();
            bw.write(texto);
            bw.newLine();
            while(!texto.equals(" "))
            {
                System.out.println("Escribe texto: ");
                texto = escribe.nextLine();
                bw.write(texto);
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

    public static void leeFicheroTexto(String fichero)
    {
        String s = "";
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();
            while(s != null)
            {
                System.out.println(s);
                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void copiaFicheroTexto(String fichero, String copia)
    {

        try
        {
            String s;

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(copia);
            BufferedWriter bw = new BufferedWriter(fw);

            s = br.readLine();
            while(s != null)
            {
                bw.write(s);
                bw.newLine();
                s = br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String invierteCadena(String cadena)
    {
        String invertida = "";
        int i;

        for(i = cadena.length()-1; i >= 0; i--)
        {
            invertida += cadena.charAt(i);
        }
        return invertida;
    }

    public static void invierteLineasFichero(String fichero, String invertido)
    {
        try
        {
            String s;

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);


            FileWriter fw = new FileWriter(invertido);
            BufferedWriter bw = new BufferedWriter(fw);

            s = br.readLine();
            while(s != null)
            {
                s = invierteCadena(s);
                bw.write(s);
                bw.newLine();
                s = br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void invierteFicheroTexto(String fichero)
    {
        try
        {
            List<String> li = new ArrayList<>();
            String s;

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();
            while(s != null)
            {
                li.add(s);   //Se añaden las líneas de texto a una lista
                s = br.readLine();
            }

            br.close();
            fr.close();


            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = li.size()-1; i >= 0; i--)
            {
                bw.write(li.get(i));
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

    public static List<String> copiaFicheroEnListaString(String fichero)
    {

        List<String> li = new ArrayList<>();
        String s;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();
            while(s != null)
            {
                li.add(s);
                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return li;
    }

    public static void separaPalabrasFichero(String fichero, String copia)
    {
        List<String> li = new ArrayList<>();
        String elementoLista = "";
        String[] array;

        try
        {
            li = copiaFicheroEnListaString(fichero);

            FileWriter fw = new FileWriter(copia);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < li.size(); i++)
            {
                elementoLista = li.get(i);
                array = elementoLista.split(" ");

                for(int j = 0; j < array.length; j++)
                {
                    bw.write(array[j]);
                    bw.newLine();
                }

            }

            bw.close();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFichero1_100(String fichero)
    {
        int n = 1;

        try
        {
            //Escribimos fichero binario
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i = 0; i < 100; i++)
            {
                dos.writeInt(n);
                n++;
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroInt100(String fichero)
    {
        try
        {
            //Leemos fichero binario
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            for(int i = 0; i < 100; i++)
            {
                int n = dis.readInt();
                //System.out.println(n);
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroDeciYEnterosAleatorios(String fichero, int tamaNumFichero)
    {
        Random rd = new Random();
        int alea = 0;
        double num = 0;

        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i = 0; i < tamaNumFichero; i = i+2)
            {
                alea = rd.nextInt(100)+1;
                num = (Math.random()*101)+1;
                dos.writeInt(alea);
                dos.writeDouble(num);
                //System.out.println(alea + " " + num);  //Muestro por consola para ver resultado en base 10
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntAleatorio(String fichero, int n)
    {
        Random rd = new Random();
        int alea = 0;

        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i = 0; i < n; i++)
            {
                alea = rd.nextInt(100)+1;
                dos.writeInt(alea);
                //System.out.println(alea);  //Muestro por consola para ver resultado en base 10
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntAleatorioPro(String fichero, int valor, int min, int max)
    {
        Random rd = new Random();
        int alea = 0;

        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i = 0; i < valor; i++)
            {
                alea = rd.nextInt(max-min+1)+min;
                dos.writeInt(alea);
                //System.out.println(alea);  //mostramos para probar ejercicio
            }


            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static boolean esEntero(double numero)
    {
        boolean esEntero;
        int entero = 0;

        if(numero % 1 == 0)
        {
            esEntero = true;
        }
        else
        {
            esEntero = false;
        }

        return esEntero;
    }

    public static void leeFicheroInt(String fichero)
    {
        int numero;

        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                numero = dis.readInt();
                System.out.println(numero);
            }

            dis.close();
            fis.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroIntBin(String fichero)
    {
        int suma = 0;
        int i;

        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                suma += dis.readInt();
               // System.out.println(suma);  //esto es para verlo mejor
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return suma;
    }

    public static List<Integer> leeFicheroIntLista(String fichero)
    {
        List<Integer> li = new ArrayList<>();
        int n;

        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                n = dis.readInt();
                li.add(n);
               // System.out.println(n);
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return li;
    }

    public static void escribeFicheroIntLista(String fichero, List<Integer> li)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i = 0; i < li.size(); i++)
            {
                dos.writeInt(li.get(i));
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void ordenaFicheroInt(String fichero)
    {
        List<Integer> li = new ArrayList<>();

        try
        {
            li = leeFicheroIntLista(fichero);  //Leemos el fichero y pasamos los datos a una lista
            Collections.sort(li);              //Ordenamos la lista

            escribeFicheroIntLista(fichero, li); //Escribimos los enteros ordenados de la lista en el fichero

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void separaFicheroInt(String fichero)
    {
        List<Integer> datosOriginales = new ArrayList<>();
        List<Integer> listaPositivos = new ArrayList<>();
        List<Integer> listaNegativos = new ArrayList<>();

        int i;

        try
        {
            datosOriginales = leeFicheroIntLista(fichero);  //Aquí tenemos todos los datos del fichero original en una lista
            for(i = 0; i < datosOriginales.size(); i++)
            {
                if(datosOriginales.get(i) > 0)
                {
                    listaPositivos.add(datosOriginales.get(i)); //Lista con los nºs positivos
                }
                else if(datosOriginales.get(i) < 0)
                {
                    listaNegativos.add(datosOriginales.get(i)); //Lista con los nºs negativos
                }
            }

            //Pasamos los datos de las listas (positivos y negativos) a dos fichero nuevos (datos.binpositivos y datos.binnegativos)
            escribeFicheroIntLista("datos.binpositivos", listaPositivos);
            escribeFicheroIntLista("datos.binnegativos", listaNegativos);


            leeFicheroInt("datos.binpositivos");
            System.out.println();
            leeFicheroInt("datos.binnegativos");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroBinEnOrden(String fichero, int numeroDenteros)
    {
        int i;
        int n = 1;

        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for(i = 0; i < numeroDenteros; i++)  //Iteraciones de nºs según numeroDenteros que pases por parámetro
            {
                dos.writeInt(n);
                n++;
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void invierteFicheroInt(String fichero)
    {
        List<Integer> li = new ArrayList<>();  //Lista para copiar todos los enteros del fichero

        try
        {
            //Mostramos los datos originales (para ir probando el ejercicio y que lo podamos ver por consola)
            leeFicheroInt(fichero);
            System.out.println();

            li = leeFicheroIntLista(fichero);  //Aquí tengo todos los enteros del fichero en la lista
            Collections.reverse(li);  //Aquí ya tenemos la lista de enteros invertidos
            escribeFicheroIntLista(fichero, li); //Escribimos en fichero los datos modificados de la lista (enteros invertidos)

            //Leemos los datos del fichero para comprobar si está bien el ejercicio
            leeFicheroInt(fichero);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================");
        System.out.println("MENÚ FICHEROS JAVA");
        System.out.println("==================");
        System.out.println("[1] escribeFicheroNumRandom10");
        System.out.println("[2] sumaFicheroInt10");
        System.out.println("[3] escribeFicheroNumRandom");
        System.out.println("[4] sumaFicheroInt");
        System.out.println("[5] escribeFicheroTexto");
        System.out.println("[6] leeFicheroTexto");
        System.out.println("[7] copiaFicheroTexto");
        System.out.println("[8] invierteLineasFichero");
        System.out.println("[9] invierteFicheroTexto");
        System.out.println("[10] separaPalabrasFichero");
        System.out.println("[11] escribeFichero1_100");
        System.out.println("[12] leeFicheroInt100");
        System.out.println("[13] escribeFicheroIntAleatorio");
        System.out.println("[14] escribeFicheroIntAleatorioPro");
        System.out.println("[15] leeFicheroInt");
        System.out.println("[16] sumaFicheroIntBin");
        System.out.println("[17] leeFicheroIntLista");
        System.out.println("[18] escribeFicheroIntLista");
        System.out.println("[19] ordenaFicheroInt");
        System.out.println("[20] separaFicheroInt");
        System.out.println("[21] invierteFicheroInt");
        System.out.println("[22] escribeFicheroBinEnOrden");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe una función escribeFicheroNumRandom10 a la que le pasas un nombre de
                //fichero y te crea un fichero con ese nombre que contiene 10 números aleatorios en
                //diferentes líneas.

                //String fichero = "fichero1.txt";
                escribeFicheroNumRandom10("ficheroCalifornina.txt");

            }
            break;

            case 2:
            {
                //Escribe una función sumaFicheroInt10 a la que le pasas un fichero con 10 líneas (que
                //debe contener enteros en diferentes líneas, como el del ejercicio anterior) y te
                //devuelve la suma de todos los números contenidos en el fichero.

                int suma;
                String fich = "fichero2.txt";

                suma = sumaFicheroInt10(fich);
                System.out.println(suma);
            }
            break;

            case 3:
            {
                //Escribe una función escribeFicheroNumRandom a la que le pasas un nombre de
                //fichero y un entero y te escribe tantos números aleatorios como le hayas dicho en un
                //fichero de texto.

                String nomFichero = "fichero3.txt";
                int n;

                escribeFicheroNumRandom(nomFichero, 4);
            }
            break;

            case 4:
            {
                //Escribe una función sumaFicheroInt a la que le pasas un nombre de fichero y te
                //devuelve un entero resultante de sumar todos los números contenidos en el fichero
                //(que puede tener tantas líneas como haga falta).

                String fich = "fichero3.txt";  //Fichero del ejercicio anterior --> contiene n enteros
                int suma;

                suma = sumaFicheroInt(fich);
                System.out.println(suma);
            }
            break;

            case 5:
            {
                // Escribe una función escribeFicheroTexto a la que le pasas un nombre de fichero. La
                //función ira pidiendo al usuario que escriba líneas de texto, que se irán guardando en el
                //fichero, hasta que introduzca una línea en blanco (“”).

                String fich;

                escribeFicheroTexto("ejercicio5.txt");
            }
            break;

            case 6:
            {
                //Escribe la función leeFicheroTexto a la que le pasas un nombre de fichero y te pone el
                //contenido de fichero por pantalla.


                //Mostraremos el fichero del ejercicio5
                leeFicheroTexto("ejercicio5.txt");

            }
            break;

            case 7:
            {
                //Escribe la función copiaFicheroTexto a la que le pasas dos nombres de fichero y copias
                //el contenido del primer fichero en el segundo.

                String fichero = "ejercicio5.txt";  //Pasamos el fichero del ejercicio5
                String copia;

                copiaFicheroTexto(fichero, "copiaEjercicio7.txt");

            }
            break;

            case 8:
            {
                // Escribe la función invierteLineasFichero a las que la pasas dos nombres de fichero y te
                //copia las líneas del primer fichero al segundo fichero, pero invertidas (con el primer
                //carácter al final y el último al principio, etc.). Podéis usar la función de invertir cadenas
                //que ya tenéis hecha.

                invierteLineasFichero("ejercicio5.txt", "ejercicio8.txt");
            }
            break;

            case 9:
            {
                //Escribe la función invierteFicheroTexto a la que le pasas un nombre de fichero y te
                //invierte el contenido del fichero, es decir, la primera línea la pone la última, la segunda
                //la pone la penúltima, etc. Hay varias formas de hacerlo; la más fácil es con una lista de
                //cadenas.

                invierteFicheroTexto("copiaEjercicio7.txt");

            }
            break;

            case 10:
            {
                // Escribe la función separaPalabrasFichero a la que le pasas dos nombres de fichero. Te
                //cogerá el primer fichero (que contendrá frases) y te separará las palabras, que
                //escribirá en el segundo fichero (que tendrá una palabra en cada línea).

                separaPalabrasFichero("copiaEjercicio7.txt", "ejercicio10.txt");



            }
            break;

            case 11:
            {
                // Escribe una función escribeFichero1_100 que te escriba en un fichero binario cuyo
                //nombre le pasas por parámetro (p.ej.: “datos01.bin”) los valores enteros desde 1 hasta
                //100.

                escribeFichero1_100("ejercicio11.bin");


            }
            break;

            case 12:
            {
                //Escribe una función leeFicheroInt100 que te lea del fichero que le pasas por
                //parámetro los 100 primeros valores enteros.

                leeFicheroInt100("ejercicio11.bin");
            }
            break;

            case 13:
            {
                // Escribe una función escribeFicheroIntAleatorio a la que le pasas el nombre del fichero
                //y cuántos números aleatorios queremos escribir en el mismo. Los números aleatorios
                //serán entre 1 y 100 y serán de tipo int.

                escribeFicheroIntAleatorio("ejercicio13.bin", 10);

            }
            break;

            case 14:
            {
                // Escribe una función escribeFicheroIntAleatorioPro a la que le pasas lo siguiente: el
                //nombre del fichero, número de valores que se van a generar, el valor mínimo y el valor
                //máximo. Así, escribeFicheroIntAleatorioPro(“datos.bin”, 10, -5, 5) nos escribirá diez
                //valores aleatorios entre -5 y 5 en el fichero datos.bin.

                escribeFicheroIntAleatorioPro("ejercicio14.bin", 10, -4, 5);

            }
            break;

            case 15:
            {
                //Escribe una función leeFicheroInt que te lea del fichero que le pasas por parámetro
                //todos los valores enteros que haya en él.

                escribeFicheroDeciYEnterosAleatorios("ejerc15.bin", 10);
                leeFicheroInt("ejerc15.bin");

            }
            break;

            case 16:
            {
                //Escribe una función sumaFicheroInt que te lea de un fichero todos los valores enteros,
                //los sume y te devuelva el resultado.

                int suma;

                suma = sumaFicheroIntBin("ejercicio14.bin");
                //System.out.println(suma);

            }
            break;

            case 17:
            {
                //Escribe una función leeFicheroIntLista que te lea de un fichero todos los valores
                //enteros. Los valores los irá almacenando en una lista de enteros que devolverá. El
                //prototipo de la función será: List<Integer> LeeFicheroIntLista(String nombre_fichero).

                List<Integer> li = new ArrayList<>();

                li = leeFicheroIntLista("ejercicio13.bin");
                System.out.println(li);
            }
            break;

            case 18:
            {
                //Escribe una función escribeFicheroIntLista que te escriba en un fichero todos los
                //valores enteros de la lista que le pasamos por parámetro. El prototipo de la función
                //será: void LeeFicheroIntLista(String nombre_fichero, List<Integer> lista).

                List<Integer> li = new LinkedList<>(Arrays.asList(3,4,5,6,7,8,9));

                escribeFicheroIntLista("ejercicio18.bin", li);

            }
            break;

            case 19:
            {
                // Escribe una función ordenaFicheroInt que te lea de un fichero los valores enteros que
                //haya, los ordene y vuelva a escribir en el mismo fichero los valores ya ordenados.


                escribeFicheroIntAleatorio("ejercicio19.bin", 10);  //Creamos un fichero

                leeFicheroInt("ejercicio19.bin");
                ordenaFicheroInt("ejercicio19.bin");
                System.out.println("---------------");
                leeFicheroInt("ejercicio19.bin");


            }
            break;

            case 20:
            {
                //Escribe una función separaFicheroInt a la que le pasaremos el nombre del fichero que
                //queremos separar. La función nos creará dos ficheros que tendrán el mismo nombre
                //que el de origen pero añadiéndole “positivos” o “negativos” detrás (ej.: “datos.bin” ->
                //“datos.binpositivos”, “datos.binnegativos”). En un fichero guardaremos todos los
                //números positivos que haya en el primer fichero y en el otro los negativos.

                escribeFicheroIntAleatorioPro("datos.bin", 30, -10, 27);

                separaFicheroInt("datos.bin");


            }
            break;

            case 21:
            {
                // Escribe una función invierteFicheroInt a la que le pasaremos un fichero que contiene
                //enteros e invertirá la posición de los valores dentro del fichero, es decir, lo escribirá de
                //atrás para delante.

                escribeFicheroBinEnOrden("ejercicio21.bin", 10);

                invierteFicheroInt("ejercicio21.bin");

            }
            break;

            case 100:
            {
                //PRUEBAS SUELTAS

                escribeFicheroDeciYEnterosAleatorios("prueba100.bin", 10);

            }
            break;
        }
    }
}
