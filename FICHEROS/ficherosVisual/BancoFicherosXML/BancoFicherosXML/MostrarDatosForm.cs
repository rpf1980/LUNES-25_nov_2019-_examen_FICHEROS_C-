using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BancoFicherosXML
{
    public partial class MostrarDatosForm : Form
    {
        string filePath = "data.xml";

        public MostrarDatosForm()
        {
            InitializeComponent();
            dataSet.ReadXml(filePath);
        }

        private void MostrarDatosForm_Load(object sender, EventArgs e)
        {

        }

        // Btn MOSTRAR
        private void button1_Click(object sender, EventArgs e)
        {
            dataGridView.DataSource = dataSet;
            dataGridView.DataMember = "Cliente";
        }

        // Btn SALIR
        private void button2_Click(object sender, EventArgs e)
        {
            Environment.Exit(0);
        }
    }
}
