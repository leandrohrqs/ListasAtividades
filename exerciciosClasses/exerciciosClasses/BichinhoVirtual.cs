using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class BichinhoVirtual
    {
        private string nome;
        private double nivelFome;
        private double nivelSaude;
        private int idade;
        private double nivelHumor;

        public BichinhoVirtual(string nome, double nivelFome, double nivelSaude, int idade)
        {
            this.nome = nome;
            this.nivelFome = nivelFome;
            this.nivelSaude = nivelSaude;
            this.idade = idade;
        }

        public void AlterarNome(string novoNome)
        {
            nome = novoNome;
        }

        public string GetNome()
        {
            return nome;
        }

        public void AlterarFome(double novoNivelFome)
        {
            if (novoNivelFome < 0 || novoNivelFome > 100)
            {
                throw new ArgumentException("Nivel de fome mínimo \" 0 \" e máximo \" 100 \"");
            }

            nivelFome = novoNivelFome;
        }

        public double GetNivelFome()
        {
            return nivelFome;
        }

        public void AlterarNivelSaude(double novoNivelSaude)
        {
            if (novoNivelSaude < 0 || novoNivelSaude > 100)
            {
                throw new ArgumentException("Nivel de saúde mínimo \" 0 \" e máximo \" 100 \"");
            }
            
            nivelSaude = novoNivelSaude;
        }

        public double GetNivelSaude()
        {
            return nivelSaude;
        }

        public void AlterarIdade(int novaIdade)
        {
            if (idade < 0)
            {
                throw new ArgumentException("Não é possível utilizar uma idade negativa");
            }
            idade = novaIdade;
        }

        public int GetIdade()
        {
            return idade;
        }

        public void Brincar(int tempoMinutos)
        {
            nivelFome -= tempoMinutos / 2;
            nivelHumor += tempoMinutos / 2;
        }

        public void MostrarAtributos()
        {
            Console.WriteLine($"Nome: {nome}");
            Console.WriteLine($"Nível de Fome: {nivelFome}");
            Console.WriteLine($"Nível de Saúde: {nivelSaude}");
            Console.WriteLine($"Idade: {idade}");
            Console.WriteLine($"Nível de Humor: {nivelHumor}");
        }

    }
}
