package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baraja
{
    //Atributos
    private List<Carta> listaCartas;

    //Constructores
    public Baraja()
    {
        listaCartas = new ArrayList<Carta>();
    }

    public Baraja(int tipoBaraja)
    {
        listaCartas = new ArrayList<Carta>();
        int i;
        if(tipoBaraja == 1)
        {
            for(i = 1; i <= 40; i++)
            {
                Carta c1 = new Carta(i);
                listaCartas.add(c1);
            }
        }
        else
        {
            if(tipoBaraja == 2)
            {
                for(i = 1; i <= 80; i++)
                {
                    Carta c2 = new Carta(i);
                    listaCartas.add(c2);
                }
            }
            else
            {
                throw new InvalidParameterException("El tipo de baraja no es el correcto");
            }
        }
    }

    public Baraja(int tipoBaraja, boolean barajar)
    {
        this(tipoBaraja);

        if(barajar)
        {
            barajar();
        }
    }

    //Métodos
    public void barajar()
    {
        List<Carta> listaAuxiliar = new ArrayList<Carta>();
        Random rd = new Random();
        int posicion;
        int i;

        while(!listaCartas.isEmpty())
        {
            posicion = rd.nextInt(listaCartas.size());
            listaAuxiliar.add(listaCartas.get(posicion));
            listaCartas.remove(posicion);
        }

        listaCartas.addAll(listaAuxiliar);
    }

    public void cortar(int numeroCartas)
    {
        int i;
        List<Carta> listaAuxiliar = new ArrayList<>();

        //numeroCartas podemos considerarlo una posición en la baraja (si queremos cortar 8 cartas, estaríamos en la posición 8 de la baraja)

        for(i = numeroCartas; i < listaCartas.size(); i++)
        {
            listaAuxiliar.add(listaCartas.get(i)); //Aquí tenemos copiadas todas las cartas desde la posición (numeroCartas) hasta el final de la baraja
        }

        for(i = 0; i < numeroCartas; i++)
        {
            listaAuxiliar.add(listaCartas.get(i)); //En este punto tomamos todas las cartas desde el principio de la baraja hasta la posición, y lo copiamos al final de la baraja
        }

        listaCartas.addAll(listaAuxiliar); //Copiamos la baraja con su nuevo orden

    }

    public Carta robar()
    {
        Carta robar = listaCartas.get(0);
        listaCartas.remove(0);

        return robar;
    }

    public void insertaCartaFinal(int idCarta)
    {
        Carta insertafinal = new Carta(idCarta);
        listaCartas.add(insertafinal);
    }

    public void insertaCartaPrincipio(int idCarta)
    {
        Carta insertaprincipio = new Carta(idCarta);
        listaCartas.add(0,insertaprincipio);
    }

    public int numeroCartas()
    {
        return this.listaCartas.size();
    }

    public boolean vacia()
    {
        boolean vacia;

        if(listaCartas.size() == 0)
        {
            vacia = true;
        }
        else
        {
            vacia = false;
        }

        return vacia;
    }
}
