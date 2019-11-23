package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.fill;

public class Main
{
    public static void escribeListaBoolean(List<Boolean> li)
    {
        int i;
        System.out.print("<");
        for (i = 0; i < li.size() - 1; i++)
        {
            System.out.print(li.get(i) + ",");
        }
        System.out.print(li.get(li.size() - 1) + ">");
    }

    public static void escribeListaDouble(List<Double> li)
    {
        int i;
        System.out.print("<");
        for (i = 0; i < li.size() - 1; i++)
        {
            System.out.print(li.get(i) + ",");
        }
        System.out.print(li.get(li.size() - 1) + ">");
    }

    public static void escribeListaString(List<String> li)
    {
        int i;
        System.out.print("<");
        for (i = 0; i < li.size() - 1; i++)
        {
            System.out.print(li.get(i) + ",");
        }
        System.out.print(li.get(li.size() - 1) + ">");
    }

    public static void escribeLista(List<Integer> li)
    {
        int i;
        System.out.print("<");
        for (i = 0; i < li.size() - 1; i++)
        {
            System.out.print(li.get(i) + ",");
        }
        System.out.print(li.get(li.size() - 1) + ">");
    }

    public static void leeLista(List<Integer> li)
    {
        Scanner lee = new Scanner(System.in);
        int n = 0;

        while (n != -1)
        {
            System.out.print("Escribe nº: ");
            n = lee.nextInt();

            if (n == -1)
            {
                n = -1;
            } else
            {
                li.add(n);
            }
        }
    }

    public static void leeListaN(List<Integer> li, int n)
    {
        Scanner leeN = new Scanner(System.in);
        int numero;
        int i;

        for (i = 0; i < n; i++)
        {
            System.out.print("Escribe nº: ");
            numero = leeN.nextInt();
            li.add(numero);
        }
    }

    public static void eliminaNegativos(List<Integer> li)
    {
        int i;
        for (i = 0; i < li.size(); i++)
        {
            if (li.get(i) < 0)
            {
                li.remove(i);
            }
        }
    }

    public static void clasificaNumeros(List<Integer> li, List<Integer> negativos, List<Integer> positivos)
    {
        int i;
        for (i = 0; i < li.size(); i++)
        {
            if (li.get(i) < 0)
            {
                negativos.add(li.get(i));
            } else
            {
                positivos.add(li.get(i));
            }
        }
        Collections.sort(negativos);
        Collections.sort(positivos);
    }

    public static void eliminaRepetidos(List<Integer> li)
    {
        List<Integer> l2 = new ArrayList<>();
        int i;
        for (i = 0; i < li.size(); i++)
        {
            if (!l2.contains(li.get(i)))
            {
                l2.add(li.get(i));
            }
        }
        li.clear();
        li.addAll(l2);
    }

    public static void ordenaListaSeleccion(List<Integer> li)
    {
        List<Integer> orden = new ArrayList<>();
        int max;
        int pos;
        int i;

        while (!li.isEmpty())
        {
            max = li.get(0);
            for (i = 0; i < li.size(); i++)
            {
                if (li.get(i) > max)
                {
                    max = li.get(i);
                }
            }

            pos = li.indexOf(max);
            orden.add(0, max);
            li.remove(pos);
        }
        li.clear();
        li.addAll(orden);
    }

    public static void ordenaListaInsercion(List<Integer> li)
    {
        List<Integer> orden = new ArrayList<>();
        int actual;
        int i;

        while (!li.isEmpty())
        {
            actual = li.get(0);

            i = 0;
            while (i < orden.size() && actual > orden.get(i))
            {
                i++;
            }

            orden.add(i, actual);
            li.remove(0);
        }
        li.clear();
        li.addAll(orden);

    }

    public static void ordenaListaPalabras(List<String> li)
    {
        List<String> copia = new ArrayList<>();
        String min;
        int pos;
        int i;

        while (!li.isEmpty())
        {
            min = li.get(0);

            for (i = 0; i < li.size(); i++)
            {
                if (li.get(i).toLowerCase().compareTo(min) < 0)
                {
                    min = li.get(i);
                }
            }
            pos = li.indexOf(min);
            copia.add(min);
            li.remove(pos);
        }
        li.clear();
        li.addAll(copia);
    }

