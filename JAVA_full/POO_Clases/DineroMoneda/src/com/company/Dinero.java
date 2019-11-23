package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Dinero
{
    //Atributo estatico

    private static List<Moneda> listaMonedas;

    //Bloque estático

    static
    {
        listaMonedas = new ArrayList<>();

        listaMonedas.add(new Moneda(TipoMoneda.Euro, 2, "€", 1));
        listaMonedas.add(new Moneda(TipoMoneda.Dolar, 2, "$", 1.1398));
        listaMonedas.add(new Moneda(TipoMoneda.Yen, 0, "¥", 125.8470));
    }

    //Métodos estáticos
    public static void actualizarCambio(TipoMoneda t, double cambio)
    {
        int i;
        for (i = 0; i < listaMonedas.size(); i++)
        {
            if (listaMonedas.get(i).getMoneda() == t)
            {
                listaMonedas.get(i).setCambioEuro(cambio);
            }
        }
    }

    private static Moneda buscaMoneda(TipoMoneda t)
    {
        int i;
        for (i = 0; i < listaMonedas.size(); i++)
        {
            if (listaMonedas.get(i).getMoneda() == t)
            {
                return listaMonedas.get(i);
            }

        }
        throw new InvalidParameterException("La lista no está bien definida. Puede que le falten tipos de monedas");
    }

    //Atributos "normales"
    private double cantidad;
    private TipoMoneda tMoneda;

    //Constructores
    public Dinero(double cantidad, TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    public Dinero(int cantidad, TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    //Propiedades
    public double getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    public TipoMoneda gettMoneda()
    {
        return tMoneda;
    }

    public void settMoneda(TipoMoneda tMoneda)
    {
        this.tMoneda = tMoneda;
    }

    //Métodos
    public String toString()
    {
        String imprime = "";
        Moneda m = buscaMoneda(this.tMoneda);

        double redondeo = 0;

        switch (m.getDecimales())
        {
            case 0:
                redondeo = Math.round(this.cantidad);
                break;
            case 1:
                redondeo = Math.round(this.cantidad * 10.0) / 10.0;
                break;
            case 2:
                redondeo = Math.round(this.cantidad * 100.0) / 100.0;
                break;
            case 3:
                redondeo = Math.round(this.cantidad * 1000.0) / 1000.0;
                break;
            case 4:
                redondeo = Math.round(this.cantidad * 10000.0) / 10000.0;
                break;

        }

        imprime = redondeo + m.getSimbolo();

        return imprime;
    }

    public double valorEn(TipoMoneda t)
    {
        double valorEuro = 0;
        double resultado = 0;
        double cambio;
        double cambio2;

        Moneda m = buscaMoneda(this.tMoneda);

        cambio = m.getCambioEuro();

        valorEuro = this.cantidad / cambio;

        Moneda m2 = buscaMoneda(t);

        cambio2 = m2.getCambioEuro();

        resultado = valorEuro * cambio2;

        return resultado;
    }

    public Dinero convierteEn(TipoMoneda t)
    {
        Dinero d = new Dinero(valorEn(t),t);
        return d;
    }

    public String toString(TipoMoneda t)
    {
        String cadena = convierteEn(t).toString();

        return cadena;
    }

    //Métodos (operadores)
    public Dinero add(Dinero d)
    {
        Dinero dinero;
        double suma = 0;
        double cambioDevalor;

        if(this.tMoneda == d.tMoneda)
        {
            suma = this.cantidad + d.cantidad;
        }
        else
        {
            cambioDevalor = d.valorEn(this.tMoneda);

            suma = this.cantidad + cambioDevalor;
        }
        dinero = new Dinero(suma, tMoneda);
        return dinero;
    }

    public Dinero substract(Dinero d)
    {
        Dinero dinero;
        double resta = 0;
        double cambioDevalor;

        if(this.tMoneda == d.tMoneda)
        {
            resta = this.cantidad - d.cantidad;
        }
        else
        {
            cambioDevalor = d.valorEn(this.tMoneda);

            resta = this.cantidad - cambioDevalor;
        }
        dinero = new Dinero(resta, tMoneda);
        return dinero;
    }

    public Dinero multiply(double multi)
    {
        Dinero d;
        double resultado = this.cantidad * multi;

        d = new Dinero(resultado, tMoneda);

        return d;
    }

    public Dinero divide(double div)
    {
        Dinero d;
        double resultado = this.cantidad / div;

        d = new Dinero(resultado, tMoneda);

        return d;
    }

    public Dinero negate()
    {
        Dinero dinero;

        dinero = new Dinero(-this.cantidad, this.tMoneda);

        return dinero;
    }

    public boolean equals(Dinero d)
    {
        boolean iguales;
        double cambioDeValor;

        if(this.tMoneda == d.tMoneda)
        {
            if(this.cantidad == d.cantidad)
            {
                iguales = true;
            }
            else
            {
                iguales = false;
            }
        }
        else
        {
            cambioDeValor = d.valorEn(this.tMoneda);

            if(cambioDeValor == this.cantidad)
            {
                iguales = true;
            }
            else
            {
                iguales = false;
            }
        }

        return iguales;
    }

    public int compareTo(Dinero d)
    {
        int resultado ;
        double cambioDeValor;

        if(this.tMoneda == d.tMoneda)
        {
            if(this.cantidad < d.cantidad)
            {
                resultado = -1;
            }
            else
            {
                if(this.cantidad == d.cantidad)
                {
                    resultado = 0;
                }
                else
                {
                    resultado = 1;
                }
            }
        }
        else
        {
            cambioDeValor = d.valorEn(this.tMoneda);

            if(this.cantidad < cambioDeValor)
            {
                resultado = -1;
            }
            else
            {
                if(this.cantidad == cambioDeValor)
                {
                    resultado = 0;
                }
                else
                {
                    resultado = 1;
                }
            }

        }
        return resultado;
    }
}

