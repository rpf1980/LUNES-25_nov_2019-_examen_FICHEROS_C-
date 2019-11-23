using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace BancoFicherosXML
{
    [Serializable()]
    [XmlRoot("Banco")]
    public class Banco
    {
        //Atributos
        private List<Cliente> listaClientes = new List<Cliente>();

        //Constructores

        public Banco()
        {
            listaClientes = new List<Cliente>();
        }

        //Getter && Setter
        public List<Cliente> ListaClientes { get => listaClientes; set => listaClientes = value; }

        //Métodos
        public void AddCliente(Cliente cliente)
        {
            //**OJO---> Atención con esto:
            // Serializable tiene que acceder al atributo lista desde un modo público
            // Ese modo público lo obtenemos desde la propiedad de la clase ( Setter )
            ListaClientes.Add(cliente);
        }

        public void ModificarCliente(Cliente cliente, int pos)
        {
            this.ListaClientes[pos] = cliente;
        }

        public void EliminaCliente(int pos)
        {
            this.ListaClientes.RemoveAt(pos);
        }
    }
}

