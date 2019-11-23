package com.company;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Fraccion
{
    //Atributos
    private int numerador;
    private int denominador;

    //Constructores
    public Fraccion(int numerador, int denominador)
    {
        this.setNumerador(numerador);
        this.setDenominador(denominador);
    }

    public Fraccion(int n)
    {
        this.setNumerador(n);
        this.setDenominador(1);
    }

    public Fraccion(double n)
    {
        double numerador = n;
        int denominador = 1;

        while(Math.floor(numerador) != numerador)
        {
            numerador = numerador*10;
            denominador = denominador*10;
        }
        this.setNumerador((int)numerador);
        this.setDenominador(denominador);
    }

    //Propiedades
    public int getNumerador()
    {
        return numerador;
    }

    public void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }

    public int getDenominador()
    {
        return denominador;
    }

    public void setDenominador(int denominador)
    {
        if(denominador != 0)
        {
            this.denominador = denominador;
        }
        else
        {
            throw new InvalidParameterException("El denominador no puede ser 0.");
        }
    }

    //Métodos privados
    private static int mcd(int a, int b)
    {
        Scanner sc = new Scanner(System.in);

        int divisor;

        //Seleccionamos el menor de los dos números

        if(a < b)
        {
            divisor = a;
        }
        else
        {
            divisor = b;
        }

        //Ahora empezamos a comprobar si ese número es el mcd
        //o lo son los sucesivos inferiores a él

        while((a %divisor != 0 || b %divisor != 0) && divisor > 1)
        {
            divisor--;
        }

        //Para salir del bucle deben cumplirse dos condiciones:
        //1. divisor es divisor de ambos números
        //2. divisor a llegado a valer 1, por lo tanto ese es el MCD

        return divisor;
    }

    private static int mcm(int a, int b)
    {
        Scanner sc = new Scanner(System.in);

        int multiplo;

        //Seleccionamos el mayor de los dos
        if(a > b)
        {
            multiplo = a;
        }
        else
        {
            multiplo = b;
        }

        //Ahoram vamos comprobando si ese número es el mcm
        //o los son los sucesivos superiores a él
        while(multiplo %a != 0 || multiplo %b != 0)
        {
            multiplo++;
        }
        //Para salir del bucle debe cumplirse:
        //· multiplo es un número múltiplo de a y b simultáneamente

        return multiplo;
    }

    //Métodos
    public void simplificar()
    {
        int mcd = mcd(numerador, denominador);

        numerador = numerador/mcd;
        denominador = denominador/mcd;
    }

    public String toString()
    {
        return this.numerador + "/" + this.denominador;
    }

    //Métodos (Operadores)
    public Fraccion negate()
    {
        Fraccion f = new Fraccion(-numerador, denominador);
        return f;
    }

    public Fraccion add(Fraccion f)
    {
        int den = mcm(this.denominador, f.denominador);
        int num = (this.numerador*(den/this.denominador))+(f.numerador*(den/f.denominador));
        Fraccion fr = new Fraccion(num, den);
        return fr;
    }

    public Fraccion substract(Fraccion f)
    {
        int den = mcm(this.denominador, f.denominador);
        int num = (this.numerador*(den/this.denominador)-(f.numerador*(den/f.denominador)));
        Fraccion fr = new Fraccion(num, den);
        return fr;
    }

    public Fraccion multiply(Fraccion f)
    {
        int num, den;

        num = this.numerador * f.numerador;
        den = this.denominador * f.denominador;

        Fraccion fr = new Fraccion(num, den);
        return fr;
    }

    public Fraccion divide(Fraccion f)
    {
        int num, den;

        num = this.numerador * f.denominador;
        den = this.denominador * f.numerador;

        Fraccion fr = new Fraccion(num, den);
        return fr;
    }

    public boolean equals(Fraccion f)
    {
        boolean iguales = false;
        double resultado1 , resultado2;

        resultado1 = this.numerador / this.denominador;
        resultado2 = f.numerador / f.denominador;

        if(resultado1 == resultado2)
        {
            iguales = true;
        }

        return iguales;
    }

    public int compareTo(Fraccion f)
    {
        int valor;
        double resultado1, resultado2;

        resultado1 = this.numerador / this.denominador;
        resultado2 = f.numerador / f.denominador;

        if(resultado1 == resultado2)
        {
            valor = 0;
        }
        else
        {
            if(resultado1 < resultado2)
            {
                valor = -1;
            }
            else
            {
                valor = 1;
            }
        }

        return valor;
    }
}
