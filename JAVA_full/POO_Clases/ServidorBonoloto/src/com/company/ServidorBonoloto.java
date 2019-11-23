package com.company;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorBonoloto
{
    //Atributo estático
    static Random r;

    //Método stático
    public static void lanzaServidor()
    {
        try
        {
            ServerSocket server = new ServerSocket(9009);

            r = new Random();
            while (true)
            {
                Socket soc = server.accept();

                PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);

                List<Integer> listaNumeros = new ArrayList<>();
                int n = 0;
                int i;

                for (i = 0; i < 6; i++)
                {
                    n = r.nextInt(49)+1;
                    listaNumeros.add(n);
                }

                for(i = 0; i < listaNumeros.size(); i++)
                {
                    pw.println(listaNumeros.get(i));
                    System.out.print(listaNumeros.get(i) + " ");
                }

       			soc.close();

            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}