using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class ContaCorrente
    {
        public int numeroDaConta;
        private string nomeCliente;
        private double saldo = 0;

        public ContaCorrente(int numeroConta, string nomeCLiente) 
        { 
            this.numeroDaConta = numeroConta;
            this.nomeCliente = nomeCLiente;
        }

        public void AlterarNome(string novoNome)
        {
            nomeCliente = novoNome;
        }

        public void Sacar(double valorSaque)
        {
            if (saldo < valorSaque) 
            {
                throw new ArgumentException("Não é possível sacar um valor maior que o saldo");
            }
            
            saldo -= valorSaque;
        }

        public void Depositar(double valorDeposito)
        {
            if (valorDeposito <= 0)
            {
                throw new ArgumentException("Não é possível depositar R$ 0 ou menos");
            }

            saldo += valorDeposito;
        }



    }
}
