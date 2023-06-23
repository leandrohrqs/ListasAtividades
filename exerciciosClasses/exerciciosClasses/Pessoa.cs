using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class Pessoa
    {
        public string nome;
        public int idade;
        public double peso;
        public double altura;

        public Pessoa(string nome, int idade, double peso, double altura)
        {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
        }

        public void Envelhecer()
        {
            if (idade < 21)
            {
                altura += 0.05;
            }
            idade += 1;
            
        }
        public void Engordar(double quilos)
        {
            if (quilos < 0)
            {
                throw new ArgumentException("O número de quilos deve ser positivo.");
            }

            peso += quilos;
        }

        public void Emagrecer(double quilos)
        {
            if (quilos < 0)
            {
                throw new ArgumentException("O número de quilos deve ser positivo.");
            }

            peso -= quilos;
        }

        public void Crescer(double centimetros)
        {
            if (centimetros < 0)
            {
                throw new ArgumentException("O número de centímetros deve ser positivo.");
            }

            altura += centimetros;
        }
    }
}
