using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.PortableExecutable;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class Bola
    {
        private string cor;
        public double circunferencia;
        public string material;

        public Bola(string cor, double circunferencia, string material)
        {
            this.cor = cor;
            this.circunferencia = circunferencia;
            this.material = material;
        }
        public void trocaCor(string novaCor)
        {
            cor = novaCor;
        }
        public string mostraCor()
        {
            return cor;
        }
    }

}
