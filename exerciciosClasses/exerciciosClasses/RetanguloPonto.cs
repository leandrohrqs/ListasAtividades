using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class RetanguloPonto
    {
        public double Largura { get; set; }
        public double Altura { get; set; }
        public Ponto VerticePartida { get; set; }
        private double CentroLargura;
        private double CentroAltura;

        public RetanguloPonto(double largura, double altura, Ponto verticePartida)
        {
            Largura = largura;
            Altura = altura;
            VerticePartida = verticePartida;
        }

        public Ponto EncontrarCentro()
        {
            CentroAltura = VerticePartida.Y + Altura / 2;
            CentroLargura = VerticePartida.X + Largura / 2;
            return new Ponto(CentroAltura, CentroLargura);
        }
    }
}