    public static void ordenaListaPalabras2(List<String> li)
    {
        List<String> copia = new ArrayList<>();
        String min;
        String palabra;
        int pos;
        int i;

        while (!li.isEmpty())
        {
            min = li.get(0);

            for (i = 0; i < li.size(); i++)
            {
                palabra = li.get(i);

                if (palabra.length() < min.length())
                {
                    min = palabra;
                }
            }
            pos = li.indexOf(min);
            copia.add(min);
            li.remove(pos);
        }
        li.clear();
        li.addAll(copia);
    }

    public static int[] insertaArrayEnArrayPro(int[] a, int[] b, int pos)
    {
        int[] c;
        List<Integer> li = new ArrayList<>();
        int i;

        for (i = 0; i < a.length; i++)
        {
            li.add(a[i]);
        }
        for (i = b.length - 1; i >= 0; i--)
        {
            li.add(pos, b[i]);
        }

        c = new int[li.size()];
        for (i = 0; i < li.size(); i++)
        {
            c[i] = li.get(i);
        }
        return c;
    }

    public static void sorteoBonoloto()
    {
        List<Integer> bonoloto = new ArrayList<>();
        List<Integer> li49 = new ArrayList<>();
        int pos = 0;
        int i;
        Random rd = new Random();

        //Lista de 49 nº's
        for (i = 1; i <= 49; i++)
        {
            li49.add(i);
        }

        //Elegimos los nº's y los borramos de la li49
        for (i = 0; i < 6; i++)
        {
            pos = rd.nextInt(li49.size());
            bonoloto.add(li49.get(pos));
            li49.remove(pos);
        }
        escribeLista(bonoloto);
    }

    public static int[] eliminaRepetidosPro(int[] a)
    {
        int[] b;
        List<Integer> li = new ArrayList<>();
        int i;

        //Recorremos el array para buscar elementos no repetidos
        for (i = 0; i < a.length; i++)
        {
            if (!li.contains(a[i]))
            {
                li.add(a[i]);
            }
        }

        //Tenemos la lista con los "no repetidos". Y pasamos los elementos al array que tenemos que devolver
        b = new int[li.size()];
        for (i = 0; i < li.size(); i++)
        {
            b[i] = li.get(i);
        }

        return b;
    }

    public static List<Integer> unionListas(List<Integer> li, List<Integer> l2)
    {
        List<Integer> union = new ArrayList<>();
        int i;

        for (i = 0; i < li.size(); i++)
        {
            union.add(li.get(i));
        }
        for (i = 0; i < l2.size(); i++)
        {
            if (!li.contains(l2.get(i)))
            {
                union.add(l2.get(i));
            }
        }

        Collections.sort(union);
        return union;
    }

    public static List<Integer> interseccionListas(List<Integer> li, List<Integer> l2)
    {
        List<Integer> interseccion = new ArrayList<>();
        int i;

        for (i = 0; i < li.size(); i++)
        {
            if (l2.contains(li.get(i)))
            {
                interseccion.add(li.get(i));
            }
        }
        return interseccion;
    }

    public static void desordenaLista(List<Integer> li)
    {
        List<Integer> copia = new ArrayList<>();
        int pos;
        int i;
        Random rd = new Random();

        while (!li.isEmpty())
        {
            for (i = 0; i < li.size(); i++)
            {
                pos = rd.nextInt(li.size());
                copia.add(li.get(pos));
                li.remove(pos);
            }
        }
        li.clear();
        li.addAll(copia);
    }

    public static int numeroOcurrencias(List<Integer> li, int n)
    {
        int ocurrencias = 0;
        int i;

        for (i = 0; i < li.size(); i++)
        {
            if (li.get(i) == n)
            {
                ocurrencias++;
            }
        }
        return ocurrencias;
    }

    public static int modaLista(List<Integer> li)
    {
        int moda = li.get(0);
        int i;

        for (i = 1; i < li.size(); i++)
        {
            if (numeroOcurrencias(li, moda) < numeroOcurrencias(li, li.get(i)))
            {
                moda = li.get(i);
            }
        }
        return moda;
    }

