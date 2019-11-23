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
    public partial class InfoAlumnoForm : Form
    {       
        public InfoAlumnoForm()
        {
            InitializeComponent();                      
        }
    
        private void InfoAlumnoForm_Load(object sender, EventArgs e)
        {
            // Guardamos en el ComboBox los strings DNI's del fichero Alumno.txt
            

            try
            {                
                StreamReader fichero = File.OpenText("Alumno.txt");
                string[] trozos = new string[0];
                string linea;
                
                while(!fichero.EndOfStream)
                {
                    linea = fichero.ReadLine(); // Leemos línea a línea del fichero
                    trozos = linea.Split('*');  // Hacemos Split por los *
                    
                    idCboxInfoAlumno.Items.Add(trozos[0]); // Guardamos todas las primeras posiciones del array (los dni)
                }
                             
                fichero.Close();

               
            }
            catch(IOException ex)
            {
                Console.WriteLine($"Se ha producido un error: {ex.Message}");
            }

        }

        //ComboBox
        private void idCboxInfoAlumno_SelectedIndexChanged(object sender, EventArgs e)
        {
            string itemSeleccionado = idCboxInfoAlumno.SelectedItem.ToString();
          
            try
            {
                // Leemos de nuevo el fichero
                StreamReader fichero = File.OpenText("Alumno.txt");
                string[] trozos = new string[4];
                string linea;

                while(!fichero.EndOfStream)
                {
                    linea = fichero.ReadLine();
                    trozos = linea.Split('*');

                    if (itemSeleccionado.Equals(trozos[0]))
                    {
                        idTbDniInfoAlumno.Text = trozos[0];
                        idTbNombreInfoAlumno.Text = trozos[1];
                        idTbFechaNacInfoAlumno.Text = trozos[4];
                        idTbDireccionInfoAlumno.Text = trozos[2];
                        idTbTelefonInfoAlumno.Text = trozos[3];
                    }

                }

                fichero.Close();
            }
            catch(IOException ex)
            {
                Console.WriteLine($"Se ha producido un error: {ex.Message}");
            }         
        }

        // Btn LIMPIAR
        private void button1_Click(object sender, EventArgs e)
        {
            idTbDniInfoAlumno.Text = "";
            idTbNombreInfoAlumno.Text = "";
            idTbFechaNacInfoAlumno.Text = "";
            idTbDireccionInfoAlumno.Text = "";
            idTbTelefonInfoAlumno.Text = "";
            idCboxInfoAlumno.Text = "";
        }
    }
}
