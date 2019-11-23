package com.company;

import java.security.InvalidParameterException;

public class Carta
{
    //Atributos
    private int numero;
    private int palo;

    //Constructores
    public Carta(int numero, int palo)
    {
        if (numero >= 1 && numero <= 10)
        {
            this.numero = numero;
        } else
        {
            throw new InvalidParameterException("El número de la carta no está entre 1 y 10");
        }

        if (palo >= 0 && palo < 4)
        {
            this.palo = palo;
        } else
        {
            throw new InvalidParameterException("El palo de la carta no corresponde");
        }

    }

    public Carta(int id)
    {
        if (id >= 1 && id <= 40)
        {
            if (id <= 10)//Entre 1 y 10
            {
                this.numero = id;
                this.palo = 0;
            } else
            {
                if (id <= 20)//Entre 11 y 20
                {
                    this.numero = id - 10;
                    this.palo = 1;
                } else
                {
                    if (id <= 30)//Entre 21 y 30
                    {
                        this.numero = id - 20;
                        this.palo = 2;
                    } else
                    {
                        //Entre 31 y 40
                        this.numero = id - 30;
                        this.palo = 3;
                    }
                }
            }
        }
    }

    //Propiedades
    public int getNumero()
    {
        return numero;
    }

    public int getPalo()
    {
        return palo;
    }

    //Métodos
    public String nombreNumero()
    {
        String nombre = "";

        switch (this.numero)
        {
            case 1:
                nombre = "as";
                break;
            case 2:
                nombre = "dos";
                break;
            case 3:
                nombre = "tres";
                break;
            case 4:
                nombre = "cuatro";
                break;
            case 5:
                nombre = "cinco";
                break;
            case 6:
                nombre = "seis";
                break;
            case 7:
                nombre = "siete";
                break;
            case 8:
                nombre = "sota";
                break;
            case 9:
                nombre = "caballo";
                break;
            case 10:
                nombre = "rey";
                break;
        }
        return nombre;
    }

    public String nombrePalo()
    {
        String nombre = "";

        switch (this.palo)
        {
            case 0:
                nombre = "oros";
                break;
            case 1:
                nombre = "copas";
                break;
            case 2:
                nombre = "espadas";
                break;
            case 3:
                nombre = "bastos";
                break;
        }
        return nombre;
    }

    public String nombreCarta()
    {
        String carta = nombreNumero() + " de " + nombrePalo();
        return carta;
    }

    public int valorTute()
    {
        int valor = 0;

        switch (this.numero)
        {
            case 1:
                valor = 11;
                break;
            case 3:
                valor = 10;
                break;
            case 8:
                valor = 2;
                break;
            case 9:
                valor = 3;
                break;
            case 10:
                valor = 4;
                break;
            default:
                valor = this.numero;
                break;
        }
        return valor;
    }

    public int valorMus()
    {
        int valor = 0;

        switch (this.numero)
        {
            case 1:
            case 2:
                valor = 1;
                break;
            case 3:
            case 8:
            case 9:
            case 10:
                valor = 10;
                break;
            default:
                valor = this.numero;
                break;
        }
        return valor;
    }

    public double valor7ymedia()
    {
        double valor = 0;

        switch (this.numero)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                valor = this.numero;
                break;
            case 8:
            case 9:
            case 10:
                valor = 0.5;
                break;
        }
        return valor;
    }
}

