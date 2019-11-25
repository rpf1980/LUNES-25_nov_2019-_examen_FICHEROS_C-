using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace EjerInicialesFileFileInfo
{
    class Program
    {
        static void CopiaContenidoFicherosTexto(string nombreFichCopia)
        {
            // PRIMERA PARTE:

            // Objeto que referencia el directorio donde queremos trabajar
            DirectoryInfo di = new DirectoryInfo(".");

            // Guardamos en un array todos los ficheros encontrados en di
            FileInfo[] fichArray = di.GetFiles();

            // Lista que almacenará nombres de ficheros
            List<string> listaFicherosTexto = new List<string>();

            // Recorremos el array de ficheros 
            foreach (FileInfo item in fichArray)
            {
                //Si el fichero es un .txt entramos...
                if (item.Name.Contains(".txt"))
                {
                    //... y lo vamos guardando el la lista
                    listaFicherosTexto.Add(item.Name);
                }
            }

            // SEGUNDA PARTE:

            int indice = 1; //Contador que usaré para ir dando un número de orden a los ficheros encontrados

            // Preparamos la lectura y escritura de los ficheros
            string linea;
            StreamReader sr = null;
            StreamWriter sw = new StreamWriter(nombreFichCopia);
            for (int i = 0; i < listaFicherosTexto.Count; i++)
            {
                try
                {
                    sr = new StreamReader(listaFicherosTexto[i]);
                    while (!sr.EndOfStream)
                    {
                        linea = sr.ReadLine();
                        sw.WriteLine(linea);
                    }
                }
                catch (IOException ex)
                {
                    Console.WriteLine(ex.Message);
                }
                // Mostramos por pantalla ( esto es opcinal ) los ficheros encontrados
                Console.WriteLine("Fichero encontrado nº " + indice + ": " + listaFicherosTexto[i]);
                indice++;
            }
            sr.Close();
            sw.Close();
        }

        static void ListaFicherosYdirectorios()
        {
            string[] arrayDirectorios = Directory.GetDirectories(".");
            string[] arrayFicheros = Directory.GetFiles(".");

            for (int i = 0; i < arrayDirectorios.Length; i++)
            {
                Console.WriteLine(arrayDirectorios[i]);
            }

            for (int i = 0; i < arrayFicheros.Length; i++)
            {
                Console.WriteLine(arrayFicheros[i]);
            }
        }

        static void MuestraInfoFicherosTipoExtension(string tipoExtension)
        {
            string[] arrayFicheros = Directory.GetFiles(".");

            foreach(string item in arrayFicheros)
            {
                if(Path.GetExtension(item).Equals(tipoExtension))
                {
                    Console.WriteLine(item);
                }                
            }
        }

        static void DirInfoLastAccesTime(string nombreDir)
        {
            string lastTime = "";

            //Comprobamos que el directorio exista
            if (Directory.Exists(nombreDir))
            {
                //Guardamos los posibles ficheros que contenga
                string[] fichArray = Directory.GetFiles(nombreDir);

                //Comprobamos que tenga ficheros

                FileInfo file;
                if (fichArray.Length > 0)
                {
                    foreach(string item in fichArray)
                    {
                        file = new FileInfo(item);
                        Console.WriteLine(file.LastAccessTime);
                    }                                       
                }
                else
                {
                    Console.WriteLine("El directorio no contiene ficheros");
                }
            }
            else
            {
                Console.WriteLine("El directorio no existe");
            }
        }

        static void DirInfoExtension()
        {
            Console.WriteLine("Escribe nombre del directorio: ");
            string nombreDir = Console.ReadLine();
            string nomExtension = "";

            if (Directory.Exists(nombreDir))
            {
                string[] fichArray = Directory.GetFiles(nombreDir);

                if(fichArray.Length > 0)
                {
                    Console.WriteLine("Escribe extensión de ficheros a buscar: ");
                    nomExtension = Console.ReadLine();

                    foreach(string i in fichArray)
                    {
                        if(Path.GetExtension(i).Equals(nomExtension))
                        {
                            Console.WriteLine(i);
                        }
                    }
                }
                else
                {
                    Console.WriteLine("El directorio no contiene ficheros");
                }
            }
            else
            {
                Console.WriteLine("El directorio no existe");
            }
        }

        static void DirSubDirCopy(string dirOrigen, string dirDestino, string extension)
        {          
            if (Directory.Exists(dirOrigen))
            {
                Directory.CreateDirectory(dirOrigen + "\\" + dirDestino);
            }

            string[] fichArray = Directory.GetFiles(dirOrigen);

            foreach (string file in fichArray)
            {
                FileInfo fi = new FileInfo(file);

                if (Path.GetExtension(file).Equals(extension))
                {
                    File.Copy(file, dirOrigen + "\\" + dirDestino + "\\" + fi.Name, true);
                }
            }
        }

        static void BorraDirectorioActual(string extension, string respuesta)
        {
            //Array con todos los ficheros de directorio actual
            string[] fichArray = Directory.GetFiles(".");

            //String con la respuesta del usuario
            respuesta = respuesta.ToLower();

            // Si el directorio tiene contenido

            if(fichArray.Length > 0)
            {
                //Mostramos los ficheros de directorio
                foreach(string i in fichArray)
                {
                    Console.WriteLine(i);
                }

                foreach(string i in fichArray)
                {
                    if(Path.GetExtension(i).Equals(extension) && respuesta.Equals("si"))
                    {
                        File.Delete(i);
                    }                    
                }

                foreach(string i in fichArray)
                {
                    Console.WriteLine(i);
                }
                
            }
            else
            {
                Console.WriteLine("El fichero no tiene contenido.");
            }
               
        }

        static void CambiaExtension(string nombreFichero, string nombreExtension)
        {
            string strNameSinExtension = Path.GetFileNameWithoutExtension(nombreFichero);

            File.Move(nombreFichero, strNameSinExtension + nombreExtension);
        }

        static void Main(string[] args)
        {
            int opcion = -1;
            while (opcion != 0)
            {
                Console.WriteLine("================================");
                Console.WriteLine("MENÚ DE EJERCICIOS FILE FILEINFO");
                Console.WriteLine("================================");
                Console.WriteLine("[1] CopiaContenidoFicherosTexto");
                Console.WriteLine("[2] ListaFicherosYdirectorios");
                Console.WriteLine("[3] MuestraInfoFicherosTipoExtension");
                Console.WriteLine("[4] DirInfoLastAccesTime");
                Console.WriteLine("[5] DirInfoExtension");
                Console.WriteLine("[6] DirSubDirCopy");
                Console.WriteLine("[7] BorraDirectorioActual");
                Console.WriteLine("[8] CambiaExtension");
                Console.WriteLine("[0] SALIR");
                Console.WriteLine();
                opcion = int.Parse(Console.ReadLine());

                switch (opcion)
                {
                    case 1:
                        {
                            //Crea un programa que cree un fichero de texto a partir del contenido de todos los
                            //ficheros de texto existentes en la carpeta actual.

                            Console.Write("Escribe nombre para el fichero de copia: ");
                            string fichCopia = Console.ReadLine();
                            CopiaContenidoFicherosTexto(fichCopia);
                        }
                        break;
                    case 2:
                        {
                            //Crea un programa que permita "pasear" por la carpeta actual, al estilo del antiguo
                            //"Comandante Norton": mostrará la lista de ficheros y subdirectorios de la carpeta
                            //actual.

                            ListaFicherosYdirectorios();

                        }
                        break;
                    case 3:
                        {
                            //Mejora el ejercicio anterior, para que se pueda seleccionar el tipo de ficheros que
                            //queremos visualizar.Se le solicitará al usuario una extensión, y recorreremos la
                            //carpeta   actual,   mostrando la   información únicamente   de los   ficheros cuya
                            //extensión coincida con la introducida por el usuario.

                            Console.Write("Escriba extensión de fichero: ");
                            string extension = Console.ReadLine();

                            MuestraInfoFicherosTipoExtension(extension);
                        }
                        break;
                    case 4:
                        {
                            //Realiza un programa, que solicita al usuario introducir el nombre de un directorio. 
                            //Dicho programa comprobará si el directorio existe, si no fuese así, informará del
                            //error.En caso de que exista, comprobaremos si tiene ficheros dentro, si no fuese
                            //así, también se informará al usuario de este hecho.Si tuviese ficheros, debemos
                            //mostrar el fichero al que se ha accedido más recientemente.

                            Console.Write("Escribe nombre del directorio: ");
                            string nombreDir = Console.ReadLine();

                            DirInfoLastAccesTime(nombreDir);

                        }
                        break;
                    case 5:
                        {
                            //Realiza un programa, que solicita al usuario introducir el nombre de un directorio. 
                            //Dicho programa comprobará si el directorio existe, si no fuese así, informará del
                            //error.En caso de que exista, comprobaremos si tiene ficheros dentro, si no fuese
                            //así, también   se informará   al usuario   de este   hecho.Si tuviese   ficheros, 
                            //solicitaremos al usuario una extensión de fichero, y mostraremos por pantalla sólo
                            //los ficheros que tengan dicha extensión.

                            DirInfoExtension();
                      
                        }
                        break;
                    case 6:
                        {
                            //Crea un   programa que   solicite al   usuario el   nombre de   un directorio.   Dicho
                            //programa comprobará si el directorio existe, si no fuese así, informará del error. En
                            //caso de que exista, pediremos al usuario que introduzca un nombre para crear un
                            //subdirectorio dentro de él, Una vez creado dicho subdirectorio, copiaremos en él
                            //todos los archivos que tengan la extensión igual que la que habremos solicitado al
                            //usuario previamente.

                            Console.WriteLine("Escribe directorio origen: ");
                            string dirOrigen = Console.ReadLine();
                            Console.WriteLine("Escribe directorio destino: ");
                            string dirDestino = Console.ReadLine();
                            Console.WriteLine("Escribe nombre de extensión de fichero: ");
                            string nombExten = Console.ReadLine();

                            DirSubDirCopy(dirOrigen, dirDestino, nombExten);
                        }
                        break;
                    case 7:
                        {
                            //Crea un programa que solicite al usuario una extensión de fichero.Una vez
                            //introducida, preguntaremos al usuario si desea borrar los ficheros del directorio
                            //actual, que mostraremos por pantalla, que tengan dicha extensión.Si la respuesta
                            //es afirmativa borraremos los ficheros, y mostraremos el resto de ficheros que
                            //hayan quedado en el directorio.

                            Console.WriteLine("Escribe extensión de fichero: ");
                            string extension = Console.ReadLine();
                            Console.WriteLine("Desea borrar los ficheros de directorio actual: ");
                            string respuesta = Console.ReadLine();

                            BorraDirectorioActual(extension, respuesta);

                        }
                        break;
                    case 8:
                        {
                            //Realiza un programa que haciendo uso de la clase Path, cambie la extensión a un
                            //fichero. Para ello tendrás que solicitar al usuario el nombre de un fichero, y la
                            //nueva extensión, haciendo una copia de dicho fichero con la nueva extensión, y
                            //posteriormente borrarás el fichero original.

                            Console.WriteLine("Nombre de fichero: ");
                            string nombreFichero = Console.ReadLine();
                            Console.WriteLine("Nueva extensión: ");
                            string nuevaExtension = Console.ReadLine();

                            CambiaExtension(nombreFichero, nuevaExtension);
                        }
                        break;
                    default: break;
                }
                Console.ReadKey();
            }
        }
    }
}