    public static double puntuacionesTrampolin(List<Double> notas)
    {
        double suma = 0;
        int i;

        //Primero ordenamos la lista
        Collections.sort(notas);

        //Eliminamos de la lista las 2 primeras posiciones y las dos últimas (2 puntuaciones menores, y las 2 mayores de los saltos)
        for (i = 0; i < 2; i++)
        {
            notas.remove(0);
            notas.remove(notas.get(notas.size() - 1));
        }

        //Sumamos los elementos que quedan
        for (i = 0; i < notas.size(); i++)
        {
            suma = suma + notas.get(i);
        }
        System.out.println("OJO");
        escribeListaDouble(notas);
        return suma;
    }

    public static List<Integer> muestraRepetidos(List<Integer> li, int n)
    {
        List<Integer> repes = new ArrayList<>();
        int i;

        for (i = 0; i < li.size(); i++)
        {
            if (li.get(i) == n)
            {
                repes.add(li.get(i));
            }
        }
        return repes;
    }

    public static void eliminaTodosIguales(int n, List<Integer> li)
    {
        List<Integer> l2 = new ArrayList<>();
        int i;

        for (i = 0; i < li.size(); i++)
        {
            if (li.get(i) != n)
            {
                l2.add(li.get(i));
            }
        }
        li.clear();
        li.addAll(l2);
    }

    public static void ordenaRepetidos(List<Integer> lista)
    {
        List<Integer> copia = new ArrayList<>();
        int moda;
        int numOcurrencias;
        int i;

        while (lista.size() > 0)
        {
            moda = modaLista(lista);
            numOcurrencias = numeroOcurrencias(lista, moda);

            for (i = 1; i <= numOcurrencias; i++)
            {
                copia.add(moda);
            }

            for (i = 0; i < lista.size(); i++)
            {
                if (lista.get(i) == moda)
                {
                    lista.remove(i);
                    i--;
                }
            }
        }
        lista.clear();
        lista.addAll(copia);

    }

    public static List<Integer> elementosUnicos(List<Integer> li)
    {
        List<Integer> unicos = new ArrayList<>();
        int i;

        for(i = 0; i < li.size(); i++)
        {
            if(numeroOcurrencias(li, li.get(i)) == 1)
            {
                unicos.add(li.get(i));
            }
        }
        return unicos;
    }

    public static List<Integer> elementosRepetidos(List<Integer> li)
    {
        List<Integer> repetidos = new ArrayList<>();
        int i;

        for(i = 0; i < li.size(); i++)
        {
            if(numeroOcurrencias(li, li.get(i)) > 1)
            {
                repetidos.add(li.get(i));
            }
        }
        eliminaRepetidos(repetidos);
        return repetidos;
    }

    public static List<Integer> listaDominoDobles(List<Integer> li)
    {
        List<Integer> pares = new ArrayList<>();
        int i;

        if(li.size() %2 != 0)
        {
            System.out.println("Error.\nNúmero impar de fichas repartidas.");
        }
        else
        {
            for(i = 0; i < li.size(); i++)
            {
                if(li.get(i) < 0 || li.get(i) > 6)
                {
                    System.out.println("Error.\nFicha no válida.");
                }
                else
                {
                    if(numeroOcurrencias(li, li.get(i)) > 1)
                    {
                        pares.add(li.get(i));
                    }
                }
            }
        }
        return pares;
    }

    public static List<String> palabrasMismaLetra(String cadena)
    {
        List<String> mismaLetra = new ArrayList<>();
        String[] array = cadena.split(" ");
        int i;
        String palabra;

        for(i = 0; i < array.length; i++)
        {
            palabra = array[i].toLowerCase();

            if(palabra.charAt(0) == palabra.charAt(palabra.length()-1))
            {
                mismaLetra.add(palabra);
            }
        }
        return mismaLetra;
    }

