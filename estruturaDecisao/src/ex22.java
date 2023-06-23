import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número inteiro para saber se é par ou impar:");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 2 == 0){
        System.out.printf("O número \"%d\" é par!", numero);
        } else {
            System.out.printf("O número \"%d\" é ímpar!", numero);
        }
    }
}