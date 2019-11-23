package com.company;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteMayusculas
{
    //Método estático
    public static void conectaCliente(String ip)
    {
        try
        {
            String textoCliente = "";
            String textoServidor = "";
            Socket soc = new Socket(ip, 9010);

            Scanner scClient = new Scanner(System.in);
            Scanner scServer = new Scanner(soc.getInputStream());
            PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);

            while(true)
            {
                //Pedimos datos al cliente
                System.out.println("Escribe texto: ");
                textoCliente = scClient.nextLine(); //Leemos la terminal

                //Enviamos lo escrito al servidor
                pw.println(textoCliente);

                //Leer la respuesta del servidor
                textoServidor = scServer.nextLine();
                System.out.println(textoServidor); //Mostramos respuesta
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}