    public static List<String> listaPalabrasLargas(String cadena, int longitudMinima)
    {
        List<String> li = new ArrayList<>();
        String[] array = cadena.split(" ");
        int i;
        String palabra;

        for(i = 0; i < array.length; i++)
        {
            palabra = array[i];

            if(palabra.length() >= longitudMinima)
            {
                li.add(palabra);
            }
        }
        return li;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========");
        System.out.println("MENÚ LISTAS");
        System.out.println("===========");
        System.out.println("[1] leeLista");
        System.out.println("[2] leeListaN");
        System.out.println("[3] escribeLista");
        System.out.println("[4] eliminaNegativos");
        System.out.println("[5] clasificaNumeros");
        System.out.println("[6] eliminaRepetidos");
        System.out.println("[7] ordenaListaSeleccion");
        System.out.println("[8] ordenaListaInsercion");
        System.out.println("[9] ordenaListaPalabras");
        System.out.println("[10] ordenaListaPalabras2");
        System.out.println("[11] insertaArrayEnArrayPro");
        System.out.println("[12] sorteoBonoloto");
        System.out.println("[13] eliminaRepetidosPro");
        System.out.println("[14] unionListas");
        System.out.println("[15] interseccionListas");
        System.out.println("[16] desordenaLista");
        System.out.println("[17] modaLista");
        System.out.println("[18] puntuacionesTrampolin");
        System.out.println("[19] ordenaRepetidos");
        System.out.println("[20] Dos funciones (elementosUnicos || elementosRepetidos)");
        System.out.println("[21] listaDominoDobles");
        System.out.println("[22] palabrasMismaLetra");
        System.out.println("[23] listaPalabrasLargas");
        System.out.println("[100] numeroOcurrencias");
        System.out.println("[101] muestraRepetidos");
        System.out.println("[102] eliminaTodosIguales");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe la función leeLista que va leyendo enteros desde el teclado y los va metiendo en
                //una lista. La función ira leyendo valores hasta que escribamos un -1. La lista la pasamos
                //por parámetro.
                //Ejemplo de uso:
                //List<Integer> l = new ArrayList<>();
                //leeLista(l);

                List<Integer> li = new ArrayList<>();
                leeLista(li);
                escribeLista(li);

            }
            break;

            case 2:
            {
                //Escribe la función leeListaN que lee desde el teclado el número de enteros que le
                //digamos. Para ello, le pasaremos dos parámetros: la lista y un entero.
                //Ejemplo de uso:
                //List<Integer> l = new ArrayList<>();
                //leeListaN(l, 10);

                List<Integer> li = new ArrayList<>();
                int n;

                leeListaN(li, 3);
                escribeLista(li);

            }
            break;

            case 3:
            {
                //Escribe la función escribeLista a la que le pasas una lista y te escribe su contenido por
                //pantalla. Para diferenciarla de los arrays, usaremos angulos para delimitarla.
                //Ej.: <5, 6, 8, 19>

                List<Integer> li = new LinkedList<>(Arrays.asList(2, 3, 45, 6, 7, 88));
                escribeLista(li);

            }
            break;

            case 4:
            {
                //Escribe la función eliminaNegativos que elimine todos los números negativos de una
                //lista de enteros.

                List<Integer> li = new LinkedList<>(Arrays.asList(2, -2, 3, -3, 4, -4, 5, -5, 0));

                escribeLista(li);
                System.out.println();
                eliminaNegativos(li);
                escribeLista(li);

            }
            break;

            case 5:
            {
                //Escribe la función clasificaNumeros a la que le pasamos tres listas. La primera contiene
                //un montón de números positivos y negativos. Habrá que copiar los positivos en la
                //primera lista y los negativos en la segunda lista, y después ordenar las dos listas.

                List<Integer> li = new LinkedList<>(Arrays.asList(-9, 3, 4, 5, -8, -7, 8, 7, -6, -5, -4, -3, -2, -1, 1, 2, 6, 9));
                List<Integer> negativos = new ArrayList<>();
                List<Integer> positivos = new ArrayList<>();

                System.out.println("Lista original:");
                escribeLista(li);
                clasificaNumeros(li, negativos, positivos);
                System.out.println();
                System.out.println("Lista de negativos:");
                escribeLista(negativos);
                System.out.println();
                System.out.println("Lista de positivos:");
                escribeLista(positivos);


            }
            break;

            case 6:
            {
                //Escribe la función eliminaRepetidos a la que le pasas una lista y te elimina los elementos
                //repetidos, dejando sólo uno de cada (ej.: <1,2,3,1> = <1,2,3>). La forma más fácil es ir
                //copiando de una lista a otra sólo los elementos que no estén ya introducidos (p.ej.,
                //usando contains).

                List<Integer> li = new LinkedList<>(Arrays.asList(5, 5, 5, 5, 7, 8, 8, 8, 8, 9, 9, 0, 0, 0, 0, 1, 2));
                escribeLista(li);
                System.out.println();
                eliminaRepetidos(li);
                escribeLista(li);

            }
            break;

