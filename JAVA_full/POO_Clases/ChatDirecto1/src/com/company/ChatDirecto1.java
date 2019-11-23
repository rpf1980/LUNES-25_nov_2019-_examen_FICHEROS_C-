package com.company;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatDirecto1
{
    //Método estático
    public static void escuchar()
    {
        try
        {
            ServerSocket server = new ServerSocket(9011);

            while(true)
            {
                //PARTE 1ª --> conectamos con cliente amigo y a través de HiloRecibir leemos sus menajes
                Socket soc = server.accept(); //Aceptamos la conexión del cliente "amigo"
                System.out.println("Conectado: " + soc.toString());
                String mensaje = ""; //Contendrá los mensajes que recibe del cliente amigo
                HiloRecibir hr = new HiloRecibir(soc);
                Thread th = new Thread(hr);
                th.start(); //Se activa el hilo de recibir menajes

                PrintWriter pw = new PrintWriter(soc.getOutputStream(), true);

                //PARTE 2ª --> escribimos desde este lado
                //Pedimos líneas de texto
                System.out.print("Escribe texto: ");

                Scanner sc = new Scanner(System.in);
                mensaje = sc.nextLine();

                while(!mensaje.isEmpty())
                {
                    pw.println(mensaje);
                    mensaje = sc.nextLine();
                }

                    //Paramos HiloRecibir
                    hr.stop();

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void conectar(String ip)
    {
        try
        {
            //Conectamos con cliente "amigo" que está escuchando
            Socket soc = new Socket(ip, 9011);

            //Preparamos el hilo recibir
            HiloRecibir hr = new HiloRecibir(soc);
            Thread th = new Thread(hr);
            th.start();

            //Scanner para la terminal (así vemos y mandamos los mensajes)
            Scanner scConsola = new Scanner(System.in);

            //Mandamos mensajes que se imprimen en cliente "amigo"
            PrintWriter pw = new PrintWriter(soc.getOutputStream(), true);
            System.out.println("Escribe texto: ");
            String mensaje;
            mensaje = scConsola.nextLine();


            while(mensaje.length()>0)
            {

                pw.println(mensaje);
                mensaje = scConsola.nextLine();
            }

            hr.stop(); //Paramos el hilo
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static class HiloRecibir implements Runnable
    {
        //Atributos
        Socket socket;
        private volatile boolean salir = false;

        //Constructor
        HiloRecibir(Socket socket)
        {
            this.socket = socket;
        }

        public void run()
        {
            try
            {
                Scanner sc = new Scanner(socket.getInputStream());

                while(!this.salir)
                {
                    //Leemos mensajes que llegan

                    //Mostramos por pantalla mensajes que leemos
                    System.out.println(sc.nextLine());
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        public void stop()
        {
            this.salir = true;
        }
    }
}

