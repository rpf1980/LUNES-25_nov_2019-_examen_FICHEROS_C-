package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Fraccion f = new Fraccion(1, 2);
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("OPCIONES PARA FRACCIONES");
        System.out.println("========================");
        System.out.println("[1] simplificar y toString");
        System.out.println("[2] negate");
        System.out.println("[3] add");
        System.out.println("[4] substract");
        System.out.println("[5] multiply");
        System.out.println("[6] divide");
        System.out.println("[7] equals");
        System.out.println("[8] compareTo");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //simplifica y toString

                f.simplificar();
                System.out.println( f.toString());


            }
            break;

            case 2:
            {
                //negate
                System.out.println(f.toString());
                System.out.println(f.negate());
            }
            break;

            case 3:
            {
                //add
                Fraccion fraccion = new Fraccion(69, 48);


                System.out.println(f.add(fraccion));

            }
            break;

            case 4:
            {
                //substract
                Fraccion fraccion = new Fraccion(69, 48);

                System.out.println(f.substract(fraccion));
            }
            break;

            case 5:
            {
                //multiply
                Fraccion fraccion = new Fraccion(22, 56);

                System.out.println(f.multiply(fraccion));
            }
            break;

            case 6:
            {
                //divide
                Fraccion fraccion = new Fraccion(22, 56);

                System.out.println(f.divide(fraccion));
            }
            break;

            case 7:
            {
                //equals
                Fraccion fraccion = new Fraccion(2, 4);

                System.out.println(f.equals(fraccion));

            }
            break;

            case 8:
            {
                //compareTo
                Fraccion fraccion = new Fraccion(20,5);

                System.out.println(f.compareTo(fraccion));
            }
            break;
        }
    }
}
