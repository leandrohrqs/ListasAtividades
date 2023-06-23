using exerciciosClasses;


internal class PontoRetanguloPrograma
{
    public static void Main(string[] args)
    {
        Ponto verticePartida = new Ponto(0, 0);
        RetanguloPonto retangulo = new RetanguloPonto(10, 20, verticePartida);

        bool sair = false;
        while (!sair)
        {
            Console.WriteLine("1. Alterar largura");
            Console.WriteLine("2. Alterar altura");
            Console.WriteLine("3. Imprimir centro");
            Console.WriteLine("4. Sair");
            Console.Write("Escolha uma opção: ");
            int opcao = int.Parse(Console.ReadLine());
            switch (opcao)
            {
                case 1:
                    Console.Write("Digite a nova largura: ");
                    double largura = double.Parse(Console.ReadLine());
                    retangulo.Largura = largura;
                    break;
                case 2:
                    Console.Write("Digite a nova altura: ");
                    double altura = double.Parse(Console.ReadLine());
                    retangulo.Altura = altura;
                    break;
                case 3:
                    Ponto centro = retangulo.EncontrarCentro();
                    centro.MostrarValores();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    Console.WriteLine("Opção inválida!");
                    break;
            }
        }
    }
}


