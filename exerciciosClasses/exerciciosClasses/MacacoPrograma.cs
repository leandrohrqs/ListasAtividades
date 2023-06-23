using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace exerciciosClasses
{
    internal class MacacoPrograma
    {
        public static void Main(string[] args)
        {
            Macaco macaco1 = new Macaco("Jhon");
            Macaco macaco2 = new Macaco("Clovis");

            macaco1.Comer("banana");
            macaco1.VerBucho();
            macaco1.Comer("maçã");
            macaco1.VerBucho();
            macaco1.Comer("laranja");
            macaco1.VerBucho();

            macaco2.Comer("uva");
            macaco2.VerBucho();
            macaco2.Comer("pêssego");
            macaco2.VerBucho();
            macaco2.Comer("manga");
            macaco2.VerBucho();
        }
    }
}

