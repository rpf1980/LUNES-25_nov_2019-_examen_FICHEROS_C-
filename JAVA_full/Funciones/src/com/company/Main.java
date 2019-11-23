package com.company;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static boolean Par(int n)
    {
        boolean espar = false;

        if(n %2 == 0)
        {
            espar = true;
        }
        return espar;
    }

    public static boolean Bisiesto(int anio)
    {
        boolean bisiesto = false;

        if(anio %4 == 0 && (anio %100 != 0 || anio %400 == 0))
        {
            bisiesto = true;
        }
        return bisiesto;

    }

    public static void TablaMultiplicar(int n)
    {
        int i;
        for(i = 1; i <= 10; i++)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }

    public static void ImprimeSerie(int a, int b)
    {
        if(a < b)
        {
            for(a = a; a <= b; a++)
            {
                System.out.println(a);
            }
        }
        else
        {
            if(a > b)
            {
                for(a = a; a >= b; a--)
                {
                    System.out.println(a);
                }
            }
        }
    }

    public static int Signo(int n)
    {
        int signo;
        if(n < 0)
        {
            signo = -1;
        }
        else
        {
            if(n == 0)
            {
                signo = 0;
            }
            else
            {
                signo = 1;
            }
        }
        return signo;
    }

    public static int Max(int a, int b)
    {
        int max;
        if(a < b)
        {
            max = b;
        }
        else
        {
            max = a;
        }
        return max;
    }

    public static int Min(int a, int b)
    {
        int min;
        if(a < b)
        {
            min = a;
        }
        else
        {
            min = b;
        }
        return min;
    }

    public static int MCD(int a, int b)
    {
        //MCD es el mayor número por el que se divide cada uno de los números dados

        int mcd;
        int divisor;

        //Primero buscamos el número menor
        divisor = Min(a,b);

        //Ahora vamos comprobando si el número es el mcd o lo son los sucesivos inferiores a él
        while((a %divisor != 0 || b %divisor != 0) && divisor > 1)
        {
            divisor--;
        }
        //Para salir del bucle deben cumplirse dos condiciones:
        //1. "divisor" debe ser mcd de ambos números
        //2. No hay mas de un divisor, por lo tanto ese es el mcd
        return divisor;
    }

    public static int MCM(int a, int b)
    {
        //MCM es el menor de todos múltiplos comunes a varios números, excluido el cero.

        int mcm;
        int multiplo;

        //Primero buscamos el mayor de los números
        if(a > b)
        {
            multiplo = a;
        }
        else
        {
            multiplo = b;
        }

        //Ahora vamos probando si el número es mcm o lo son los sucesivos superiores a él.
        while(multiplo %a != 0 || multiplo %b != 0)
        {
            multiplo++;
        }
        return multiplo;
    }

    public static boolean Primo(int n)
    {
        boolean esprimo = true;
        int divisores = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n %i == 0)
            {
                divisores += 1;
            }
        }
        if(divisores > 2)
        {
            esprimo = false;
        }
        return esprimo;
    }

    public static int AreaTriangulo(int base, int altura)
    {
        int area = (base * altura) / 2;
        return area;
    }

    public static double ConversorPulgadasCentimetros(double valor, String unidad)
    {
        double resultado = 0;

        unidad = unidad.toLowerCase();
        if(unidad.equals("centímetros"))
        {
            resultado = valor * 2.54;
        }
        else
        {
            if(unidad.equals("pulgadas"))
            {
                resultado = valor / 2.54;
            }
        }
        return resultado;
    }

    public static String NotaEnTexto(double nota)
    {
        String calificacion = "";
        if(nota >= 0 && nota < 5)
        {
            calificacion = "Suspenso";
        }
        else
        {
            if(nota > 5 && nota < 6)
            {
                calificacion = "Suficiente";
            }
            else
            {
                if(nota >= 6 && nota <= 7)
                {
                    calificacion = "Bien";
                }
                else
                {
                    if(nota > 7 && nota < 9)
                    {
                        calificacion = "Notable";
                    }
                    else
                    {
                        if(nota >= 9 && nota <= 10)
                        {
                            calificacion = "Sobresaliente";
                        }
                    }
                }
            }
        }
        return calificacion;
    }

    public static void LeeNatural(int n)
    {
        Scanner leenatural = new Scanner(System.in);
        while(n <= 0)
        {
            System.out.print("Escribe un número: ");
            n = leenatural.nextInt();
        }
    }

    public static void LeeNumero(int a, int b)
    {
        int n = 0;
        Scanner leenumero = new Scanner(System.in);
        while(n < a || n > b)
        {
            System.out.print("Escribe un número: ");
            n = leenumero.nextInt();
        }
    }

    public static int Elevado(int a, int b)
    {
        int i;
        int elevado = 1;

        for(i = 0; i < b; i++)
        {
            elevado = elevado * a;
        }
        return elevado;
    }

    public static int Factorial(int n)
    {
        int factorial = 1;
        int i;
        for(i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void ResolucionCamara(double megapixel)
    {
        double largo, ancho;

        //Primero despejamos la y
        ancho = Math.sqrt((megapixel * 1000000 * 9) / 16);
        largo = (ancho * 16) / 9;

        System.out.println("Ancho = " + ancho + " píxeles");
        System.out.println("Largo = " + largo + " píxeles");
    }

    public static int DiasMes(int mes)
    {
        int dias = 0;

        switch (mes)
        {
            case 1: dias = 31; break;
            case 2: dias = 28; break;
            case 3: dias = 31; break;
            case 4: dias = 30; break;
            case 5: dias = 31; break;
            case 6: dias = 30; break;
            case 7: dias = 31; break;
            case 8: dias = 31; break;
            case 9: dias = 30; break;
            case 10: dias = 31; break;
            case 11: dias = 30; break;
            case 12: dias = 31; break;
            default:break;
        }
        return dias;
    }

    public static int DiasMes2(int mes, int anio)
    {
        int dias;

        if(Bisiesto(anio) && mes == 2)
        {
            dias = 29;
        }
        else
        {
            dias = DiasMes(mes);
        }
        return dias;
    }

    public static int DiasTranscurridos(int dias, int mes, int anio)
    {
        int totalDias;
        int diasEnteros = 0;
        int i;

        for(i = 1; i < mes; i++)
        {
            diasEnteros = diasEnteros + DiasMes2(i, anio);
        }
        totalDias = diasEnteros + dias;
        return totalDias;
    }

    public static int DiasTranscurridos1980(int dias, int mes, int anio)
    {
        int sumaAnios = 0;
        int i;
        for(i = 1980; i < anio; i++)
        {
            if(Bisiesto(anio))
            {
                sumaAnios = sumaAnios + 366;
            }
            else
            {
                sumaAnios = sumaAnios + 365;
            }
        }
        sumaAnios = sumaAnios + DiasTranscurridos(dias, mes, anio);
        return sumaAnios;
    }

    public static int DiasEntreFechas(int dias, int mes, int anio, int dias2, int mes2, int anio2)
    {
        int totalDias = DiasTranscurridos1980(dias2, mes2, anio2) - DiasTranscurridos1980(dias, mes, anio);
        return totalDias;
    }

    public static int DiaSemanaFecha(int dia, int mes, int anio)
    {
        int totalDias;
        totalDias = DiasTranscurridos1980(dia, mes, anio) % 7;

        int diasSemana;
        switch (totalDias)
        {
            case 1: diasSemana = 2; break;
            case 2: diasSemana = 3; break;
            case 3: diasSemana = 4; break;
            case 4: diasSemana = 5; break;
            case 5: diasSemana = 6; break;
            case 6: diasSemana = 7; break;
            case 7: diasSemana = 1; break;
            default: diasSemana = 0; break;
        }
        return diasSemana;
    }

    public static int HorasASegundos(int hora, int minuto, int segundo)
    {
        int totalSegundos;

        hora = (hora * 60) * 60;
        minuto = minuto * 60;

        totalSegundos = hora + minuto + segundo;
        return totalSegundos;
    }

    public static void EscribeHoraBonita(int hora, int minuto, int segundo)
    {
        if(hora < 10)
        {
            System.out.print("0"+hora+":");
        }
        else
        {
            System.out.print(hora+":");
        }
        if(minuto < 10)
        {
            System.out.print("0"+minuto+":");
        }
        else
        {
            System.out.print(minuto+":");
        }
        if(segundo < 10)
        {
            System.out.print("0"+segundo);
        }
        else
        {
            System.out.print(segundo);
        }
    }

    public static void EscribeSegundosBonito(int segundos)
    {
        int hora, minuto, segun;

        hora = segundos / 3600;
        minuto = (segundos % 3600)/ 60;
        segun = (segundos % 3600) % 60;

        EscribeHoraBonita(hora, minuto, segun);
    }

    public static int SegundosTranscurridos(int hora, int minuto, int segundo,
                                            int hora2, int minuto2, int segundo2)
    {
        int resto = HorasASegundos(hora2, minuto2, segundo2) - HorasASegundos(hora, minuto, segundo);
        return resto;
    }

    public static int SegundosTranscurridos1980(int dia, int mes, int anio,
                                                int hora, int minuto, int segundo)
    {
        int dias;
        int totalHoras;
        int totalSegundos;

        dias = DiasTranscurridos1980(dia, mes, anio);
        totalHoras = dias * 24 + hora;
        totalSegundos = HorasASegundos(totalHoras, minuto, segundo);

        return totalSegundos;
    }

    public static boolean PrimosRelativos(int a, int b)
    {
        boolean relativos = true;
        int divisor = 0;
        int min = a;
        int i;

        if (a < b)
        {
            min = a;
        } else
        {
            min = b;
        }

        for (i = 1; i <= min; i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                divisor = divisor + 1;
            }
        }
        if (divisor > 1)
        {
            relativos = false;
        }

        return relativos;
    }

    public static double CentigradosAFahrenheit(double centigrados)
    {
        //Temp.(F)=1,8*Temp.(C°)+32

        double fahrenheit;

        fahrenheit = 1.8 * centigrados + 32;

        return fahrenheit;
    }

    public static double FahrenheitACentigrados(double f)
    {
        //Temp.(C)=(Temp.(F)-32)/1,8

        double centigrados;

        centigrados = (f - 32) / 1.8;

        return centigrados;
    }

    public static double Calderilla(double cantidad)
    {
        long cantentero = Math.round(cantidad * 100);
        double cambio = 5 - cantidad;

        if (cambio >= 4)
        {
            cambio = cambio - 4;
            System.out.println("2 menedas de 2 euros");
        } else
        {
            if (cambio >= 2)
            {
                cambio = cambio - 2;
                System.out.println("1 moneda de 2 euros");
            } else
            {
                if (cambio >= 1)
                {
                    cambio = cambio - 1;
                    System.out.println("1 monedad de 1 euro");
                } else
                {
                    if (cambio >= 0.50)
                    {
                        cambio = cambio - 0.50;
                        System.out.println("1 moneda de 50 céntimos");
                    } else
                    {
                        if (cambio >= 0.20)
                        {
                            cambio = cambio - 0.20;
                            System.out.println("1 moneda de 20 céntimos");
                        } else
                        {
                            if (cambio >= 0.10)
                            {
                                cambio = cambio - 0.10;
                                System.out.println("1 moneda de 10 céntimos");
                            } else
                            {
                                if (cambio >= 0.5)
                                {
                                    cambio = cambio - 0.5;
                                    System.out.println("1 moneda de 5 céntimos");
                                } else
                                {
                                    if (cambio >= 0.2)
                                    {
                                        cambio = cambio - 0.2;
                                        System.out.println("1 moneda de 2 céntimos");
                                    } else
                                    {
                                        if (cambio >= 0.1)
                                        {
                                            cambio = cambio - 0.1;
                                            System.out.println("1 moneda de 1 céntimo");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return cambio;
    }

    public static int Potencia2(int n)
    {
        int potencia = 1;
        int i;

        if (n >= 0)
        {
            for (i = 0; i < n; i++)
            {
                potencia = potencia * 2;
            }
        } else
        {
            potencia = -1;
        }

        return potencia;
    }

    public static void TrianguloEstrellitas(int n)
    {
        int linea, i;

        if (n >= 3 && n <= 20)
        {
            i = 0;
            for (linea = 0; linea < n; linea++)
            {
                for (i = 0; i <= linea; i++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        } else
        {
            System.out.println("ERROR");
        }
    }

    public static void Rombo(int n)
    {
        char espacio = ' ';
        char asterisco = '*';

        for (int i = 1; i <= 4; i++)
        {
            for (int espacios = 5 - i; espacios > 0; espacios--)
            {
                System.out.print(espacio);
            }
            for (int lineas = 0; lineas < 2 * i; lineas++)
            {
                System.out.print(asterisco);
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--)
        {
            for (int espacios = 5 - i; espacios > 0; espacios--)
            {
                System.out.print(espacio);
            }
            for (int lineas = 0; lineas < 2 * i; lineas++)
            {
                System.out.print(asterisco);
            }
            System.out.println();
        }
    }



    public static void CalendarioGrafico(int mes, int anio)
    {
        //Calculamos el día de la semana correspondiente al 1 de ese mes
        int diaSemana = DiaSemanaFecha(1, mes, anio);  //1 - lunes  7- domingo
        int diasMes = DiasMes2(mes, anio);  //Lo calculamos con DiasMes2
        int i;

        System.out.println(" L  M  X  J  V  S  D");
        System.out.println();

        //Dejamos espacios para la primera línea
        for(i = 1; i < diaSemana; i++)
        {
            System.out.print("   ");
        }

        for(i = 1; i <= diasMes; i++)
        {
            if(i < 10)
            {
                System.out.print(" ");
            }
            System.out.print(i + " ");

            diaSemana++;

            if(diaSemana == 8)
            {
                diaSemana = 1;
                System.out.println();
            }
        }
    }

    public static void CuadradoDeEstrellitas(int lado)
    {
        int fila;
        int columna;

        if(lado < 1 || lado > 20)
        {
            System.out.println("ERROR");
        }
        else
        {
            for(fila = 1; fila <= lado; fila++)
            {
                for(columna = 1; columna <= lado; columna++)
                {
                    if(fila == 1 || fila == lado || columna == 1 || columna == lado)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void BisiestosXXI()
    {
        int i;
        for(i = 2001; i <= 2101; i++)
        {
            if(Bisiesto(i))
            {
                System.out.println(i);
            }
        }
    }

    public static void EscribeSerieNumeros3(int n1, int n2, int n3)
    {
        int i;

        //Pedimos nº's bajo condiciones
        while(n1 < 1 || n1 > 100)
        {
            System.out.print("Escribe primer número: ");
        }
        while((n2 < n1) || (n2 < 1 || n2 > 100))
        {
            System.out.print("Escribe segundo número: ");
        }
        while(!(n3 > n1 && n3 < n2) || (n3 < 1 || n3 > 100))
        {
            System.out.print("Escribe tercer número: ");
        }

        for(i = n1; i <= n3; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = n3; i <= n2; i++)
        {
            System.out.print(i + " ");
        }

    }

    public static int Maximo(int a, int b, int c)
    {
        int maximo = a;

        if(a > b && a > c)
        {
            maximo = a;
        }
        else
        {
            if(b > a && b > c)
            {
                maximo = b;
            }
            else
            {
                maximo = c;
            }
        }
        return maximo;
    }

    public static int Minimo(int a, int b, int c)
    {
        int minimo = a;

        if(a < b && a < c)
        {
            minimo = a;
        }
        else
        {
            if(b < a && b < c)
            {
                minimo = b;
            }
            else
            {
                minimo = c;
            }
        }
        return minimo;
    }

    public static int Medio(int a, int b, int c)
    {
        int medio = a;

        if(a < b && b < c)
        {
            medio = b;
        }
        else
        {
            if(a < c && c < b)
            {
                medio = c;
            }
            else
            {
                if(b < a && a < c)
                {
                    medio = a;
                }
                else
                {
                    if(b < c && c < a)
                    {
                        medio = c;
                    }
                    else
                    {
                        if(c < a && a < b)
                        {
                            medio = a;
                        }
                        else
                        {
                            if(c < b && b < a)
                            {
                                medio = b;
                            }
                        }
                    }
                }
            }
        }
        return medio;
    }

    public static void Romboide(int altura, int longitud)
    {
        int espacios;
        int asteriscos;
        int j,l;

        espacios = altura - 1;
        for(j = altura; j > 0; j--)
        {
            asteriscos = longitud;

            for(l = 0; l < espacios; l++)
            {
                System.out.print(" ");
            }
            for(l = 0; l < asteriscos; l++)
            {
                System.out.print("*");
            }
            espacios--;

            System.out.println();
        }
    }

    public static double CalculaNotaFinal(double nota)
    {
        Scanner calculaNota = new Scanner(System.in);

        double calificacion, media, suma;
        suma = 0;
        int suspenso = 0;
        int i;

        for(i = 0; i < 7; i++)
        {
            System.out.print("Escribe nota: ");
            nota = calculaNota.nextDouble();
            while(nota < 0 || nota > 10)
            {
                System.out.print("Escribe nota: ");
                nota = calculaNota.nextDouble();
            }

            suma = suma + nota;

            if(nota < 5)
            {
                suspenso = suspenso + 1;
            }
        }

        if(suspenso >= 2)
        {
            media = 4;
        }
        else
        {
            media = suma / 7;
        }


        return media;

    }

    public static String MesEnTexto(int n)
    {
        String mes = "";

        switch (n)
        {
            case 1: mes = "Enero"; break;
            case 2: mes = "Febreo"; break;
            case 3: mes = "Marzo"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Mayo"; break;
            case 6: mes = "Junio"; break;
            case 7: mes = "Julio"; break;
            case 8: mes = "Agosto"; break;
            case 9: mes = "Septiembre"; break;
            case 10: mes = "Octubre"; break;
            case 11: mes = "Noviembre"; break;
            case 12: mes = "Diciembre"; break;
            default:break;
        }
        return mes;
    }

    public static void EscribeFechaBonita(int dia, int mes, int anio)
    {
        if(dia > 31 || mes > 12)
        {
            System.out.println("Fecha no válida");
        }
        else
        {
            System.out.println(dia + " de " + MesEnTexto(mes) + " de " + anio);
        }
    }

    public static boolean CuadradoPerfecto(int n)
    {
        boolean perfecto = false;
        int i;

        for(i = 0; i <= n; i++)
        {
            if(i * i == n)
            {
                perfecto = true;
            }
        }
        return perfecto;
    }

    public static void ListaCuadradosPerfectos(int min, int max)
    {
        for(int i = min; i <= max; i++)
        {
            if(CuadradoPerfecto(i))
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void DescomponerFactoresPrimos(int n)
    {
        int factor = 2;

        do
        {
            if(n %factor == 0)
            {
                System.out.print(factor + "x");
                n = n / factor;
            }
            else
            {
                factor++;
            }

        }while(factor <= n);

        System.out.print("\b");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("MENÚ FUNCIONES JAVA");
        System.out.println("===================");
        System.out.println("[1] Par");
        System.out.println("[2] Bisiesto");
        System.out.println("[3] TablaMultiplicar");
        System.out.println("[4] ImprimeSerie");
        System.out.println("[5] Signo");
        System.out.println("[6] Max");
        System.out.println("[7] Min");
        System.out.println("[8] MCD");
        System.out.println("[9] MCM");
        System.out.println("[10] Primo");
        System.out.println("[11] AreaTriangulo");
        System.out.println("[12] ConversorPulgadasCentimetros");
        System.out.println("[13] NotaEnTexto");
        System.out.println("[14] LeeNatural");
        System.out.println("[15] LeeNumero");
        System.out.println("[16] Elevado");
        System.out.println("[17] Factorial");
        System.out.println("[18] ResolucionCamara");
        System.out.println("[19] DiasMes");
        System.out.println("[20] DiasMes2");
        System.out.println("[21] DiasTranscurridos");
        System.out.println("[22] DiasTranscurridos1980");
        System.out.println("[23] DiasEntreFechas");
        System.out.println("[24] DiaSemanaFecha");
        System.out.println("[25] HorasASegundo");
        System.out.println("[26] EscribeHoraBonita");
        System.out.println("[27] EscribeSegundosBonito");
        System.out.println("[28] SegundosTranscurridos");
        System.out.println("[29] SegundosTranscurridos1980");
        System.out.println("[30] PrimosRelativos");
        System.out.println("[31] CentigradosAFahrenheit");
        System.out.println("[32] FahrenheitACentigrados");
        System.out.println("[33] Calderilla");
        System.out.println("[34] Potencia2");
        System.out.println("[35] TrianguloEstrellitas");
        System.out.println("[36] Rombo");
        System.out.println("[37] CalendarioGrafico");
        System.out.println("[38] CuadradoDeEstrellitas");
        System.out.println("[39] BisiestosXXI");
        System.out.println("[40] EscribeSerieNumeros3");
        System.out.println("[41] Tres funciones (Maximo, Medio, Minimo)");
        System.out.println("[42] Romboide");
        System.out.println("[43] CalculaNotaFinal");
        System.out.println("[44] Dos FUNCIONES (MesEnTexto y EscribeFechaBonita");
        System.out.println("[45] Dos FUNCIONES (CuadradoPerfecto y ListaCuadradosPerfectos");
        System.out.println("[46] DescomponerFactoresPrimos");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe una función que te diga si un número es par o no. La función se llamará “par” y
                //nos devolverá un valor booleano que será “verdadero” si el número es par y “falso” si
                //es impar.

                boolean espar;
                int n;
                System.out.println("Escribe un número para ver si es par: ");
                n = sc.nextInt();

                espar = Par(n);
                System.out.println(n + " = " + espar);
            }
            break;

            case 2:
            {
                // Escribe una función que nos diga si un año es bisiesto o no. La función se llamará
                //“bisiesto” y nos devolverá “verdadero” si es bisiesto y “falso” si no lo es.

                boolean bisiesto;
                int anio;
                System.out.print("Escribe año: ");
                anio = sc.nextInt();

                bisiesto = Bisiesto(anio);
                System.out.println("Año " + anio + " = " + bisiesto);
            }
            break;

            case 3:
            {
                //Escribe una función “tablaMultiplicar” a la que le pases un entero y nos escriba la tabla
                //de multiplicar de ese número.

                int n;
                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                TablaMultiplicar(n);
            }
            break;

            case 4:
            {
                //Escribe una función “imprimeSerie” a la que le pases dos enteros y te escriba por la
                //pantalla todos los valores comprendidos entre ambos. Lo hará en orden ascendente si
                //el primero es menor que el segundo y descendente en caso contrario. Usa “for”.

                int a, b;
                System.out.print("Escribe primer número: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo número: ");
                b = sc.nextInt();

                ImprimeSerie(a,b);
            }
            break;

            case 5:
            {
                //Escribe una función “signo” a la que le pasemos un número y nos devuelva “1” si es
                //positivo, “0” si es cero y “-1” si es negativo.

                int n, signo;

                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                signo = Signo(n);
                System.out.println(n + " = " + signo);
            }
            break;

            case 6:
            {
                //Escribe una función “max” que nos devuelva el mayor de los dos números que le
                //pasemos por parámetro.

                int a, b, max;
                System.out.print("Escribe primer número: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo número: ");
                b = sc.nextInt();

                max = Max(a,b);
                System.out.println("MAYOR = " + max);

            }
            break;

            case 7:
            {
                //Escribe una función “min” que nos devuelva el menor de los dos números que le
                //pasemos por parámetro.

                int a, b, min;
                System.out.print("Escribe primer número: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo número: ");
                b = sc.nextInt();

                min = Min(a,b);
                System.out.println("MENOR = " + min);
            }
            break;

            case 8:
            {
                // Escribe una función que nos calcule el “mcd” de dos números.

                int a, b, mcd;
                System.out.print("Escribe primer número: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo número: ");
                b = sc.nextInt();

                mcd = MCD(a,b);
                System.out.println("MCD = " + mcd);
            }
            break;

            case 9:
            {
                //Escribe una función que nos calcule el “mcm” de dos números.

                int a, b, mcm;

                System.out.print("Escribe primer número: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo número: ");
                b = sc.nextInt();

                mcm = MCM(a,b);
                System.out.println("MCM = " + mcm);
            }
            break;

            case 10:
            {
                //Escribe una función “primo” que nos devuelva “verdadero” si el número que le
                //pasamos por parámetro es primo y “falso” en caso contrario.

                int n;
                boolean esprimo;

                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                esprimo = Primo(n);
                System.out.println(n + " = " + esprimo);
            }
            break;

            case 11:
            {
                // Escribe una función “areaTriangulo” que te calcule el área de un triángulo. Habrá que
                //pasarle como parámetros la base y la altura.

                int base, altura, area;

                System.out.print("Escribe base: ");
                base = sc.nextInt();
                System.out.print("Escribe altura: ");
                altura = sc.nextInt();

                area = AreaTriangulo(base, altura);
                System.out.println("Área del triángulo = " + area);
            }
            break;

            case 12:
            {
                //Escribe una función “pulgadasACentimetros” a la que le pases un valor en pulgadas (de
                //tipo double) y te devuelva el valor en centímetros. Haz también la función
                //“centímetrosAPulgadas”.

                double resultado, valor;
                String unidad;

                System.out.println("¿Quieres convertir centímetros o pulgadas?");
                unidad = sc.next();
                System.out.print("Escribe cantidad de " + unidad + ": ");
                valor = sc.nextDouble();

                resultado = ConversorPulgadasCentimetros(valor, unidad);
                System.out.println("Conversión = " + resultado);
            }
            break;

            case 13:
            {
                //Escribe una función “notaEnTexto” a la que le pasamos la nota de un alumno como un
                //double y nos devolverá la calificación en formato texto (“aprobado”, “suficiente”, etc.).

                String calificacion;
                double nota;
                System.out.println("Escribe nota: ");
                nota = sc.nextDouble();

                calificacion = NotaEnTexto(nota);
                System.out.println(nota + " = " + calificacion);
            }
            break;

            case 14:
            {
                //Escribe una función “leeNatural” que nos lea un número natural desde el teclado. La
                //función nos pondrá un texto en el que se nos indica que introduzcamos un número y
                //después nos leerá el número del teclado. Si el número introducido es 0 o negativo, nos
                //volverá a pedir otro número.

                int n;
                System.out.print("Escribe un número: ");
                n = sc.nextInt();
                LeeNatural(n);
            }
            break;

            case 15:
            {
                //Escribe una función “leeNúmero” a la que le pasas dos parámetros (a y b) y nos lee del
                //teclado un número comprendido entre a y b (ambos incluidos). Si el número no es
                //correcto, te vuelve a pedir que lo introduzcas.

                int n;
                int a = 10;
                int b = 20;
                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                LeeNumero(a,b);

            }
            break;

            case 16:
            {
                //Escribe una función “elevado” a la que le pasas dos números enteros (a y b) y te
                //devuelve el valor de “a” elevado a “b” (sin usar la función Math.pow) (o sea,
                //multiplicando un número muchas veces).

                int a = 2;
                int b = 5;
                int elevado = Elevado(a,b);

                System.out.println("Número = " + a);
                System.out.println("Exponente = " + b);
                System.out.println("Resultado = " + elevado);
            }
            break;

            case 17:
            {
                //Escribe una función “factorial” que nos calcule el factorial de un número entero.

                int n;
                int factorial;

                System.out.println("Escribe un número para calcular su factorial: ");
                n = sc.nextInt();

                factorial = Factorial(n);
                System.out.println("Factorial de " + n + " = " + factorial);

            }
            break;

            case 18:
            {
                //Escribe una función “resolucionCamara” a la que le pasas el número de MegaPixels
                //que tiene una cámara digital (puede ser un double) y nos dice cuál es la resolución
                //máxima de las fotos que hace la cámara. Como no podemos devolver dos valores (la
                //altura y la anchura de la imagen), los escribiremos por pantalla.

                double megapixeles;
                System.out.print("Megapíxeles de tu cámara: ");
                megapixeles = sc.nextDouble();

                ResolucionCamara(megapixeles);

            }
            break;

            case 19:
            {
                //Escribe  una  función  “diasMes”,  a  la  que  le  pasamos  un  mes  (en  formato  numérico
                //1=Enero, 2=Febrero, etc.) y nos dice el número de días que tiene ese mes.

                int mes, dias;
                System.out.print("Escribe mes en formato numérico: ");
                mes = sc.nextInt();

                dias = DiasMes(mes);
                System.out.println("El mes " + mes + " tiene " + dias + " dias.");
            }
            break;

            case 20:
            {
                // Debido a que en los años bisiestos el mes de Febrero tiene 29 días en lugar de 28,
                //necesitaremos  también  dar  el  año  para  conseguir  el  resultado  correcto.  Escribe  la
                //función  “diasMes2”  a  la  que  le  pasas  un  mes  y  un  año  (ambos  enteros)  y  te  dice
                //cuántos  días  tiene  ese  mes,  teniendo  en  cuenta  si  el  año  es  bisiesto  o  no  (NOTA:
                //Podéis usar la función “Bisiesto” que hicimos con anterioridad).

                int anio, mes, dias;
                System.out.print("Escribe mes: ");
                mes = sc.nextInt();
                System.out.println("Escribe anio: ");
                anio = sc.nextInt();

                dias = DiasMes2(mes, anio);
                System.out.println(dias);
            }
            break;

            case 21:
            {
                // Escribe una función “diasTranscurridos” a la que le pasamos tres enteros, el día, el mes
                //y el año, y nos dice cuántos días han pasado desde el inicio del año hasta ese día. Así,
                //el 1 de enero será el día 1 y el 31 de diciembre será el 365 ó 366 dependiendo de si el
                //año es bisiesto o no.

                int dias, mes, anio, totalDias;
                System.out.print("Escribe dias: ");
                dias = sc.nextInt();
                System.out.print("Escribe mes: ");
                mes = sc.nextInt();
                System.out.print("Escribe año: ");
                anio = sc.nextInt();

                totalDias = DiasTranscurridos(dias, mes, anio);
                System.out.println("Los días transcurridos desde primero de año a la fecha de hoy son = " + totalDias);
            }
            break;

            case 22:
            {
                // Escribe una función “diasTranscurridos1980” a la que le pasamos un día, mes y año y
                //nos diga cuántos días han transcurrido desde el 01/01/1980 hasta ese día.

                int dias, mes, anio, totalDias;
                System.out.print("Escribe dias: ");
                dias = sc.nextInt();
                System.out.print("Escribe mes: ");
                mes = sc.nextInt();
                System.out.print("Escribe año: ");
                anio = sc.nextInt();

                totalDias = DiasTranscurridos1980(dias, mes, anio);
                System.out.println("TOTAL DIAS = " + totalDias);
            }
            break;

            case 23:
            {
                //Escribe una función “diasEntreFechas” a la que le pasamos 6 enteros. Un día, mes y
                //año y otro día, mes y año, y nos dice cuántos días han pasado entre ambas fechas.

                int dia, mes, anio, dia2, mes2, anio2, totalDias;
                System.out.print("Escribe dia de primera fecha: ");
                dia = sc.nextInt();
                System.out.print("Escribe mes de primera fecha: ");
                mes = sc.nextInt();
                System.out.print("Escribe año de primera fecha: ");
                anio = sc.nextInt();

                System.out.print("Escribe dia de segunda fecha: ");
                dia2 = sc.nextInt();
                System.out.print("Escribe mes de segunda fecha: ");
                mes2 = sc.nextInt();
                System.out.print("Escribe año de segunda fecha: ");
                anio2 = sc.nextInt();

                totalDias = DiasEntreFechas(dia, mes, anio, dia2, mes2, anio2);
                System.out.println("TOTAL DIAS = " + totalDias);

            }
            break;

            case 24:
            {
                //Teniendo en cuenta que el 01/01/1980 era martes, haz una función “diaSemanaFecha”
                //que nos devuelva qué día de la semana corresponde a la fecha (día, mes y año) que le
                //pasamos en 3  parámetros.  Nos  devolverá  un  entero  que corresponderá  al  día  de  la
                //semana (1=lunes, 2=martes, etc.).

                int dia, mes, anio, diaSemana;

                System.out.print("Dia: ");
                dia = sc.nextInt();
                System.out.print("Mes: ");
                mes = sc.nextInt();
                System.out.print("Año: ");
                anio = sc.nextInt();

                diaSemana = DiaSemanaFecha(dia, mes, anio);
                System.out.println("Día de la semana = " + diaSemana);
            }
            break;

            case 25:
            {
                //Escribe una función “horaASegundos” a la que le pasas 3 parámetros enteros (hora,
                //minutos y segundos) y te devuelve el total de segundos.

                int hora, minuto, segundo, totalSegundos;
                System.out.print("Escribe hora: ");
                hora = sc.nextInt();
                System.out.print("Escribe minuto: ");
                minuto = sc.nextInt();
                System.out.print("Escribe segundo: ");
                segundo = sc.nextInt();

                totalSegundos = HorasASegundos(hora, minuto, segundo);
                System.out.println("Total segundos = " + totalSegundos);
            }
            break;

            case 26:
            {
                // Escribe una función “escribeHoraBonita” a la que le pasas tres parámetros (hora,
                //minutos y segundos) y te escribe por pantalla la hora en formato “HH:MM:SS”.

                int hora, minuto, segundo;
                System.out.print("Hora: ");
                hora = sc.nextInt();
                System.out.print("Minuto: ");
                minuto = sc.nextInt();
                System.out.print("Segundo: ");
                segundo = sc.nextInt();

                EscribeHoraBonita(hora, minuto, segundo);
            }
            break;

            case 27:
            {
                // Escribe una función “escribeSegundosBonito” a la que le pasas un parámetro que
                //corresponde al número de segundos y te escribe por pantalla la hora en formato
                //“HH:MM:SS”.

                int segundos = 3661;
                EscribeSegundosBonito(segundos);
            }
            break;

            case 28:
            {
                // Escribe una función “segundosTranscurridos” a la que le pasas 2 horas (en total, 6
                //parámetros: hora, minutos y segundos para cada una de las dos horas) y te dice
                //cuántos segundos han transcurrido entre una y otra.

                int h,m,s,h2,m2,s2;
                int resultado;
                System.out.print("Hora: ");
                h = sc.nextInt();
                System.out.print("Minuto: ");
                m = sc.nextInt();
                System.out.print("Segundo: ");
                s = sc.nextInt();

                System.out.print("Hora: ");
                h2 = sc.nextInt();
                System.out.print("Minuto: ");
                m2 = sc.nextInt();
                System.out.print("Segundo:");
                s2 = sc.nextInt();

                resultado = SegundosTranscurridos(h,m,s,h2,m2,s2);
                System.out.println("Segundos transcurridos entre las horas indicadas = " + resultado + " segundos");

            }
            break;

            case 29:
            {
                //Escribe una función “segundosTranscurridos1980” a la que le pasas 6 parámetros: día,
                //mes, año, hora, minutos y segundos y te dice cuántos segundos han transcurrido
                //desde el 1 de enero de 1980.

                int dia, mes, anio, hora, minutos, segundos;
                int total;

                System.out.print("Escribe día: ");
                dia = sc.nextInt();
                System.out.print("Escribe mes: ");
                mes = sc.nextInt();
                System.out.print("Escribe anio: ");
                anio = sc.nextInt();
                System.out.print("Escribe hora: ");
                hora = sc.nextInt();
                System.out.print("Escribe minutos: ");
                minutos = sc.nextInt();
                System.out.print("Escribe segundos: ");
                segundos = sc.nextInt();

                total = SegundosTranscurridos1980(dia, mes, anio, hora, minutos, segundos);
                System.out.println("Total segundos = " + total);

            }
            break;

            case 30:
            {
                // Escribe una función primosRelativos a la que le pasas dos números enteros y te dice si
                //son primos relativos, es decir, si "NO" tienen ningún divisor común además del 1.

                boolean respuesta;
                int a, b;

                a = 3;
                b = 6;

                respuesta = PrimosRelativos(a, b);
                System.out.println(respuesta);
            }
            break;

            case 31:
            {
                //Escribe una función centigradosAFahrenheit que nos convierta una temperatura que
                //está en grados centígrados a grados Fahrenheit. La función tendrá un parámetro, que
                //será un número real, y devolverá otro número real. La fórmula es:
                //Temp.(F)=1,8*Temp.(C°)+32.

                DecimalFormat df = new DecimalFormat("#.00");

                double f;
                double centigrados;
                System.out.println("Escribe los grados centígrados: ");
                centigrados = sc.nextDouble();

                f = CentigradosAFahrenheit(centigrados);
                System.out.println(centigrados + "Cº" + " = " + df.format(f) + "F");
            }
            break;

            case 32:
            {
                //Escribe una función fahrenheitACentigrados que nos convierta una temperatura que
                //está en grados Fahrenheit a grados centígrados. La función tendrá un parámetro, que
                //será un número real, y devolverá otro número real. La fórmula es:
                //Temp.(C)=(Temp.(F)-32)/1,8.

                DecimalFormat df = new DecimalFormat("#.00");

                double c;
                double f;
                System.out.println("Escribe los grados fahrenheit");
                f = sc.nextDouble();

                c = FahrenheitACentigrados(f);
                System.out.println(f + "F" + " = " + df.format(c) + "Cº");
            }
            break;

            case 33:
            {
                //Escribe la función calderilla a la que le pasamos una cantidad de dinero (menor de 5€,
                //puede tener decimales) y nos muestra por pantalla qué monedas debemos usar para
                //dar el cambio (con el menor número posible de monedas). En esta función sí que
                //podéis poner println dentro.

                double cantidad;
                double cambio;

                System.out.print("Escribe cantidad de moneda euro: ");
                cantidad = sc.nextDouble();

                cambio = Calderilla(cantidad);
                System.out.println(cambio);
            }
            break;

            case 34:
            {
                // Escribe una función potencia2 que te devuelva la potencia de 2 del número que le pasas
                //por  parámetro  (ambos  enteros).  El  valor  del  parámetro  tendrá  que  ser  0  (un  caso
                //especial) o un número positivo. Si se le manda un número negativo, la función devolverá
                //-1. No se podrá utilizar la función Math.pow() (evidentemente).

                int potencia;
                int n;
                System.out.print("Escribe exponente: ");
                n = sc.nextInt();

                potencia = Potencia2(n);
                System.out.println(potencia);
            }
            break;

            case 35:
            {
                // Escribe la función trianguloEstrellitas. La función te pedirá un número que deberá ser
                //como mínimo el número 3 y como máximo el 20. Si el número no es correcto, escribirá
                //“ERROR”. La función escribirá por pantalla una pirámide a base de estrellitas como la
                //del ejemplo. La función deberá funcionar para cualquier número entre 3 y 20 (o sea,
                //nada de escribir las estrellitas a mano).

                int n;
                System.out.println("Escribe tamaño para el triángulo");
                n = sc.nextInt();

                TrianguloEstrellitas(n);
            }
            break;

            case 36:
            {
                //Escribe la función rombo que te escribe un rombo en pantalla a base de asteriscos (la
                //pirámide del ejercicio 6 sería la cuarta parte del rombo).
                //Opcional: Hacerlo con el número de bucles más pequeño posible (se puede hacer sin
                //bucles incluso).

                int n = 5;

                Rombo(n);
            }
            break;

            case 37:
            {
                //Escribe la función calendarioGrafico a la que le pasas dos parámetros: el mes y el año.
                //La función nos escribirá por pantalla un calendario del mes indicado.
                int mes, anio;
                System.out.println("Escribe mes: ");
                mes = sc.nextInt();
                System.out.println("Escribe año: ");
                anio = sc.nextInt();

                CalendarioGrafico(mes, anio);
            }
            break;

            case 38:
            {
                //Escribe la función cuadradoEstrellitas que te pinta un cuadrado realizado con
                //estrellitas. El tamaño máximo será 20. Si escribes más de 20 o menos de 1, dará
                //un mensaje de error en lugar de pintar el cuadrado.

                int lado;
                System.out.println("Escribe tamaño del lado del cuadrado: ");
                lado = sc.nextInt();

                CuadradoDeEstrellitas(lado);
            }
            break;

            case 39:
            {
                //Escribe una función bisiestosXXI que nos escriba por pantalla todos los años bisiestos
                //del siglo XXI.

                BisiestosXXI();
            }
            break;

            case 40:
            {
                //Escribe  una  función  escribeSerieNumeros3  que  nos  pide  tres  números.  El  primero
                //tendrá que ser un número entre 1 y 100; si el número no es correcto, lo vuelve a pedir.
                //El segundo tendrá que ser un número entre 1 y 100 pero con la condición de que sea
                //mayor que el primero; lo volverá a pedir mientras no sea correcto. El tercero tendrá que
                //ser un número entre 1 y 100 con la condición de que sea mayor que el primero y menor
                //que el segundo; también lo volverá a pedir hasta que sea correcto.
                //Una  vez  que  tengamos  los  tres  números,  nos  escribirá  por  pantalla  los  números
                //comprendidos entre el primero y el tercero y en otra línea los números comprendidos
                //entre el tercero y el segundo. Mejor con un ejemplo:
                //Los tres números son 5, 12 y 7. Nos tendrá que escribir:
                //5 6 7
                //7 8 9 10 11 12

                int n1, n2, n3;
                System.out.print("Escribe un número: ");
                n1 = sc.nextInt();
                System.out.print("Escribe un número: ");
                n2 = sc.nextInt();
                System.out.print("Escribe un número: ");
                n3 = sc.nextInt();

                EscribeSerieNumeros3(n1,n2,n3);
            }
            break;

            case 41:
            {
                //Escribe tres funciones que se llamarán maximo, medio y minimo. A cada una de las
                //funciones le pasaremos tres valores enteros (a, b, c). La función maximo nos devolverá
                //el mayor de los tres, la función minimo el menor de los tres y la función medio el del
                //medio.
                //Ej.: maximo(7, 1, 4) nos devolverá 7.

                System.out.println("=========================");
                System.out.println("MÁXIMO || MEDIO || MÍNIMO");
                System.out.println("=========================");
                System.out.println("[1] Máximo");
                System.out.println("[2] Medio");
                System.out.println("[3] Mínimo");
                System.out.println();
                System.out.print("Elige una opción: ");
                int op = sc.nextInt();

                switch (op)
                {
                    case 1:
                    {
                        int a, b, c, maximo;
                        System.out.print("Escribe primer número: ");
                        a = sc.nextInt();
                        System.out.print("Escribe segundo número: ");
                        b = sc.nextInt();
                        System.out.print("Escribe tercer número: ");
                        c = sc.nextInt();

                        maximo = Maximo(a,b,c);
                        System.out.println("MÁXIMO = " + maximo);

                    }
                    break;

                    case 2:
                    {
                        int a, b, c, medio;
                        System.out.print("Escribe primer número: ");
                        a = sc.nextInt();
                        System.out.print("Escribe segundo número: ");
                        b = sc.nextInt();
                        System.out.print("Escribe tercer número: ");
                        c = sc.nextInt();

                        medio = Medio(a,b,c);
                        System.out.println("MEDIO = " + medio);
                    }
                    break;

                    case 3:
                    {
                        int a, b, c, minimo;
                        System.out.print("Escribe primer número: ");
                        a = sc.nextInt();
                        System.out.print("Escribe segundo número: ");
                        b = sc.nextInt();
                        System.out.print("Escribe tercer número: ");
                        c = sc.nextInt();

                        minimo = Minimo(a,b,c);
                        System.out.println("MÍNIMO = " + minimo);
                    }
                    break;
                }
            }
            break;

            case 42:
            {
                // Escribe la función romboide, que nos pintará un romboide con asteriscos. Habrá que
                //pasarle dos parámetros: la altura y la longitud. La longitud será el número de asteriscos
                //que hay en cada piso y la altura el número de pisos que tendrá.

                int altura =5;
                int longitud = 9;

                Romboide(altura, longitud);
            }
            break;

            case 43:
            {
                // Escribe  el  programa  calculaNotaFinal.  El  programa  nos  ira  pidiendo  7  doubles
                //correspondientes a las notas de los 7 exámenes que se hacen en una asignatura durante
                //el curso. La nota final que nos escribirá por pantalla será la media de los 7 doubles, con
                //una excepción: si hemos suspendido dos o más exámenes durante el curso, la nota final
                //no superará el 4 aunque la media salga más alta. Por ejemplo: si las notas son [10, 10,
                //10, 10, 10, 2, 3], la media saldría 7’86, pero devolveríamos un 4 porque ha suspendido
                //dos exámenes.
                //El programa tendrá que controlar que cada nota introducida esté entre 0 y 10. Si no lo
                //está, no la dará por válida y la volverá a pedir.

                DecimalFormat df = new DecimalFormat("#.00");

                double nota, resultado;
                System.out.print("Escribe nota: ");
                nota = sc.nextDouble();

                resultado = CalculaNotaFinal(nota);
                System.out.println("Nota final = " + df.format(resultado));
            }
            break;

            case 44:
            {
                // Escribe dos funciones:
                //•  Escribe la función mesEnTexto a la que le pasaremos un entero correspondiente a
                //un mes y nos devolverá un string con ese mes escrito en texto. Por ejemplo: si le
                //pasamos un 10 nos devolverá “octubre”.
                //•  Escribe  la  función  escribeFechaBonita.  La  función  recibirá  tres  enteros  por
                //parámetro: el día, el mes y el año y nos escribirá la fecha por pantalla en el formato
                //siguiente: “dia de mes de año” (ej.: 31/11/1980 = “31 de noviembre de 1980”). La
                //función no devuelve nada porque escribe el resultado por pantalla. En esta función
                //tendremos que usar la función anterior.
                //Si  la  fecha  que  introducimos  no  es  válida,  nos  escribirá  “Fecha  no  válida”  por
                //pantalla en lugar de la fecha.

                System.out.println("==============================================");
                System.out.println("Dos funciones (MesEnTexto y EscribeFechaBonita");
                System.out.println("==============================================");
                System.out.println("[1] MesEnTexto");
                System.out.println("[2] EscribeFechaBonita");
                System.out.println();
                int elige = sc.nextInt();

                switch (elige)
                {
                    case 1:
                    {
                        //Función MesEnTexto

                        int n;
                        String mes;

                        System.out.println("Escribe mes en formato numérico: ");
                        n = sc.nextInt();

                        mes = MesEnTexto(n);
                        System.out.println(n + " = " + mes);
                    }
                    break;

                    case 2:
                    {
                        //Función EscribeFechaBonita

                        int dia, mes, anio;

                        System.out.print("Dia: ");
                        dia = sc.nextInt();
                        System.out.print("Mes: ");
                        mes = sc.nextInt();
                        System.out.print("Año: ");
                        anio = sc.nextInt();

                        EscribeFechaBonita(dia,mes,anio);
                    }
                    break;
                }
            }
            break;

            case 45:
            {
                // Escribe dos funciones:
                //•  A  la  función  cuadradoPerfecto  le  pasaremos  un  entero  por  parámetro  y  nos
                //devolverá un boolean, que será true si el entero es un cuadrado perfecto y false si
                //no lo es.
                //Un número A es un cuadrado perfecto si existe otro número B que multiplicado por
                //sí mismo nos da A. O, dicho de otra forma, un número es un cuadrado perfecto si su
                //raíz cuadrada sale exacta. Ej.: 4, 9, 16, 25, etc.
                //•  A la función listaCuadradosPerfectos le pasaremos dos enteros min y max y nos
                //escribirá  por  pantalla  todos  los  cuadrados  perfectos  que  existen  entre  esos  dos
                //números. No devuelve nada porque escribe el resultado directamente por pantalla.
                //Esta función usará la función anterior para el cálculo.
                //Por ejemplo: listaCuadradosPerfectos(10, 20) nos escribirá el 9 y el 16.

                System.out.println("=========================================================");
                System.out.println("Dos funciones (CuadradoPerfecto y ListaCuadradosPerfectos");
                System.out.println("=========================================================");
                System.out.println("[1] CuadradoPerfecto");
                System.out.println("[2] ListaCuadradosPerfectos");
                System.out.println();
                System.out.print("Elige una opción: ");
                int cuadrados = sc.nextInt();

                switch (cuadrados)
                {
                    case 1:
                    {
                        //CuadradoPerfecto

                        boolean perfecto;
                        int n;
                        System.out.print("Escribe un número: ");
                        n = sc.nextInt();

                        perfecto = CuadradoPerfecto(n);
                        System.out.println(perfecto);
                    }
                    break;

                    case 2:
                    {
                        //ListaCuadradosPerfectos

                        int min, max;
                        min = 1;
                        max = 20;

                        ListaCuadradosPerfectos(min, max);
                    }
                    break;
                }
            }
            break;

            case 46:
            {
                // Escribe la función descomponerFactoresPrimos a la que le pasamos un entero y nos
                //escribe por pantalla sus factores primos. No devuelve nada porque escribe los datos por
                //pantalla.
                //Ejemplo: Si le pasamos el número 24, nos debería escribir: 2 2 2 3
                //Para los que quieran nota, que aparezca bonito: “24 = 2 x 2 x 2 x 3”.

                int n;
                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                System.out.print(n + " = ");
                DescomponerFactoresPrimos(n);
            }
            break;
        }
    }
}