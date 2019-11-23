package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("MENÚ BUCLES WHILE");
        System.out.println("=================");
        System.out.println("[9] Números del 10 al 20");
        System.out.println("[10] Impares entre 1 y 10");
        System.out.println("[11] 10 primeros pares");
        System.out.println("[12] Par o Impar");
        System.out.println("[13] Tabla de multiplicar");
        System.out.println("[14] Mayor - Menor || números entre ambos");
        System.out.println("[15] Menor - Mayor || Ascendente - Descendente");
        System.out.println("[16] A y B - impares entre ellos");
        System.out.println("[17] Suma pares hasta 1000");
        System.out.println("[18] Calcular media de N valores enteros");
        System.out.println("[19] 30 NOTAS de alumnos");
        System.out.println("[20] Valor máximo de 10 números");
        System.out.println("[21] Valor máximo, mínimo y media de 10 números");
        System.out.println("[22] Factorial de N entero");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 9:
            {
                //Escribe un programa que nos escriba los números del 10 al 20.
                int i;
                i = 10;
                while(i <= 20)
                {
                    System.out.println(i);
                    i++;
                }
            }
            break;

            case 10:
            {
                //Escribe un programa que nos escriba los números impares comprendidos entre 1 y 10.

                int i;
                i = 1;
                while(i <= 10)
                {
                    System.out.println(i);
                    i = i + 2;
                }
            }
            break;

            case 11:
            {
                //Escribe un programa que nos escriba los 10 primeros números pares.

                int contador = 0;
                int i = 2;
                while(contador < 10)
                {
                    if(i %2 == 0)
                    {
                        System.out.println(i);
                        contador++;
                    }
                    i++;
                }

                //OTRA FORMA DE HACERLO

                /*int contador = 0;
                int i = 2;
                while(contador < 10)
                {
                    i = i + 2;
                    contador = contador + 1;
                }*/
            }
            break;

            case 12:
            {
                // Escribe un programa que te pregunte si quieres números pares o impares. Si te dice
                //pares, escribe los números pares del 1 al 10 y si te dice impares, escribe los números
                //impares del 1 al 10.

                int i;
                String tipo = "";
                System.out.print("Elige pares o impares");
                tipo = sc.next();

                if(tipo.equals("pares"))
                {
                    i = 2;
                    while(i < 11)
                    {
                        System.out.println(i);
                        i = i + 2;
                    }
                }
                else
                {
                    if(tipo.equals("impares"))
                    {
                        i = 1;
                        while(i < 11)
                        {
                            System.out.println(i);
                            i = i + 2;
                        }
                    }
                }
            }
            break;

            case 13:
            {
                //Escribe un programa que te escribe la tabla de multiplicar del número que le introduzcas
                //por teclado.

                int n, i;
                System.out.println("Escribe un número para mostrarte su tabla de multiplicar: ");
                n = sc.nextInt();

                i = 1;
                while(i <= 10)
                {
                    System.out.println(n + " x " + i + " = " + (n*i));
                    i++;
                }
            }
            break;

            case 14:
            {
                //Escribe un programa que te pida dos números con la condición de que el segundo sea
                //mayor que el primero, en caso contrario te pregunta de nuevo el número hasta que sea
                //correcto. Si los números son correctos, escribe todos los números comprendidos entre
                //el primer y el segundo número (ambos inclusive).

                int a, b, i;
                System.out.println("Escribe dos números: ");
                a = sc.nextInt();
                b = sc.nextInt();

                while(a > b)
                {
                    System.out.println("El segundo número debe ser mayor que el primero");
                    System.out.println("Escribe dos números: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                }

                while(a <= b)
                {
                    System.out.println(a);
                    a++;
                }
            }
            break;

            case 15:
            {
                //Escribe un programa que te pide dos números. Si el primero es menor que el segundo,
                //escribe  todos  los  números  comprendidos  entre  ambos  en  orden  ascendente.  Si  el
                //primero  es  mayor  que  el  segundo,  escribe  todos  los  números  comprendidos  entre
                //ambos en orden descendente.

                int a, b, i;
                System.out.print("Escribe primer nº: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo nº: ");
                b = sc.nextInt();

                while(a <= b)
                {
                    System.out.println(a);
                    a++;
                }
                while(a >= b)
                {
                    System.out.println(a);
                    a--;
                }
            }
            break;

            case 16:
            {
                //Escribir todos los números impares entre dos números A y B introducidos por teclado.
                //Antes habrá que comprobar cuál de los dos números A y B es mayor.
                int a, b, i;

                System.out.print("Escribe primer nº: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo nº: ");
                b = sc.nextInt();

                //Primera condición que los números no pueden ser iguales
                if(a != b)
                {
                    while(a < b)
                    {
                        if(a %2 != 0)
                        {
                            System.out.println(a);
                        }
                        a++;
                    }
                    while(a > b)
                    {
                        if(b %2 != 0)
                        {
                            System.out.println(b);
                        }
                        b++;
                    }
                }
                else
                {
                    System.out.println("¡Los números son iguales!");
                }

            }
            break;

            case 17:
            {
                //Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998
                //+ 1000

                int i = 2;
                while(i <= 1000)
                {
                    System.out.println(i);
                    i = i + 2;
                }
            }
            break;

            case 18:
            {
                //Calcular  el  valor  medio  de  una  serie  de  valores  enteros  positivos  introducidos  por
                //teclado.  Para  terminar  de  introducir  valores,  el  usuario  debe  teclear  un  número
                //negativo

                int n;
                int suma = 0;
                int contador = 0;
                int media;

                //Pedimos primer nº fuera del bucle
                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                while(n >= 0)
                {
                    contador++;
                    suma = suma + n;
                    System.out.print("Escribe un número: ");
                    n = sc.nextInt();

                }
                media = suma /contador;
                System.out.println("SUMA = " + suma);
                System.out.println("MEDIA = " + media);

            }
            break;

            case 19:
            {
                //El  usuario  de  este  programa  será  un  profesor,  que  introducirá  las  notas  de  sus  30
                //alumnos  de  una  en  una.  El  algoritmo  debe  decirle  cuántos  suspensos  y  cuántos
                //aprobados hay.

                int n = 0, i;
                int apro = 1;
                int sus = 1;

                i = 0;
                while(i < 30)
                {
                    System.out.print("Escribe nota: ");
                    n = sc.nextInt();
                    i++;
                }
                if(n < 5)
                {
                    sus++;
                }
                else
                {
                    apro++;
                }

                System.out.println("APROBADOS = " + apro);
                System.out.println("SUSPENSOS = " + sus);

            }
            break;

            case 20:
            {
                //Calcular el valor máximo de una serie de 10 números introducidos por teclado.

                int n, i, mayor;

                System.out.print("Escribe un número: ");
                n = sc.nextInt();
                mayor = n;

                i = 1;
                while(i < 10)
                {
                    System.out.print("Escribe un número: ");
                    n = sc.nextInt();

                    if(n > mayor)
                    {
                        mayor = n;
                    }
                    i++;
                }
                System.out.println("MAYOR = " + mayor);
            }
            break;

            case 21:
            {
                //Calcular en el mismo bucle el valor máximo, el valor mínimo y la media aritmética de
                //una serie de 10 números introducidos por teclado.

                int max, min, media, suma, n, contador, i;
                suma = 0;
                contador = 1;

                //Pedimos primer número fuera del bucle para poder darle un primer valor a max y a min
                System.out.println("Escribe un número: ");
                n = sc.nextInt();
                max = n;
                min = n;
                suma = n;   //Aquí suma ya vale 1 porque acabamos de pedir el primer número

                //Bucle que pedirá los 9 números que nos quedan por leer
                i = 1;
                while(i < 3)
                {
                    System.out.println("Escribe un número: ");
                    n = sc.nextInt();
                    contador++;
                    suma = suma + n;
                    //Ahora buscamos los valores mayores y valores menores
                    if(n < min)
                    {
                        min = n;
                    }
                    else
                    {
                        max = n;
                    }
                    i++;
                }
                System.out.println("SUMA = " + suma);
                System.out.println("MAYOR = " + max);
                System.out.println("MENOR = " + min);
                System.out.println("MEDIA = " + (media = suma / contador));
            }
            break;

            case 22:
            {
                // Calcular el factorial de un número entero N. Recuerda que el factorial de un número es
                //el  producto  de  ese  número  por  todos  los  enteros  menores  que  él.  Por  ejemplo,  el
                //factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.

                int n, i, factorial = 1;

                System.out.print("Escribe un número para calcular su factorial: ");
                n = sc.nextInt();

                i = 1;
                while(i <= n)
                {
                    factorial = factorial * i;
                    i++;
                }
                System.out.println("Factorial de " + n + " = " + factorial);

            }
            break;
        }
    }
}
