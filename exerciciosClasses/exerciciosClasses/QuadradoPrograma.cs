using exerciciosClasses;

Console.WriteLine("Digite a largura em metros do local:");
double ladoA = double.Parse(Console.ReadLine());

Console.WriteLine("Digite a base em metros do local:");
double ladoB = double.Parse(Console.ReadLine());

Retangulo local = new Retangulo(ladoA, ladoB);

Console.WriteLine($"Será necessário de pisos: {local.CalcularArea()}m²");
Console.WriteLine($"Será necessário de rodapés: {local.CalcularPerimetro()}m²");
