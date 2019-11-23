package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TresEnRaya tres = new TresEnRaya();

        int opcion = -1;

        while(opcion != 0)
        {
            tres.iniciar();
            System.out.println("=================");
            System.out.println("MENÚ TRES EN RAYA");
            System.out.println("=================");
            System.out.println("[1] Jugador1 vs Jugador2");
            System.out.println("[2] Jugador vs Ordenador");
            System.out.println("[3] Ordenador vs Jugador");
            System.out.println("[4] Ordenador vs Ordenador");
            System.out.println("[0] SALIR");
            System.out.println();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {
                    //Jugador1 vs Jugador2

                    int jugador1, jugador2, turno = 1;

                    System.out.println("JUGADOR_1 vs JUGADOR_2");
                    System.out.println();

                    //Empezamos juego

                    while(tres.quedanMovimientos() && !(tres.ganaJugador1() || tres.ganaJugador2()))
                    {
                        tres.dibujaTablero();
                        if(turno == 1)
                        {
                            System.out.println("Mueve jugador 1:");
                            jugador1 = sc.nextInt();

                            tres.mueveJugador1(jugador1);
                            turno = 2;
                        }
                        else
                        {
                            if(!tres.ganaJugador2())
                            {
                                System.out.println("Mueve jugador 2:");
                                jugador2 = sc.nextInt();

                                tres.mueveJugador2(jugador2);
                                turno = 1;
                            }

                        }

                    }

                    if(tres.ganaJugador1())
                    {
                        System.out.println("GANA JUGADOR 1");
                    }
                    else
                    {
                        if(tres.ganaJugador2())
                        {
                            System.out.println("GANA JUGADOR 2");
                        }
                        else
                        {
                            System.out.println("EMPATE !!!");
                        }
                    }

                }
                break;

                case 2:
                {
                    //Jugador vs Ordenador

                    int turno = 1;
                    int jugador1, ordenador;

                    System.out.println("JUGADOR vs ORDENADOR");
                    System.out.println();

                    while(tres.quedanMovimientos() && !(tres.ganaJugador1() || tres.ganaJugador2()))
                    {
                        tres.dibujaTablero();
                        if(turno == 1)
                        {
                            System.out.println("Mueve jugador: ");
                            jugador1 = sc.nextInt();

                            tres.mueveJugador1(jugador1);
                            turno = 2;
                        }
                        else
                        {
                            if(!tres.ganaJugador2())
                            {
                                System.out.println("TURNO DE ORDENADOR: ");
                                tres.mueveOrdenador2();
                                turno = 1;
                            }

                        }

                    }

                    if(tres.ganaJugador1())
                    {
                        tres.dibujaTablero();
                        System.out.println("GANA JUGADOR 1");
                    }
                    else
                    {
                        if(tres.ganaJugador2())
                        {
                            tres.dibujaTablero();
                            System.out.println("GANA ORDENADOR");
                        }
                        else
                        {
                            tres.dibujaTablero();
                            System.out.println("EMPATE !!!");
                        }
                    }

                }
                break;

                case 3:
                {
                    //Ordenador vs Jugador

                    int turno = 1;
                    int ordenador, jugador;

                    System.out.println("ORDENADOR vs JUGADOR");
                    System.out.println();

                    while(tres.quedanMovimientos() && !(tres.ganaJugador1() || tres.ganaJugador2()))
                    {
                        tres.dibujaTablero();
                        if(turno == 1)
                        {
                            System.out.println("TURNO DE ORDENADOR:");
                            tres.mueveOrdenador1();
                            turno = 2;
                        }
                        else
                        {
                            if(!tres.ganaJugador2())
                            {
                                System.out.println("JUGADOR:");
                                jugador = sc.nextInt();
                                tres.mueveJugador2(jugador);
                                turno = 1;
                            }

                        }

                    }

                    if(tres.ganaJugador1())
                    {
                        tres.dibujaTablero();
                        System.out.println("GANA ORDENADOR");
                    }
                    else
                    {
                        if(tres.ganaJugador2())
                        {
                            tres.dibujaTablero();
                            System.out.println("GANA JUGADOR");
                        }
                        else
                        {
                            tres.dibujaTablero();
                            System.out.println("EMPATE !!!");
                        }
                    }
                }
                break;

                case 4:
                {
                    //Ordenador vs Ordenador

                    int turno = 1;

                    System.out.println("ORDENADOR vs ORDENADOR");
                    System.out.println();

                    while(tres.quedanMovimientos() && !(tres.ganaJugador1() || tres.ganaJugador2()))
                    {
                        tres.dibujaTablero();
                        System.out.println();
                        if(turno == 1)
                        {
                            tres.mueveOrdenador1();
                            turno = 2;
                        }
                        else
                        {
                            if(!tres.ganaJugador2())
                            {
                                tres.mueveOrdenador2();
                                turno = 1;
                            }

                        }

                    }

                    if(tres.ganaJugador1())
                    {
                        tres.dibujaTablero();
                        System.out.println("GANA ORDENADOR 1");
                    }
                    else
                    {
                        if(tres.ganaJugador2())
                        {
                            tres.dibujaTablero();
                            System.out.println("GANA ORDENADOR 2");
                        }
                        else
                        {
                            tres.dibujaTablero();
                            System.out.println("EMPATE !!!");
                        }
                    }

                }
                break;
            }
        }
    }
}
