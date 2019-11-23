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

namespace AppVisualCsharpGestionColegio
{
    public partial class AsignaturasForm : Form
    {
        //Variables
        string strID = "";
        string strNombre = "";
        string strDepartamento = "";
        string strHoras = "";
        string nombreFichero = "Asignaturas.txt";

        public AsignaturasForm()
        {
            InitializeComponent();
        }

        //Btn LIMPIAR
        private void idBtnLimpiarAsignaturas_Click(object sender, EventArgs e)
        {
            idTbIDasignaturas.Text = "";
            idTbNombreAsignaturas.Text = "";
            idComboDepAsignaturas.Text = "";
            idTbHorasAsignaturas.Text = "";
        }

        // Btn GUARDAR
        private void idBtnGuardarAsignaturas_Click(object sender, EventArgs e)
        {
            strID = idTbIDasignaturas.Text;
            strNombre = idTbNombreAsignaturas.Text;
            strDepartamento = idComboDepAsignaturas.Text;
            strHoras = idTbHorasAsignaturas.Text;

            try
            {
                if (texBoxIsEmpty())
                {
                    //Crea un fichero nuevo y guarda datos ( CONDICIÓN: que el fichero no exista ) 
                    StreamWriter fichero;

                    if (File.Exists(nombreFichero))
                    {
                        // Guarda datos en fichero que ya existe
                        fichero = File.AppendText(nombreFichero);
                        fichero.WriteLine($"{strID}*{strNombre}*{strDepartamento}*{strHoras}");
                        fichero.Close();
                    }
                    else
                    {
                        // Crea fichero y guarda datos por primera vez
                        fichero = File.CreateText(nombreFichero);
                        fichero.WriteLine($"{strID}*{strNombre}*{strDepartamento}*{strHoras}");
                        fichero.Close();
                    }
                }
                else
                {
                    MessageBox.Show("Comprueba que los campos no estén vacíos.");
                }
            }
            catch(IOException ex)
            {
                Console.WriteLine($"Se ha producido un error: {ex.Message}");
            }          
        }

        // Método para que los campos no estén vacíos
        public bool texBoxIsEmpty()
        {
            bool emptyOk = false;

            if (!strID.Equals("") && !strNombre.Equals("") && !strDepartamento.Equals("") &&
                !strHoras.Equals(""))
            {
                emptyOk = true;
            }

            return emptyOk;
        }

        private void AsignaturasForm_Load(object sender, EventArgs e)
        {

        }
    }
}