            case 7:
            {
                //Escribe la función ordenaListaSeleccion a la que le pasas una lista de enteros
                //desordenada y te la ordena mediante el algoritmo de selección.
                //La ordenación por selección funciona de la siguiente forma:
                //- Buscamos el elemento más pequeño de nuestra lista.
                //- Lo metemos en otra lista resultado.
                //- Lo eliminamos de nuestra lista.
                //- Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan
                //pasado a la lista resultado en orden

                List<Integer> li = new LinkedList<>(Arrays.asList(5, 9, 1, 4, 3, 6, 2, 7, 6, 8, 10));
                escribeLista(li);
                ordenaListaSeleccion(li);
                System.out.println();
                escribeLista(li);

            }
            break;

            case 8:
            {
                //Escribe la función ordenaListaInsercion a la que le pasas una lista de enteros
                //desordenada y te la ordena mediante el algoritmo de inserción.
                //La ordenación por inserción funciona de la siguiente forma:
                //- Cogemos cada elemento en orden de nuestra lista.
                //- A la hora de meterlo en la lista resultado lo metemos de manera que la lista
                //resultado se quede ordenada. Para ello, vamos pasando por la lista resultado hasta
                //que encontremos un valor mayor e insertamos nuestro número delante.
                //- Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan
                //pasado a la lista resultado en orden.

                List<Integer> li = new LinkedList<>(Arrays.asList(5, 9, 1, 4, 3, 6, 2, 7, 6, 8, 10));
                escribeLista(li);
                ordenaListaInsercion(li);
                System.out.println();
                escribeLista(li);

            }
            break;

            case 9:
            {
                //Escribe la función ordenaListaPalabras a la que le pasas una lista de cadenas que
                //contiene palabras y te las ordena alfabéticamente.

                List<String> li = new LinkedList<>(Arrays.asList("vacilar", "torneo", "buceadores", "antaño", "chaqueta"));

                escribeListaString(li);
                System.out.println();
                ordenaListaPalabras(li);
                escribeListaString(li);
            }
            break;

            case 10:
            {
                //Escribe la función ordenaListaPalabras2 a la que le pasas una lista de cadenas que
                //contiene palabras y te las ordena por tamaño (la más pequeña el principio).

                List<String> li = new LinkedList<>(Arrays.asList("maratoniano", "copa", "calado", "septimo", "sin", "la"));
                escribeListaString(li);
                System.out.println();
                ordenaListaPalabras2(li);
                escribeListaString(li);

            }
            break;

            case 11:
            {
                //. Escribe la función insertaArrayEnArrayPro a la que le pasamos tres parámetros: un
                //array de enteros, una posición en ese array y otro array de enteros. La función insertará
                //en el primer array, a partir de la posición indicada, todo el contenido del segundo array,
                //y nos devolverá otro array con el resultado. Para ello, usaremos una lista como paso
                //intermedio: copiamos el array a la lista, realizamos la inserción en la lista y luego
                //convertiremos la lista en un array y lo devolveremos.

                int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                int[] b = {100, 200, 300};
                int pos;
                int[] c;

                System.out.println(Arrays.toString(a));
                System.out.println(Arrays.toString(b));
                c = insertaArrayEnArrayPro(a, b, 3);
                System.out.println(Arrays.toString(c));

            }
            break;

            case 12:
            {
                //Escribe la función sorteoBonoloto que nos da los 6 números que van a tocar en el
                //próximo sorteo. Para ello, meteremos en una lista los 49 números, elegiremos una
                //posición al azar, guardaremos el número en otra lista y lo eliminaremos de la primera
                //(para que no pueda volver a salir). Al terminar de sortear los 6 números, devolveremos
                //una lista que contenga el resultado.

                sorteoBonoloto();

            }
            break;

            case 13:
            {
                //Escribe la función eliminaRepetidosPro a la que le pasamos un array (en el que puede que
                //aparezcan elementos repetidos) y nos devuelve otro array en el que no hay repetidos.
                //Podemos usar listas para que sea más sencillo.

                int[] a = {1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 7, 7, 7};
                int[] b;

                System.out.println(Arrays.toString(a));
                b = eliminaRepetidosPro(a);
                System.out.println();
                System.out.println(Arrays.toString(b));

            }
            break;

