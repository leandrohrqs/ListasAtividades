using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class Macaco
    {
        public string Nome { get; set; }
        public List<string> Bucho { get; set; }

        public Macaco(string nome)
        {
            Nome = nome;
            Bucho = new List<string>();
        }

        public void Comer(string comida)
        {
            Bucho.Add(comida);
        }

        public void VerBucho()
        {
            Console.WriteLine($"O bucho do {Nome} contém: ");
            foreach (var comida in Bucho)
            {
                Console.WriteLine(comida);
            }
        }

        public void Digerir()
        {
            if (Bucho.Count > 0)
            {
                Bucho.RemoveAt(0);
            }
        }
    }
}
