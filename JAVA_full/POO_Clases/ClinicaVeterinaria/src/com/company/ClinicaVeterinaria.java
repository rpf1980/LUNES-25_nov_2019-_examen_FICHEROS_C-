package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria
{
    //Atributos
    private List<Animal> listaAnimal;

    //Constructor
    public ClinicaVeterinaria()
    {
        listaAnimal = new ArrayList<>();
    }

    //Métodos
    public void insertaAnimal(Animal a)
    {
        listaAnimal.add(a);
    }

    public Animal buscaAnimal(String nombreAnimal)
    {

        Animal devuelvoAnimal = listaAnimal.get(0);

        int i;
        for(i = 0; i < listaAnimal.size(); i++)
        {
            if(listaAnimal.get(i).nombre.equals(nombreAnimal))
            {
                devuelvoAnimal = listaAnimal.get(i);
            }
            else
            {
                throw new InvalidParameterException("El nombre de animal no existe");
            }
        }

        return devuelvoAnimal;
    }

    public void modificaComentarioAnimal(String nombreAnimal, String comentarioAnimal)
    {
        int i;
        for(i = 0; i < listaAnimal.size(); i++)
        {
            if(listaAnimal.get(i).nombre.equals(nombreAnimal))
            {
                listaAnimal.get(i).comentario = comentarioAnimal;
            }
        }
    }

    public String toString()
    {
        String fichaAnimales = "";
        int i;

        for(i = 0; i < listaAnimal.size(); i++)
        {
            fichaAnimales = fichaAnimales + listaAnimal.get(i).toString() + "\n";
        }

        return fichaAnimales;
    }
}
