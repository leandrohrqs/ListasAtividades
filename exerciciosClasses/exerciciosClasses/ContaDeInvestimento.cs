using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class ContaDeInvestimento
    {
        private double Saldo;
        private double TaxaJuros;

        public ContaDeInvestimento(double saldo, double taxaJuros)
        {
            Saldo = saldo;
            TaxaJuros = taxaJuros;
        }

        public void AdicionarJuros(int taxaJuros)
        {
            Saldo -= (Saldo * (taxaJuros / 100));
        }
        public double MostrarSaldo()
        {
            return Saldo;
        }


    }
}
