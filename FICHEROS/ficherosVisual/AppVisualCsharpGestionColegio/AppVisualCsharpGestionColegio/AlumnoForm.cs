using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace AppVisualCsharpGestionColegio
{
    
    public partial class AlumnoForm : Form
    {       
        // Variables de ámbito global de clase para guardar los strings de los campos del formulario
        string dni = "";
        string nombre = "";
        string direccion = "";
        string telefono = ""; // Recuerda que entra un string y que debes hacer el casting de datos para poder validar el teléfono como tipo entero
        DateTime date = new DateTime(); //Guardará el dato tipo DateTime del campo Fecha de nacimiento
        string nombreFichero = "Alumno.txt";

        public AlumnoForm()
        {
            InitializeComponent();
        }
       
        private void AlumnoForm_Load(object sender, EventArgs e)
        {

        }

        // Btn LIMPIAR
        private void idBtnLimpiar_Click(object sender, EventArgs e)
        {
            idTbDni.Text = "";
            idTbNombre.Text = "";
            idTbDireccion.Text = "";
            idTbTelefono.Text = "";
            idDatePicketAlumno.Text = "";
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

            if(!dni.Equals("") && !nombre.Equals("") && !direccion.Equals("") && 
                !telefono.Equals("") && !idDatePicketAlumno.Value.Equals(""))
            {
                emptyOk = true;
            }

            return emptyOk;
        }

        // Btn GUARDAR
        private void idBtnGuardar_Click(object sender, EventArgs e)
        {
            dni = idTbDni.Text;
            nombre = idTbNombre.Text;
            direccion = idTbDireccion.Text;
            telefono = idTbTelefono.Text;
            date = idDatePicketAlumno.Value;

            if (texBoxIsEmpty() && DNIvalido(dni) && ValidarTelefono(telefono)) // Si los campos de los TexBox están vacíos, entramos.
            {
                //Crea un fichero nuevo y guarda datos ( CONDICIÓN: que el fichero no exista ) 
                StreamWriter fichero;

                try
                {
                    if (File.Exists(nombreFichero))
                    {
                        // Guarda datos en fichero que ya existe
                        fichero = File.AppendText(nombreFichero);
                        fichero.WriteLine($"{dni}*{nombre}*{direccion}*{telefono}*{date}");
                        fichero.Close();
                    }
                    else
                    {
                        // Crea fichero y guarda datos por primera vez
                        fichero = File.CreateText(nombreFichero);
                        fichero.WriteLine($"{dni}*{nombre}*{direccion}*{telefono}*{date}");
                        fichero.Close();
                    }
                }
                catch(IOException ex)
                {
                    Console.WriteLine("Se ha producido un error:" + ex.Message);
                }                       
            }          
        }
    }
}
