import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero");
        double numero3 = scanner.nextDouble();
        scanner.close();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.printf("%nO maior numero: %f", numero1);
        }
        else if (numero2 > numero1 && numero2 > numero3){
            System.out.printf("%nO maior numero: %f", numero2);
        }
        else{
            System.out.printf("%nO maior numero: %f", numero3);
        }

        if (numero1 < numero2 && numero1 < numero3){
            System.out.printf("%nO menor numero: %f", numero1);
        }
        else if (numero2 < numero1 && numero2 < numero3){
            System.out.printf("%nO menor numero: %f", numero2);
        }
        else{
            System.out.printf("%nO menor numero: %f", numero3);
        }
    }
}
