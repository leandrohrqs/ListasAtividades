using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class Quadrado
    {
        private double tamanhoLado;

        public Quadrado(double tamanhoLado) 
        {
            this.tamanhoLado = tamanhoLado;
        }

        public void SetValorLado(double novoValorLado) 
        {
            tamanhoLado = novoValorLado;
        }

        public double GetValorLado() 
        {
            return tamanhoLado;
        }

        public double GetAreaQuadrado()
        {
            double areaQuadrado = tamanhoLado * tamanhoLado;
            return areaQuadrado;
        }

    }
}