            case 14:
            {
                //Escribe la función unionListas a la que le pasas dos listas (que representan conjuntos) y
                //que te devuelve otra lista que representará la unión de ambos conjuntos. Esto es, los
                //elementos que estén o en la primera lista o en la segunda (si están en las dos, sólo hay
                //que meterlos una vez).

                List<Integer> li = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
                List<Integer> l2 = new LinkedList<>(Arrays.asList(1, 2, 3, 7, 8, 9));
                List<Integer> union = new ArrayList<>();

                escribeLista(li);

                System.out.println();
                escribeLista(l2);
                System.out.println();

                System.out.println();
                escribeLista(l2);
                System.out.println();
                System.out.println("UNION:");
                union = unionListas(li, l2);
                escribeLista(union);

            }
            break;

            case 15:
            {
                //Escribe la función interseccionListas a la que le pasas dos listas (que representan
                //conjuntos) y que te devuelve otra lista que representará la intersección de ambos
                //conjuntos. Esto es, los elementos que estén tanto en la primera lista como en la
                //segunda.

                List<Integer> li22 = new LinkedList<>(Arrays.asList(1, 2, 34, 5, 67, 8, 9, 0));
                List<Integer> li33 = new LinkedList<>(Arrays.asList(0, 21, 34, 85, 67, 80, 90));
                List<Integer> interseccion = new ArrayList<>();

                escribeLista(li22);
                System.out.println();
                escribeLista(li33);
                System.out.println();
                System.out.println();
                escribeLista(li33);
                System.out.println();

                interseccion = interseccionListas(li22, li33);
                escribeLista(interseccion);

            }
            break;

            case 16:
            {
                //Escribe la función desordenaLista a la que le pasas una lista y te la desordena. Para ello,
                //iremos cogiendo al azar elementos de la lista y poniéndolos en otra lista (quitándolos de
                //la primera). La segunda lista, contendrá los elementos al azar.

                List<Integer> li = new LinkedList<>(Arrays.asList(6, 4, 8, 9, 7, 5, 1, 3, 2));
                escribeLista(li);
                System.out.println();
                desordenaLista(li);
                escribeLista(li);

            }
            break;

