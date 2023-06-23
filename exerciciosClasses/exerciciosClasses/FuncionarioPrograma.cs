using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class FuncionarioPrograma
    {
        public static void Main(string[] args)
        {
            Funcionario funcionario1 = new("Leandro", 2500);

            funcionario1.MostrarNome();
            funcionario1.MostrarSalario();
            funcionario1.AumentarSalario(15);
            funcionario1.MostrarSalario();
        }
    }
}
