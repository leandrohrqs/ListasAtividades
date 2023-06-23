using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class Funcionario
    {
        public string Nome;
        public double Salario;

        public Funcionario(string nome, double salario)
        {
            Nome = nome;
            Salario = salario;
        }

        public string MostrarNome()
        {
            return Nome;
        }

        public double MostrarSalario()
        {
            return Salario;
        }
        public void AumentarSalario(int taxaAumento)
        {
            Salario += (Salario * (taxaAumento / 100));
        }
    }
}
