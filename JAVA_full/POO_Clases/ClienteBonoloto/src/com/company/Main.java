package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] a = {41,25,16,7,28,49};
        ClienteBonoloto cliente = new ClienteBonoloto(a);

        int aciertos;

        aciertos = cliente.conectaCliente("localhost");

        System.out.println("Boleto del cliente: ");
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println("Su boleto de bonoloto tiene " + aciertos + " aciertos.");

    }
}
