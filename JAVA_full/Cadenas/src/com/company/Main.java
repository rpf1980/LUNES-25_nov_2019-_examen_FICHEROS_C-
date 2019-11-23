package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main
{

    public static int NumeroEspacios(String c)
    {
        int espacios = 0;
        int i;
        for (i = 0; i < c.length(); i++)
        {
            if (c.charAt(i) == ' ')
            {
                espacios++;
            }
        }
        return espacios;
    }

    public static int NumeroVocales(String c)
    {
        int vocales = 0;
        int i, j;
        String s = "aáeéiíoóuú";

        c = c.toLowerCase();
        for (i = 0; i < c.length(); i++)
        {
            for (j = 0; j < s.length(); j++)
            {
                if (c.charAt(i) == s.charAt(j))
                {
                    vocales += 1;
                }
            }
        }
        return vocales;
    }

    public static boolean EsPalindromo(String c)
    {
        //String copia = "";
        boolean palindromo;
        int contador = 0;
        int i, j;

        c = c.toLowerCase();
        c = c.replaceAll(" ", "");

        for (i = 0, j = c.length() - 1; i < j; i++, j--)
        {
            if (c.charAt(i) != c.charAt(j))
            {
                contador++;
            }
        }
        if (contador == 0)
        {
            palindromo = true;
        } else
        {
            palindromo = false;
        }
        return palindromo;
    }

    public static boolean Contiene(String cadena, char c)
    {
        boolean contiene = false;
        int i;
        for (i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i) == c)
            {
                contiene = true;
            }
        }
        return contiene;
    }

    public static String RepiteCaracter(char c, int n)
    {
        String cadena = "";
        int i;
        for (i = 0; i < n; i++)
        {
            cadena = cadena + c;
        }
        return cadena;
    }

    public static String PadLeft(String c, int longitud)
    {
        String cadena = c;
        int cantidadEspacios = longitud - c.length();
        int i;

        for (i = 0; i < cantidadEspacios; i++)
        {
            cadena = " " + cadena;
        }
        return cadena;
    }

    public static String PadRight(String c, int longitud)
    {
        String cadena = c;
        int cantidadEsapcios = longitud - c.length();
        int i;

        for (i = 0; i < cantidadEsapcios; i++)
        {
            cadena = cadena + " ";
        }
        return cadena;
    }

    public static String QuitaEspacios(String c)
    {
        String cadena = "";
        String sin = "";
        int i;

        for (i = 0; i < c.length(); i++)
        {
            if (c.charAt(i) != ' ')
            {
                cadena = cadena + c.charAt(i);
            }
        }
        return cadena;

    }

    public static String QuitaEspaciosTrim(String c)
    {
        String cadena = c;
        int i, j;

        i = 0;
        while (cadena.charAt(i) == ' ')
        {
            i++;
        }

        j = cadena.length() - 1;
        while (cadena.charAt(j - 1) == ' ')
        {
            j--;
        }

        cadena = cadena.substring(i, j);

        return cadena;
    }

    public static String SustituyeCaracter(String cadena, char viejo, char nuevo)
    {
        String copia = cadena.toLowerCase();
        String c2 = "";
        int i;

        for (i = 0; i < copia.length(); i++)
        {
            if (copia.charAt(i) == viejo)
            {
                c2 = c2 + nuevo;
            } else
            {
                c2 = c2 + copia.charAt(i);
            }
        }
        return c2;
    }

    public static int CuentaPalabras(String c)
    {
        String copia = c;
        int palabras = 0;

        //String simbolos = "!;:?¿,./";

        /*for(int i = 0; i < simbolos.length(); i++)
        {
            for(int j = 0; j < copia.length(); j++)
            {
                if(simbolos.charAt(i) == copia.charAt(j))
                {
                    copia = copia + "";
                }
            }
        }*/

        String[] trozos = copia.split(" ");
        int i;
        palabras = trozos.length;

        return palabras;
    }

    public static boolean EsNumero(String c)
    {
        String copia = c;
        boolean esDigito = false;
        int contador = 0; //Contador que servirá para comprobar la cantidad de coincidencias con respecto al largo de la cadena
        int i, j;

        //Creamos una cadean con los números del 0 al 9
        String enteros = "0123456789";

        //Recorremos la cadena enteros y comprobamos en la cadena copia si existen caracteres parecidos
        for (i = 0; i < enteros.length(); i++)
        {
            for (j = 0; j < copia.length(); j++)
            {
                if (enteros.charAt(i) == copia.charAt(j))
                {
                    contador++;
                }
            }
        }
        if (contador == copia.length())
        {
            esDigito = true;
        }
        return esDigito;
    }

    public static String QuitaCaracter(String cadena, char caracter)
    {
        String copia = cadena;
        String c2 = "";
        char vacio = ' ';
        int i;

        for (i = 0; i < copia.length(); i++)
        {
            if (copia.charAt(i) == caracter)
            {
                c2 = c2 + vacio;
            } else
            {
                c2 = c2 + copia.charAt(i);
            }
        }
        return c2;
    }

    public static String QuitaAcentos(String cadena)
    {

        //PRIMERA FORMA DE HACERLO usamos replace
        /*String copia = cadena;
        String c2 = "";
        String con = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
        String sin = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
        int elementos = con.length();
        int i;

        //Condicional que comprueba tamaño de cadenas con y sin
        if(con.length() != sin.length())
        {
            System.out.println("Error.Revisa las cadenas para sustitución de acentos (longitud/datos)");
        }

        //Bucle for que recorre el número de elementos con o sin de la cadena copiada. Usa un tamaño común para sus iteraciones, comparando las dos (con y sin) a la vez con la cadena copiada.
        for(i = 0; i < elementos; i++)
        {
            //Ahora por cada elemento encontrado hacemos un reemplazo de caracteres
            copia = copia.replace(con.charAt(i), sin.charAt(i));

        }
        return copia;*/

        //-----------------<<<<<<<<<<<0>>>>>>>>>----------------

        //SEGUNDA FORMA DE HACERLO sin usar replace

        String cadenaVacia = "";
        String con = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
        String sin = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
        int contador = 0;
        int i, j;

        for (i = 0; i < cadena.length(); i++)
        {
            contador = 0;
            for (j = 0; j < con.length(); j++)
            {
                if (cadena.charAt(i) == con.charAt(j))
                {
                    cadenaVacia = cadenaVacia + sin.charAt(j);
                    contador++;
                }
            }
            if (contador == 0)
            {
                cadenaVacia = cadenaVacia + cadena.charAt(i);
            }
        }
        return cadenaVacia;
    }

    public static String InvierteCadena(String cadena)
    {
        String copia = cadena;
        String c2 = "";
        int i;

        for (i = copia.length() - 1; i >= 0; i--)
        {
            c2 = c2 + copia.charAt(i);
        }
        return c2;
    }

    public static int VecesCaracter(String cadena, char caracter)
    {
        int repite = 0;
        String copia = cadena;
        int i;

        //Quitamos los acentos y pasamos los caracteres a minúscula para evitar esas pegas
        copia = copia.toLowerCase();
        copia = QuitaAcentos(copia);

        //Ahora recorremos la cadena para contar las veces que se repite el caracter indicado
        for (i = 0; i < copia.length(); i++)
        {
            if (copia.charAt(i) == caracter)
            {
                repite++;
            }
        }
        return repite;
    }

    public static void EscribeArrayCadena(String[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length - 1] + "]");
    }

    public static void EscribeArrayCaracteres(char[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
        }
        System.out.print("]");
    }

    public static int VecesPalabra(String cadena, String palabra)
    {
        String copia = cadena;
        int veces = 0;
        int i;

        //Pasamos a minúsculas la cadena copiada
        copia = copia.toLowerCase();

        //Split sobre copia para separar las palabras
        String[] array = copia.split(" ");

        //Bucle for para buscar y contar las palabras en el array creado
        for (i = 0; i < array.length; i++)
        {
            if (array[i].equals(palabra))
            {
                veces++;
            }
        }
        return veces;
    }

    public static String MayusculasPrimera(String cadena)
    {
        String copia = cadena;
        int i;

        char[] caracteres = copia.toCharArray();

        caracteres[0] = Character.toUpperCase(caracteres[0]);

        for (i = 0; i < copia.length() - 2; i++)
        {
            if (caracteres[i] == ' ' || caracteres[i] == ',' ||
                    caracteres[i] == '.' || caracteres[i] == ':' ||
                    caracteres[i] == ';')
            {
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
            }
        }
        return new String(caracteres);

        /*String copia = cadena;
        int i;

        //Pasamos a char de array
        char[] caracteres = copia.toCharArray();

        EscribeArrayCaracteres(caracteres);
        System.out.println(caracteres[2]);

        //Ponemos en mayuscula la primera letra de la primera palabra de la cadena
        caracteres[0] = Character.toUpperCase(caracteres[0]);

        //Bucle para buscar la primera letra de cada palabra y cambiarla a mayúscula

        //El -2 es para evitar una excepción
        for(i = 0; i < copia.length()-2;i++)
        {
            if(caracteres[i] == ' ' || caracteres[i] == '.' ||
                    caracteres[i] == ',' || caracteres[i] == ':' ||
                        caracteres[i] == ';')
            {
                //Reemplazamos
                caracteres[i+1] = Character.toUpperCase(caracteres[i+1]);
            }
        }
        return new String(caracteres);*/
    }

    public static String SustituyePalabra(String cadena, String palabra, String nuevaPalabra)
    {
        String copia = cadena;
        String[] array = copia.split(" ");
        int i, j;

        for (i = 0; i < array.length; i++)
        {
            if (array[i].equals(palabra))
            {
                array[i] = nuevaPalabra;
            }
        }

        //Convertimos el array en cadena
        StringBuilder sb = new StringBuilder();
        for (j = 0; j < array.length; j++)
        {
            sb = sb.append(array[j]);
        }

        String cA = sb.toString();
        cA = String.join(" ", array);
        return cA;
    }

    public static String InviertePalabras(String cadena)
    {
        String copia = cadena;
        String c2 = "";
        int i;

        //Creamos array de string y hacemos split por los espacios para obtener cada palabra a modo de elemento del array
        String[] palabrasFrase = copia.split(" ");

        for (i = 0; i < palabrasFrase.length; i++)
        {
            String palabraInvertida = InvierteCadena(palabrasFrase[i]);
            c2 += palabraInvertida + ' ';
        }
        return c2;
    }

    public static String InviertePalabrasCadena(String cadena)
    {
        String copia = cadena;
        String[] array = copia.split(" ");
        String[] a2 = new String[array.length];
        int i, j;

        j = 0;
        for (i = array.length - 1; i >= 0; i--)
        {
            a2[j] = array[i];
            j++;
        }

        copia = String.join(" ", a2);
        return copia;
    }

    public static String QuitaEspaciosSobrantes(String cadena)
    {
        String copia = cadena;
        int i;
        String c2 = "";


        for (i = 0; i < copia.length() - 1; i++)
        {
            if (!(copia.charAt(i) == ' ' && copia.charAt(i + 1) == ' '))
            {
                c2 = c2 + copia.charAt(i);
            }
        }
        c2 = c2 + copia.charAt(i);

        return c2;
    }

    public static String MarcaSubcadena(String cadena, String subcadena)
    {
        String copia = cadena;
        String resultado = "";
        int i;
        StringBuilder sb = new StringBuilder(copia);
        String cacho;

        for (i = 0; i < sb.length() - subcadena.length() + 1; i++)
        {
            cacho = sb.substring(i, i + subcadena.length());

            if (cacho.equals(subcadena))
            {
                sb.setCharAt(i, '*');  //Cambiamos caracter que se encuentra en i por un asterisco
            }
        }
        resultado = sb.toString();
        return resultado;
    }

    public static void escribeNombres(String c)
    {
        String[] arrayCadena = c.split(" ");
        int i;

<<<<<<< HEAD
        for(i = 0; i < arrayCadena.length-2; i = i+3)  //Recorremos array en iteraciones de 3 (saltos de 3)
        {
            System.out.print(arrayCadena[i + 2] + " ");  //Escribimos nombre + espacio
            System.out.print(arrayCadena[i] + " ");		 //Escribimos apellido1 + espacio	
            System.out.println(arrayCadena[i + 1]); //Escribimos apellido2 + salto de línea
=======
        for(i = 0; i < arrayCadena.length-2; i = i+3)  //Recorro el array en iteraciones de 3 saltos
        {
            System.out.print(arrayCadena[i + 2] + " ");  //Mostramos nombre + espacio
            System.out.print(arrayCadena[i] + " ");      //Mostramos apellido1 + espacio
            System.out.println(arrayCadena[i + 1]); //Mostramos apellido2 + salto de línea
>>>>>>> 7a22113492631682f0b5cbe5913acde94d0bc25e
        }
    }

    public static int[] CuentaLetras(String cadena)
    {
        int[] array = new int[5];
        int i;
        int contador = 0;
        String copia = cadena.toLowerCase();

        for (i = 0; i < copia.length(); i++)
        {
            if (copia.charAt(i) == 'a')
            {
                contador = array[0];
                contador++;
                array[0] = contador;
            }
            if (copia.charAt(i) == 'b')
            {
                contador = array[1];
                contador++;
                array[1] = contador;
            }
            if (copia.charAt(i) == 'c')
            {
                contador = array[2];
                contador++;
                array[2] = contador;
            }
            if (copia.charAt(i) == 'd')
            {
                contador = array[3];
                contador++;
                array[3] = contador;
            }
            if (copia.charAt(i) == 'e')
            {
                contador = array[4];
                contador++;
                array[4] = contador;
            }
        }
        return array;
    }

    public static String MayusculasMinusculas(String cadena, int numero)
    {
        String copia = "";

        switch (numero)
        {
            case 1:
            {
                copia = cadena.toLowerCase();
            }
            break;

            case 2:
            {
                copia = cadena.toUpperCase();
            }
            break;

            case 3:
            {
                String sinSaltosLinea = cadena.replace("\n", " ");
                String[] array = sinSaltosLinea.split(" ");
                int i;
                String cadeAuxiliar = "";
                String c2 = "";
                int contador = 0;

                for (i = 0; i < array.length; i++)
                {
                    cadeAuxiliar = array[i];

                    c2 = cadeAuxiliar.toUpperCase().substring(0, 1) + cadeAuxiliar.toLowerCase().substring(1);
                    array[i] = c2;

                }

                copia = copia.join(" ", array);

                char letra;

                StringBuilder sb = new StringBuilder(copia);

                for (int k = 0; k < sb.length(); k++)
                {
                    if (sb.charAt(k) == '.')
                    {
                        letra = '\n';
                        sb.setCharAt(k + 1, letra);
                    }
                }
                copia = sb.toString();
            }
            break;

            case 4:
            {

                String nuevaC = cadena.toLowerCase();
                int i;
                boolean punto = true;
                String cadenadevuelta = "";


                for (i = 0; i < nuevaC.length(); i++)
                {
                    if (nuevaC.charAt(i) == '.')
                    {
                        cadenadevuelta = cadenadevuelta + nuevaC.charAt(i);
                        punto = true;
                    } else
                    {
                        if (punto == true && Character.isLetter(nuevaC.charAt(i)))
                        {
                            cadenadevuelta = cadenadevuelta + nuevaC.toUpperCase().charAt(i);
                            punto = false;
                        } else
                        {
                            cadenadevuelta = cadenadevuelta + nuevaC.charAt(i);
                        }
                    }
                }


                copia = cadenadevuelta;

            }
            break;

        }
        return copia;
    }

    public static String EliminaTag(String cadena)
    {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        String caD = "";
        int i;

        for (i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i) == '<')
            {
                while (cadena.charAt(i) != '>')
                {
                    i++;
                }
            } else
            {
                caD = caD + cadena.charAt(i);
            }
        }

        return caD;


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

       /* int i;
        String copia = cadena;
        int posInicio = -1, posFinal = -1;
        char limpia;
        int guardaPosfinal = 0;

        String total = "";
        for(i = 0; i < copia.length(); i++)
        {
            if(copia.charAt(i) == '<')
            {
                posInicio = i;
            }
            if(copia.charAt(i) == '>')
            {
                posFinal = i;
                guardaPosfinal = posFinal;
            }

            //"<p>Esto es texto normal <b>y esto es texto en negrita</b>.</p>";
            if(posFinal != -1 && posFinal != guardaPosfinal)
            {
                for(int j = posFinal; j < copia.length(); j++)
                {
                    if(copia.charAt(i) == '<')
                    {
                        posInicio = i;
                    }
                }
            }
        }
        copia = total;

        return copia;*/
    }

    public static String OrdenaPalabrasComa(String cadena)
    {
        String[] a = cadena.split(",");
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        int i;

        for (i = 0; i < a.length; i++)
        {
            sb = sb.append(a[i]);
        }
        String resultado = sb.toString();
        resultado = String.join(",", a);
        return resultado;
    }

    public static String AcentosHTML(String cadena)
    {
        int i, j;
        StringBuilder sb = new StringBuilder(cadena);
        String conversion;  //String que contiene la correspondencia en código HTML
        //Cadena de signos
        String cadenasigno = "<>&\"áÁéÉíÍóÓúÚñÑüÜ";

        //array con los caracteres HTML
        String[] mnemo = {"&lt;", "&gt;", "&amp;", "&quot;", "&aacute;", "&Aacute;", "&aecute;", "&Eacute;", "&iacute;", "&Iacute;", "&oacute;", "&Oacute;", "&uacute;", "&Uacute;"
                , "&ntilde;", "&Ntilde;", "&uuml;", "&Uuml;"};


        for (i = 0; i < sb.length(); i++)
        {
            for (j = 0; j < cadenasigno.length(); j++)
            {
                if (sb.charAt(i) == cadenasigno.charAt(j))
                {
                    sb.delete(i, i + 1);
                    sb.insert(i, mnemo[j]);
                }
            }
        }
        return new String(sb);
    }

    public static String[] PalabrasMismaLetra(String cadena)
    {
        String[] array = cadena.split(" ");
        String[] mismaLetra = new String[array.length];
        String[] resultado;
        String elemento;
        int i, j, k;


        k = 0;
        for (i = 0; i < array.length; i++)
        {
            elemento = array[i];

            if (elemento.charAt(0) == elemento.charAt(elemento.length() - 1))
            {
                mismaLetra[k] = array[i];
                k++;
            }
        }

        resultado = new String[k];
        for (i = 0; i < resultado.length; i++)
        {
            resultado[i] = mismaLetra[i];
        }

        return resultado;
    }

    public static String NumeroTexto9(int n)
    {
        //PRIMERA FORMA... con un SWITCH
        
        /*String texto = "";

        switch (n)
        {
            case 0: texto = "cero";break;
            case 1: texto = "uno";break;
            case 2: texto = "dos";break;
            case 3: texto = "tres";break;
            case 4: texto = "cuatro";break;
            case 5: texto = "cinco";break;
            case 6: texto = "seis";break;
            case 7: texto = "siete";break;
            case 8: texto = "ocho";break;
            case 9: texto = "nueve";break;
            default:break;
        }
        return texto;*/
        
        //----------------------->>>>>>>>>>>>>>>>>>>>>>0<<<<<<<<<<<<<<<<<<---------------------
        
        //SEGUNDA FORMA... con un ARRAY DE STRING
        
        String[] arrayNumeros = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String devolvemos = "";
        int i;

        //Recorremos numeros (char[]) para comparlo con arrayNumeros (String[]) con la condición del nº entero
        //que pasamos por parámetro

        return arrayNumeros[n];
    }

    public static String NumeroTexto99(int n)
    {
        String texto = "";
        int decena = n / 10;
        int unidad = n % 10;

        switch (decena)
        {
            case 0:
                texto = NumeroTexto9(unidad);
                break;

            case 1:
                switch (n)
                {
                    case 10:texto = "diez";break;
                    case 11:texto = "once";break;
                    case 12:texto = "doce";break;
                    case 13:texto = "trece";break;
                    case 14:texto = "catorce";break;
                    case 15:texto = "quince";break;
                    case 16:texto = "dieci" + NumeroTexto9(n);break;
                    case 17:texto = "dieci" + NumeroTexto9(n);break;
                    case 18:texto = "dieci" + NumeroTexto9(n);break;
                    case 19:texto = "dieci" + NumeroTexto9(n);break;
                    default:break;
                }

            case 2:
                switch (unidad)
                {
                    case 0:texto = "veinte ";break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        texto = "veinti" + NumeroTexto9(unidad);
                        break;
                }
                break;

            case 3:
                switch (unidad)
                {
                    case 0: texto = "treinta";break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        texto = "treinta y " + NumeroTexto9(unidad);
                        break;
                }
                break;

            case 4:
                switch (unidad)
                {
                    case 0: texto = "cuarenta";break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        texto = "cuarenta y " + NumeroTexto9(unidad);
                        break;
                }
                break;

            case 5:
                switch (unidad)
                {
                    case 0: texto = "cincuenta";break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        texto = "cincuenta y " + NumeroTexto9(unidad);
                        break;
                }
                break;

            case 6:
                switch (unidad)
                {
                    case 0: texto = "sesenta";break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        texto = "sesenta y " + NumeroTexto9(unidad);
                        break;
                }
                break;

            case 7:
                switch (unidad)
                {
                    case 0: texto = "setenta";break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        texto = "setenta y " + NumeroTexto9(unidad);
                        break;
                }
                break;

            case 8:
                switch (unidad)
                {
                    case 0: texto = "ochenta";break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        texto = "ochenta y " + NumeroTexto9(unidad);
                        break;
                }
                break;

            case 9:
                switch (unidad)
                {
                    case 0: texto = "noventa";break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        texto = "noventa y " + NumeroTexto9(unidad);
                        break;
                }
                break;
            default:break;
        }
        return texto;
    }

    public static String PrimeraLetraMayusculasFrase(String cadena)
    {
        char[] caracteres = cadena.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        return new String(caracteres);
    }

    public static String EliminaUltimaPalbra(String cadena)
    {
        String copia = cadena;
        int i;
        int ultimoEspacio = copia.lastIndexOf(' ');
        String substraemos = copia.substring(0, 15);
        return substraemos;
    }

    public static int CuantasVecesSubcadenaSubstring(String cadena, String subcadena)
    {
        // Texto
        String sTexto = cadena;
        // Texto que vamos a buscar
        //String sTextoBuscado = "palabra";
        // Contador de ocurrencias
        int contador = 0;

        while (sTexto.indexOf(subcadena) > -1)
        {
            sTexto = sTexto.substring(sTexto.indexOf(
                    subcadena) + subcadena.length(), sTexto.length());
            contador++;
        }

        return contador;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("============");
        System.out.println("MENÚ CADENAS");
        System.out.println("============");
        System.out.println("[1] NumeroEspacios");
        System.out.println("[2] NumeroVocales");
        System.out.println("[3] EsPalindromo");
        System.out.println("[4] Contiene");
        System.out.println("[5] RepiteCaracter");
        System.out.println("[6] Dos funciones (PadLeft || PadRight)");
        System.out.println("[7] QuitaEspacios");
        System.out.println("[8] QuitaEspaciosTrim");
        System.out.println("[9] SustituyeCaracter");
        System.out.println("[10] CuentaPalabras");    //**Comprobar si funciona con otros caracteres (*Ver el Main)
        System.out.println("[11] EsNumero");
        System.out.println("[12] QuitaCaracter");
        System.out.println("[13] QuitaAcentos");
        System.out.println("[14] InvierteCadena");
        System.out.println("[15] VecesCaracter");
        System.out.println("[16] VecesPalabra");
        System.out.println("[17] MayusculasPrimera");
        System.out.println("[18] SustituyePalabra");
        System.out.println("[19] InviertePalabras");
        System.out.println("[20] QuitaEspaciosSobrantes");
        System.out.println("[21] MarcaSubcadena");
        System.out.println("[22] EscribeNombres");
        System.out.println("[23] CuentaLetras");
        System.out.println("[24] MayusculasMinusculas");
        System.out.println("[25] Tag");
        System.out.println("[26] OrdenaPalabrasComa");
        System.out.println("[27] AcentosHTML");
        System.out.println("[28] PalabrasMismaLetra");
        System.out.println("[29] NumeroEnTexto99");
        System.out.println("[100] InviertePalabrasCadena");
        System.out.println("[101] PrimeraLetraMayusculaFrase");
        System.out.println("[102] EliminaUltimaPalabra");
        System.out.println("[103] CuantasVecesSubcadenaSubstring");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                // Escribe la función “numeroEspacios” a la que le pasamos una cadena y nos devuelve el
                //número de espacios que contiene esa cadena (tanto al principio y al final como
                //intercalados).
                String s = "La casa de la abuela está cerrada desde hace tiempo";
                int espacios;

                System.out.println(s);
                System.out.println();
                espacios = NumeroEspacios(s);
                System.out.println("Espcios encontrados = " + espacios);
            }
            break;

            case 2:
            {
                //Escribe la función “numeroVocales” a la que le pasamos una cadena y nos devuelve el
                //número de vocales que hay en la cadena.

                String c = "Ei lo ves que no lo veraus...";
                int vocales;

                System.out.println(c);
                vocales = NumeroVocales(c);
                System.out.println("\nNumero vocales = " + vocales);
            }
            break;

            case 3:
            {
                //Escribe la función “esPalindromo” a la que le pasamos una cadena y nos dice si la cadena
                //es un palíndromo (true) o no (false). Un palíndromo es una palabra o frase que se lee
                //igual al revés que al derecho.

                String c = "Isaac no ronca asi";
                //String c = "Isaac nyo ronca aqsi";
                boolean palindromo;

                System.out.println(c);
                System.out.println();
                palindromo = EsPalindromo(c);
                System.out.println(palindromo);
            }
            break;

            case 4:
            {
                //Escribe  la  función  “contiene”  a  la  que  le  pasamos  una  cadena  y  un  carácter  por
                //parámetro y nos dice si el carácter aparece en la cadena o no. Es igual que la función
                //contains. Evidentemente, no podéis usar esta función para hacer la vuestra.

                boolean contiene;
                String cadena = "El aprobado no se le da a cualquiera";
                char c;

                System.out.println(cadena);
                System.out.print("\nEscribe el caracter que quieres buscar en la cadena: ");
                c = sc.next().charAt(0);
                contiene = Contiene(cadena, c);

                System.out.println("\nEl caracter " + c + " ¿está en la cadena? = " + contiene);


            }
            break;

            case 5:
            {
                //Escribe la función “repiteCaracter” a la que le pasamos dos parámetros: un carácter y
                //un entero. La función nos devolverá una cadena que contendrá el carácter repetido
                //tantas veces como indique el entero. Ej.: repiteCaracter(‘A’, 5) = “AAAAA”.

                String cadena;
                char c;
                int n;
                System.out.print("Escribe el caracter que quieres que se repita: ");
                c = sc.next().charAt(0);
                System.out.print("\nEscribe las veces que quieres que se repita: ");
                n = sc.nextInt();

                cadena = RepiteCaracter(c, n);
                System.out.println("\n" + cadena);

            }
            break;

            case 6:
            {
                // Escribe las funciones “padLeft” y “padRight” a las que le pasaremos una cadena y una
                //longitud  final.  Ambas  funciones  nos  añadirán  espacios  delante  (padLeft)  o  detrás
                //(padRight) de nuestra cadena hasta que el tamaño de nuestra cadena llega a la longitud
                //que le hemos pasado.

                System.out.println("=============");
                System.out.println("DOS FUNCIONES");
                System.out.println("=============");
                System.out.println("[1] PadLeft");
                System.out.println("[2] PadRight");
                System.out.println();
                System.out.print("Elige una opción: ");
                int op = sc.nextInt();

                switch (op)
                {
                    case 1:
                    {
                        //PadLeft

                        String copia;
                        System.out.println("Cadena original: ");
                        String cadena = "Aforo completo";
                        System.out.println(cadena);
                        System.out.println("\nLongitud de cadena original: " + cadena.length());
                        int longituFinal;
                        System.out.println("\nLongitud final que quieres para la cadena: ");
                        longituFinal = sc.nextInt();

                        copia = PadLeft(cadena, longituFinal);
                        System.out.println("<" + copia);
                    }
                    break;
                    case 2:
                    {
                        //PadRight

                        String copia;
                        System.out.println("Cadena original: ");
                        String cadena = "Aforo completo";
                        System.out.println(cadena);
                        System.out.println("\nLongitud de cadena original: " + cadena.length());
                        int longituFinal;
                        System.out.println("\nLongitud final que quieres para la cadena: ");
                        longituFinal = sc.nextInt();

                        copia = PadRight(cadena, longituFinal);
                        System.out.println(copia + ">");
                    }
                    break;
                }
            }
            break;

            case 7:
            {
                //Escribe la función “quitaEspacios” a la que le pasamos una cadena y nos devuelve la
                //misma cadena, pero con todos los espacios quitados (tanto los del principio como los
                //del final como los intermedios).

                String c = "<    Mira quien viene  por la calle Larga    >";
                String cadena = QuitaEspacios(c);
                System.out.println(cadena);
            }
            break;

            case 8:
            {
                // Escribe la función “quitaEspaciosTrim” a la que le pasamos una cadena y nos devuelve
                //otra cadena igual que la primera en la que se han eliminado los espacios que haya al
                //principio y al final. No se puede utilizar trim, obviamente.

                String copia;
                String cadena = "       Y si nos vemos después de almorzar   ...     ";

                System.out.println("<" + cadena + ">");

                copia = QuitaEspaciosTrim(cadena);
                System.out.println("<" + copia + ">");
            }
            break;

            case 9:
            {
                //Escribe la función “sustituyeCaracter” a la que le pasamos una cadena, un carácter y
                //otro carácter y nos devuelve otra cadena igual que la primera en la que se ha sustituido
                //el primer carácter por el segundo carácter. Ojo, en las cadenas, al contrario que en los
                //arrays, no podemos modificar directamente un valor al estilo de cadena[2] = ‘A’ (los
                //corchetes sólo sirven para leer el valor, no para modificarlo).

                String copia;
                String cadena = "El presidente de la empresa mas importante.";
                char viejo, nuevo;

                System.out.println("CADENA ORIGINAL:");
                System.out.println(cadena);
                System.out.print("\nEscribe qué caracter quieres cambiar: ");
                viejo = sc.next().charAt(0);
                System.out.print("\nEscribe el nuevo caracter: ");
                nuevo = sc.next().charAt(0);

                copia = SustituyeCaracter(cadena, viejo, nuevo);
                System.out.println("CADENA NUEVA:");
                System.out.println(copia);
            }
            break;

            case 10:
            {
                //Escribe la función “cuentaPalabras” a la que le pasamos una cadena que contiene una
                //frase y nos devuelve el número de palabras que hay en la misma.

                /*String cadena = "Todo es cuestion de tiempo ,: ;   / ";*/
                String cadena = "Todo es cuestion de tiempo";
                int palabras;

                System.out.println("CADENA ORIGINAL: ");
                System.out.println(cadena);
                palabras = CuentaPalabras(cadena);

                System.out.println("Cantidad de palabras " + palabras);

            }
            break;

            case 11:
            {
                // Escribe  la  función  “esNumero”,  a  la  que  le  pasamos  una  cadena  y  nos  dice  si  está
                //formada  enteramente  por  números  o  no.  Esta  función  es  muy  interesante  para
                //evitarnos errores a la hora de hacer un Scanner.nextInt(). Si queremos leer un número
                //del teclado, lo más correcto es leerlo con un Scanner.next() como si fuera una cadena,
                //después  comprobar  con  la  función  esNumero  si  está  formado  completamente  por
                //dígitos y después convertirlo a entero con, por ejemplo, un Integer.parseInt().

                boolean esDigito;
                String c = "";
                System.out.println("Escribe texto:");
                c = sc.next();

                esDigito = EsNumero(c);

                System.out.println(esDigito);

            }
            break;

            case 12:
            {
                // Escribe la función “quitaCaracter” a la que le pasamos una cadena y un carácter y nos
                //devuelve la cadena, pero con todas las ocurrencias de ese carácter quitadas.

                String cadena = "En el fondo de la taza quedan los restos de la sopa";
                char caracter = 'o';
                String copia;

                System.out.println("CADENA ORIGINAL:");
                System.out.println(cadena);

                copia = QuitaCaracter(cadena, caracter);
                System.out.println("CADENA MODIFICADA:");
                System.out.println(copia);

            }
            break;

            case 13:
            {
                //Escribe  la  función  “quitaAcentos”  a  la  que  le  pasas  una  cadena  con  caracteres
                //acentuados y te devuelve la cadena con los acentos quitados (esto se hace para algunos
                //programas que no se enteran de los acentos).

                String c = "A ese escalón más añejo le falta altura. Él no opinó lo mismo, cogió el camión y se largó.";
                String copia;

                System.out.println("CADENA ORIGINAL:");
                System.out.println(c);

                copia = QuitaAcentos(c);
                System.out.println("CADENA MODIFICADA:");
                System.out.println(copia);
            }
            break;

            case 14:
            {
                //Escribe la función “invierteCadena” a la que le pasamos una cadena y nos la devuelve
                //invertida (de detrás para delante, vamos).

                String c = "Hola Don Pepito hola Don José";
                String copia;

                System.out.println(c);
                copia = InvierteCadena(c);
                System.out.println(copia);
            }
            break;

            case 15:
            {
                //Escribe la función “vecesCaracter” a la que le pasamos una cadena y un carácter y nos
                //dice cuántas veces se repite ese carácter.

                String c = "No hay pasión más ilusa y fanática que el odio. George Gordon";
                char caracter = 'o';
                int repite;

                System.out.println(c);
                System.out.print("\nCaracter que vamos a contar = " + caracter);
                repite = VecesCaracter(c, caracter);
                System.out.println("\nEl caracter se repite " + repite + " veces.");
            }
            break;

            case 16:
            {
                // Escribe la función “vecesPalabra” a la que le pasamos una cadena y una palabra (otra
                //cadena) y nos dice cuántas veces se repite esa palabra en la cadena.

                String cadena = "Se necesitan dos años para aprender a hablar, y sesenta para aprender a callar";
                String palabra = "aprender";
                int contador;

                System.out.println(cadena);
                System.out.print("\nPalabra que vamos a buscar = " + palabra);
                contador = VecesPalabra(cadena, palabra);
                System.out.println("\n¿Cuánto se repite? = " + contador);

            }
            break;

            case 17:
            {
                // Escribe la función “mayusculasPrimera” a la que le pasas una cadena y te devuelve la
                //cadena con la primera letra de cada palabra puesta en mayúsculas.

                String cadena = "Pide y recibirás, busca y encontrarás; llama y se te abrirán las puertas";
                System.out.println(cadena);

                String copia = MayusculasPrimera(cadena);
                System.out.println(copia);

            }
            break;

            case 18:
            {
                //Escribe la función “sustituyePalabra” a la que le pasamos una cadena y dos palabras y
                //nos devuelve otra cadena en la que haya que sustituir la primera por la segunda.

                String cadena = "El perro de San Roque no tiene rabo";
                String palabra = "perro";
                String nuevaPalabra = "loro";
                String copia;

                System.out.println("CADENA ORIGINAL:");
                System.out.println(cadena);
                copia = SustituyePalabra(cadena, palabra, nuevaPalabra);
                System.out.println("\n" + "CADENA MODIFICADA:");
                System.out.println(copia);
            }
            break;

            case 19:
            {
                // Escribe una función “inviertePalabras” a la que la pasamos una cadena y nos devuelve
                //otra en la que están invertidas todas las palabras (no la cadena entera, sino cada palabra
                //independientemente).

                String cadena = "Una panadería nueva en la zona";
                String copia;

                copia = InviertePalabras(cadena);
                System.out.println(copia);
            }
            break;

            case 20:
            {
                //Escribe la función “quitaEspaciosSobrantes” a la que le pasamos una cadena por
                //parámetro y nos devuelve otra. La cadena que le pasamos podrá tener espacios
                //delante y detrás, además de espacios entre las palabras. Para obtener la cadena
                //resultado, tendremos que quitar los espacios de delante y de detrás y si entre dos
                //palabras hay más de un espacio, deberemos dejar sólo uno.
                //Ej.: “~~~Mi~~mamá~~~~me~mima~~” -> “Mi~mamá~me~mima” (~ = espacio)

                String cadena = "<" + "     El     gato  se como    toda la comida    " + ">  ";
                String copia;

                copia = QuitaEspaciosSobrantes(cadena);
                System.out.println(copia);
            }
            break;

            case 21:
            {
                // Escribe una función marcaSubCadena a la que le pasamos dos cadenas y nos busca la
                //segunda cadena dentro de la primera. Nos devolverá otra cadena igual que la primera,
                //pero en la que se cambiará la primera letra de cada vez que aparece la subcadena por
                //un asterisco.

                String cadena = "mi mamá me mima";
                String subcadena = "ma";
                String copia;

                System.out.println(cadena);
                copia = MarcaSubcadena(cadena, subcadena);
                System.out.println(copia);

            }
            break;

            case 22:
            {
                // Escribe la función escribeNombres a la que le pasamos una cadena por parámetro
                //y nos la escribe  por la pantalla (con  println) con el siguiente formato:  la cadena
                //contendrá  varias  palabras  separadas  por  espacios,  con  el  siguiente  formato:
                //“apellido1  apellido2  nombre  apellido1  apellido2  nombre  (…)”  y  deberemos
                //escribirla por pantalla de la siguiente forma:
                //nombre apellido1 apellido2
                //nombre apellido1 apellido2
                //(…)

                String cadena = "apellido1 apellido2 nombre apellido1 apellido2 nombre";
                EscribeNombres(cadena);

            }
            break;

            case 23:
            {
                //Escribe la función cuentaLetras a la que le pasas una cadena por parámetro y te
                //devuelve un array de  enteros. El tamaño del array será 5 y el contenido será el
                //número de veces que aparecen las letras “a”, “b”, “c”, “d” y “e”, respectivamente,
                //en la cadena que le hemos pasado (independientemente de si son mayúsculas o
                //minúsculas).
                //Ej.: cadena = “patata camaleón batata”, resultado: [8, 1, 1, 0, 1]
                //Versión  Pro:  La  función  devolverá  un  array  de  enteros  con  26  posiciones
                //correspondientes  a  las  26  letras  del  abecedario.  No  uséis  un  switch  (ni  26  ifs).
                //Perdón, 27, se me olvidaba la eñe.

                String cadena = "Patata camAleón batata";
                int[] a;

                System.out.println(cadena);
                a = CuentaLetras(cadena);
                System.out.println(Arrays.toString(a));
            }
            break;

            case 24:
            {
                //Escribe la función mayusculasMinusculas que recibirá dos parámetros: una cadena
                //(que podrá contener saltos de línea) y un número entre 1 y 4. Dependiendo del
                //número que le pasemos, la función nos devolverá otra cadena con las siguientes
                //características:
                //•  1 = Todas las letras en minúsculas.
                //•  2 = Todas las letras en mayúsculas.
                //•  3 = La primera letra de cada palabra en mayúsculas y el resto en minúsculas.
                //•  4 = La primera letra de cada frase en mayúsculas y el resto en minúsculas.
                //Escribir  también  un  pequeño  menú  en  el  programa  principal  para  probar  las
                //diferentes opciones.

                String cadena = "de vez en CUAndo se toma una copa de helado.\nsiempre llueve cuando VIAjamos a Barcelona";
                int n;
                System.out.println(cadena);

                System.out.println("============================");
                System.out.println("SUBMENÚ MayusculasMinusculas");
                System.out.println("============================");
                System.out.println("[1] Todas las letras en minúsculas.");
                System.out.println("[2] Todas las letras en mayúsculas.");
                System.out.println("[3] La primera letra de cada palabra en mayúsculas y el resto en minúsculas");
                System.out.println("[4] La primera letra de cada frase en mayúsculas y el resto en minúsculas.");
                System.out.println();
                System.out.print("Elige una opción: ");
                n = sc.nextInt();

                String devolmemos = MayusculasMinusculas(cadena, n);
                System.out.println(devolmemos);

            }
            break;

            case 25:
            {
                // Escribe la función eliminaTags a la que le pasamos una cadena que contiene tags
                //(como los de XML) y los elimina dejando sólo el texto (nos devuelve una cadena con
                //el resultado).
                //Ej.: <p>Esto es texto normal <b>y esto es texto en negrita</b>.</p>
                //Nos devolvería: Esto es texto normal y esto es texto en negrita.

                String cadena = "<p>Esto es texto normal <b>y esto es texto en negrita</b>.</p>";
                String copia;

                copia = EliminaTag(cadena);
                System.out.println(copia);

            }
            break;

            case 26:
            {
                // Escribe  la  función  ordenaPalabrasComas  a  la  que  le  pasamos  una  cadena  que
                //contiene varias palabras separadas por comas y nos devuelve otra cadena con las
                //mismas palabras separadas por comas, pero ordenadas en orden alfabético.
                //Ej.: “hola,don,pepito,pasó,usted,ya,por,casa”
                //Devolvería: “casa,don,hola,pasó,pepito,por,usted,ya”

                String cadena = "hola,don,pepito,pasó,usted,ya,por,casa";
                String ordenada;

                System.out.println(cadena);
                ordenada = OrdenaPalabrasComa(cadena);
                System.out.println(ordenada);
            }
            break;

            case 27:
            {
                //Escribe la función acentosHTML que te sustituye los caracteres acentuados que le
                //paséis  por  el  código  HTML  correspondiente.  La  función  recibirá  una  cadena  por
                //parámetro y nos devolverá otra cadena con el resultado. Aquí tenéis una tabla con
                //las equivalencias:
                //
                //signo  mnemo
                //
                //  signo     mnemo         signo   mnemo
                //  <         &lt;          Í       &Iacute;
                //  >         &gt;          ó       &oacute;
                //  &         &amp;         Ó       &Oacute;
                //  "         &quot;        ú       &uacute;
                //  á         &aacute;      Ú       &Uacute;
                //  Á         &Aacute;      ñ       &ntilde;
                //  é         &aecute;      Ñ       &Ntilde;
                //  É         &Eacute;      ü       &uuml;
                //  í         &iacute;      Ü       &Uuml;


                String cadena = "Camión árbol método <b> Ínca y murciélago ú Ü";
                String copia;

                System.out.println(cadena);
                copia = AcentosHTML(cadena);
                System.out.println(copia);

            }
            break;

            case 28:
            {
                //Escribe  la  función  palabrasMismaLetra  a  la  que  le  pasamos  una  cadena  y  nos
                //devolverá un array de cadenas que contendrá las palabras que empiezan y acaban
                //por la misma letra. A la hora de contar las palabras, habrá que ignorar los símbolos
                //de puntuación y las mayúsculas y minúsculas.
                //Ej.: “Amanda tiene tres serpientes.” devolvería {amanda, serpientes}

                String cadena = "Lora abana abeja adoba oro oso bicicleta barco";
                String[] array;

                System.out.println(cadena);
                array = PalabrasMismaLetra(cadena);
                EscribeArrayCadena(array);
            }
            break;

            case 29:
            {
                // Escribe una función numeroTexto99 a la que le pasamos un entero y nos devuelve
                //una cadena con ese número puesto como texto (p.ej.: 76 = “setenta y seis”).
                //-  El número deberá estar comprendido entre 0 y 99. En caso contrario, devuelve
                //una cadena vacía.
                //-  Se recomienda escribir la función NumeroTexto9 que hace lo mismo, pero sólo
                //con números de 1 cifra, y usarla para simplificar esta función.
                //-  Si me ponéis un switch de 100 elementos os echo de clase directamente.
                //-  Si no sabéis como se escriben los números del uno al noventa y nueve, os mando
                //de vuelta a la ESO.
                //-  OPCIONAL: Escribir la función NumeroTexto999.

                //-------<<<<<<<<<<<0>>>>>>>>>>-----------
                //LLAMA A LA FUNCIÓN NumeroTexto9
                /*int n = 9;
                String texto;
                cadena = NumeroTexto9(n);
                System.out.println(texto);*/
                //-------<<<<<<<<<<0>>>>>>>>>---------------

                int n;
                String texto;

                System.out.print("Escribe un número del 0 al 99: ");
                n = sc.nextInt();

                System.out.println("Numero = " + n);
                texto = NumeroTexto99(n);
                System.out.println(texto);

            }
            break;


            case 100:
            {
                //A diferencia de la función anterior, esta nos muestra una cadena con el orden de palabras invertido,
                //de detrás hacia delante.

                String cadena = "Una panadería nueva en la zona";
                String copia;

                copia = InviertePalabras(cadena);
                System.out.println(copia);
            }
            break;

            case 101:
            {
                //Función que devuelve cadena con primera letra en mayúscula
                String cadena = "el coche más caro del mundo";
                System.out.println(cadena);
                String copia = PrimeraLetraMayusculasFrase(cadena);
                System.out.println(copia);
            }
            break;

            case 102:
            {
                //Elimina última palabra de una frase (usaremos indexOf)
                String cadena = "El trayecto más largo";
                String copia;
                copia = EliminaUltimaPalbra(cadena);
                System.out.println(copia);
            }
            break;

            case 103:
            {
                //Dada una cadena cad, y una subcadena car, verificar cuántas veces se repite la subcadena car en la cadena cad, por ejemplo:
                //String cad = "El caramelo de menta se pegó en la carretera"; --> "car"(caramelo) || "car"(carretera)
                //La subcadena car aparece 2 veces.
                //USAREMOS substring

                String cad = "El caramelo de menta se pegó en la carretera, y Carmelo no se come el melon";
                String subcadena = "melo";
                int veces;

                System.out.println(cad);
                System.out.println("Subcadena que buscamos:");
                veces = CuantasVecesSubcadenaSubstring(cad, subcadena);
                System.out.println("Veces encontradas = " + veces);

            }
            break;
        }
    }

}


