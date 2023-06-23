import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade em KG de morangos comprados:");
        double kgMorangos = scanner.nextDouble();

        System.out.println("Digite a quantidade em KG de maçãs compradas:");
        double kgMacas = scanner.nextDouble();
        scanner.close();

        double valorKgMorango = 2.5;
        double valorKgMaca = 1.8;
        double desconto = 0;


        if (kgMorangos > 5){
            valorKgMorango = 2.2;
        }
        if (kgMacas > 5){
            valorKgMaca = 1.5;
        }

        double valorMorangos = kgMorangos * valorKgMorango;
        double valorMacas = kgMacas * valorKgMaca;
        double valorTotalCompra = valorMacas + valorMorangos;

        if ((kgMorangos + kgMorangos) > 8 || valorTotalCompra > 25){
            desconto = 0.1;
            valorTotalCompra -= (valorTotalCompra * desconto);
            System.out.println("PARÁBENS! VOCÊ GANHOU 10% DE DESCONTO");
            desconto = 10;
        }
        System.out.printf("""
                Valor KG Morango: R$ %.2f
                KG(s) Comprados: %f
                Valor Total Morangos: R$ %.2f
                """, valorKgMorango, kgMorangos, valorMorangos);
        System.out.printf("""
                Valor KG Maçã: R$ %.2f
                KG(s) Comprados: %f
                Valor Total Maçãs: R$ %.2f
                """, valorKgMaca, kgMacas, valorMacas);

        System.out.printf("Valor Total Compra: R$ %.2f", valorTotalCompra);
    }
}
