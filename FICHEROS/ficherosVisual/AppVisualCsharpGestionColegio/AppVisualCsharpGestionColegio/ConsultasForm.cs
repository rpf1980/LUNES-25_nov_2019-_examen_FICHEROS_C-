using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AppVisualCsharpGestionColegio
{
    public partial class ConsultasForm : Form
    {
        InfoAlumnoForm infoAlumno = new InfoAlumnoForm();
        InfoProfesorForm infoProfesor = new InfoProfesorForm();
        InfoAsignaturaForm infoAsignaturas = new InfoAsignaturaForm();

        public ConsultasForm()
        {
            InitializeComponent();
        }

        //Btn ALUMNO
        private void button1_Click(object sender, EventArgs e)
        {
            infoAlumno.Show();
        }

        //Btn PROFESOR
        private void button2_Click(object sender, EventArgs e)
        {
            infoProfesor.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            infoAsignaturas.Show();
        }
    }
}
