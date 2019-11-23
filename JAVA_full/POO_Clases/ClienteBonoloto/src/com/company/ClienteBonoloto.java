package com.company;

import java.io.DataInputStream;
import java.lang.reflect.Array;
import java.net.Socket;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClienteBonoloto
{
    //Métodos aparte
    public int[] copiaArray(int[] a)
    {
        int[] copia = new int[a.length];
        int i;

        for(i = 0; i < a.length; i++)
        {
            copia[i] = a[i];
        }
        return copia;
    }

    //Atributo
    private int[] boleto;

    //Constructor
    public ClienteBonoloto(int[] a)
    {
        if(a.length == 6)
        {
            for(int i = 0; i < a.length; i++)
            {
                if(a[i] >= 1 && a[i] <= 49)
                {
                    this.boleto = copiaArray(a);
                }
            }
        }
        else
        {
            throw new InvalidParameterException("La apuesta debe acerse de 6 números");
        }
    }

    //Métodos
    public int conectaCliente(String ip)
    {
        int aciertos = 0;
        int[] boletoServidor = new int[6]; //Guardará la combinación completa que envíe el servidor
        int n; //Guardará cada número que envíe el servidor
        int i;
        List<Integer> listaAuxiliar = new ArrayList<>();

        try
        {
            Socket soc = new Socket(ip, 9009);

            Scanner sc = new Scanner(soc.getInputStream());

            //Guardamos los números que el servidor nos manda (Número premiado)
            for(i = 0; i < boletoServidor.length; i++)
            {
                n = sc.nextInt();
                boletoServidor[i] = n;
            }

            //Pasamos a lista el array cliente para trabajar más cómodo
            for(i = 0; i < this.boleto.length; i++)
            {
                listaAuxiliar.add(this.boleto[i]);
            }

            //Comprobamos los aciertos del bonoloto del cliente
            for(i = 0; i < boletoServidor.length; i++)
            {
                if(listaAuxiliar.contains(boletoServidor[i]))
                {
                    aciertos++;
                }
            }

            //**OJO esta forma de mostrar el boleto del servidor no se si es correcta
            System.out.println("Número del sorteo de la bonoloto: ");
            System.out.println(Arrays.toString(boletoServidor));
            System.out.println();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return aciertos;
    }
}