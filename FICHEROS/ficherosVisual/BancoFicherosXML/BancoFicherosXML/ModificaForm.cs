using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Serialization;
using System.Text.RegularExpressions;
using System.IO;
using System.Xml.Linq;

namespace BancoFicherosXML
{
    public partial class ModificaForm : Form
    {
        int pos = -1;
        Banco banco = new Banco();
        Cliente cliente = new Cliente();

        string strDni = "";
        string strNombre = "";
        string strDireccion = "";
        int edad = 0;
        int tlfn = 0;
        int cc = 0;

        public ModificaForm()
        {
            InitializeComponent();
        }

        // Btn SIGUIENTE
        private void button1_Click(object sender, EventArgs e)
        {                               
            FileStream fichero = new FileStream("data.xml", FileMode.Open);     

            // Ingresa el DNI y guardamos su valor
            string strDni = idTextDni.Text;

            //Creamos el formateador XML
            XmlSerializer format = new XmlSerializer(banco.GetType());
            
            // Aquí queda deserializado el XML y guarda la lista de clientes
            banco = (Banco)format.Deserialize(fichero);          

            // Recorremos la lista de clientes para validar el DNI que buscamos
            for (int i = 0; i < banco.ListaClientes.Count; i++)
            {
                if (banco.ListaClientes[i].Dni == strDni)
                {
                    pos = i; // Aquí tenemos la posición del cliente en la lista 
                    cliente = banco.ListaClientes[i];
                    i = banco.ListaClientes.Count;
                }
            }
            fichero.Close();

            // Asignamos los datos del cliente a cada texbox          
            idCampoStrDni.Text = cliente.Dni;
            idTextNombre.Text = cliente.Nombre;
            idTextDireccion.Text = cliente.Direccion;
            idTextEdad.Text = Convert.ToString(cliente.Edad);
            idTextTlfn.Text = Convert.ToString(cliente.Tlfn);
            idTextCC.Text = Convert.ToString(cliente.Cc);
        }


        // Btn MODIFICAR
        private void button2_Click(object sender, EventArgs e)
        {            
            FileStream fichero = new FileStream("data.xml", FileMode.Create);
            
            // Guardamos los campos registrados
            strDni = idCampoStrDni.Text;
            strNombre = idTextNombre.Text;
            strDireccion = idTextDireccion.Text;
            edad = Convert.ToInt32(idTextEdad.Text);
            tlfn = Convert.ToInt32(idTextTlfn.Text);
            cc = Convert.ToInt32(idTextCC.Text);

            if(texBoxIsEmpty() && DNIvalido(strDni) && ValidarTelefono(tlfn.ToString()))
            {
                try
                {
                    // Damos valores a los atributos del objeto cliente
                    cliente.Dni = strDni;
                    cliente.Nombre = strNombre;
                    cliente.Direccion = strDireccion;
                    cliente.Edad = edad;
                    cliente.Tlfn = tlfn;
                    cliente.Cc = cc;

                    // Añadimos el cliente a la lista del objeto banco
                    // Si pos no es igual a -1 quiere decir que hay un cliente seleccionado y podríamos modificarlo
                    if (pos != -1)
                    {
                        banco.ModificarCliente(cliente, pos);

                        // Creamos el formateador XML
                        XmlSerializer format = new XmlSerializer(banco.GetType());
                        format.Serialize(fichero, banco);
                    }
                    fichero.Close();
                }
                catch(IOException ex)
                {
                    Console.WriteLine("Error: " + ex.Message);
                }
            }           
        }


        // ELIMINAR CLIENTE
        private void idBtnEliminar_Click(object sender, EventArgs e)
        {
            FileStream fichero = new FileStream("data.xml", FileMode.Create);

            if (pos != -1)
            {

                banco.EliminaCliente(pos);

                // Creamos el formateador XML
                XmlSerializer format = new XmlSerializer(banco.GetType());
                format.Serialize(fichero, banco);
            }
            fichero.Close();

            // Poner campos vacíos

            idCampoStrDni.Text = "";
            idTextNombre.Text = "";
            idTextDireccion.Text = "";
            idTextEdad.Text = "";
            idTextTlfn.Text = "";
            idTextCC.Text = "";
            idTextDni.Text = "";
        }

        // MÉTODOS APARTE

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

            if (!strDni.Equals("") && !strNombre.Equals("") && !strDireccion.Equals("") &&
                !edad.Equals("") && !tlfn.Equals("") && !cc.Equals(""))
            {
                emptyOk = true;
            }

            return emptyOk;
        }
    }
}
