package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{

    public static void escribeArray3x3(int[][] a)
    {
        int i, j;
        for (i = 0; i < 3; i++)
        {
            System.out.print("[ ");
            for (j = 0; j < 3; j++)
            {
                if (a[i][j] < 10)
                {
                    System.out.print(" " + a[i][j] + " ");
                } else
                {
                    System.out.print(a[i][j] + " ");
                }

            }
            System.out.println("]");
        }
    }

    public static void rellena3x3(int[][] a)
    {
        int i, j;
        int n = 1;
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                a[i][j] = n;
                n++;
            }
        }
    }

    public static void RellenaAleatorio3x3(int[][] a)
    {
        Random rd = new Random();
        int i, j;
        int alea = 0;

        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                alea = rd.nextInt(99);
                a[i][j] = alea;
            }
        }
    }

    public static int sumaArray3x3(int[][] a)
    {
        int suma = 0;
        int i, j;

        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    public static void escribeArrayBi(int[][] a)
    {
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            System.out.print("[ ");
            for (j = 0; j < a[i].length; j++)
            {
                if (a[i][j] < 10)
                {
                    System.out.print(" " + a[i][j] + " ");
                } else
                {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println(" ]");
        }
    }

    public static void rellenaAleatorioBi(int[][] a)
    {
        Random rd = new Random();
        int alea;
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                alea = rd.nextInt(99);
                a[i][j] = alea;
            }
        }
    }

    public static void rellenaEnordenBi(int[][] a)
    {
        int orden = 1;
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[i][j] = orden;
                orden++;
            }
        }
    }

    public static int sumaArrayBi(int[][] a)
    {
        int suma = 0;
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    public static void suma2ArraysBi(int[][] a, int[][] b, int[][] suma)
    {
        int i, j;

        if (a.length == b.length)
        {
            for (i = 0; i < a.length; i++)
            {
                for (j = 0; j < a[i].length; j++)
                {
                    suma[i][j] = a[i][j] + b[i][j];
                }
            }
        } else
        {
            System.out.println("Los arrays no tienen el mismo tamaño.");
        }
    }

    public static void copiaArrayBi(int[][] datos, int[][] vacio)
    {
        int i, j;

        if (datos.length == vacio.length)
        {
            for (i = 0; i < datos.length; i++)
            {
                for (j = 0; j < datos[i].length; j++)
                {
                    vacio[i][j] = datos[i][j];
                }
            }
        } else
        {
            System.out.println("Error.\nLos arrays no tienen el mismo tamaño.");
        }

    }

    public static int[][] copiaArrayBiPro(int[][] a)
    {
        int[][] copia = new int[a.length][a[0].length];
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                copia[i][j] = a[i][j];
            }
        }
        return copia;
    }

    public static void rellenaArrayAjedrez(int[][] a)
    {
        int i, j;
        int cambio = 0;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[i][j] = cambio;
                if (cambio == 0)
                {
                    cambio = 1;
                } else
                {
                    cambio = 0;
                }
            }
            if (cambio == 0)
            {
                cambio = 1;
            } else
            {
                cambio = 0;
            }
        }
    }

    public static void rellenaDiagonal(int[][] a)
    {
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if (i == j)
                {
                    a[i][j] = 1;
                } else
                {
                    if (j > i)
                    {
                        a[i][j] = 2;
                    } else
                    {
                        a[i][j] = 3;
                    }
                }
            }
        }
    }

    public static void rellenaX(int[][] a)
    {

        //PRIMERA FORMA DE HACERLO usando el patrón:
        //*La suma de los iteradores si es igual al tamaño del array -1, eso sería la diagonal inversa

        /*int i,j;
        for(i = 0; i < a.length; i++)
        {
            for(j = 0; j < a[i].length; j++)
            {
                if(i == j)
                {
                    a[i][j] = 1;
                }
                else
                {
                    if(i+j == a.length-1)
                    {
                        a[i][j] = 1;
                    }
                    else
                    {
                        a[i][j] = 2;
                    }
                }
            }
        }*/

        //-----------------000-------------------

        //SEGUNDA FORMA DE HACERLO:
        //*Sumando una fila y restando una columna... así trazando la diagonal inversa del cuadrado

        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[i][j] = 2;
            }
        }

        for (i = 0; i < a.length; i++)
        {
            a[i][i] = 1;
        }

        j = a.length - 1;
        for (i = 0; i < a.length; i++)
        {
            a[i][j] = 1;
            j--;
        }

    }

    public static void rellenaCuadros(int[][] a)
    {
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if (i <= 1 && j <= 1)
                {
                    a[i][j] = 1;
                } else
                {
                    if (i <= 1 && j > i)
                    {
                        a[i][j] = 2;
                    } else
                    {
                        if (j <= 1 && i > j)
                        {
                            a[i][j] = 3;
                        } else
                        {
                            a[i][j] = 4;
                        }
                    }
                }
            }
        }
    }

    public static void invierteBi(int[][] a)
    {
        int[][] copia = new int[a.length][a[0].length];
        int i, j;
        int aux;

        for (i = 0; i < a.length / 2; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                aux = a[i][j];
                a[i][j] = a[a.length - 1 - i][j];
                a[a.length - 1 - i][j] = aux;
            }
        }
    }

    public static int calculaDeterminante(int[][] a)
    {
        int determinate = 0;
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                determinate = a[0][0] * a[1][1] * a[2][2] +
                        a[1][0] * a[2][1] * a[0][2] +
                        a[2][0] * a[0][1] * a[1][2] -
                        a[0][2] * a[1][1] * a[2][0] -
                        a[1][2] * a[2][1] * a[0][0] -
                        a[2][2] * a[0][1] * a[1][0];
            }
        }
        return determinate;
    }

    public static int sumaColumnas(int[][] a, int columna)
    {
        int suma = 0;
        int i;

        for (i = 0; i < a.length; i++)
        {
            suma = suma + a[i][columna];
        }
        return suma;
    }

    public static int sumaFilas(int[][] a, int fila)
    {
        int suma = 0;
        int i;

        for (i = 0; i < a.length; i++)
        {
            suma += a[fila][i];
        }
        return suma;
    }

    public static int sumaDiagonal(int[][] a)
    {
        int suma = 0;
        int i;

        for (i = 0; i < a.length; i++)
        {
            int j = i;
            suma += a[i][j];
        }
        return suma;
    }

    public static int sumaDiagonalInversa(int[][] a)
    {

        int suma = 0;
        int i;

        int j = a.length - 1;
        for (i = 0; i < a.length; i++)
        {
            suma += a[i][j];
            j--;
        }
        return suma;
    }

    public static boolean cuadradoMagico(int[][] a)
    {
        boolean magico = false;
        int i, j;
        int sumaFil = 0;
        int sumaCol = 0;
        List<Integer> li = new ArrayList<>();

        li.add(sumaDiagonal(a));
        li.add(sumaDiagonalInversa(a));

        for (i = 0; i < a.length; i++)
        {
            sumaCol = sumaColumnas(a, i);
            sumaFil = sumaFilas(a, i);
            li.add(sumaCol);
            li.add(sumaFil);
        }

        Collections.sort(li);
        System.out.println(li);
        if (li.get(0) == li.get(li.size() - 1))
        {
            magico = true;
        }

        return magico;
    }

    public static void escribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length - 1] + "]");
    }

    public static boolean compruebaArray19(int[] a)  //case 100
    {
        boolean esValido = false;

        List<Integer> li = new ArrayList<>();
        int i;

        for (i = 0; i < a.length; i++)  //Pasamos los elementos del array a una lista siempre y cuando la lista no los contengan

        {
            if (!li.contains(a[i]))
            {
                li.add(a[i]);
            }
        }


        if (li.size() == a.length)  //Si el tamaño de la lista es idéntico al del array, significa que son iguales, ya que no se han repetido
        //elementos y no quedarían hueco por copiar en la lista
        {
            esValido = true;
        }

        return esValido;

    }

    public static boolean compruebaFilas(int[][] sudoku) //case 101
    {
        boolean esValida = true;
        List<Boolean> filaBoleana = new ArrayList<>();  //Contiene respuestas de tipo boolean para cada resultado de la fila
        int[] a = new int[9];  //Array que albergará cada fila
        int i, j;
        int k;

        j = 0;
        for (i = 0; i < sudoku.length; i++)
        {
            k = 0;
            for (j = 0; j < sudoku[i].length; j++)
            {
                a[k] = sudoku[i][j];   //Contendrá fila a fila del sudoku
                k++;
            }

            if (compruebaArray19(a))   //Comprobamos que el array tiene n elementos sin repetir (del 1 al 9)
            {
                filaBoleana.add(true);  //Por cada elemento no repetido del array a, añade true a la lista
            } else
            {
                filaBoleana.add(false);  //Por cada elemento repetido del array a, añade false a la lista
            }

        }

        if (filaBoleana.contains(false))  //Si la lista contiene cualquier valor false, nuestra fila no es válida
        {
            esValida = false;
        }
        return esValida;
    }

    public static boolean compruebaColumnas(int[][] sudoku)  //case 102
    {
        boolean esValida = true;
        int[] a = new int[9];
        int i, j;
        int k;

        j = 0;
        for (i = 0; i < sudoku.length; i++)
        {
            k = 0;
            for (j = 0; j < sudoku[i].length; j++)
            {
                a[k] = sudoku[j][i];  //Cambiamos de orden los iteradores, para que copie los elementos de las columnas al array
                k++;
            }

            if (!compruebaArray19(a))
            {
                esValida = false;
                i = sudoku.length;
                j = sudoku[i].length;
            }
        }

        return esValida;
    }

    public static boolean compruebaSubarray3x3(int[][] sudoku)  //case 103
    {
        boolean esValida = true;
        int[] array = new int[9];
        int r; //Indice que itera el array
        int i, j; //Indices para iterar de 3 en 3 las filas y las columnas
        int k, e; //Indices que recorrerán los subarray 3x3

        for(i = 0; i < sudoku.length; i = i+3)
        {
            for(j = 0; j < sudoku[i].length; j = j+3)
            {
                r = 0;
                for(k = i; k < i+3; k++)
                {
                    for(e = j; e < j+3; e++)
                    {
                        array[r] = sudoku[k][e];
                        r++;
                    }
                }
                if(!compruebaArray19(array))
                {
                    esValida = false;
                    i = sudoku.length;
                    j = sudoku[i].length;
                }
            }
        }


        return esValida;
    }

    public static boolean compruebaSudoku(int[][] sudoku)  //case 19
    {
        boolean esValida;
        int i, j;

        if (compruebaFilas(sudoku) && compruebaColumnas(sudoku) && compruebaSubarray3x3(sudoku))
        {
            esValida = true;
        }
        else
        {
            esValida = false;
        }
        return esValida;
    }

    public static boolean compruebaQuedanBarcos(int[][] tablero)
    {
        boolean hayBarco = false;
        List<Integer> li = new ArrayList<>();
        int[] claseBarcos = {2, 3, 4, 5};  //Array que contiene los nº que identifican a los barcos
        int i, j, k;

        k = 0;
        for (i = 0; i < tablero.length; i++)
        {
            for (j = 0; j < tablero[i].length; j++)
            {
                li.add(tablero[i][j]);  //En este punto tengo todos los elementos del array 8x8 en una lista que podré comparar con el array claseBarcos
            }
        }

        for (k = 0; k < claseBarcos.length; k++)  //Aquí comparo la lista con el array claseBarcos
        {
            if (li.contains(claseBarcos[k]))  //Y si la lista contiene algún nº que identifica a un barco...
            {
                hayBarco = true;
                k = claseBarcos.length;  //... paramos bucle porque encontró un barco...(y para qué seguir)
            }
        }

        return hayBarco;
    }

    public static void muestraTablero(int[][] tablero)
    {
        int i, j;

        for (i = 0; i < tablero.length; i++)
        {
            System.out.print("[ ");
            for (j = 0; j < tablero[i].length; j++)
            {
                if (tablero[i][j] < 100)
                {
                    System.out.print("  " + tablero[i][j] + " ");
                } else
                {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println(" ]");
        }

        System.out.println("AGUA   = 100" );
        System.out.println("TOCADO = 101" );

    }

    public static void hundirLaFlota(int[][] tablero)
    {
        Scanner sc = new Scanner(System.in);
        int[][] tablaVacia = new int[8][8];

        int coordenadaX;
        int coordenadaY;
        int i, j;

        muestraTablero(tablaVacia);  //Muestra todo vacío...

        while (compruebaQuedanBarcos(tablero))
        {
            //System.out.println(compruebaQuedanBarcos(tablero));

            System.out.println("Dame coordenadas: ");
            System.out.print("Coordenada X = ");
            coordenadaX = sc.nextInt();
            System.out.println();
            System.out.print("Coordenada Y = ");
            coordenadaY = sc.nextInt();


            if (tablero[coordenadaX][coordenadaY] == 0)
            {
                tablaVacia[coordenadaX][coordenadaY] = 100;
                tablero[coordenadaX][coordenadaY] = 100;
            } else
            {
                if (tablero[coordenadaX][coordenadaY] == 2 || tablero[coordenadaX][coordenadaY] == 3 ||
                        tablero[coordenadaX][coordenadaY] == 4 || tablero[coordenadaX][coordenadaY] == 5)
                {
                    tablaVacia[coordenadaX][coordenadaY] = 101;
                    tablero[coordenadaX][coordenadaY] = 101;
                }

            }

            muestraTablero(tablaVacia);  //Aquí muestra cada jugada en un tablero sin barcos
        }

        System.out.println("<<<<<<<<<<< HUNDIMOS LA FLOTA >>>>>>>>>>");


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("MENÚ ARRAY MULTIDIMENSIONALES JAVA");
        System.out.println("==================================");
        System.out.println("[1] escribeArray3x3");
        System.out.println("[2] rellena3x3");
        System.out.println("[3] RellenaAleatorio3x3");
        System.out.println("[4] sumaArray3x3");
        System.out.println("[5] escribeArrayBi");
        System.out.println("[6] rellenaAleatorioBi");
        System.out.println("[7] rellenaEnordenBi");
        System.out.println("[8] sumaArrayBi");
        System.out.println("[9] suma2ArraysBi");
        System.out.println("[10] copiaArrayBi");
        System.out.println("[11] copiaArrayBiPro");
        System.out.println("[12] rellenaArrayAjedrez");
        System.out.println("[13] rellenaDiagonal");
        System.out.println("[14] rellenaX");
        System.out.println("[15] rellenaCuadros");
        System.out.println("[16] invierteBi");
        System.out.println("[17] calculaDeterminante");
        System.out.println("[18] cuadradoMagico");
        System.out.println("[19] compruebaSudoku");
        System.out.println("[20] hundirLaFlota");
        System.out.println("[100] compruebaArray19");
        System.out.println("[101] compruebaFilas");
        System.out.println("[102] compruebaColumnas");
        System.out.println("[103] compruebaSubarray3x3");
        System.out.println("[104] ");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe la función escribeArray3x3 a la que le pasas un array bidimensional de tamaño
                //3x3 y te lo imprime por pantalla (que quede bonito).

                //int[][] a = new int[3][3];
                int[][] a = {{1, 2, 3}, {4, 15, 6}, {7, 8, 9}};
                escribeArray3x3(a);
            }
            break;

            case 2:
            {
                //Escribe la función rellena3x3 a la que le pasas un array bidimensional de 3x3 y te lo
                //rellena con los números del 1 al 9.

                int[][] a = new int[3][3];
                rellena3x3(a);
                escribeArray3x3(a);
            }
            break;

            case 3:
            {
                //Escribe la función RellenaAleatorio3x3 a la que le pasas un array bidimensional de
                //tamaño 3x3 y te lo rellena con números aleatorios.

                int[][] a = new int[3][3];
                RellenaAleatorio3x3(a);
                escribeArray3x3(a);
            }
            break;

            case 4:
            {
                //Escribe la función sumaArray3x3 a la que le pasas un array de 3x3 y te suma todos los
                //números. Te devuelve un entero con el resultado.

                int[][] a = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
                int suma;

                escribeArray3x3(a);
                System.out.println();
                suma = sumaArray3x3(a);
                System.out.println("SUMA = " + suma);
            }
            break;

            case 5:
            {
                //Escribe la función escribeArrayBi a la que le pasas un array bidimensional de cualquier
                //tamaño y te lo imprime por pantalla

                int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};

                escribeArrayBi(a);
            }
            break;

            case 6:
            {
                //Escribe la función rellenaAleatorioBi a la que le pasas un array bidimensional de
                //cualquier tamaño y te lo rellena con números aleatorios.

                int[][] a = new int[5][5];

                rellenaAleatorioBi(a);
                escribeArrayBi(a);

            }
            break;

            case 7:
            {
                //Escribe la función rellenaEnordenBi a la que le pasas un array bidimensional de
                //cualquier tamaño y te lo rellena con los números a partir del 1 en orden.

                int[][] a = new int[7][7];

                rellenaEnordenBi(a);
                escribeArrayBi(a);
            }
            break;

            case 8:
            {
                //Escribe la función sumaArrayBi a la que le pasas un array bidimensional y te suma
                //todos los números. Te devuelve un entero con el resultado.

                int[][] a = {{20, 20, 20}, {20, 20, 20}, {20, 20, 20}, {20, 20, 20}};
                int suma;

                escribeArrayBi(a);
                System.out.println();
                suma = sumaArrayBi(a);
                System.out.println("SUMA = " + suma);
            }
            break;

            case 9:
            {
                //Escribe la función suma2ArraysBi que hace lo mismo, pero con tres arrays
                //bidimensionales de cualquier tamaño (siempre y cuando todos tengan las mismas
                //dimensiones).

                int[][] a = {{3, 3}, {3, 3}, {3, 3}, {3, 3}};
                int[][] b = {{3, 3}, {3, 3}, {3, 3}, {3, 3}};
                int[][] suma = new int[4][2];

                escribeArrayBi(a);
                System.out.println(" + ");
                escribeArrayBi(b);
                System.out.println(" = ");
                suma2ArraysBi(a, b, suma);
                escribeArrayBi(suma);
            }
            break;

            case 10:
            {
                //. Escribe la función copiaArrayBi a la que le pasas dos arrays, uno con datos y otro
                //vacío, y te copia el contenido del primero al segundo

                int[][] datos = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {1, 2, 3}, {4, 5, 6}};
                int[][] vacio = new int[5][3];

                System.out.println();
                System.out.println("DATOS ORIGINALES");
                escribeArrayBi(datos);
                System.out.println();
                System.out.println("DATOS COPIADOS");
                copiaArrayBi(datos, vacio);
                escribeArrayBi(vacio);
            }
            break;

            case 11:
            {
                //Escribe la función copiaArrayBiPro a la que le pasas un array y te devuelve otro del
                //mismo tamaño y con los mismos datos.

                int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
                int[][] copia;

                System.out.println("DATOS ORIGINALES");
                escribeArrayBi(a);
                System.out.println();
                System.out.println("DATOS COPIADOS");
                copia = copiaArrayBiPro(a);
                escribeArrayBi(copia);

            }
            break;

            case 12:
            {
                //Escribe la función rellenaArrayAjedrez que te rellena un array de 8x8 con la forma de
                //un tablero de ajedrez, usando el valor 1 para las casillas blancas y 0 para las negras.

                int[][] a = new int[8][8];

                rellenaArrayAjedrez(a);
                escribeArrayBi(a);
            }
            break;

            case 13:
            {
                //Escribe la función rellenaDiagonal que te rellena un array cuadrado con el número ‘1’
                //en la diagonal principal, el número ‘2’ en el triángulo que queda por encima y el ‘3’ en
                //el triángulo que queda por debajo.

                int[][] a = new int[4][4];

                rellenaDiagonal(a);
                escribeArrayBi(a);
            }
            break;

            case 14:
            {
                //Escribe la función rellenaX que te rellena un array cuadrado con el número ‘1’ en las
                //dos diagonales y el ‘2’ en el resto.

                int[][] a = new int[8][8];

                rellenaX(a);
                escribeArrayBi(a);

            }
            break;

            case 15:
            {
                //Escribe la función rellenaCuadros que te rellena un array cuadrado de lado par (o sea,
                //2x2, 4x4, 6x6, etc.) en cuatro cuadros. El cuadro superior izquierdo lo rellena con ‘1’, el
                //superior derecho, con ‘2’, el inferior izquierdo con ‘3’ y el inferior derecho con ‘4’.

                int[][] a = new int[4][4];

                rellenaCuadros(a);
                escribeArrayBi(a);

            }
            break;

            case 16:
            {
                //Escribe la función invierteBi a la que le pasas un array bidimensional cuadrado (es
                //decir, igual de alto que de ancho) y te lo invierte.

                int[][] a = {{1, 2, 3, 4}, {5, 6, 8, 9}, {10, 11, 12, 13}, {14, 15, 16, 17}};

                escribeArrayBi(a);
                invierteBi(a);
                System.out.println();
                escribeArrayBi(a);

            }
            break;

            case 17:
            {
                //Escribe la función calculaDeterminante que te calcule el valor de un determinante de
                //3x3 y te lo devuelva. Si no sabéis cómo se calcula un determinante de 3x3, lo buscáis
                //en el internete.

                int[][] a = {{1, 0, 1}, {0, 3, 2}, {1, 2, 3}};
                int determinante;

                escribeArrayBi(a);
                System.out.println();
                determinante = calculaDeterminante(a);
                System.out.println("Determinante = " + determinante);
            }
            break;

            case 18:
            {
                //Escribe la función cuadradoMagico a la que le pasas un array de 3x3 y te dice si es un
                //cuadrado mágico o no. Un cuadrado mágico es un array bidimensional cuadrado en el
                //cual la suma de cada una de las filas y de cada una de las columnas y de las dos
                //diagonales principales es igual

                int[][] a = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
                boolean magico;

                escribeArrayBi(a);
                System.out.println();
                magico = cuadradoMagico(a);
                System.out.print("¿Es cuadrado mágico? => " + magico);

            }
            break;

            case 19:
            {
                //Escribe la función compruebaSudoku a la que le pasas un array de 9x9 enteros y te dice
                //si el array contiene un sudoku correcto (devuelve un Boolean que será true si es
                //correcto). Un sudoku será correcto si en cada fila, en cada columna y en cada submatriz
                //de 3x3 aparecen todos los números del 1 al 9 y una sola vez cada uno.
                //Se recomienda crear la función compruebaArray19 al que le pasas un array de 9 enteros
                //y te dice si en él se encuentran todos los números del 1 al 9 una sola vez.
                //Con esta función, sólo tendréis que pasar cada fila, columna y submatriz a un array de 9
                //enteros y pasárselo a esta función para comprobar si está bien.

                int[][] a = {{6, 3, 2, 7, 8, 1, 9, 4, 5},
                        {4, 8, 7, 5, 9, 6, 2, 1, 3},
                        {5, 1, 9, 2, 4, 3, 8, 7, 6},
                        {8, 6, 4, 3, 5, 2, 7, 9, 1},
                        {7, 5, 1, 9, 6, 8, 3, 2, 4},
                        {2, 9, 3, 1, 7, 4, 6, 5, 8},
                        {9, 4, 5, 6, 3, 7, 1, 8, 2},
                        {1, 7, 6, 8, 2, 5, 4, 3, 9},
                        {3, 2, 8, 4, 1, 9, 5, 6, 7}};

                boolean esValido;
                esValido = compruebaSudoku(a);
                System.out.println(esValido);


            }
            break;

            case 20:
            {
                // Escribe la función hundirLaFlota que simula el clásico juego de hundir la flota pero en
                //versión solitario (para hacerlo más simple). Para guardar los datos del juego, usaremos
                //un  array  de  8x8  enteros  que  contendrá  los  datos  de  los  barcos  y  las  casillas  ya
                //bombardeadas.  En  este  array,  colocaremos  antes  de  jugar  los  barcos  usando  los
                //siguientes valores para cada casilla:
                //[0]: Agua
                //[1]:  Barco.  Podemos  usar  diferentes  valores  (2,  3,  etc.)  para  diferentes  barcos;  así
                //podremos saber si hemos hundido cada barco o sólo lo hemos tocado.
                //[100]: Agua ya bombardeada.
                //[101]: Barco ya bombardeado.
                //
                //Una vez rellenada la matriz con valores 0 y 1 (y 2, 3, 4, etc., si queremos marcar cada
                //barco de manera independiente), le iremos pidiendo al jugador las coordenadas que
                //quiere bombardear, mostrándole el tablero después de cada jugada. Cuando el jugador
                //elige  una  casilla,  esa  casilla  se  marca  como  bombardeada  (se  le  suma  100)  y  se  le
                //muestra  el  resultado  de  ese  bombardeo.  El  juego  termina  cuando  no  quede ningún
                //barco por bombardear.

                //Barcos usados para el juego por jugador:
                //1 de 5
                //1 de 4
                //2 de 3
                //1 de 2

                int[][] tableroFlota = {{0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 2, 0, 0, 0},
                        {0, 0, 0, 0, 2, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0}};


                hundirLaFlota(tableroFlota);
            }
            break;

            case 100:
            {
                //compruebaArray19
                //Función que comprueba si un array de 9 elementos contiene los nº's del 1 al 9 sin que se repitan
                int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                boolean valido;

                valido = compruebaArray19(a);
                System.out.println(valido);

            }
            break;

            case 101:
            {
                //compruebaFilas
                //Le pasamos el sudoku 9x9 por parámetro y nos comprueba sus filas.
                //Sus filas deben cumplir las reglas del sudoku
                //Para ayudarnos a construir esta función usaremos la función llamada compruebaArray19

                int[][] sudoku = {{6, 3, 2, 7, 8, 1, 9, 4, 5},
                        {4, 8, 7, 5, 9, 6, 2, 1, 3},
                        {5, 1, 9, 2, 4, 3, 8, 7, 6},
                        {8, 6, 4, 3, 5, 2, 7, 9, 1},
                        {7, 5, 1, 9, 6, 8, 3, 2, 4},
                        {2, 9, 3, 1, 7, 4, 6, 5, 8},
                        {9, 4, 5, 6, 3, 7, 1, 8, 2},
                        {1, 7, 6, 8, 2, 5, 4, 3, 9},
                        {3, 2, 8, 4, 1, 9, 5, 6, 7}};

                boolean filaValida;
                filaValida = compruebaFilas(sudoku);

                escribeArrayBi(sudoku);
                System.out.println(filaValida);

            }
            break;

            case 102:
            {
                //compruebaColumnas
                //Le pasamos el sudoku y nos comprueba las columnas del mismo.
                //Comprueba que guarden las reglas del juego.

                int[][] sudoku = {{6, 3, 2, 7, 8, 1, 9, 4, 5},
                        {4, 8, 7, 5, 9, 6, 2, 1, 3},
                        {5, 1, 9, 2, 4, 3, 8, 7, 6},
                        {8, 6, 4, 3, 5, 2, 7, 9, 1},
                        {7, 5, 1, 9, 6, 8, 3, 2, 4},
                        {2, 9, 3, 1, 7, 4, 6, 5, 8},
                        {9, 4, 5, 6, 3, 7, 1, 8, 2},
                        {1, 7, 6, 8, 2, 5, 4, 3, 9},
                        {3, 2, 8, 4, 1, 9, 5, 6, 7}};

                boolean filaValida;
                filaValida = compruebaFilas(sudoku);

                escribeArrayBi(sudoku);
                System.out.println(filaValida);
            }
            break;

            case 103:
            {
                //compruebaSubarray3x3
                //Pasamos el sudoku 9x9 y nos comprueba sus cuadrantes:
                //La función comprueba que los 9 subarrays de 3x3 que contiene el sudoku y determina si guardan las
                //reglas del sudoku


                int[][] sudoku = {{6, 3, 2, 7, 8, 1, 9, 4, 5},
                        {4, 8, 7, 5, 9, 6, 2, 1, 3},
                        {5, 1, 9, 2, 4, 3, 8, 7, 6},
                        {8, 6, 4, 3, 5, 2, 7, 9, 1},
                        {7, 5, 1, 9, 6, 8, 3, 2, 4},
                        {2, 9, 3, 1, 7, 4, 6, 5, 8},
                        {9, 4, 5, 6, 3, 7, 1, 8, 2},
                        {1, 7, 6, 8, 2, 5, 4, 3, 9},
                        {3, 2, 8, 4, 1, 9, 5, 6, 7}};

                boolean subarrayValido;


                subarrayValido = compruebaSubarray3x3(sudoku);
                System.out.println(subarrayValido);

            }
            break;

            case 200:
            {
                int[][] tableroFlota = {{0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 4, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 101, 0, 0, 0},
                        {0, 0, 0, 0, 101, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 5, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0}};

                boolean bueno;


                bueno = compruebaQuedanBarcos(tableroFlota);
                System.out.println(bueno);
            }
            break;

        }
    }
}


