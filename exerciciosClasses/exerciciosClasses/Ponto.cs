using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class Ponto
    {
        public double X { get; set; }
        public double Y { get; set; }

        public Ponto(double x, double y)
        {
            X = x;
            Y = y;
        }

        public void MostrarValores()
        {
            Console.WriteLine($"Valor de X: {X} ; Y: {Y}");
        }
    }
}
