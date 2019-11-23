package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Dinero d = new Dinero(9, TipoMoneda.Euro);

        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("MENÚ MONEDAS DINERO");
        System.out.println("===================");
        System.out.println("[1] add");
        System.out.println("[2] substract");
        System.out.println("[3] multiply");
        System.out.println("[4] divide");
        System.out.println("[5] negate");
        System.out.println("[6] equals");
        System.out.println("[7] compareTo");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //add
                Dinero d2 = new Dinero(3, TipoMoneda.Dolar);

                System.out.println(d.add(d2));
            }
            break;

            case 2:
            {
                //substract
                Dinero d2 = new Dinero(5, TipoMoneda.Dolar);

                System.out.println(d.substract(d2));
            }
            break;

            case 3:
            {
                //multiply
                Dinero d2 = new Dinero(3, TipoMoneda.Euro);

            }
            break;

            case 4:
            {
                //divide
            }
            break;

            case 5:
            {
                //negate
            }
            break;

            case 6:
            {
                //equals
            }
            break;

            case 7:
            {
                //compareTo
            }
            break;
        }

    }
}

