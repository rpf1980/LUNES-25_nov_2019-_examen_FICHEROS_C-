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
    public partial class InfoProfesorForm : Form
    {
        public InfoProfesorForm()
        {
            InitializeComponent();
        }


        // ComboBox
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            string itemSeleccionado = idComboBox.SelectedItem.ToString();

            try
            {
                // Leemos de nuevo el fichero
                StreamReader fichero = File.OpenText("Profesores.txt");
                string[] trozos = new string[4];
                string linea;

                while (!fichero.EndOfStream)
                {
                    linea = fichero.ReadLine();
                    trozos = linea.Split('*');

                    if (itemSeleccionado.Equals(trozos[0]))
                    {
                        idTbDniInfoProfesor.Text = trozos[0];
                        idTbNombreInfoProfesor.Text = trozos[1];
                        idTbDireccionInfoProfesor.Text = trozos[2];
                        idTbTlfnInfoProfesor.Text = trozos[3];
                        idTbEstudiosInfoProfesor.Text = trozos[4];
                    }

                }

                fichero.Close();
            }
            catch (IOException ex)
            {
                Console.WriteLine($"Se ha producido un error: {ex.Message}");
            }
        }


        // Carga el FORM
        private void InfoProfesorForm_Load(object sender, EventArgs e)
        {
            // Guardamos en el ComboBox los strings DNI's del fichero Profesores.txt
            try
            {
                StreamReader fichero = File.OpenText("Profesores.txt");
                string[] trozos = new string[0];
                string linea;

                while (!fichero.EndOfStream)
                {
                    linea = fichero.ReadLine(); // Leemos línea a línea del fichero
                    trozos = linea.Split('*');  // Hacemos Split por los *

                    idComboBox.Items.Add(trozos[0]); // Guardamos todas las primeras posiciones del array (los dni)
                }

                fichero.Close();
            }
            catch (IOException ex)
            {
                Console.WriteLine($"Se ha producido un error: {ex.Message}");
            }
        }

        // Btn LIMPIAR
        private void button1_Click(object sender, EventArgs e)
        {
            idTbDniInfoProfesor.Text = "";
            idTbNombreInfoProfesor.Text = "";
            idTbDireccionInfoProfesor.Text = "";
            idTbTlfnInfoProfesor.Text = "";
            idTbEstudiosInfoProfesor.Text = "";
            idComboBox.Text = "";
        }
    }
}
