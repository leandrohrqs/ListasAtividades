using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class Carro
    {
        public double ConsumoKML;
        public double NivelCombustivel = 0;

        public Carro(double consumoKML)
        {
            ConsumoKML = consumoKML;
        }

        public void Andar(double kmsAndados)
        {
            NivelCombustivel -= (kmsAndados / ConsumoKML);
        }

        public void Abastecer(double qtdGasolinaAbastecida)
        {
            NivelCombustivel += qtdGasolinaAbastecida;
        }

        public double MostrarTanque()
        {
            return NivelCombustivel;
        }

    }
}
