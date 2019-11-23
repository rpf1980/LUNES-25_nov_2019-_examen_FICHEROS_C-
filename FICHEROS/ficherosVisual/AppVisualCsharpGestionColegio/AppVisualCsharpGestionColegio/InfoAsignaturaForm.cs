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
    public partial class InfoAsignaturaForm : Form
    {
        public InfoAsignaturaForm()
        {
            InitializeComponent();
        }

        // Carga la APP
        private void InfoAsignaturaForm_Load(object sender, EventArgs e)
        {
            // Guardamos en el ComboBox los strings ID's del fichero Asignaturas.txt
            try
            {
                StreamReader fichero = File.OpenText("Asignaturas.txt");
                string[] trozos = new string[0];
                string linea;

                while (!fichero.EndOfStream)
                {
                    linea = fichero.ReadLine(); // Leemos línea a línea del fichero
                    trozos = linea.Split('*');  // Hacemos Split por los *

                    comboBox1.Items.Add(trozos[0]); // Guardamos todas las primeras posiciones del array (los ID's)
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
            idTextBoxID.Text = "";
            idTbNombre.Text = "";
            idTbDepart.Text = "";
            idTbHoras.Text = "";
            comboBox1.Text = "";
        }

        // ComboBox
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            string itemSeleccionado = comboBox1.SelectedItem.ToString();
            try
            {
                // Leemos de nuevo el fichero
                StreamReader fichero = File.OpenText("Asignaturas.txt");
                string[] trozos = new string[4];
                string linea;

                while (!fichero.EndOfStream)
                {
                    linea = fichero.ReadLine();
                    trozos = linea.Split('*');

                    if (itemSeleccionado.Equals(trozos[0]))
                    {
                        idTextBoxID.Text = trozos[0];
                        idTbNombre.Text = trozos[1];
                        idTbDepart.Text = trozos[2];
                        idTbHoras.Text = trozos[3];
                        
                    }

                }

                fichero.Close();
            }
            catch (IOException ex)
            {
                Console.WriteLine($"Se ha producido un error: {ex.Message}");
            }
        }
    }
}
