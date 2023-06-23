using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exerciciosClasses
{
    internal class MenuBichinho
    {
        public static void Main(string[] args)
        {
            BichinhoVirtual bichinho = new BichinhoVirtual("Fido", 50, 80, 2);

            bool sair = false;
            while (!sair)
            {
                Console.WriteLine("1. Alterar nome");
                Console.WriteLine("2. Alterar nível de fome");
                Console.WriteLine("3. Alterar nível de saúde");
                Console.WriteLine("4. Alterar idade");
                Console.WriteLine("5. Brincar");
                Console.WriteLine("6. Sair");
                Console.Write("Escolha uma opção: ");
                int opcao = int.Parse(Console.ReadLine());
                switch (opcao)
                {
                    case 1:
                        Console.Write("Digite o novo nome: ");
                        string novoNome = Console.ReadLine();
                        bichinho.AlterarNome(novoNome);
                        break;
                    case 2:
                        Console.Write("Digite o novo nível de fome: ");
                        double novoNivelFome = double.Parse(Console.ReadLine());
                        bichinho.AlterarFome(novoNivelFome);
                        break;
                    case 3:
                        Console.Write("Digite o novo nível de saúde: ");
                        double novoNivelSaude = double.Parse(Console.ReadLine());
                        bichinho.AlterarNivelSaude(novoNivelSaude);
                        break;
                    case 4:
                        Console.Write("Digite a nova idade: ");
                        int novaIdade = int.Parse(Console.ReadLine());
                        bichinho.AlterarIdade(novaIdade);
                        break;
                    case 5:
                        Console.Write("Digite o tempo de brincadeira em minutos: ");
                        int tempoMinutos = int.Parse(Console.ReadLine());
                        bichinho.Brincar(tempoMinutos);
                        break;
                    case 6:
                        sair = true;
                        break;
                    case 7:
                        bichinho.MostrarAtributos();
                        break;
                    default:
                        Console.WriteLine("Opção inválida!");
                        break;
                }
            }

        }
    }
}
