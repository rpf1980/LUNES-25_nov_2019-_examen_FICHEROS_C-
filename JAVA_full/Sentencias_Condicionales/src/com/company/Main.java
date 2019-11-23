package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("MENÚ CONDICIONALES");
        System.out.println("==================");
        System.out.println("[1] A y B mayor menor");
        System.out.println("[2] Año bisiesto");
        System.out.println("[3] Conversor Euros || Pesetas");
        System.out.println("[4] ¿Ordenados de menor a mayor?");
        System.out.println("[5] ¿Son consecutivos los números?");
        System.out.println("[6] Cantidad de cifras para N entero");
        System.out.println("[7] Ecuación de segundo grado");
        System.out.println("[8] Mayor - Menor - Mediano");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                // Leídos dos números por teclado, A y B, calcular la resta del mayor menos el menor. Por
                //ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el
                //resultado debe ser B – A, es decir, 3.

                int a, b, resta;
                System.out.println("Escribe primer nº: ");
                a = sc.nextInt();
                System.out.println("Escribe segundo nº: ");
                b = sc.nextInt();

                if (a > b)
                {
                    System.out.println("La resta = " + (a - b));
                } else
                {
                    System.out.println("La resta = " + (b - a));
                }
            }
            break;

            case 2:
            {
                // Determinar si un año es bisiesto o no (los años bisiestos son múltiplos de 4; utilícese el
                //operador módulo).

                int anio;
                System.out.println("Escribe un año para decirte si es bisiesto: ");
                anio = sc.nextInt();

                if (anio % 4 == 0 && ((anio % 100 != 0) || (anio % 400 == 0)))
                {
                    System.out.println(anio + " es bisiesto");
                } else
                {
                    System.out.println(anio + " no es bisiesto");
                }

            }
            break;

            case 3:
            {
                // Leer un número real y un tipo de moneda, que puede ser "euro" o "peseta". Convertir
                //la cantidad al tipo de moneda indicado, suponiendo que está expresada en la otra. Por
                //ejemplo, si la cantidad es 15 y la moneda es "peseta", se supondrá que se trata de 15 €
                //y que hay que convertirlos a pesetas y, por lo tanto, el resultado debe ser 2495.

                double euro, peseta;
                String tipo = "";
                System.out.print("Quieres convertir euros o pesetas: ");
                tipo = sc.next();

                if (tipo.equals("euros"))
                {
                    System.out.print("Escribe cantidad de euros: ");
                    euro = sc.nextDouble();
                    peseta = euro * 166.386;
                    System.out.println(euro + " € = " + peseta + " pts.");
                } 
                else
                {
                    if (tipo.equals("pesetas"))
                    {
                        System.out.print("Escribe cantidad de pesetas: ");
                        peseta = sc.nextDouble();
                        euro = peseta / 166.386;
                        System.out.println(euro + " pts = " + peseta + " €.");
                    }
                }
            }
            break;

            case 4:
            {
                //Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor.
                int x, y, z;
                System.out.print("Escribe primer nº: ");
                x = sc.nextInt();
                System.out.print("Escribe segundo nº: ");
                y = sc.nextInt();
                System.out.print("Escribe tercer nº: ");
                z = sc.nextInt();

                if (x < y && y < z)
                {
                    System.out.println("Los números están ordenados de menor a mayor");
                } else
                {
                    System.out.println("Los números no están ordenados de menor a mayor");
                }
            }
            break;

            case 5:
            {
                //Como el anterior, pero para averiguar si los números son consecutivos.
                int x, y, z;
                System.out.print("Escribe primer nº: ");
                x = sc.nextInt();
                System.out.print("Escribe el segundo nº: ");
                y = sc.nextInt();
                System.out.print("Escribe el tercer nº: ");
                z = sc.nextInt();

                if (x == y - 1 && y == z - 1)
                {
                    System.out.println("Los números van de menor a mayor y son consecutivos");
                } else
                {
                    System.out.println("Los números no son consecutivos");
                }
            }
            break;

            case 6:
            {
                //Determinar el número de cifras de un número entero. El algoritmo debe funcionar para
                //números de hasta 5 cifras, considerando los negativos. Por ejemplo, si se introduce el
                //número 5342, la respuesta del programa debe ser 4. Si se introduce -250, la respuesta
                //debe ser 3.

                int n;
                System.out.print("Escribe un número para determinar su cifra: ");
                n = sc.nextInt();

                if (n > -10 && n < 10)
                {
                    System.out.println("Cifras de " + n + " = " + " 1.");
                } else
                {
                    if (n > -100 && n < 100)
                    {
                        System.out.println("Cifras de " + n + " = " + " 2.");
                    } else
                    {
                        if (n > -1000 && n < 1000)
                        {
                            System.out.println("Cifras de " + n + " = " + " 3.");
                        } else
                        {
                            if (n > -10000 && n < 10000)
                            {
                                System.out.println("Cifras de " + n + " = " + " 4.");
                            } else
                            {
                                if (n > -100000 && n < 100000)
                                {
                                    System.out.println("Cifras de " + n + " = " + " 5.");
                                }
                            }
                        }
                    }
                }
            }
            break;

            case 7:
            {
                //Calcular las dos soluciones de una ecuación de segundo grado, del tipo ax2 + bx + c = 0.
                //Los coeficientes a, b y c deberá introducirlos el usuario a través del teclado.
                //Fórmula x = -b + sqrt(b^2 - 4ac) / 2a

                double a, b, c, delta, x1, x2;
                System.out.print("Escribe valor de a = ");
                a = sc.nextDouble();
                System.out.print("Escribe valor de b = ");
                b = sc.nextDouble();
                System.out.print("Escribe valor de c = ");
                c = sc.nextDouble();

                delta = (b * b) - (4 * a * c);

                if (delta > 0)
                {
                    x1 = (-b + (Math.sqrt(delta)) / (2 * a));
                    x2 = (-b - (Math.sqrt(delta)) / (2 * a));
                    System.out.println("Las dos soluciones son = " + x1 + " y " + x2);
                } else
                {
                    if (delta == 0)
                    {
                        x1 = -b / (2 * a);
                        System.out.println("Solo una solución = " + x1);
                    } else
                    {
                        System.out.println("¡No tiene solución!");
                    }
                }
            }
            break;

            case 8:
            {
                // Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el menor y cuál
                //el mediano.

                int mayor, menor, mediano;
                int a, b, c;
                System.out.print("Escribe valor de a: ");
                a = sc.nextInt();
                System.out.print("Escribe valor de b: ");
                b = sc.nextInt();
                System.out.print("Escribe valor de c: ");
                c = sc.nextInt();

                if (a <= b && b <= c)
                {
                    menor = a;
                    mediano = b;
                    mayor = c;
                } else
                {
                    if (a <= c && c <= b)
                    {
                        menor = a;
                        mediano = c;
                        mayor = b;
                    } else
                    {
                        if (b <= a && a <= c)
                        {
                            menor = b;
                            mediano = a;
                            mayor = c;
                        } else
                        {
                            if (b <= c && c <= a)
                            {
                                menor = b;
                                mediano = c;
                                mayor = a;
                            } else
                            {
                                if (c <= a && a <= b)
                                {
                                    menor = c;
                                    mediano = a;
                                    mayor = b;
                                } else
                                {
                                    menor = c;
                                    mediano = b;
                                    mayor = a;
                                }
                            }
                        }
                    }

                }
                System.out.println("MENOR = " + menor);
                System.out.println("MEDIANO = " + mediano);
                System.out.println("MAYOR = " + mayor);

            }
            break;
        }
    }
}