            case 17:
            {
                //Escribe la función modaLista que nos devuelva la moda (el valor que más veces se repite)
                //de una lista de enteros

                List<Integer> li = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9));
                int moda;

                escribeLista(li);
                System.out.println();
                moda = modaLista(li);
                System.out.println("Moda = " + moda);

            }
            break;

            case 18:
            {
                //Escribe la función puntuacionesTrampolin. La función recibirá una lista con siete
                //números reales que se corresponderán a las notas obtenidas por un saltador de
                //trampolín de 3 metros. En este deporte, para calcular la nota final, se eliminan las dos
                //notas más altas y las dos más bajas, sumándose las tres que quedan. Por tanto, nuestra
                //función eliminará los dos valores más altos y los dos más bajos del la lista y, además,
                //devolverá un real que será la suma de los tres valores que quedan.

                List<Double> notas = new LinkedList<>(Arrays.asList(3.4, 1.6, 7.8, 5.9, 6.3, 9.4, 7.2));
                double suma;

                escribeListaDouble(notas);
                System.out.println();
                suma = puntuacionesTrampolin(notas);
                System.out.print("Puntuación final: " + suma);

            }
            break;

            case 19:
            {
                //Escribe la función ordenaRepetidos, a la que le pasas una lista con números y te la
                //ordena en función del número de veces que se repiten sus elementos, con los
                //números que más se repiten apareciendo en las primeras posiciones y los que menos
                //se repiten (o aparecen una sola vez) apareciendo en las últimas.
                //Ej.: [5, 5, 1, 2, 8, 3, 0, 3, 2, 2, 5, 7, 5] => [5, 5, 5, 5, 2, 2, 2, 3, 3, 1, 8, 0, 7]

                List<Integer> li = new LinkedList<>(Arrays.asList(5, 5, 1, 1, 1, 1, 1, 2, 8, 3, 0, 3, 2, 2, 5, 7, 5));
                escribeLista(li);
                System.out.println();
                ordenaRepetidos(li);
                escribeLista(li);

            }
            break;

            case 20:
            {
                //Escribe las funciones elementosUnicos y elementosRepetidos. La función
                //elementosUnicos recibirá una lista y nos devolverá otra lista que contendrá
                //solamente los elementos de la primera que sólo aparecen una vez.
                //Ej.: {1, 1, 2, 3, 99, 1, 99, 5} nos devolvería {2, 3, 5}

                System.out.println("=============");
                System.out.println("DOS funciones");
                System.out.println("=============");
                System.out.println("[1] elementosUnicos");
                System.out.println("[2] elementosRepetidos");
                System.out.println();
                System.out.print("Elige una de las funciones: ");
                int op = sc.nextInt();
                switch (op)
                {
                    case 1:
                    {
                        //elementosUnicos
                        List<Integer> li = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 99, 1, 99, 5));
                        List<Integer> unicos = new ArrayList<>();

                        escribeLista(li);
                        System.out.println();
                        unicos = elementosUnicos(li);
                        escribeLista(unicos);

                    }
                    break;
                    case 2:
                    {
                        //elementosRepetidos
                        List<Integer> li = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 99, 1, 99, 5));
                        List<Integer> repetidos = new ArrayList<>();

                        escribeLista(li);
                        System.out.println();
                        repetidos = elementosRepetidos(li);
                        escribeLista(repetidos);
                    }
                    break;
                }

            }
            break;

            case 21:
            {
                //listaDominoDobles
                List<Integer> li = new LinkedList<>(Arrays.asList( 1, 1, 2, 6, 0, 0,1,1, 5, 4));
                List<Integer> pares = new ArrayList<>();

                escribeLista(li);
                System.out.println();
                pares = listaDominoDobles(li);
                escribeLista(pares);

            }
            break;

            case 22:
            {
                //Escribe la función palabrasMismaLetra a la que le pasamos una cadena y nos devolverá
                //una lista de cadenas que contendrá las palabras que empiezan y acaban por la misma
                //letra. A la hora de contar las palabras, considerar
                //las mayúsculas y minúsculas.
                //Ej.: “Amanda tiene tres serpientes” devolvería {amanda, serpientes}

                String cadena = "Amanda tiene tres serpientes";
                List<String> li = new ArrayList<>();

                System.out.println(cadena);
                li = palabrasMismaLetra(cadena);
                escribeListaString(li);

            }
            break;

            case 23:
            {
                //Escribe la función listaPalabrasLargas, a la que le pasamos una cadena que contiene
                //palabras separadas por espacios y un entero en el que le indicamos la longitud mínima
                //de una palabra y nos devuelve una lista de cadenas que contendrá solamente las
                //palabras que tienen una longitud igual o mayor a la mínima.
                //Ej.: “Mi mamá me mima” (longitud = 4) devolvería {mamá, mima}

                String cadena = "camisete mas lo Roma simplemente";
                int longitudMinima;
                List<String> li = new ArrayList<>();

                System.out.println(cadena);
                li = listaPalabrasLargas(cadena, 4);
                escribeListaString(li);

            }
            break;

            case 100:
            {
                //Función que se llamará numeroOcurrencias:
                //Pasando una lista de enteros y un número n, nos devuelve el número de ocurrencias de ese número n en la lista.
                List<Integer> li = new LinkedList<>(Arrays.asList(2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5));
                int ocurrencias;

                escribeLista(li);
                System.out.println();
                ocurrencias = numeroOcurrencias(li, 4);
                System.out.print("Número de ocurrencias: " + ocurrencias);

            }

            case 101:
            {
                //Crea una función llamada muestraRepetidos a la cual le pasamos una lista y un número entero,
                //y nos devuelve otra lista con las ocurrencias de ese número entero.

                List<Integer> li = new LinkedList<>(Arrays.asList(4, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 9, 10));
                List<Integer> repes = new ArrayList<>();

                escribeLista(li);
                System.out.println();
                repes = muestraRepetidos(li, 7);
                escribeLista(repes);

            }

            case 102:
            {
                //Función llamada eliminaTodosIguales:
                //Pasamos una lista y número n, y nos borra todos los números n de esa lista.

                List<Integer> li = new LinkedList<>(Arrays.asList(3, 4, 4, 4, 2, 2, 2, 2, 6, 7, 8));

                escribeLista(li);
                System.out.println();
                eliminaTodosIguales(2, li);
                escribeLista(li);

            }

        }

    }
}


