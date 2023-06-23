using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class Retangulo
    {
        private double ladoA;
        private double ladoB;
        public Ponto vertice { get; set; }

        public Retangulo(double ladoA, double ladoB)
        {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
        }

        public void SetLadoA(double novoLadoA)
        {
            ladoA = novoLadoA;
        }

        public void SetLadoB(double novoLadoB)
        {
            ladoB = novoLadoB;
        }

        public double GetLadoA()
        {
            return ladoA;
        }

        public double GetLadoB()
        {
            return ladoB;
        }

        public double CalcularArea()
        {
            return ladoA * ladoB;
        }

        public double CalcularPerimetro() 
        {
            return 2 * (ladoA + ladoB);
        }
    }
}
