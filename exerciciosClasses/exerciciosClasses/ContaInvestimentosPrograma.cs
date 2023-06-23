using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class ContaInvestimentosPrograma
    {
        public static void Main(string[] args) 
        {
            ContaDeInvestimento contaPoupanca = new(1000, 10);

            contaPoupanca.MostrarSaldo();
            contaPoupanca.AdicionarJuros(10);
            contaPoupanca.MostrarSaldo();
            contaPoupanca.AdicionarJuros(20);
            contaPoupanca.MostrarSaldo();
            contaPoupanca.AdicionarJuros(12);
            contaPoupanca.MostrarSaldo();
            contaPoupanca.AdicionarJuros(4);
            contaPoupanca.MostrarSaldo();
            contaPoupanca.AdicionarJuros(5);
        }
    }
}
