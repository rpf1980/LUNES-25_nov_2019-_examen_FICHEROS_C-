package com.company;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class ServidorMayusculas
{
    //Método estático
    public static void lanzaServidor()
    {
        try
        {
            ServerSocket server = new ServerSocket(9010);
            ExecutorService pool = Executors.newFixedThreadPool(10);

            while(true)
            {
                Socket soc = server.accept(); //Aceptamos clientes
                System.out.println("Clinte conectado");
                pool.execute(new HiloServidor(soc)); //Lanzamos hilos del servidor (hilos por clientes conectados)
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //Clase interna
    public static class HiloServidor implements Runnable
    {
        //Atributo
        Socket socket;

        //Constructor
        HiloServidor(Socket socket)
        {
            this.socket = socket;
        }

        public void run()
        {
            try
            {
                //Lee el servidor
                Scanner sc = new Scanner(socket.getInputStream());
                //Escribe el servidor
                PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

                while(true)
                {
                    //pw.println(sc.nextLine().toUpperCase()); //Escribe contenido que lee

                    //Estas tres sentencias son equivalentes a la única sentencia anterior
                    String linea = sc.nextLine();
                    System.out.println(linea);
                    linea = linea.toUpperCase();
                    pw.println(linea);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
