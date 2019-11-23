using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace BancoFicherosXML
{
    public class Cliente
    {
        //Atributos
        private string dni;
        private string nombre;
        private string direccion;
        private int edad;
        private int tlfn;
        private int cc;

        //Constructores
        public Cliente() { }

        public Cliente(string dni, string nombre, string direccion, int edad, int tlfn, int cc)
        {
            this.dni = dni;
            this.nombre = nombre;
            this.direccion = direccion;
            this.edad = edad;
            this.tlfn = tlfn;
            this.cc = cc;
        }

        public string Dni { get => dni; set => dni = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string Direccion { get => direccion; set => direccion = value; }
        public int Edad { get => edad; set => edad = value; }
        public int Tlfn { get => tlfn; set => tlfn = value; }
        public int Cc { get => cc; set => cc = value; }
    }
}

