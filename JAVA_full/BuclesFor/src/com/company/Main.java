package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============");
        System.out.println("MENÚ BUCLES FOR");
        System.out.println("===============");
        System.out.println("[23] Pide nota de alumno");
        System.out.println("[24] Pares del 1 al 10");
        System.out.println("[25] 10 primeros pares");
        System.out.println("[26] Pares o Impares");
        System.out.println("[27] Tabla de multiplicar");
        System.out.println("[28] A y B || Ascendente - Descendente");
        System.out.println("[29] Impares entre A y B");
        System.out.println("[30] Suma los pares del 1 al 1000");
        System.out.println("[31] Notas 30 alumnos");
        System.out.println("[32] Valor máximo de N enteros");
        System.out.println("[33] Máximo | Mínimo | Medio");
        System.out.println("[34] Factorial de un número");
        System.out.println("[35] Suspenso | Suficiente | Bien | Notable | Sobresaliente");
        System.out.println("[36] No múltiplos de 2 y 3");
        System.out.println("[37] Menú 3 opciones. Múltiplos++");
        System.out.println("[38] MCD");
        System.out.println("[39] MCM");
        System.out.println("[40] Número primo");
        System.out.println("[41] Números primos entre 2 y 1000");
        System.out.println("[42] Juego del número secreto");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 23:
            {
                //Escribe un programa que nos escriba los números del 10 al 20.
                int i;
                for(i = 10; i <= 20; i++)
                {
                    System.out.println(i);
                }

            }
            break;

            case 24:
            {
                // Escribe un programa que nos escriba los números impares comprendidos entre 1 y 10
                int i;
                for(i = 2; i <= 10; i = i + 2)
                {
                    System.out.println(i);
                }
            }
            break;

            case 25:
            {
                // Escribe un programa que nos escriba los 10 primeros números pares.
                int contador = 0;

                int i;
                for(i = 1; i <= 100; i++)
                {
                    if(i %2 != 0)
                    {
                        contador = contador + 1;
                        if(contador <= 10)
                        {
                            System.out.println(i);
                        }
                    }
                }
            }
            break;

            case 26:
            {
                //Escribe un programa que te pregunte si quieres números pares o impares. Si te dice
                //pares, escribe los números pares del 1 al 10 y si te dice impares, escribe los números
                //impares del 1 al 10.

                int i;
                String tipo = "";
                System.out.print("Elige pares o impares: ");
                tipo = sc.next();
                tipo = tipo.toLowerCase();

                if(tipo.equals("pares"))
                {
                    for(i = 2; i <= 10; i = i + 2)
                    {
                        System.out.println(i);
                    }
                }
                else
                {
                    for(i = 1; i <= 10; i = i + 2)
                    {
                        System.out.println(i);
                    }
                }

            }
            break;

            case 27:
            {
                //Escribe un programa que te escribe la tabla de multiplicar del número que le introduzcas
                //por teclado

                int n, i;
                System.out.println("Escribe un número para mostrarte su tabla de multiplicar:");
                n = sc.nextInt();
                for(i = 1; i <= 10; i++)
                {
                    System.out.println(n + " x " + i + " = " + (n*i));
                }
            }
            break;

            case 28:
            {
                // Escribe un programa que te pide dos números. Si el primero es menor que el segundo,
                //escribe  todos  los  números  comprendidos  entre  ambos  en  orden  ascendente.  Si  el
                //primero  es  mayor  que  el  segundo,  escribe  todos  los  números  comprendidos  entre
                //ambos en orden descendente.

                int a, b;
                int i;
                System.out.print("Escribe un número: ");
                a = sc.nextInt();
                System.out.print("Escribe otro número: ");
                b = sc.nextInt();

                if(a < b)
                {
                    for(i = a; i <= b; i++)
                    {
                        System.out.println(i);
                    }
                }
                else
                {
                    for(i = a; i >= b; i--)
                    {
                        System.out.println(i);
                    }
                }

            }
            break;

            case 29:
            {
                //Escribir todos los números impares entre dos números A y B introducidos por teclado.
                //Antes habrá que comprobar cuál de los dos números A y B es mayor.

                int a, b;
                System.out.println("Escribe dos números: ");
                a = sc.nextInt();
                b = sc.nextInt();

                if(a < b)
                {
                    for(a = a; a <= b; a++)
                    {
                        if(a %2 != 0)
                        {
                            System.out.println(a);
                        }
                    }
                }
                else
                {
                    for(b = b; b <= a; b++)
                    {
                        if(b %2 != 0)
                        {
                            System.out.println(b);
                        }
                    }
                }

            }
            break;

            case 30:
            {
                // Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998
                //+ 1000.

                int i;
                for(i = 2; i <= 1000; i = i + 2)
                {
                    System.out.println(i);
                }
            }
            break;

            case 31:
            {
                // El  usuario  de  este  programa  será  un  profesor,  que  introducirá  las  notas  de  sus  30
                //alumnos  de  una  en  una.  El  algoritmo  debe  decirle  cuántos  suspensos  y  cuántos
                //aprobados hay.

                int nota, i, aprobado, suspenso;
                aprobado = 0;
                suspenso = 0;

                for(i = 0; i < 30; i++)
                {
                    System.out.print("Escribe nota: ");
                    nota = sc.nextInt();

                    if(nota >= 0 && nota < 5)
                    {
                        suspenso = suspenso + 1;
                    }
                    else
                    {
                        aprobado = aprobado + 1;
                    }
                }
                System.out.println("APROBADOS = " + aprobado);
                System.out.println("SUSPENSOS = " + suspenso);
            }
            break;

            case 32:
            {
                //Calcular el valor máximo de una serie de 10 números introducidos por teclado.

                int max, n, i;

                System.out.print("Escribe un número: ");
                n = sc.nextInt();
                max = n;

                for(i = 1; i < 10; i++)
                {
                    System.out.print("Escribe un número: ");
                    n = sc.nextInt();
                    if(n > max)
                    {
                        max = n;
                    }
                }
                System.out.println("VALOR MÁXIMO = " + max);
            }
            break;

            case 33:
            {
                //Generalizar  el  ejercicio  anterior  para  que  también  se  averigüe  el  valor  mínimo  y  el
                //medio.

                int n, max, min, suma, contador, media, i;
                suma = 0;
                contador = 1;

                System.out.print("Escribe un número: ");
                n = sc.nextInt();
                max = n;
                min = n;
                suma = suma + n;

                for(i = 1; i < 3; i++)
                {
                    System.out.print("Escribe un número: ");
                    n = sc.nextInt();
                    if(n < min)
                    {
                        min = n;
                    }
                    else
                    {
                        if(n > max)
                        {
                            max = n;
                        }
                    }
                    suma = suma + n;
                    contador++;
                }
                media = suma / contador;
                System.out.println("MÍNIMO = " + min);
                System.out.println("MEDIO = " + media);
                System.out.println("MÁXIMO = " + max);
            }
            break;

            case 34:
            {
                //Calcular el factorial de un número entero N. Recuerda que el factorial de un número es
                //el  producto  de  ese  número  por  todos  los  enteros  menores  que  él.  Por  ejemplo,  el
                //factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.

                int n, i, factorial = 1;
                System.out.println("Escribe un número para calcular su factorial:");
                n = sc.nextInt();

                for(i = 1; i <= n; i++)
                {
                    factorial = factorial * i;
                }
                System.out.println("Factorial de " + n + " = " + factorial);

            }
            break;

            case 35:
            {
                //Escribe un programa que le pide al usuario la nota de un alumno (un número real). El
                //programa escribirá “Suspenso” si la nota está entre 0 y 5; “Suficiente” si la nota está
                //entre 5 y 6; “Bien” si la nota está entre 6 y 7; “Notable” si la nota está entre 7 y 9 y
                //“Sobresaliente” si está entre 9 y 10. Si la nota no es válida, el programa nos vuelve a
                //pedir un valor hasta que introduzcamos una correcta.

                double nota;
                System.out.print("Escribe nota: ");
                nota = sc.nextDouble();

                while(nota < 0 && nota > 10)
                {
                    System.out.println("Nota no válida");
                    System.out.print("Escribe nota: ");
                    nota = sc.nextDouble();
                }

                if(nota >= 0 && nota < 5)
                {
                    System.out.println("SUSPENSO");
                }
                else
                {
                    if(nota >= 5 && nota < 6)
                    {
                        System.out.println("SUFICIENTE");
                    }
                    else
                    {
                        if(nota >= 6 && nota < 7)
                        {
                            System.out.println("BIEN");
                        }
                        else
                        {
                            if(nota >= 7 && nota < 9)
                            {
                                System.out.println("NOTABLE");
                            }
                            else
                            {
                                if(nota >= 9 && nota <= 10)
                                {
                                    System.out.println("SOBRESALIENTE");
                                }
                            }
                        }
                    }
                }
            }
            break;

            case 36:
            {
                //Escribe un programa que nos escriba los 10 primeros números que no sean múltiplos ni
                //de 2 ni de 3.

                int contador = 0;
                int i = 1;
                while(contador <= 10)
                {
                    if(i %2 != 0 && i %3 != 0)
                    {
                        contador = contador + 1;
                        System.out.println(i);
                    }
                    i++;
                }
            }
            break;

            case 37:
            {
                //Escribe un programa que nos presente un menú con 3 opciones. Eligiendo la opción “a”
                //nos escribirá todos los múltiplos de 11 comprendidos entre 1 y 100. Eligiendo la opción
                //“b” lo mismo, pero con los múltiplos de 17. Eligiendo la opción “c” lo mismo, pero con
                //los múltiplos de 23.

                int i;

                System.out.println("===============");
                System.out.println("MENÚ 3 OPCIONES");
                System.out.println("===============");
                System.out.println("a) Múltiplos de 11 entre 1 y 100");
                System.out.println("b) Múltiplos de 17 entre 1 y 100");
                System.out.println("c) Múltiplos de 23 entre 1 y 100");
                System.out.println();
                System.out.print("Elige un opción: ");
                String op = sc.next();

                switch (op)
                {
                    case "a":
                    {
                        for(i = 1; i <= 100; i++)
                        {
                            if(i %11 == 0)
                            {
                                System.out.println(i);
                            }
                        }
                    }
                    break;
                    case "b":
                    {
                        for(i = 1; i <= 100; i++)
                        {
                            if(i %17 == 0)
                            {
                                System.out.println(i);
                            }
                        }
                    }
                    break;
                    case "c":
                    {
                        for(i = 1; i <= 100; i++)
                        {
                            if(i %23 == 0)
                            {
                                System.out.println(i);
                            }
                        }
                    }
                    break;
                }
            }
            break;

            case 38:
            {
                //Escribe un programa que calcule el máximo común divisor de 2 números.
                //El MCD de dos númeos es el número natural mas grande que divid a ambos

                int a, b, divisor;

                System.out.print("Escribe un número: ");
                a = sc.nextInt();
                System.out.print("Escribe otro número: ");
                b = sc.nextInt();

                //Seleccionamos el menor de los dos números

                if(a < b)
                {
                    divisor = a;
                }
                else
                {
                    divisor = b;
                }

                //Ahora empezamos a comprobar si ese número es el mcd
                //o lo son los sucesivos inferiores a él

                while((a %divisor != 0 || b %divisor != 0) && divisor > 1)
                {
                    divisor--;
                }

                //Para salir del bucle deben cumplirse dos condiciones:
                //1. divisor es divisor de ambos números
                //2. divisor a llegado a valer 1, por lo tanto ese es el MCD
                System.out.println("El MCD de " + a + " y " + b + " = " + divisor);
            }
            break;

            case 39:
            {
                //Escribe un programa que calcule el mínimo común múltiplo de 2 números.

                //El MCM entre varios números naturales
                //es el número natural más pequeño que es distinto de 0
                //y que resulta múltiplo de cada uno de ellos.

                int a, b, multiplo;

                System.out.print("Escribe el primer número: ");
                a = sc.nextInt();
                System.out.println("Escribe el segundo número: ");
                b = sc.nextInt();

                //Seleccionamos el mayor de los dos
                if(a > b)
                {
                    multiplo = a;
                }
                else
                {
                    multiplo = b;
                }

                //Ahoram vamos comprobando si ese número es el mcm
                //o los son los sucesivos superiores a él
                while(multiplo %a != 0 || multiplo %b != 0)
                {
                    multiplo++;
                }
                //Para salir del bucle debe cumplirse:
                //· multiplo es un número múltiplo de a y b simultáneamente
                System.out.println("El MCM de " + a + " y " + b + " = " + multiplo);


            }
            break;

            case 40:
            {
                //Escribe un programa que nos diga si un número es primo o no.

                int n, i, divisores = 0;

                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                for(i = 1; i <= n; i++)
                {
                    if(n %i == 0)
                    {
                        divisores = divisores + 1;
                    }
                }
                if(divisores > 2)
                {
                    System.out.println(n + " no es primo");
                }
                else
                {
                    System.out.println(n + " es primo");
                }
            }
            break;

            case 41:
            {
                //Generalizar el algoritmo anterior para averiguar todos los números primos que existen
                //entre 2 y 1000.

                int i, numero, divisores;

                //Comienzamos con un bucle for --> vamos del 2 al 1000
                for(numero = 2; numero <= 1000; numero++)
                {
                    divisores = 0;
                    i = 1;  //Inicio del while comienza en 1 para que compruebe el 1 también, ya que un nº primo es divisible por sí mismo y por el 1
                    while(i <= numero)  //Mientras vaya del 1 hasta el nº que está comprobando
                    {
                        if(numero %i == 0)  ////Y si ese nº que comprueba es divisible (resto 0)
                        {
                            divisores = divisores + 1;
                        }
                        i++;
                    }
                    if(divisores <= 2)
                    {
                        System.out.println(numero + " ");
                    }
                }
            }
            break;

            case 42:
            {
                //Juego del número secreto. El ordenador elegirá un número al azar entre 1 y 100. El
                //usuario irá introduciendo números por teclado, y el ordenador le irá dando pistas: "mi
                //número es mayor" o "mi número es menor", hasta que el usuario acierte. Entonces el
                //ordenador le felicitará y le comunicará el número de intentos que necesitó para acertar
                //el número secreto.

                Random rd = new Random();
                int n;
                int intentos;
                int secreto;
                secreto = rd.nextInt(100)+1;

                System.out.println("JUEGO DEL NÚMERO SECRETO");
                System.out.println();
                System.out.print("Escribe un número: ");
                n = sc.nextInt();
                intentos = 1;

                while(n != secreto)
                {
                    if(n < secreto)
                    {
                        intentos = intentos + 1;
                        System.out.println("El número secreto es mayor");
                        System.out.print("Vuelve a escribir otro número: ");
                        n = sc.nextInt();
                    }
                    else
                    {
                        if(n > secreto)
                        {
                            intentos = intentos + 1;
                            System.out.println("El número secreto es menor");
                            System.out.print("Vuevle a escribir otro número: ");
                            n = sc.nextInt();
                        }
                    }
                }

                if(intentos == 1)
                {
                    System.out.println();
                    System.out.println("Enhorabuena, acertaste a la primera");
                }
                else
                {
                    if(intentos > 1 && intentos < 7)
                    {
                        System.out.println();
                        System.out.println("Bueno, al menos no pasaste de 7 intentos");
                        System.out.print("Número de intentos = " + intentos);
                    }
                    else
                    {
                        if(intentos > 7)
                        {
                            System.out.println();
                            System.out.println("Te ha costado un poco, pero hacertaste al fin");
                            System.out.print("Número de intentos = " + intentos);
                        }
                    }
                }

            }
            break;
        }
    }
}
