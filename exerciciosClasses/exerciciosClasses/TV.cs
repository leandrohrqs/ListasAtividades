using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class TV
    {
        private int canalTV;
        private int volumeTV;

        public TV(int canalTV, int volumeTV) 
        {
            this.canalTV = canalTV;
            this.volumeTV = volumeTV;
        }

        public void DiminuirCanal()
        {
            if (canalTV < 0) 
            {
                throw new ArgumentException("Não existe canal menor que 0.");
            }
            canalTV -= 1;
        }

        public void AumentarCanal()
        {
            canalTV += 1;
        }

        public int AumentarVolume()
        {
            if (volumeTV == 100)
            {
                throw new ArgumentException("Volume máximo de 100 atingido");
            }
            volumeTV += 1;
            return volumeTV;
        }
        
        public int DiminuirVolume()
        {
            if (volumeTV == 0) 
            {
                throw new ArgumentException("Não é possívil diminuir mais o volume");
            }

            volumeTV -= 1;
            return volumeTV;
        }
    }
}
