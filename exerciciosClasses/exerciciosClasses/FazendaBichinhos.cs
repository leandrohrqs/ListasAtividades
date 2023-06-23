using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class FazendaBichinhos
    {
        public static void Main(string[] args)
        {
            List<BichinhoVirtual> bichinhos = new List<BichinhoVirtual>();
            Random random = new Random();

            for (int i = 0; i < 5; i++)
            {
                string nome = "Bichinho " + (i + 1);
                double nivelFome = random.Next(0, 101);
                double nivelSaude = random.Next(0, 101);
                int idade = random.Next(1, 11);
                BichinhoVirtual bichinho = new BichinhoVirtual(nome, nivelFome, nivelSaude, idade);
                bichinhos.Add(bichinho);
            }

            bool sair = false;
            while (!sair)
            {
                Console.WriteLine("1. Alimentar todos os bichinhos");
                Console.WriteLine("2. Brincar com todos os bichinhos");
                Console.WriteLine("3. Sair");
                Console.Write("Escolha uma opção: ");
                int opcao = int.Parse(Console.ReadLine());
                switch (opcao)
                {
                    case 1:
                        foreach (BichinhoVirtual bichinho in bichinhos)
                        {
                            double novoNivelFome = bichinho.GetNivelFome() - 10;
                            if (novoNivelFome < 0) novoNivelFome = 0;
                            bichinho.AlterarFome(novoNivelFome);
                        }
                        Console.WriteLine("Todos os bichinhos foram alimentados!");
                        break;
                    case 2:
                        foreach (BichinhoVirtual bichinho in bichinhos)
                        {
                            bichinho.Brincar(10);
                        }
                        Console.WriteLine("Você brincou com todos os bichinhos por 10 minutos!");
                        break;
                    case 3:
                        sair = true;
                        break;
                    default:
                        Console.WriteLine("Opção inválida!");
                        break;
                }
            }
        }
    }
}
