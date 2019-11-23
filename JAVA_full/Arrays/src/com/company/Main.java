package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void EscribeArray5(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < 4; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[4] + "]");
    }

    public static void EscribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length - 1] + "]");
    }

    public static void EscribeArrayDouble(double[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length - 1] + "]");
    }

    public static void EscribeArrayDoubleSinDecimales(double[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++)
        {
            System.out.print((int) a[i] + ",");
        }
        System.out.print((int) a[a.length - 1] + "]");
    }

    public static void EscribeArrayBoolean(boolean[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length - 1] + "]");
    }

    public static void LeeArray5(int[] a)
    {
        Scanner lee5 = new Scanner(System.in);
        int i;
        for (i = 0; i < 5; i++)
        {
            System.out.print("Escribe elemento nº " + i + " : ");
            a[i] = lee5.nextInt();
        }
    }

    public static void LeeArray(int[] a)
    {
        Scanner lee = new Scanner(System.in);
        int i;
        for (i = 0; i < a.length; i++)
        {
            System.out.print("Escribe elemento nº " + i + " : ");
            a[i] = lee.nextInt();
        }
    }

    public static void LeeArrayDouble(double[] a)
    {
        Scanner leedouble = new Scanner(System.in);
        int i;
        for (i = 0; i < a.length; i++)
        {
            System.out.print("Escribe elemento nº " + i + " : ");
            a[i] = leedouble.nextDouble();
        }
    }

    public static void PonCeros5(int[] a)
    {
        int i;
        for (i = 0; i < 5; i++)
        {
            a[i] = 0;
        }
    }

    public static void PonCeros(int[] a)
    {
        int i;
        for (i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }
    }

    public static int SumaArray5(int[] a)
    {
        int suma = 0;
        int i;
        for (i = 0; i < 5; i++)
        {
            suma = suma + a[i];
        }
        return suma;
    }

    public static int SumaArray(int[] a)
    {
        int suma = 0;
        int i;
        for (i = 0; i < a.length; i++)
        {
            suma += a[i];
        }
        return suma;
    }

    public static int MediaArray5(int[] a)
    {
        int suma = 0;
        int media;
        int i;
        for (i = 0; i < 5; i++)
        {
            suma += a[i];
        }
        media = suma / 5;
        return media;
    }

    public static int MediaArray(int[] a)
    {
        int media;
        int suma = 0;
        int i;
        for (i = 0; i < a.length; i++)
        {
            suma += a[i];
        }
        media = suma / a.length;
        return media;
    }

    public static void RellenaEnOrden(int[] a)
    {
        int i;
        int ordena = 1;
        for (i = 0; i < a.length; i++)
        {
            a[i] = ordena;
            ordena++;
        }
    }

    public static void RellenaEnOrdenDesc(int[] a)
    {
        int i;
        int desc = a.length;
        for (i = 0; i < a.length; i++)
        {
            a[i] = desc;
            desc--;
        }
    }

    public static void RellenaAleatorio(int[] a)
    {
        Random rd = new Random();
        int i;
        for (i = 0; i < a.length; i++)
        {
            a[i] = rd.nextInt(10) + 1;
        }
    }

    public static boolean EstaOrdenado(int[] a)
    {
        boolean ordenado = true;
        int i;
        for (i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1])
            {
                ordenado = false;
            }
        }
        return ordenado;
    }

    public static int NumerosImpares(int[] a)
    {
        int impares = 0;
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] % 2 != 0)
            {
                impares += 1;
            }
        }
        return impares;
    }

    public static int MinArray(int[] a)
    {
        int min = a[0];
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public static int MaxArray(int[] a)
    {
        int max = a[0];
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public static int NumeroAprobados(int[] a)
    {
        int aprobados = 0;
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] >= 5 && a[i] <= 10)
            {
                aprobados += 1;
            }
        }
        return aprobados;
    }

    public static int PorEncimaDe(int[] a, int limite)
    {
        int porEncima = 0;
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] >= limite)
            {
                porEncima += 1;
            }
        }
        return porEncima;
    }

    public static int CuantosCeros(int[] a)
    {
        int ceros = 0;
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] == 0)
            {
                ceros += 1;
            }
        }
        return ceros;
    }

    public static void CopiaArray(int[] a1, int[] a2)
    {
        int i;
        if (a1.length == a2.length)
        {
            for (i = 0; i < a1.length; i++)
            {
                a2[i] = a1[i];
            }
        }
    }

    public static void CopiaArrayInvertido(int[] a, int[] invertido)
    {
        int i, j;
        int guardaPrimeraPosicion = a[0];

        if (a.length == invertido.length)
        {
            j = 0;
            for (i = a.length - 1; i > 0; i--, j++)
            {
                invertido[j] += a[i];
            }
            invertido[j] = guardaPrimeraPosicion;
        } else
        {
            System.out.println("Error.\nLos arrays no son del mismo tamaño.");
        }
    }

    public static void SumaArrays(int[] a, int[] b, int[] suma)
    {
        int i;
        if (a.length == b.length && b.length == suma.length)
        {
            for (i = 0; i < a.length; i++)
            {
                suma[i] = a[i] + b[i];
            }
        } else
        {
            System.out.println("Error.\nLos arrays no son del mismo tamaño.");
        }
    }

    public static void RestaArrays(int[] a, int[] b, int[] resta)
    {
        int i;
        if (a.length == b.length && b.length == resta.length)
        {
            for (i = 0; i < a.length; i++)
            {
                resta[i] = a[i] - b[i];
            }
        } else
        {
            System.out.println("Error.\nLos arrays no tienen el mismo tamaño.");
        }
    }

    public static void MultiplicaArrays(int[] a, int[] b, int[] multiplica)
    {
        int i;
        if (a.length == b.length && b.length == multiplica.length)
        {
            for (i = 0; i < a.length; i++)
            {
                multiplica[i] = a[i] * b[i];
            }
        }
    }

    public static void DivideArrays(int[] a, int[] b, int[] divide)
    {
        int i;
        if (a.length == b.length && a.length == divide.length)
        {
            for (i = 0; i < a.length; i++)
            {
                divide[i] = a[i] / b[i];
            }
        }
    }

    public static void InvierteArray(int[] a)
    {
        int i;
        int primeraPosicionGuardada;  //Variable que guardará la primera posición del array
        int contador = a.length - 1;    //Contador que guarda la útlima posición
        for (i = 0; i < a.length / 2; i++, contador--)  //Recorremos el array partiéndolo hasta llegar a la mitad ...Aumentando contador de i (de primera posicion en adelante) || contador de atrás para adelante
        {
            primeraPosicionGuardada = a[i];   //Aquí guardo la primera posición
            a[i] = a[contador];               //En la primera posición guardo la que hay en contador (última posición)
            a[contador] = primeraPosicionGuardada;  //Y por útlimo en la última posición guardamos la primera
        }
    }

    public static boolean ComparaArrays(int[] a, int[] b)
    {
        boolean iguales = false;
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < b.length; j++)
            {
                if (a.length == b.length && a[i] == b[i])
                {
                    iguales = true;
                }
            }
        }
        return iguales;
    }

    public static void PonNotasArray(double[] notas, boolean[] calificaciones)
    {
        int i;
        for (i = 0; i < notas.length; i++)
        {
            if (notas[i] < 5)
            {
                calificaciones[i] = false;
            } else
            {
                calificaciones[i] = true;
            }
        }
    }

    public static void ConcatenaArray55(int[] a, int[] b, int[] concatenado)
    {
        /*int i;
        for(i = 0; i < a.length; i++)
        {
            concatenado[i] = a[i];
        }
        for(i = 0; i < b.length; i++)
        {
            concatenado[i + a.length] = b[i];
        }*/
        int i;
        for (i = 0; i < 5; i++)
        {
            concatenado[i] = a[i];
            concatenado[i + 5] = b[i];
        }
    }

    public static void ConcatenaArrays(int[] a, int[] b, int[] c)
    {
        if (a.length + b.length == c.length)
        {
            for (int i = 0; i < a.length; i++)
            {
                c[i] = a[i];
            }
            for (int i = 0; i < b.length; i++)
            {
                c[i + a.length] = b[i];
            }
        }
    }

    public static boolean Contiene(int[] a, int valor)
    {
        boolean contiene = false;
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] == valor)
            {
                contiene = true;
            }
        }
        return contiene;
    }

    public static int[] ConcatenaArraysPro(int[] a, int[] b)
    {
        //Primera forma de hacerlo
        /*int[] c = new int[a.length + b.length];
        ConcatenaArray55(a,b,c);
        return c;*/

        //-----------------<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>-------------------

        //Segunda forma de hacerlo
        int[] c = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++)
        {
            c[i] = c[i] + a[i];
        }
        for (i = 0; i < b.length; i++)
        {
            c[i + a.length] += b[i];
        }
        return c;
    }

    public static int[] CopiaArrayPro(int[] a)
    {
        //Primera forma de hacerlo. Usaremos función CopiaArray
        /*int[] copia = new int[a.length];
        CopiaArray(a,copia);
        return copia;*/
        //--------------<<<<<<<<<<<<<<>>>>>>>>>>>>>>>---------------------
        //Segunda forma de hacerlo sin usar funión CopiaArray
        int[] copia = new int[a.length];
        int i;
        for (i = 0; i < a.length; i++)
        {
            copia[i] += a[i];
        }
        return copia;
    }

    public static double[] CopiaArrayProDouble(double[] a)
    {
        double[] copia = new double[a.length];
        int i;
        for (i = 0; i < a.length; i++)
        {
            copia[i] += a[i];
        }
        return copia;
    }


    public static int[] InsertaEnArray(int[] a, int valor, int posicion)
    {
        //Primera forma de hacerlo (hacemos copia de array original + lo redimensionamos + vamos machacando los elementos de atrás para adelante + copiamos valor en posición)
        /*int[] copia = CopiaArrayPro(a);   //Hacemos una copia del array original
        copia = Arrays.copyOf(copia, copia.length + 1); //Lo redimensionamos
        int i;
        for(i = copia.length-1; i > posicion; i--)
        {
            copia[i] = copia[i - 1];
        }
        copia[posicion] = valor;
        return copia;*/

        //-------------------------------<<<<<<<<<<<<<<>>>>>>>>>>>>>>-------------------------------

        //Segunda forma de hacerlo (copiamos elementos anteriores a la posición + copiamos posición + copiamos elementos posteriores)
        int i;
        int[] b = new int[a.length + 1];

        //Copiamos los elementos que anteriores a la posición
        for (i = 0; i < posicion; i++)
        {
            b[i] = a[i];
        }
        b[posicion] = valor;

        //Copiamos todos los valores desde el puesto siguiente a la posición hasta el final del array
        for (i = posicion; i < a.length; i++)
        {
            b[i + 1] = a[i];
        }
        return b;
    }

    public static int[] BorraDeArray(int[] a, int posicion)
    {
        //Primera forma de hacerlo (machacando elementos desde la posición hasta el final de array + redimensionamos el array)
        /*int[] copia = CopiaArrayPro(a);
        int i;
        for(i = posicion; i < a.length-1; i++)
        {
            copia[i] = copia[i + 1];
        }
        copia = Arrays.copyOf(copia, copia.length-1);
        return copia;*/

        //---------------<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>--------------------

        //Segunda forma de hacerlo (usamos un array vacío en el tamaño - 1 del array original + vamos copiando los elementos menos el que queremos borrar)
        int[] b = new int[a.length - 1];
        int i;
        for (i = 0; i < posicion; i++)  //[3,4,6,7,8,9,7]
        {
            b[i] = a[i];
        }
        for (i = posicion + 1; i < a.length; i++)
        {
            b[i - 1] = a[i];
        }

        return b;

    }

    public static int[] Elimina1ElementoArray(int[] a, int valor)
    {
        //int[] copia = CopiaArrayPro(a);
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] == valor)
            {
                a = BorraDeArray(a, i);
                i = a.length;
            }
        }
        return a;
    }

    public static int[] EliminaElementosArray(int[] a, int valor)
    {
        int[] copia = CopiaArrayPro(a);
        int i;
        for (i = 0; i < copia.length; i++)
        {
            if (copia[i] == valor)
            {
                copia = BorraDeArray(copia, i);  //Desde BorraDeArray te está devolviendo el array con los elementos
                // borrados y estamos machacando la variable copia con los cambios.
            }
        }
        if (copia.length - 1 == valor)
        {
            copia = Arrays.copyOf(copia, copia.length - 1);
        }
        return copia;
    }

    public static int[] InsertaArrayEnArray(int[] a, int[] b, int posicion)
    {
        int[] copia;
        copia = CopiaArrayPro(a);
        int i;
        for (i = 0; i < b.length; i++)
        {
            copia = InsertaEnArray(copia, b[i], posicion);
            posicion++;
        }
        return copia;
    }

    public static int[] SubArray(int[] a, int inicio, int fin)
    {
        int i, j;
        int cota = fin - inicio + 1;
        int[] b = new int[cota];

        i = 0;
        for (j = inicio; j <= fin; j++)
        {
            b[i] = a[j];
            i++;
        }
        return b;
    }

    public static int[] RecortaArray(int[] a, int pos1, int pos2)
    {
        int k;
        int cota = pos2 - pos1 + 1;
        int[] resto = new int[a.length - cota];
        k = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (i < pos1 || i > pos2)
            {
                resto[k] = a[i];
                k++;
            }

        }
        return resto;
    }

    public static void OrdenaBurbuja(int[] a)
    {
        int aux;  //Guardará la posición primera de los 2 números que irá comprobando
        int i, j;
        //Primer bucle sirve para marcar las vueltas necesarias (tamaño del array - 1, con esas vueltas basta)
        for (i = 0; i < a.length - 1; i++)
        {
            //Bucle anidado que sirve para ir intercambiando los elementos en cada vuelta si es necesario
            for (j = 0; j < a.length - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }

    public static void IntercambiaParImpar(int[] a)
    {
        int[] b = new int[a.length];
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (i % 2 == 0)
            {
                b[i] = a[i + 1];
            } else
            {
                b[i] = a[i - 1];
            }
        }
        for (i = 0; i < a.length; i++)
        {
            a[i] = b[i];
        }
    }

    public static boolean CompruebaTarjeta(int[] a)
    {
        int[] b = new int[a.length / 2];
        boolean valida = false;
        int suma = 0;
        int i, j;

        //Primera condicion, la tarjeta debe tener 16 dígitos
        if (a.length == 16)
        {
            for (i = 0, j = 0; i < a.length; i++)
            {
                if (i % 2 == 0)
                {
                    b[j] = a[i] * 2;
                    j++;
                } else
                {
                    suma = suma + a[i];
                }
            }
            for (i = 0; i < b.length; i++)
            {
                if (b[i] >= 10)
                {
                    b[i] = b[i] - 9;
                }
                suma = suma + b[i];
            }
            if (suma % 10 == 0)
            {
                valida = true;
            }
        } else
        {
            System.out.println("La tarjeta no tiene 16 dígitos");
        }
        return valida;
    }

    public static int[] TailArray(int[] a, int n)
    {
        //Primera forma de hacerlo sin llamar a la función InvierteArray

        /*int[] b = new int[n];
        int i,j;
        int primeraPosicion;
        int contador;

        if(n > a.length || n < 0)
        {
            System.out.println("Error.\nEl tamaño del N es incorrecto");
        }
        else
        {
            j = 0;
            for(i = a.length-1; i >= a.length-n; i--)  //Comenzamos a el for con la útlima posición del array, y vamos hasta la posición del tamaño del array menos n (a.length-n)...POR QUÉ? --> porque es el tamaño del arrray menos el número de posiciones totales que tienes que mostrar por pantalla
            {
                b[j] = a[i];
                j++;
            }

            contador = b.length-1;
            for(i = 0; i < b.length/2; i++, contador--)
            {
                primeraPosicion = b[i];
                b[i] = b[contador];
                b[contador] = primeraPosicion;
            }
        }

        return b;*/
        //------------->>>>>>>>><<<<<<<<<<<-------------------

        //Segunda forma de hacerlo: Usaremos la función InvierteArray

        int[] b = new int[n];
        int i, j;
        int aux;

        if (n > a.length || n < 0)
        {
            System.out.println("Error.\nEl tamaño del N es incorrecto");
        } else
        {
            j = 0;
            for (i = a.length - 1; i >= a.length - n; i--)
            {
                b[j] = a[i];
                j++;
            }
            InvierteArray(b);
        }

        return b;
    }

    public static boolean Detecta5(int[] a)
    {
        boolean cinco = false;
        int contador = 0;
        int i, j;

        if (a.length >= 5)
        {
            for (i = 0; i < a.length - 1; i++)  //Primer for: este for nos sirve para recorrerlo
            {
                j = i + 1;
                contador = 1;
                for (j = i + 1; j < a.length - 1; j++) //Segundo for: este for nos sirve para comprobar la primera posición (i = 0) con la siguiente (j = i + 1)
                {
                    if (contador == 5)  //Comprobamos si el contador vale 5 y nos salimos de los bucles
                    {
                        i = a.length;
                        j = a.length;
                        cinco = true;
                    } else
                    {
                        if (a[i] == a[j])   //Comprueba elemento del primer bucle con el segundo
                        {
                            contador += 1; //Suma 1 al contador porque debe iniciarse en 1 para que cuente el primer elemento (por si se trata de la secuencia de 5 que estamos buscando)
                        } else  //Sino... j se iguala al array para salir del bucle
                        {
                            j = a.length;
                            contador = 0;  //Y reseteamos contador
                        }
                    }

                }
            }
        }
        return cinco;
    }

    public static boolean Primo(int n)
    {
        boolean esprimo = true;
        int i;
        int divisores = 0;

        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                divisores++;
            }
        }
        if (divisores > 2)
        {
            esprimo = false;
        }
        return esprimo;
    }

    public static boolean[] CalculaNPrimos(int n)
    {
        boolean[] nPrimos = new boolean[n + 1];  //Aumentamos el array en 1 porque el 0 no cuenta, no es primo
        int i, j;

        for (i = 0, j = 0; i < n; i++, j++)
        {
            nPrimos[j] = Primo(i);
            if (i == 0 || i == 1)
            {
                nPrimos[j] = false;
            }
        }
        return nPrimos;
    }

    public static void EscribeArrayNotas(double[] a)
    {
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        int i;
        System.out.print("[");
        for (i = 0; i < a.length; i++)
        {
            if (a[i] < 0 || a[i] > 10)
            {
                System.out.println("ERROR");
            } else
            {
                if (a[i] >= 0 && a[i] < 5)
                {
                    System.out.print(ANSI_RED + a[i] + ANSI_RESET);
                } else
                {
                    if (a[i] >= 5 && a[i] <= 10)
                    {
                        System.out.print(ANSI_GREEN + a[i] + ANSI_RESET);
                    } else
                    {
                        System.out.print(ANSI_WHITE + a[i] + ANSI_RESET);
                    }
                }
            }
            System.out.print(",");

        }
        System.out.print("\b");
        System.out.print("]");
    }

    public static void TachaElementosComunes(int[] a, int[] b)
    {
        int[] copiaA = new int[a.length];  //Ej: [1, 3, 5, 7] y [1, 2, 3, 4] => [1, 3, 0, 0] y [1, 0, 3, 0]
        int[] copiaB = new int[b.length];
        int i, j;
        int pos;
        
        //Comparamos a con b y guardamos iguales de a en copiaA
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < b.length; j++)
            {
                if (a[i] == b[j])
                {
                    pos = PrimeraPosicionDelValor(a, a[i]);
                    copiaA[pos] = a[pos];
                }
            }
        }
        
        //Comparamos b con a y guardamos iguales de b en copiaB
        for (j = 0; j < b.length; j++)
        {
            for (i = 0; i < a.length; i++)
            {
                if (b[j] == a[i])
                {
                    pos = PrimeraPosicionDelValor(b, b[j]);
                    copiaB[pos] = b[pos];
                }
            }
        }
        EscribeArray(copiaA);
        System.out.println();
        EscribeArray(copiaB);
    }

    public static int PrimeraPosicionDelValor(int[] a, int valor)
    {
        int posicion = -1;
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] == valor)
            {
                posicion = i;
                break;
            }
        }
        return posicion;
    }


    public static int[] EliminaRepetidos(int[] a)
    {
        int posicion;
        int[] b = CopiaArrayPro(a);
        int i;
        for (i = 0; i < b.length; i++)
        {
            posicion = PrimeraPosicionDelValor(b, b[i]);

            if (posicion != i)
            {
                b = BorraDeArray(b, i);
                i--;
            }
        }
        return b;
    }

    public static void RedondeaArray(double[] a)
    {
        //double[] b = CopiaArrayProDouble(a);


        int i;
        for (i = 0; i < a.length; i++)
        {
            a[i] = Math.floor(a[i]);
        }
    }


    public static double[] DecimalesArray(double[] a)
    {
        int i;
        double[] b = CopiaArrayProDouble(a);
        RedondeaArray(b);
        double[] resta = new double[b.length];

        for (i = 0; i < b.length; i++)
        {
            resta[i] = a[i] - b[i];
        }

        return resta;
    }

    public static int[] DesordenaArray(int[] a)
    {
        Random rd = new Random();
        int[] copia = CopiaArrayPro(a);
        int[] des = new int[copia.length];
        int i, pos;

        for (i = 0; i < des.length; i++) //Recorremos array vacío
        {
            pos = rd.nextInt(copia.length); //Aleatoriamente guardamos posicion (pos)
            des[i] = copia[pos];            //Copiamos elemento de esa posicion de array copiado
            copia = BorraDeArray(copia, pos); //Borramos elemento de esa posición para que no lo vuelva a seleccionar el random
        }
        return des;
    }

    public static int[] MinMaxArray(int[] a)
    {
        int min = MinArray(a);
        int max = MaxArray(a);
        int tam = max - min + 1;
        int[] b = new int[tam];
        int i, j;

        j = 0;
        for (i = min; i <= max; i++)
        {
            b[j] = i;
            j++;
        }
        return b;

    }

    public static void GraficaBarras(int[] a)
    {
        char c = '█';
        int i;

        for (i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " " + "\t");
            for (int j = 0; j <= a[i]; j++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static int MejorRacha(int[] a)
    {
        int racha = 0, max = 0;
        int i, j;

        for (i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1])
            {
                racha += 1;
            } else
            {
                if (racha > max)
                {
                    max = racha;
                    racha = 0;
                }
            }
        }
        return max;
    }

    public static boolean PrimoP(int n)
    {
        boolean primo = true;
        int i;
        int div = 0;

        for(i = 1; i <= n; i++)
        {
            if(n %i == 0)
            {
                div++;
            }
        }
        if(div > 2)
        {
            primo = false;
        }

        return primo;
    }

    public static int MCM(int a, int b)
    {
        int mcm = 0;
        int multiplo;

        if(a > b)
        {
            multiplo = a;
        }
        else
        {
            multiplo = b;
        }

        while(multiplo %a != 0 || multiplo %b != 0)
        {
            multiplo++;
        }
        return multiplo;
    }

    public static int[] NumerosPrimosPro(int[] a)
    {
        boolean primoActual;
        int conteoDePrimos = 0;
        int[] b = new int[a.length];
        int[] copia = new int[1];
        int i, n, k;
        int posicion;
        int mcm;
        int contadorCopia = 0;

        n = 0;
        //Con este primer bucle rellenamos el array a con los números del 0 al 1000
        for (i = 0; i < a.length; i++)
        {
            a[i] = n;
            n++;
        }
        //Segundo bucle va comprobando los números del array según el algoritmo del ejercicio
        for (i = 2; i < a.length; i++)
        {
            if(PrimoP(a[i]))
            {
                copia[contadorCopia] = a[i];
                copia = Arrays.copyOf(copia, copia.length+1);
                contadorCopia++;
                for(k = i+1; k < a.length; k++)
                {
                    mcm = MCM(a[i],a[k]);
                    if(a[k] %mcm == 0)
                    {
                        posicion = k;
                        if(b[posicion] != -1)
                        {
                            b[posicion] = -1;
                        }
                    }
                }
            }
        }
        if(copia[copia.length-1] == 0)
        {
            copia = BorraDeArray(copia, copia.length-1);
        }
        return copia;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========");
        System.out.println("MENÚ ARRAYS");
        System.out.println("===========");
        System.out.println("[1] EscribeArray5");
        System.out.println("[2] EscribeArray");
        System.out.println("[3] LeeArray5");
        System.out.println("[4] LeeArray");
        System.out.println("[5] PonCeros5");
        System.out.println("[6] PonCeros");
        System.out.println("[7] SumaArray5");
        System.out.println("[8] SumaArray");
        System.out.println("[9] MediaArray5");
        System.out.println("[10] MediaArray");
        System.out.println("[11] RellenaEnOrden");
        System.out.println("[12] RellenaEnOrdenDesc");
        System.out.println("[13] RellenaAleatorio");
        System.out.println("[14] EstaOrdenado");
        System.out.println("[15] NumerosImpares");
        System.out.println("[16] MinArray");
        System.out.println("[17] MaxArray");
        System.out.println("[18] NumeroAprobados");
        System.out.println("[19] PorEncimaDe");
        System.out.println("[20] CuantosCeros");
        System.out.println("[21] CopiaArray");
        System.out.println("[22] CopiaArrayInvertido");
        System.out.println("[23] SumaArrays");
        System.out.println("[24] RestaArrays || MultiplicaArrays || DivideArrays");
        System.out.println("[25] InvierteArray");
        System.out.println("[26] ComparaArrays");
        System.out.println("[27] PonNotasArray");
        System.out.println("[28] ConcatenaArray55");
        System.out.println("[29] ConcatenaArrays");
        System.out.println("[30] Contiene");
        System.out.println("[31] ConcatenaArrayPro");
        System.out.println("[32] CopiaArrayPro");
        System.out.println("[33] InsertaEnArray");
        System.out.println("[34] BorraDeArray");
        System.out.println("[35] Elimina1ElementoArray");
        System.out.println("[36] EliminaElementosArray");
        System.out.println("[37] InsertaArrayEnArray");
        System.out.println("[38] SubArray");
        System.out.println("[39] RecortaArray");
        System.out.println("[40] OrdenaBurbuja");
        System.out.println("[41] IntercambiaParImpar");
        System.out.println("[42] CompruebaTarjeta");
        System.out.println("[43] TailArray");
        System.out.println("[44] Detecta5");
        System.out.println("[45] CalculaNPrimos");
        System.out.println("[46] EscribeArrayNotas");
        System.out.println("[47] TachaElementosComunes");
        System.out.println("[48] EliminaRepetidos");
        System.out.println("[49] 2 FUNCIONES (RedondeaArray || DecimalesArray");
        System.out.println("[50] DesordenaArray");
        System.out.println("[51] MinMaxArray");
        System.out.println("[52] GraficaBarras");
        System.out.println("[53] MejorRacha");
        System.out.println("[54] NumeroPrimosPro");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe una función “escribeArray5” a la que le pasamos un array de tipo entero de
                //cinco elementos y lo escribe por pantalla de la siguiente forma: [23, 43, 1, -3, 6]
                int[] array = {1, 2, 3, 4, 5};
                EscribeArray5(array);
            }
            break;

            case 2:
            {
                //Escribe una función “escribeArray” a la que le pasamos un array de enteros del tamaño
                //que sea y lo escribe por pantalla de la misma forma. Tendremos que usar la función
                //“length” para saber el tamaño del array desde dentro de la función.
                int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
                EscribeArray(array);
            }
            break;

            case 3:
            {
                // Escribe una función “leeArray5” que lea un array de enteros de 5 elementos. Habrá
                //que pasarle el array ya definido y él lo rellenará pidiéndole los valores al usuario por
                //consola.
                int[] a = new int[5];
                LeeArray5(a);
                EscribeArray5(a);
            }
            break;

            case 4:
            {
                // Escribe una función “leeArray” que lea un array de enteros de cualquier tamaño. El
                //array lo crearemos fuera de la función y dentro de la función usaremos la función
                //“length” para saber cuál es el tamaño y cuántos datos debemos leer.
                int[] a = new int[3];
                LeeArray(a);
                EscribeArray(a);
            }
            break;

            case 5:
            {
                //Escribe una función “ponCeros5” que modifique el contenido de un array de enteros
                //de cinco elementos y ponga en todas las posiciones un 0.
                int[] a = {1, 2, 3, 4, 5};
                PonCeros5(a);
                EscribeArray5(a);
            }
            break;

            case 6:
            {
                // Escribe una función “ponCero” que haga lo mismo para un array de enteros de
                //cualquier tamaño.
                int[] a = {3, 4, 5, 6, 7, 8, 9};
                PonCeros(a);
                EscribeArray(a);
            }
            break;

            case 7:
            {
                // Escribe una función “sumaArray5” que sume todas las posiciones de un array de
                //enteros de cinco elementos y nos devuelva el resultado.
                int[] a = {3, 3, 3, 3, 3};
                int suma;

                EscribeArray5(a);
                suma = SumaArray5(a);
                System.out.println("\nSUMA = " + suma);
            }
            break;

            case 8:
            {
                //Escriba una función “sumaArray” que haga lo mismo para un array de enteros de
                //cualquier tamaño.
                int[] a = {10, 20, 30};
                int suma;

                EscribeArray(a);
                suma = SumaArray(a);
                System.out.println("\nSUMA = " + suma);
            }
            break;

            case 9:
            {
                // Escribe una función “mediaArray5” que nos calcule el valor medio de los elementos de
                //un array de enteros de tamaño 5.
                int[] a = {10, 10, 10, 10, 10};
                int media;

                EscribeArray5(a);
                media = MediaArray5(a);
                System.out.println("\nMEDIA = " + media);
            }
            break;

            case 10:
            {
                //Escribe una función “mediaArray” que haga lo mismo para un array de enteros de
                //cualquier tamaño.
                int[] a = {7, 7, 7};
                int media;

                EscribeArray(a);
                media = MediaArray(a);
                System.out.println("\nMEDIA = " + media);
            }
            break;

            case 11:
            {
                //Escribe una función “rellenaEnOrden” que nos rellena un array de enteros con los
                //números desde el 1 en adelante (1, 2, 3, 4... hasta el tamaño del array).
                int[] a = new int[4];
                RellenaEnOrden(a);
                EscribeArray(a);
            }
            break;

            case 12:
            {
                // Escribe una función “rellenaEnOrdenDesc” que nos rellena un array con los valores
                //siguientes: tamaño del array, tamaño del array-1, etc., 3, 2, 1.
                int[] a = new int[30];
                RellenaEnOrdenDesc(a);
                EscribeArray(a);
            }
            break;

            case 13:
            {
                // Escribe una función “rellenaAleatorio” a la que le pasamos un array de enteros y nos lo
                //rellena de valores aleatorios entre 1 y 10.
                int[] a = new int[20];
                RellenaAleatorio(a);
                EscribeArray(a);
            }
            break;

            case 14:
            {
                //Escribe una función “estaOrdenado” a la que le pasas un array de enteros y te
                //devuelve un booleano que será verdadero si los elementos del array se encuentran en
                //orden ascendente.
                int[] a = {5, 2, 6, 7, 8};
                //int[] a = {1,2,3,4,5};
                boolean ordenado;

                EscribeArray(a);
                ordenado = EstaOrdenado(a);
                System.out.println("\n" + ordenado);
            }
            break;

            case 15:
            {
                //Escribe una función “numeroImpares” a la que le pasas un array de enteros y te
                //devuelve un entero que corresponde a la cantidad de números impares que tenemos
                //en el array.
                int[] a = {3, 5, 7, 9, 2, 4, 6, 8};
                int impares;

                EscribeArray(a);
                impares = NumerosImpares(a);
                System.out.println("\nIMPARES = " + impares);
            }
            break;

            case 16:
            {
                //Escribe una función “minArray” a la que le pasas un array y te devuelve el valor más
                //pequeño de los contenidos en dicho array.
                int[] a = {23, 33, 56, 3};
                int min;

                EscribeArray(a);
                min = MinArray(a);
                System.out.println("\nValor más pequeño = " + min);
            }
            break;

            case 17:
            {
                // Escribe una función “maxArray” que te devuelve el más grande.
                int[] a = {12, 34, 100, 23, 2};
                int max;

                EscribeArray(a);
                max = MaxArray(a);
                System.out.println("\nValor mayor del array = " + max);
            }
            break;

            case 18:
            {
                // Escribe una función “numeroAprobados” a la que se le pasa un array de enteros y,
                //suponiendo que son notas, nos devuelve el número de aprobados (valores entre 5 y
                //10).
                int[] a = {3, 4, 6, 7, 8, 9};
                int aprobados;

                EscribeArray(a);
                aprobados = NumeroAprobados(a);
                System.out.println("\nAPROBADOS = " + aprobados);
            }
            break;

            case 19:
            {
                //Escribe una función “porEncimaDe” a la que le pasamos un valor “limite” y nos
                //devuelve cuántos elementos del array son iguales o mayores que ese límite. Por
                //ejemplo, le pasamos el valor 10 y nos dice cuántos elementos son 10 o más.
                int[] a = {23, 45, 10, 3, 4, 5, 6, 7, 8};
                int limite = 10;
                int porEncima;

                EscribeArray(a);
                porEncima = PorEncimaDe(a, limite);
                System.out.println("\nPor encima del límite = " + porEncima);
            }
            break;

            case 20:
            {
                // Escribe una función “cuantosCeros” a la que le pasamos un array y nos devuelve un
                //entero que nos dice cuántos elementos tienen el valor 0.
                int[] a = {0, 4, 5, 0, 0, 56, 0};
                int ceros;

                EscribeArray(a);
                ceros = CuantosCeros(a);
                System.out.println("\nNúmero de ceros = " + ceros);
            }
            break;

            case 21:
            {
                //Escribe una función “copiaArray” a la que le pasas dos arrays por parámetro (array1 y
                //array2, por ejemplo) del mismo tamaño (se debería comprobar dentro de la función).
                //La función copiara el contenido del primer array al segundo array.
                int[] array1 = {12, 34, 45, 67, 89};
                int[] copia = new int[array1.length];

                EscribeArray(array1);
                CopiaArray(array1, copia);
                System.out.print(" <==> ");
                EscribeArray(copia);
            }
            break;

            case 22:
            {
                // Escribe una función “copiaArrayInvertido” a la que le pasas dos arrays por parámetro y
                //te copia el contenido del primer array al segundo array pero en orden inverso (Ej.: si el
                //primero es [5,6,7,8,9], en el segundo se copiará [9,8,7,6,5]).
                int[] a = {5, 6, 7, 8, 9};
                int[] invertido = new int[a.length];

                EscribeArray(a);
                CopiaArrayInvertido(a, invertido);
                System.out.print(" <==> ");
                EscribeArray(invertido);
            }
            break;

            case 23:
            {
                // Escribe una función “sumaArrays” a la que le pasamos tres arrays. Los dos primeros
                //contendrán los datos que hay que sumar y en el tercero guardaremos el resultado (Ej.:
                //[1,2,3] + [8, 6, 8] = [9, 8, 11]).
                int[] a = {3, 4, 5};
                int[] b = {5, 4, 3};
                int[] suma = new int[a.length];

                EscribeArray(a);
                System.out.print(" + ");
                EscribeArray(b);
                SumaArrays(a, b, suma);
                System.out.print(" = ");
                EscribeArray(suma);
            }
            break;

            case 24:
            {
                System.out.println("===========");
                System.out.println("3 FUNCIONES");
                System.out.println("===========");
                System.out.println("[1] RestaArrays");
                System.out.println("[2] MultiplicaArrays");
                System.out.println("[3] DivideArrays");
                System.out.println();
                System.out.print("Elige una opción: ");
                int op = sc.nextInt();
                switch (op)
                {
                    case 1:
                    {
                        int[] a = {12, 34, 56};
                        int[] b = {8, 4, 2};
                        int[] resta = new int[a.length];

                        EscribeArray(a);
                        System.out.print(" - ");
                        EscribeArray(b);
                        RestaArrays(a, b, resta);
                        System.out.print(" = ");
                        EscribeArray(resta);
                    }
                    break;
                    case 2:
                    {
                        int[] a = {4, 5, 6};
                        int[] b = {3, 3, 3};
                        int[] multiplica = new int[a.length];

                        EscribeArray(a);
                        System.out.print(" x ");
                        EscribeArray(b);
                        MultiplicaArrays(a, b, multiplica);
                        System.out.print(" = ");
                        EscribeArray(multiplica);
                    }
                    break;
                    case 3:
                    {
                        int[] a = {34, 64, 84};
                        int[] b = {4, 4, 4};
                        int[] divide = new int[a.length];

                        EscribeArray(a);
                        System.out.print(" / ");
                        EscribeArray(b);
                        DivideArrays(a, b, divide);
                        System.out.print(" = ");
                        EscribeArray(divide);
                    }
                    break;
                }
            }
            break;

            case 25:
            {
                // Escribe una función “invierteArray” a la que le pasamos un array de enteros y modifica
                //su contenido invirtiendo la posición de sus elementos (Ej.: [1,2,3] -> [3,2,1]).
                int[] a = {1, 2, 3, 4, 5, 6, 7};

                EscribeArray(a);
                System.out.print(" < invertido > ");
                InvierteArray(a);
                EscribeArray(a);
            }
            break;

            case 26:
            {
                //Escribe una función “comparaArrays” a la que le pasamos dos arrays y nos devuelve un
                //boolean que será verdadero si los dos arrays tienen el mismo tamaño y contienen los
                //mismos datos.
                boolean iguales;
                int[] a = {1, 2, 3, 4, 5};
                //int[] b = {0,6,12};
                //int[] b = {3,4,1,2,7};
                int[] b = {1, 2, 3, 4, 5};
                //int[] b = {1,2,3,4,56};

                EscribeArray(a);
                System.out.print(" < ¿iguales? > ");
                EscribeArray(b);
                ;
                iguales = ComparaArrays(a, b);
                System.out.print(" =\t" + "\"" + iguales + "\"");
            }
            break;

            case 27:
            {
                //Escribe una función “ponNotasArray” a la que le pasamos dos arrays del mismo
                //tamaño. El primero será un array de reales (double) y contendrá las notas de los
                //alumnos. El segundo será un array de booleanos en el que deberemos escribir en cada
                //posición “true” si la nota es mayor o igual que 5 (aprobado) y “false” en caso contrario.
                double[] notas = {4.9, 5.3, 7.2, 4.3, 9.3, 8.6};
                boolean[] calificaciones = new boolean[notas.length];

                EscribeArrayDouble(notas);
                PonNotasArray(notas, calificaciones);
                System.out.println();
                EscribeArrayBoolean(calificaciones);
            }
            break;

            case 28:
            {
                // Escribe una función “concatenaArrays55” a la que le pasamos tres arrays de enteros.
                //Los dos primeros tendrán un tamaño de 5 y contendrán los datos que hay que copiar.
                //El tercero tendrá un tamaño de 10 y en él copiaremos los datos del primer array y
                //después los datos del segundo (Ej.: [4,5,6,7,8] & [1,1,2,2,3] = [4,5,6,7,8,1,1,2,2,3]).
                int[] a = {1, 2, 3, 4, 5};
                int[] b = {6, 7, 8, 9, 10};
                int[] c = new int[a.length + b.length];

                EscribeArray(a);
                System.out.print(" < == > ");
                EscribeArray(b);
                ConcatenaArray55(a, b, c);
                System.out.println();
                EscribeArray(c);
            }
            break;

            case 29:
            {
                //Escribe una función “concatenaArrays” a la que pasamos tres arrays con la condición
                //de que el tamaño del tercero sea igual a la suma del tamaño de los dos primeros. Hará
                //lo mismo que la función anterior.
                int[] a = {1, 2, 3};
                int[] b = {6, 7, 8, 9, 10};
                int[] c = new int[a.length + b.length];

                EscribeArray(a);
                System.out.print(" < == > ");
                EscribeArray(b);
                ConcatenaArrays(a, b, c);
                System.out.println();
                EscribeArray(c);
            }
            break;

            case 30:
            {
                //Escribe una función “contiene” a la que le pasamos un array y un valor entero. La
                //función nos devolverá “true” si el array contiene el número y “false” si no lo contiene.
                /*boolean contiene;
                int[] a = {23,45,65,34,0,23,12};
                int valor = 0;

                EscribeArray(a);
                System.out.print(" ¿contiene? ==> ");
                contiene = Contiene(a,valor);
                System.out.print(contiene);*/

                int tam;
                int valor;
                boolean contiene;
                int[] a;

                //Pedimos tamaño del array
                System.out.println("Tamaño del array:");
                tam = sc.nextInt();

                //Pedimos los elementos del array
                a = new int[tam];
                LeeArray(a);

                //Pedimos el valor que vamos a comprobar
                System.out.println("Valor que vamos a buscar en el array:");
                valor = sc.nextInt();

                //Mostramos array definido
                EscribeArray(a);

                //Llamamos la función Contiene y mostramos resultado que emite
                System.out.print(" ¿contiene " + valor + "?" + " ==> ");
                contiene = Contiene(a, valor);
                System.out.print(contiene);
            }
            break;

            case 31:
            {
                // Escribe una función “concatenaArraysPro” a la que le pasas dos arrays de enteros y te
                //devuelve un array cuyo tamaño es la suma del tamaño de ambos y que contiene todos
                //los elementos del primero y a continuación los del segundo. Esta función devolverá un
                //array de enteros (int[]) el cuál se creará dentro de la propia función.
                //Ej. de uso:   int[] a = {1,2,3};
                //              int[] b = {4,5,6,7,2};
                //              int[] c;
                //              c = concatenaArraysPro(a, b);
                int[] a = {1, 2, 3, 4};
                int[] b = {5, 6};
                int[] c = ConcatenaArraysPro(a, b);

                EscribeArray(a);
                System.out.print(" < concatenaPRO > ");
                EscribeArray(b);
                System.out.println();
                EscribeArray(c);
            }
            break;

            case 32:
            {
                //Escribe una función “copiaArrayPro” a la que le pasas un array y te devuelve un array
                //del mismo tamaño y con los mismos datos.
                //Ej. de uso:   int[] a = {1,2,3};
                //              int[] b;
                //              b = copiaArrayPro(a);

                int[] a = {12, 13, 14, 15};
                int[] copia = CopiaArrayPro(a);

                EscribeArray(a);
                System.out.print(" < == > ");
                EscribeArray(copia);
            }
            break;

            case 33:
            {
                // Escribe una función “insertaEnArray” a la que le pasas tres parámetros: un array de
                //enteros, un valor entero y una posición. La función insertará el valor en la posición
                //indicada, desplazando el resto de valores para hacerle hueco. La función nos devolverá
                //un array con el resultado. Ej.: Si tenemos el array [1,2,3,4,5] y queremos insertar el
                //valor “26” en la posición “2”, el resultado será: [1,2,26,3,4,5].
                int[] array = {3, 4, 5, 6, 7};
                int valor = 13;
                int posicion = 2;
                int[] copia;

                EscribeArray(array);
                System.out.print(" < == > ");
                copia = InsertaEnArray(array, valor, posicion);
                EscribeArray(copia);
            }
            break;

            case 34:
            {
                // Escribe una función “borraDeArray” a la que le pasas dos parámetros: un array de
                //enteros y una posición. La función eliminará el elemento colocado en la posición
                //indicada. La función nos devolverá un array con el resultado. Ej.: Si tenemos el array
                //[5,7,2,8,1] y queremos eliminar la posición 1, el resultado será: [5,2,8,1].
                int[] a = {5, 7, 2, 8, 1};
                int posicion = 1;
                int[] copia = BorraDeArray(a, posicion);

                EscribeArray(a);
                System.out.print(" < == > ");
                EscribeArray(copia);
            }
            break;

            case 35:
            {
                //Escribe una función “elimina1ElementoArray” a la que le pasas dos parámetros: un
                //array de enteros y un valor entero. La función eliminará del array el valor entero
                //independientemente de la posición en la que se encuentre. Si el valor se repite, se
                //eliminará sólo la primera vez que aparece el valor. La función nos devolverá un array
                //con el resultado.
                int[] a = {2, 4, 5, 67, 4, 6, 78};
                int valor = 4;
                int[] copia;

                EscribeArray(a);
                System.out.print(" < == > ");
                copia = Elimina1ElementoArray(a, valor);
                EscribeArray(copia);
            }
            break;

            case 36:
            {
                //Escribe una función “eliminaElementosArray” a la que le pasas dos parámetros: un
                //array de enteros y un valor entero. La función eliminará del array el valor entero
                //independientemente de la posición en la que se encuentre. Si el valor se repite, se
                //eliminarán todas las veces que se repite. La función nos devolverá un array con el
                //resultado.
                int[] a = {1, 2, 4, 3, 4, 5, 4, 6, 4, 7, 5, 7};
                int valor = 7;
                int[] copia;

                EscribeArray(a);
                System.out.print(" < == > ");
                copia = EliminaElementosArray(a, valor);
                EscribeArray(copia);
            }
            break;

            case 37:
            {
                //Escribe una función “insertaArrayEnArray” a la que le pasas tres parámetros: un array
                //de enteros, una posición de ese array, y otro array de enteros. La función insertará en
                //el primer array, a partir de la posición indicada, todo el contenido del segundo array.
                //La función nos devolverá un array con el resultado. Ej.: [6, 2, 1, 3], posición: 2, insertar:
                //[12, 13], resultado = [6, 2, 12, 13, 1, 3].
                int[] a = {6, 2, 1, 3};
                int posicion = 2;
                int[] b = {12, 13};
                int[] copia;

                EscribeArray(a);
                System.out.print(" < == > ");
                EscribeArray(b);
                copia = InsertaArrayEnArray(a, b, posicion);
                System.out.println();
                EscribeArray(copia);
            }
            break;

            case 38:
            {
                //Escribe una función “subArray” a la que le pasas un array y dos posiciones. La función
                //te devuelve otro array que contiene los datos comprendidos entre ambas posiciones
                //(incluidas ambas dos). Ej.: [3, 6, 2, 8, 9], posiciones, 1 y 3, resultado = [6, 2, 8].
                int[] a = {3, 6, 2, 8, 9};
                int posInicio = 1;
                int posFinal = 3;
                int[] copia;

                EscribeArray(a);
                System.out.println();
                copia = SubArray(a, posInicio, posFinal);
                EscribeArray(copia);
            }
            break;

            case 39:
            {
                // Escribe una función “recortaArray” a la que le pasas un array y dos posiciones. La
                //función te devuelve otro array que contiene los todos los datos menos los
                //comprendidos entre ambas posiciones (incluidas ambas dos). Ej.: [3, 6, 2, 8, 9],
                //posiciones, 1 y 3, resultado = [3, 9].

                int[] a = {3, 6, 2, 8, 9};
                int pos1 = 2;
                int pos2 = 3;
                int[] copia;

                EscribeArray(a);
                System.out.println();
                copia = RecortaArray(a, pos1, pos2);
                System.out.println();
                EscribeArray(copia);
            }
            break;

            case 40:
            {
                //Escribe la función “ordenaBurbuja” a la que le pasaremos un array de enteros y lo
                //ordenará mediante la ordenación de la burbuja. La ordenación de la burbuja funciona
                //de la siguiente forma:
                //•  Si el array tiene N elementos, se realizarán N-1 pasadas (por ejemplo, para un
                //array de 5 elementos tendremos que realizar 4 pasadas para que quede
                //ordenado).
                //•  En cada pasada, iremos recorriendo el array de principio a fin comprobando los
                //números por parejas (por ejemplo: el primer y segundo número, el segundo y el
                //tercero, etc.).
                //•  Si la pareja de números está en orden (o sea, el primero es menor que el segundo)
                //la dejamos como está y si está desordenada, los intercambiamos.

                int[] a = {6, 4, 3, 9, 12, 1, 2, 8, 5, 7, 10, 11, 13};

                EscribeArray(a);
                System.out.println();
                OrdenaBurbuja(a);
                EscribeArray(a);
            }
            break;

            case 41:
            {
                // Escribe  la  función  intercambiaParImpar.  A  esta  función  le  pasaremos  un  array  de
                //enteros  por  parámetro  y  en  ese  mismo  array  intercambiará  los  elementos  de  las
                //posiciones pares por los elementos de las posiciones impares: el elemento de la posición
                //0 se intercambiará con el de la posición 1, el de la posición 2 con el de la posición 3, etc.
                //El array tendrá que tener un número par de elementos (2, 4, 6, etc.). De no ser así, la
                //función mostrará un mensaje de error y dejará el array como estaba.
                //Ej.:  Si le pasamos [1, 2, 3, 4, 5, 6], el array quedará: [2, 1, 4, 3, 6, 5]
                //  Si le pasamos [1, 2, 1, 2, 1, 2], el array quedará: [2, 1, 2, 1, 2, 1]
                //  Si le pasamos [7, 1, 4, 6, 9, 5], el array quedará: [1, 7, 6, 4, 5, 9]

                int[] a = {1, 2, 3, 4, 5, 6};
                int[] b = {1, 2, 1, 2, 1, 2};
                int[] c = {7, 1, 4, 6, 9, 5};

                EscribeArray(a);
                System.out.println();
                IntercambiaParImpar(a);
                EscribeArray(a);
                System.out.println();

                EscribeArray(b);
                System.out.println();
                IntercambiaParImpar(b);
                EscribeArray(b);
                System.out.println();

                EscribeArray(c);
                System.out.println();
                IntercambiaParImpar(c);
                EscribeArray(c);
            }
            break;

            case 42:
            {
                //Escribe la función compruebaTarjeta. A esta función le pasaremos un array de enteros
                //con los 16 números de una tarjeta de crédito. La función nos devolverá un boolean que
                //será true si el número de tarjeta es correcto y false si no lo es. Para averiguar si un
                //número de tarjeta de crédito es correcto utilizaremos el siguiente algoritmo:
                //1.  Multiplicar por dos los valores que estén en las posiciones pares del array (0, 2, …).
                //2.  Si algún valor es mayor que 10, restarle 9 a ese valor.
                //3.  Sumar todos los valores. Si el resultado es múltiplo de 10, la tarjeta es buena.
                //Ejemplos de tarjetas válidas: 5565 8666 4522 7307, 4929 9968 6150 1756
                //
                //Nota:  No  os  carguéis  el  array  inicial.  Si  el  array  no  tiene  16  elementos,  devolver  false
                //directamente.

                //int[] a = {5,5,6,5,8,6,6,6,4,5,2,2,7,3,0,7};
                int[] a = {4, 9, 2, 9, 9, 9, 6, 8, 6, 1, 5, 0, 1, 7, 5, 6};
                boolean valida;

                EscribeArray(a);
                valida = CompruebaTarjeta(a);
                System.out.println("\nTarjeta = " + valida);

            }
            break;

            case 43:
            {
                //Escribe  la  función  tailArray.  A  esta  función  le  pasaremos  un  array  de  enteros  y  un
                //número n. La función nos devolverá otro array de enteros con los n últimos elementos
                //del array que le pasamos. O sea, si n = 5, nos devolverá un array con las cinco últimas
                //posiciones del primero. Si n es mayor que el número de elementos del array o  n es
                //menor que 0, la función mostrará un mensaje de error y devolverá el array original.
                //Ej.:   Si le pasamos [1, 2, 3, 4, 5, 6] y n=3, nos devolverá: [4, 5, 6]
                //
                //Nota: El array que le pasamos por parámetro debe quedar exactamente igual que al principio;
                //no os lo carguéis.

                int[] a = {1, 2, 3, 4, 5, 6};
                int n = 4;
                int[] b;

                EscribeArray(a);
                System.out.println();
                b = TailArray(a, n);
                EscribeArray(b);
            }
            break;

            case 44:
            {
                //Escribe la función detecta5 a la que le pasamos un array de enteros y nos dice si hay, al
                //menos una vez, cinco números iguales consecutivos (nos devuelve un boolean).

                int[] a = {1, 2, 2, 2, 3, 3, 7, 7, 7, 7, 7, 8, 9, 10};
                int[] b = {4, 4, 6, 6, 3, 3, 3, 3, 9, 0};
                boolean detecta5;

                EscribeArray(a);
                detecta5 = Detecta5(a);
                System.out.println("\n¿Detecta 5? = " + detecta5);

                EscribeArray(b);
                detecta5 = Detecta5(b);
                System.out.println("\n¿Detecta 5? = " + detecta5);
            }
            break;

            case 45:
            {
                // Escribe  la  función calculaNPrimos.  A  la función  le pasaremos  un entero  que  será el
                //máximo número primo que queremos calcular. Por ejemplo, si le pasamos el 10 nos dirá
                //qué números son primos entre 1 y 10.
                //El resultado lo devolverá en un array de booleanos, de tal forma que, si un número x es
                //primo, en la posición x pondrá true y si no es primo pondrá false.
                //
                //Ej.:  CalculaNPrimos(10)  nos  devolverá  un  array  de  11  elementos (porque  la  primera
                //posición es 0 y necesitamos 11 para que exista la posición 10).
                //El array será:  [ False False True True False True False True False False False ]
                //Las dos primeras posiciones son false porque el 0 y el 1 no son primos y luego estarán a
                //true las posiciones 2, 3, 5 y 7.

                int n = 10;
                boolean[] nPrimos;

                System.out.println("Para " + n + " números enteros");
                nPrimos = CalculaNPrimos(n);
                EscribeArrayBoolean(nPrimos);

            }
            break;

            case 46:
            {
                //Escribe la función EscribeArrayNotas que te escribe por pantalla un array de double que
                //contiene notas del alumnado, con las siguientes características:
                //•  Si la nota está entre 5 y 10, se escribirá en verde.
                //•  Si la nota está entre 0 y 5 (sin incluir el cinco), se escribirá en rojo.
                //•  Si la nota no está entre 0 y 10, en lugar de la nota se escribirá “ERROR” en
                //amarillo.
                //•  El resto de cosas (los corchetes, las comas) se escribirán en blanco.
                //Para cambiar de color en la consola, en Java tenemos que usar los códigos ANSI. Para
                //imprimir en un color, escribiremos el código ANSI correspondiente a ese color y luego
                //escribiremos el texto. Opcionalmente, al terminar escribiremos el código ANSI de reset
                //para volver al color estándar para que el resto del texto nos salga normal.
                //A  continuación,  os  pongo  una  lista  de  los  diferentes  códigos  ANSI  almacenados  en
                //cadenas. Podéis usar estas cadenas para no tener que memorizar los códigos cuando
                //queráis usar los colores.
                //String ANSI_RESET = "\u001B[0m";
                //
                //String ANSI_BLACK = "\u001B[30m";
                //String ANSI_RED = "\u001B[31m";
                //String ANSI_GREEN = "\u001B[32m";
                //String ANSI_YELLOW = "\u001B[33m";
                //String ANSI_BLUE = "\u001B[34m";
                //String ANSI_PURPLE = "\u001B[35m";
                //String ANSI_CYAN = "\u001B[36m";
                //String ANSI_WHITE = "\u001B[37m";
                //
                //String ANSI_BLACK_BACKGROUND = "\u001B[40m";
                //String ANSI_RED_BACKGROUND = "\u001B[41m";
                //String ANSI_GREEN_BACKGROUND = "\u001B[42m";
                //String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
                //String ANSI_BLUE_BACKGROUND = "\u001B[44m";
                //String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
                //String ANSI_CYAN_BACKGROUND = "\u001B[46m";
                //String ANSI_WHITE_BACKGROUND = "\u001B[47m";

                double[] a = {3.5, 7.2, 8.9, 5.2, 6.7, 2.5, 4.9};
                EscribeArrayNotas(a);
                System.out.println();
                EscribeArrayDouble(a);
            }
            break;

            case 47:
            {
                //Escribe  la  función  tachaElementosNoComunes  a  la  que  le  pasamos  dos  arrays.  La
                //función sustituirá los elementos de un array que no aparezcan en el otro por ceros (y
                //viceversa).
                //Ej: [1, 3, 5, 7] y [1, 2, 3, 4] => [1, 3, 0, 0] y [1, 0, 3, 0]

                int[] a = {1, 3, 5, 7};
                int[] b = {1, 2, 3, 4};

                EscribeArray(a);
                System.out.println();
                EscribeArray(b);
                System.out.println();
                TachaElementosComunes(a, b);


            }
            break;

            case 48:
            {
                // Escribe la función eliminaRepetidos a la que le pasas un array y te devuelve otro array
                //en el que se han eliminado los elementos que estén repetidos.
                //Ej: [1, 5, 9, 2, 3, 4, 1, 1, 2] => [1, 5, 9, 2, 3, 4]

                int[] a = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5};
                int[] b;

                EscribeArray(a);
                System.out.println();
                b = EliminaRepetidos(a);
                System.out.println();
                EscribeArray(b);

            }
            break;

            case 49:
            {
                // Escribe dos funciones: redondeaArray y decimalesArray. A la función redondeaArray le
                //pasaremos un array de double y nos devolverá otro array de double en el que a los
                //números le quitamos la parte decimal.
                //Ej.: [1.56, 2.75, 3, 9.9] => [1, 2, 3, 9]
                //A la función decimalesArray le pasaremos un array de double y nos devolverá otro array
                //de double en el que aparecerán solamente las partes decimales de los números.
                //Ej.: [1.56, 2.75, 3, 9.9] => [0.56, 0.75, 0, 0.9]

                /*double[] a = {1.56, 2.75, 3, 9.9};
                double[] copia;

                EscribeArrayDouble(a);
                System.out.println();
                RedondeaArray(a);
                EscribeArrayDoubleSinDecimales(a);*/

                //-----------<<<<<<<<<<<<<<0>>>>>>>>>>>>>-------------

                double[] a = {1.56, 2.75, 3, 9.9};
                double[] b;

                EscribeArrayDouble(a);
                System.out.println();
                b = DecimalesArray(a);
                EscribeArrayDouble(b);

            }
            break;

            case 50:
            {
                // Escribe  la  función  desordenaArray.  La  función  recibirá  un  array  de  enteros  por
                //parámetro, que al término de la función deberá quedar desordenado.
                //Para conseguir esto, iremos cogiendo los elementos de un array de manera aleatoria y
                //los iremos poniendo en un array auxiliar.

                int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
                int[] des;

                EscribeArray(a);
                System.out.println();
                des = DesordenaArray(a);
                EscribeArray(des);
            }
            break;

            case 51:
            {
                //Escribe  la  función  minMaxArray  a  la  que  le  pasaremos  un  array  de  enteros  y  nos
                //devolverá  otro  array  de  enteros  diferente  en  el  que  aparecerán  los  números
                //comprendidos entre el menos y el mayor del array que le hemos pasado.
                //Con un ejemplo se entiende mejor:
                //•  Le pasamos [7, 3, 9, 4, 4, 6]
                //•  El mínimo es 3, el máximo 9.
                //Nos devolverá [3, 4, 5, 6, 7, 8, 9]

                int[] a = {7, 3, 9, 4, 4, 6};
                int[] a2 = {5, 4, 1, 8, 12, 3, 9};
                int[] b;
                int[] c;

                EscribeArray(a);
                System.out.println();
                b = MinMaxArray(a);
                EscribeArray(b);

                EscribeArray(a2);
                System.out.println();
                c = MinMaxArray(a2);
                EscribeArray(c);
            }
            break;

            case 52:
            {
                // Escribe la función graficaBarras a la que le pasamos un array de enteros y nos muestra
                //una gráfica de barras por pantalla. Ejemplo: [9, 5, 3, 2, 10]
                // 9 █████████
                // 5 █████
                // 3 ███
                // 2 ██
                //10 ██████████

                //•  Antes de pintar la gráfica, habrá que comprobar que todos los valores estén entre 0
                //   y 10 (supongamos que representan vuestras notas). Si hay valores incorrectos, no
                //   se pinta la gráfica y se muestra un mensaje de error.
                //•  Usar el caracter ASCII 219 (█) para las barritas
                //•  Dejar una línea en blanco entre barra y barra para que quede bonito.
                //•  OPCIONAL: que los aprobados aparezcan en verde y los suspensos en rojo.

                int[] a = {9, 5, 3, 2, 10};

                EscribeArray(a);
                System.out.println();
                GraficaBarras(a);
            }
            break;

            case 53:
            {
                //Escribe la función mejorRacha a la que le pasamos un array que contiene resultados de
                //fútbol y nos devuelve un entero correspondiente a la mayor racha de victorias seguidas.
                //El array contendrá parejas de números (o sea, su tamaño será par) de los cuales el
                //primero serán los goles que ha marcado nuestro equipo y el segundo los goles que ha
                //recibido (p.ej.: [1, 0, 2, 2, 3, 5] se correspondería con una victoria por 1-0, un empate 2-
                //2 y una derrota por 3-5). La función contará cuantas victorias consecutivas hay y nos
                //devolverá la mayor racha.
                //  Ej.:   [2, 1, 1, 0, 1, 1, 0, 1, 1, 0, 2, 0, 5, 1, 2, 2, 1, 0] se corresponde con:
                //    2-1, 1-0, 1-1, 0-1, 1-0, 2-0, 5-1, 2-2, 1-0, con una racha máxima de 3 victorias.

                int[] a = {2, 1, 1, 0, 1, 1, 0, 1, 1, 0, 2, 0, 5, 1, 2, 2, 1, 0, 3, 2, 4, 1, 1, 0, 2, 1};
                int racha;

                EscribeArray(a);
                System.out.println();
                racha = MejorRacha(a);
                System.out.println("Mejor racha = " + racha);
            }
            break;

            case 54:
            {
                //Escribe la función numerosPrimosPro que nos calculará los números primos entre 1 y
                //otro número (para probarlo, nos vale con 1000).
                //Esta función usará un algoritmo más avanzado que el que hemos visto con anterioridad
                //y que es mucho más eficiente a la hora de calcular muchos números primos.
                //El funcionamiento es el siguiente (para el ejemplo del 1 al 1000):
                //•  Creamos un array de 1001 elementos (por el cero).
                //•  Empezamos en la posición 2 del array y vamos haciendo lo siguiente:
                //•  Si en esta posición hay un 0 (que es lo que había al principio), añadimos esta
                //posición a una lista de números primos.
                //•  Si había un 0, además, tenemos que ir “tachando” todos los múltiplos de
                //ese número primo poniendo otro valor en esas posiciones (por ejemplo, un
                //-1). En el caso del 2, que sería el primero, pondríamos un -1 en la posición
                //4, 6, 8, 10, 12, etc., y así hasta llegar al 1000.
                //•  Si en la posición hay un -1, eso es que este número ya era múltiplo de uno
                //anterior, así que no hacemos nada y pasamos al siguiente.
                //•  Al final, devolveremos la lista de números primos que hemos ido recopilando.
                //Para comprobarlo, mostrar los números primos entre 1 y 1000 por pantalla y escribir
                //cuántos  números  son  (empieza  por  2,  3,  5,  7...  acaba  por  983,  991,  997  y  son  168
                //números primos en total).


                //PASOS A SEGUIR >>
                //Si el numero es un 0 (numerosprimosposicion), además de lo que hemos hecho anteriormente debemos tachar
                //(es poner un -1 en el numerosprimosposicion) todos sus múltiplos hasta el  numero que ingresemos (en este caso el 1000),
                //además tienes que comprobar que el numero del numerosprimosposicion no sea un -1 ¿Por que? Porque esto significa que ya tiene un múltiplo,
                //asi que pasa al siguiente y asi sucesivamente hasta el numero que hayamos ingresado.


                int tama;
                System.out.println("Tamaño del array: ");
                tama = sc.nextInt();
                int[] a = new int[tama+1];
                int[] b;

                b = NumerosPrimosPro(a);
                EscribeArray(b);
            }
            break;


        }
    }
}

