package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MusicaDB
{
    //atributos
    private Connection conn;
    private Statement st;
    private ResultSet rs;

    //Constructor
    public MusicaDB(String ip, String nombreBD, String usuario, String contrasena)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + ip + ":3306/" + nombreBD, usuario, contrasena);
            st = conn.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //Metodos
    public int insertaCancion(String ruta, String titulo, int idArtista, int idEstilo, int anno, int estrellas)
    {
        int idCancion = -1;

        try
        {
            ruta = ruta.replace("\\", "\\\\");
            String sql =
                    "INSERT INTO canciones (ruta, titulo, idArtista, idEstilo, anno, estrellas) " +
                            "VALUES ('"+ruta+"', '"+titulo+"', "+idArtista+", "+idEstilo+", "+anno+", "+estrellas+");";

            st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            rs = st.getGeneratedKeys();

            rs.next();
            idCancion = rs.getInt(1);
            rs.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return idCancion;
    }

    public int insertaArtista(String nombreArtista)
    {
        int idArtista = -1;

        try
        {
            String sql =
                    "INSERT INTO artistas (nombre) " +
                            "VALUES ('"+nombreArtista+"');";
            st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            rs = st.getGeneratedKeys();

            rs.next();
            idArtista = rs.getInt(1);
            rs.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return idArtista;
    }

    public int insertaEstilo(String nombreEstilo)
    {
        int idEstilo = -1;

        try
        {
            String sql =
                    "INSERT INTO estilos (nombre) " +
                            "VALUES ('"+nombreEstilo+"');";

            st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            rs = st.getGeneratedKeys();

            rs.next();
            idEstilo = rs.getInt(1);
            rs.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return idEstilo;
    }

    public int buscaArtista(String nombreArtista)
    {
        int idArtista = 0;

        try
        {
            String sql = "SELECT id FROM artistas WHERE nombre = '"+nombreArtista+"';";
            rs = st.executeQuery(sql);

            if(rs.next())
            {
                idArtista = rs.getInt("id");
            }
            else
            {
                return -1;
            }

            rs.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return idArtista;
    }

    public int buscaEstilo(String nombreEstilo)
    {
        int idEstilo = 0;

        try
        {
            String sql = "SELECT id FROM estilos WHERE nombre = '"+nombreEstilo+"'";
            rs = st.executeQuery(sql);

            if(rs.next())
            {
                idEstilo = rs.getInt("id");
            }
            else
            {
                return -1;
            }

            rs.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return idEstilo;
    }

    public boolean existeFichero(String ruta)
    {
        boolean existe = false;

        try
        {
            ruta = ruta.replace("\\", "\\\\");
            String sql =
                    "SELECT id FROM canciones WHERE ruta = '"+ruta+"'";
            rs = st.executeQuery(sql);
            System.out.println(sql);

            if(rs.next())
            {
                existe = true;
            }

            rs.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return existe;
    }

    public List<Cancion> listadoCanciones()
    {
        List<Cancion> lista = new ArrayList<>();

        try
        {
            String sql =
                    "SELECT id, ruta, titulo, idArtista, idEstilo, anno, estrellas FROM canciones;";
            rs = st.executeQuery(sql);

            while(rs.next())
            {
                Cancion c = new Cancion();

                c.id = rs.getInt("id");
                c.ruta = rs.getString("ruta");
                c.titulo = rs.getString("titulo");
                c.idArtista = rs.getInt("idArtista");
                c.idEstilo = rs.getInt("idEstilo");
                c.anno = rs.getInt("anno");
                c.estrellas = rs.getInt("estrellas");

                lista.add(c);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }

    public List<Cancion> listaCancionesPorArtista(int idArtista)
    {
        List<Cancion> lista = new ArrayList<>();

        try
        {
            String sql =
                    "SELECT id, ruta, titulo, idArtista, idEstilo, anno, estrellas FROM canciones " +
                            "WHERE idArtista = "+idArtista+";";

            rs = st.executeQuery(sql);

            while(rs.next())
            {
                Cancion c = new Cancion();

                c.id = rs.getInt("id");
                c.ruta = rs.getString("ruta");
                c.titulo = rs.getString("titulo");
                c.idArtista = rs.getInt("idArtista");
                c.idEstilo = rs.getInt("idEstilo");
                c.anno = rs.getInt("anno");
                c.estrellas = rs.getInt("estrellas");

                lista.add(c);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }

    public List<Cancion> listadoCancionesPorEstilo(int idEstilo)
    {
        List<Cancion> lista = new ArrayList<>();

        try
        {
            String sql =
                    "SELECT id, ruta, titulo, idArtista, idEstilo, anno, estrellas FROM canciones " +
                            "WHERE idEstilo = "+idEstilo+";";

            rs = st.executeQuery(sql);

            while(rs.next())
            {
                Cancion c = new Cancion();

                c.id = rs.getInt("id");
                c.ruta = rs.getString("ruta");
                c.titulo = rs.getString("titulo");
                c.idArtista = rs.getInt("idArtista");
                c.idEstilo = rs.getInt("idEstilo");
                c.anno = rs.getInt("anno");
                c.estrellas = rs.getInt("estrellas");

                lista.add(c);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }

    public List<Cancion> listadoCancionesPorAnno(int annoInicio, int annoFinal)
    {
        List<Cancion> lista = new ArrayList<>();

        try
        {
            String sql = "SELECT id, ruta, titulo, idArtista, idEstilo, anno, estrellas FROM canciones " +
                    "WHERE anno >= "+annoInicio+" AND anno <= "+annoFinal+";";

            System.out.println(sql);
            rs = st.executeQuery(sql);

            while(rs.next())
            {
                Cancion c = new Cancion();

                c.id = rs.getInt("id");
                c.ruta = rs.getString("ruta");
                c.titulo = rs.getString("titulo");
                c.idArtista = rs.getInt("idArtista");
                c.idEstilo = rs.getInt("idEstilo");
                c.anno = rs.getInt("anno");
                c.estrellas = rs.getInt("estrellas");

                lista.add(c);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }

    public List<Cancion> listaCancionesPorEstrellas(int min, int max)
    {
        List<Cancion> lista = new ArrayList<>();

        try
        {
            String sql =
                    "SELECT id, ruta, titulo, idArtista, idEstilo, anno, estrellas FROM canciones " +
                        "WHERE estrellas >= "+min+" AND estrellas <= "+max+";";
            rs = st.executeQuery(sql);

            while(rs.next())
            {
                Cancion c = new Cancion();
                c.id = rs.getInt("id");
                c.ruta = rs.getString("ruta");
                c.titulo = rs.getString("titulo");
                c.idArtista = rs.getInt("idArtista");
                c.idEstilo = rs.getInt("idEstilo");
                c.anno = rs.getInt("anno");
                c.estrellas = rs.getInt("estrellas");

                lista.add(c);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }

}
