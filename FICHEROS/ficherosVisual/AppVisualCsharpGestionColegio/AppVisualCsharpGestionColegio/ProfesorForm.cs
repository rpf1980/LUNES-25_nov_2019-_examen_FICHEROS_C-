using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Text.RegularExpressions;

namespace AppVisualCsharpGestionColegio
{
    public partial class ProfesorForm : Form
    {
        //Variables
        string dni = "";
        string nombre = "";
        string direccion = "";
        string telefono = "";
        string estudios = "";
        string nombreFichero = "Profesores.txt";

        public ProfesorForm()
        {
            InitializeComponent();
            
        }

        private void ProfesorForm_Load(object sender, EventArgs e)
        {

        }

        //Btn LIMPIAR
        private void idBtnLimpiarProfesor_Click(object sender, EventArgs e)
        {
            idTbDniProfesor.Text = "";
            idTbNombreProfesor.Text = "";
            idTbDireccionProfesor.Text = "";
            idTbTefefonoProfesor.Text = "";
            idTbEstudiosProfesor.Text = "";
        }

        // Métodos para validar DNI
        public bool DNIvalido(string dni)
        {
            string patron = "[A-HJ-NP-SUVW][0-9]{7}[0-9A-J]|\\d{8}[TRWAGMYFPDXBNJZSQVHLCKE]|[X]\\d{7}[TRWAGMYFPDXBNJZSQVHLCKE]|[X]\\d{8}[TRWAGMYFPDXBNJZSQVHLCKE]|[YZ]\\d{0,7}[TRWAGMYFPDXBNJZSQVHLCKE]";
            string sRemp = "";
            bool ret = false;
            System.Text.RegularExpressions.Regex rgx = new System.Text.RegularExpressions.Regex(patron);
            sRemp = rgx.Replace(dni.ToString(), "OK");
            if (sRemp == "OK") ret = true;
            return ret;
        }

        // Método para validar TELÉFONO
        public bool ValidarTelefono(string strNumero)
        {
            Regex regex = new Regex("\\A[0-9]{9}\\z");
            Match match = regex.Match(strNumero);

            if (match.Success)
                return true;
            else
                return false;
        }

        // Método para que los campos no estén vacíos
        public bool texBoxIsEmpty()
        {
            bool emptyOk = false;

            if (!dni.Equals("") && !nombre.Equals("") && !direccion.Equals("") &&
                !telefono.Equals("") && !estudios.Equals(""))
            {
                emptyOk = true;
            }

            return emptyOk;
        }

        // Btn GUARDAR
        private void idBtnGuardarProfesor_Click(object sender, EventArgs e)
        {
            dni = idTbDniProfesor.Text;
            nombre = idTbNombreProfesor.Text;
            direccion = idTbDireccionProfesor.Text;
            telefono = idTbTefefonoProfesor.Text;
            estudios = idTbEstudiosProfesor.Text;

            try
            {
                if (texBoxIsEmpty() && DNIvalido(dni) && ValidarTelefono(telefono)) // Si los campos de los TexBox están vacíos, entramos.
                {
                    //Crea un fichero nuevo y guarda datos ( CONDICIÓN: que el fichero no exista ) 
                    StreamWriter fichero;

                    if (File.Exists(nombreFichero))
                    {
                        // Guarda datos en fichero que ya existe
                        fichero = File.AppendText(nombreFichero);
                        fichero.WriteLine($"{dni}*{nombre}*{direccion}*{telefono}*{estudios}");
                        fichero.Close();
                    }
                    else
                    {
                        // Crea fichero y guarda datos por primera vez
                        fichero = File.CreateText(nombreFichero);
                        fichero.WriteLine($"{dni}*{nombre}*{direccion}*{telefono}*{estudios}");
                        fichero.Close();
                    }
                }
                else
                {
                    MessageBox.Show("Comprueba que dejastes campos vacíos.\nY comprueba que el teléfono o el DNI son válidos");
                }
            }
            catch(IOException ex)
            {
                Console.WriteLine("Se ha producido un error: " + ex.Message);
            }                      
        }
    }
}
