package com.company;

import java.security.InvalidParameterException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CineDB
{
    //Atributos
    private Connection conn;  //Conexión a bd
    private Statement st;     //Consulta SQL se hace una vez tengamos la conexión hecha
    private ResultSet rs;     //Donde se almacenan los resultados de las consultas que devuelven datos (se usa con select para devolver info)

    //Constructor
    public CineDB(String nombreFicheroDB)
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:" + nombreFicheroDB);
            st = conn.createStatement();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    //Métodos
    public int insertaPelicula(String titulo, int anno, boolean tieneOscar, double valoracion)
    {
        int idPeli = -1;

        int valorTieneOscar;
        if (tieneOscar == true)
        {
            valorTieneOscar = 1;
        } else
        {
            valorTieneOscar = 0;
        }

        try
        {
            //Insertamos película nueva
            String sql =
                    "INSERT INTO peliculas(titulo, anno, tieneOscar, valoracion) " +
                            "VALUES ('" + titulo + "', " + anno + ", " + valorTieneOscar + ", " + valoracion + ")";

            //System.out.println(sql);
            st.executeUpdate(sql);


            //Hacemos select del id

            //String consultaId = "SELECT last_insert_rowid() AS id;";  //Apuntamos al id por su nombre de columna
            String consultaId = "SELECT last_insert_rowid();";      //Apuntamos al id por su número de columna
            rs = st.executeQuery(consultaId);
            rs.next();
            //idPeli = rs.getInt("id");
            idPeli = rs.getInt(1);
            rs.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return idPeli;
    }

    public int insertaActor(String nombre, LocalDate fechaNacimiento)
    {
        int idActor = -1;

        try
        {
            //Insertamos actor con sus datos

            String sql =
                    "INSERT INTO actores (nombre, fechaNacimiento) " +
                    "VALUES ('" + nombre + "', '"+ fechaNacimiento +" 00:00:00.000');";
            st.executeUpdate(sql);

            //Hacemos el select

            String consultaIdActor = "SELECT last_insert_rowid();";
            rs = st.executeQuery(consultaIdActor);
            rs.next();
            //idPeli = rs.getInt("id");
            idActor = rs.getInt(1);
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return idActor;
    }

    public void asociaActorPelicula(int idActor, int idPelicula, boolean prinpipal)
    {

        int esPrincipal = -1;

        if(prinpipal == true)
        {
            esPrincipal = 1;
        }
        else
        {
            esPrincipal = 0;
        }

        try
        {
            String sql =
                    "INSERT INTO actoresPeliculas " +
                    "VALUES ("+idActor+", "+idPelicula+", "+esPrincipal+");";
            st.executeUpdate(sql);

            //System.out.println(sql);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public int buscaActor(String nombre)
    {
        int id = -1;

        try
        {
            String sql =
                    "SELECT id FROM actores " +
                            "WHERE nombre = '" + nombre + "';";

            rs = st.executeQuery(sql);

            if(rs.next())
            {
                id = rs.getInt("id");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return id;
    }

    public int buscaPelicula(String titulo)
    {
        int id = -1;

        try
        {
            String sql =
                    "SELECT id FROM peliculas " +
                            "WHERE  titulo = '" + titulo + "';";

            rs = st.executeQuery(sql);

            if(rs.next())
            {
                id = rs.getInt("id");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return id;
    }

    public Pelicula datosPelicula(int idPelicula)
    {
        Pelicula p = new Pelicula();

        try
        {
            String sql =
                    "SELECT id, titulo, anno, tieneOscar, valoracion FROM peliculas " +
                    "WHERE id = "+idPelicula+";";

            rs = st.executeQuery(sql);

            while(rs.next())
            {
                p.titulo = rs.getString("titulo");
                p.anno = rs.getInt("anno");
                p.tieneOscar = rs.getBoolean("tieneOscar");
                p.valoracion = rs.getDouble("valoracion");

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return p;
    }

    public Actor datosActor(int idActor)
    {
        Actor actor = new Actor();

        try
        {
            String sql =
                    "SELECT id, nombre, fechaNacimiento FROM actores " +
                            "WHERE id = "+idActor+";";

            rs = st.executeQuery(sql);

            while(rs.next())
            {
                actor.id = rs.getInt("id");
                actor.nombre = rs.getString("nombre");
                Date fecha = rs.getDate("fechaNacimiento");
                actor.fechaNacimiento = fecha.toLocalDate();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return actor;
    }

    public List<Pelicula> listadoPeliculas()
    {
        List<Pelicula> listaPeliculas = new ArrayList<>();

        try
        {
            String sql =
                    "SELECT id, titulo, anno, tieneOscar, valoracion FROM peliculas;";

            rs = st.executeQuery(sql);

            while (rs.next())
            {
                Pelicula p = new Pelicula();
                p.id = rs.getInt("id");
                p.titulo = rs.getString("titulo");
                p.anno = rs.getInt("anno");
                p.tieneOscar = rs.getBoolean("tieneOscar");
                p.valoracion = rs.getDouble("valoracion");

                listaPeliculas.add(p);

                System.out.println();
            }

            rs.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return listaPeliculas;
    }

    public List<Actor> listadoActores()
    {
        List<Actor> listaActores = new ArrayList<>();

        try
        {
            String sql =
                    "SELECT id, nombre, fechaNacimiento FROM actores;";

            rs = st.executeQuery(sql);



            while(rs.next())
            {
               Actor actor = new Actor();

                actor.id = rs.getInt("id");
                actor.nombre = rs.getString("nombre");
                Date fecha = rs.getDate("fechaNacimiento");
                actor.fechaNacimiento = fecha.toLocalDate();

                listaActores.add(actor);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return listaActores;
    }

    public List<Pelicula> listaPeliculasPorActor(int idActor)
    {
        List<Pelicula> lista = new ArrayList<>();

        try
        {
            /*String sql =
                    "SELECT id, titulo, anno, tieneOscar, valoracion FROM peliculas " +
                            "WHERE id = (SELECT idPelicula FROM actoresPeliculas WHERE idActor = "+idActor+");";*/

            String sql =
                    "SELECT id, titulo, anno, tieneOscar, valoracion FROM peliculas " +
                            "JOIN actoresPeliculas ON peliculas.id = actoresPeliculas.idPelicula " +
                            "WHERE idActor = "+idActor+";";

            rs = st.executeQuery(sql);

            while(rs.next())
            {
                Pelicula p = new Pelicula();

                p.id = rs.getInt("id");
                p.titulo = rs.getString("titulo");
                p.anno = rs.getInt("anno");
                p.tieneOscar = rs.getBoolean("tieneOscar");
                p.valoracion = rs.getDouble("valoracion");
                lista.add(p);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }

    public List<ActorPelicula> listaActoresPorPelicula(int idPelicula)
    {
        List<ActorPelicula> lista = new ArrayList<>();

        try
        {
            String sql =
                    "SELECT id, nombre, fechaNacimiento, principal FROM actores " +
                            " JOIN actoresPeliculas ON actores.id = actoresPeliculas.idActor " +
                            " WHERE idPelicula = "+idPelicula+";";

            //System.out.println(sql);
            rs = st.executeQuery(sql);

            while(rs.next())
            {
                ActorPelicula act = new ActorPelicula();

                act.id = rs.getInt("id");
                act.nombre = rs.getString("nombre");
                Date fecha = rs.getDate("fechaNacimiento");
                act.fechaNacimiento = fecha.toLocalDate();
                act.principal = rs.getBoolean("principal");

                lista.add(act);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }
}

