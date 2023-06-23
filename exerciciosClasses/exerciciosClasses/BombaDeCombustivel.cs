using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class BombaDeCombustivel
    {
        public string TipoCombustivel;
        public double ValorLitro;
        public double QtdCombustivel;
        private double CombustivelDisponivel;

        public BombaDeCombustivel(string tipoCombustivel, double valorLitro, double qtdCombustivel, double combustivelDisponivel)
        {
            TipoCombustivel = tipoCombustivel;
            ValorLitro = valorLitro;
            QtdCombustivel = qtdCombustivel;
            CombustivelDisponivel = combustivelDisponivel;
        }

        public double AbastecerValor()
        {
            CombustivelDisponivel -= QtdCombustivel;
            return (ValorLitro / QtdCombustivel);
        }

        public double AbastecerLitro()
        {
            CombustivelDisponivel -= QtdCombustivel;
            return (QtdCombustivel * ValorLitro);
        }

        public void AlterarValor(double valorLitro)
        {
            ValorLitro = valorLitro;
        }

        public void AlterarTipo(string tipoCombustivel)
        {
            TipoCombustivel = tipoCombustivel;
        }

        public void AlterarQtdCombustivel(double qtdCombustivel)
        {
            QtdCombustivel = qtdCombustivel;
        }
    }
}
