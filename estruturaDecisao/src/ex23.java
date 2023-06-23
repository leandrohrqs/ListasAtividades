import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber se é inteiro ou decimal: ");
        double numero = scanner.nextDouble();
        scanner.close();

        if (numero % 1 == 0) {
            System.out.printf("O número \"%f\" é inteiro.", numero);
        } else {
            System.out.printf("O número \"%f\" é decimal.", numero);
        }
    }
}
