import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inteiro que deseja sacar (10 à 600):");
        int valorSaque = scanner.nextInt();
        scanner.close();

        if (valorSaque < 10 || valorSaque > 600){
            System.out.println("O valor do saque está inválido!");
            return;
        }


        int nota100 = 0;
        int nota50 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota1 = 0;
        int contador = valorSaque;

        while (contador > 0){
            if (contador >= 100){
                nota100 += 1;
                contador -= 100;
            }
            else if (contador >= 50){
                nota50 += 1;
                contador -= 50;
            }
            else if (contador >= 10){
                nota10 += 1;
                contador -= 10;
            }
            else if (contador >= 5){
                nota5 += 1;
                contador -= 5;
            }
            else if (contador >= 1){
                nota1 += 1;
                contador -= 1;
            }
        }

        if (nota100 > 0){
            System.out.printf("%nNotas de R$ 100,00: %d", nota100);
        }
        if (nota50 > 0){
            System.out.printf("%nNotas de R$ 50,00: %d", nota50);
        }
        if (nota10 > 0){
            System.out.printf("%nNotas de R$ 10,00: %d", nota10);
        }
        if (nota5 > 0){
            System.out.printf("%nNotas de R$ 5,00: %d", nota5);
        }
        if (nota1 > 0){
            System.out.printf("%nNotas de R$ 1,00: %d", nota1);
        }
        System.out.printf("%nValor total: R$ %d,00", valorSaque);

    }
}
