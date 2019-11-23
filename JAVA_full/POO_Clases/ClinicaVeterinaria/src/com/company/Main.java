package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        ClinicaVeterinaria ficha = new ClinicaVeterinaria();

        int opcion = -1;
        String nombre;
        LocalDate fechNac;
        double peso;
        String comentarios;

        Scanner sc = new Scanner(System.in);

        while(opcion != 6)
        {
            System.out.println("===================");
            System.out.println("CLINICA VETERINARIA");
            System.out.println("===================");
            System.out.println("[1] INSERTA ANIMAL");
            System.out.println("[2] BUSCA ANIMAL");
            System.out.println("[3] MODIFICA COMENTARIO");
            System.out.println("[4] MOSTRAR FICHAS");
            System.out.println("[5] INSERTA COMENTARIO");
            System.out.println("[6] SALIR");
            System.out.println();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {
                    int opcion2 = -1;
                    System.out.println("¿ Qué animal se va a insertar ?");
                    System.out.println("[1] PERRO");
                    System.out.println("[2] GATO");
                    System.out.println("[3] PÁJARO");
                    System.out.println("[4] REPTIL");
                    opcion2 = sc.nextInt();
                    sc.nextLine();

                    switch (opcion2)
                    {
                        case 1:
                        {
                            RazaPerro raza;
                            String microchip;

                            //Pedimos datos
                            System.out.println("Nombre: ");
                            nombre = sc.nextLine();
                            System.out.println("Fecha de nacimiento: ");
                            fechNac = LocalDate.parse(sc.nextLine());
                            System.out.println("Peso: ");
                            peso = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Microchip: ");
                            microchip = sc.nextLine();
                            System.out.println("Raza: ");
                            raza = RazaPerro.valueOf(sc.nextLine());
//                            System.out.println("Escriba un comentario del perro: ");
//                            comentarios = sc.nextLine();

                            Perro p = new Perro(nombre, fechNac, peso, raza, microchip);
                            ficha.insertaAnimal(p);
                        }
                        break;

                        case 2:
                        {
                            RazaGato raza;
                            String microchip;

                            System.out.println("Nombre: ");
                            nombre = sc.nextLine();
                            System.out.println("Fecha de nacimiento: ");
                            fechNac = LocalDate.parse(sc.nextLine());
                            System.out.println("Peso: ");
                            peso = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Microchip");
                            microchip = sc.nextLine();
                            System.out.println("Raza: ");
                            raza = RazaGato.valueOf(sc.nextLine());
                            /*System.out.println("Escribe un comentario del gato: ");
                            comentarios = sc.nextLine();*/

                            Gato g = new Gato(nombre, fechNac, peso, raza, microchip);

                            ficha.insertaAnimal(g);
                        }
                        break;


                        case 3:
                        {
                            EspeciePajaro especie;
                            boolean cantor;

                            System.out.println("Nombre: ");
                            nombre = sc.nextLine();
                            System.out.println("Fecha de nacimiento: ");
                            fechNac = LocalDate.parse(sc.nextLine());
                            System.out.println("Peso: ");
                            peso = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Especie: ");
                            especie = EspeciePajaro.valueOf(sc.nextLine());
                            System.out.println("¿ Cantor ?");
                            cantor = sc.nextBoolean();
                            System.out.println("Escribe un comentario del pájaro: ");
                            comentarios = sc.nextLine();

                            Pajaro pajaro = new Pajaro(nombre, fechNac, peso, especie, cantor);


                            ficha.insertaAnimal(pajaro);
                        }
                        break;

                        case 4:
                        {
                            EspecieReptil especie;
                            boolean venenoso;

                            System.out.println("Nombre: ");
                            nombre = sc.nextLine();
                            System.out.println("Fecha de nacimiento: ");
                            fechNac = LocalDate.parse(sc.nextLine());
                            System.out.println("Peso: ");
                            peso = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Especie: ");
                            especie = EspecieReptil.valueOf(sc.nextLine());
                            System.out.println("¿ Venenoso ?");
                            venenoso = sc.nextBoolean();
                            System.out.println("Escribe un comentario del reptil: ");
                            comentarios = sc.nextLine();

                            Reptil reptil = new Reptil(nombre, fechNac, peso, especie, venenoso);

                            ficha.insertaAnimal(reptil);
                        }
                        break;
                    }
                }
                break;

                case 2:
                {
                    System.out.println("Escribe el nombre del animal para buscarlo: ");
                    nombre = sc.nextLine();

                    System.out.println(ficha.buscaAnimal(nombre));
                }
                break;

                case 3:
                {
                    System.out.println("Nombre del animal para modificar su comentario: ");
                    nombre = sc.nextLine();
                    System.out.println("Comentario nuevo: ");
                    comentarios = sc.nextLine();

                    System.out.println(ficha.toString());

                    ficha.modificaComentarioAnimal(nombre, comentarios);
                }
                break;

                case 4:
                {
                    System.out.println(ficha.toString());
                }
                break;

                case 5:
                {
                    //Inserta comentario

                    //Buscamos el animal
                    System.out.println("Nombre del animal: ");
                    nombre = sc.nextLine();

                    Animal a = ficha.buscaAnimal(nombre);

                    //Mostramos comentario
                    System.out.println("Comentario que ya tenemos: ");
                    System.out.println(a.comentario);

                    //Pedimos nuevo comentario
                    System.out.println("Escribe un nuevo comentario: ");
                    String comentarioNuevo = sc.nextLine();
                    System.out.println();

                    //Añadimos nueva línea de comentario
                    a.setComentario(a.comentario + "\n" + comentarioNuevo);
                    System.out.println();

                    //Mostramos los cambios
                    System.out.println(a.comentario);

                }
                break;

                case 6:
                {
                    opcion = 6;
                }
                break;
            }
        }
    }
}

