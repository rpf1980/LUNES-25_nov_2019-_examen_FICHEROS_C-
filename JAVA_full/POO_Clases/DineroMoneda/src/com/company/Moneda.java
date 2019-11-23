package com.company;

import java.security.InvalidParameterException;

enum TipoMoneda
{
    Euro, Dolar, Yen
}

public class Moneda
{
    //Atributos
    private TipoMoneda tMoneda;
    private int decimales;
    private String simbolo;
    private double cambioEuro;

    //Constructor
    public Moneda(TipoMoneda tMoneda, int decimales, String simbolo, double cambioEuro)
    {
        this.tMoneda = tMoneda;

        if(decimales >= 0 && decimales < 5)
        {
            this.decimales = decimales;
        }
        else
        {
            throw new InvalidParameterException("Número de decimales incorrectos");
        }

        if(!simbolo.isEmpty())
        {
            this.simbolo = simbolo;
        }
        else
        {
            throw new InvalidParameterException("El campo símbolo no puede estar vacío.");
        }

        if(cambioEuro >= 0)
        {
            this.setCambioEuro(cambioEuro);
        }
        else
        {
            throw new InvalidParameterException("El cambio no puede ser negativo.");
        }
    }

    //Propiedades
    public TipoMoneda getMoneda()
    {
        return tMoneda;
    }

    public int getDecimales()
    {
        return decimales;
    }

    public String getSimbolo()
    {
        return simbolo;
    }


    public double getCambioEuro()
    {
        return cambioEuro;
    }

    public void setCambioEuro(double cambioEuro)
    {
        this.cambioEuro = cambioEuro;
    }



}
