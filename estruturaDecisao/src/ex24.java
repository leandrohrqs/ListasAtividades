import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("""
                Digite qual operação deseja:
                A - Par ou Ímpar
                B - Positivo ou Negativo
                C - Inteiro ou Decimal
                """);
        scanner.nextLine();
        String operacao = scanner.nextLine().toUpperCase();
        scanner.close();

        if (!operacao.equals("A") && !operacao.equals("B") && !operacao.equals("C")){
            System.out.println("Operação inválida, digite a letra correta!");
            return;
        }

        if (operacao.equals("A")){
            if (numero1 % 2 == 0){
                System.out.printf("O número \"%f\" é par!%n", numero1);
                } 
                else {
                    System.out.printf("O número \"%f\" é ímpar!%n", numero1);
                }
                if (numero2 % 2 == 0){
                System.out.printf("O número \"%f\" é par!%n", numero2);
                } 
                else {
                    System.out.printf("O número \"%f\" é ímpar!%n", numero2);
                }
        }
        else if (operacao.equals("B")){
            if (numero1 > 0){
                System.out.println(numero1 + " é positivo");
            }
            else {
                System.out.println(numero1 + " é negativo");
            }
            if (numero2 > 0){
                System.out.println(numero2 + " é positivo");
            }
            else {
                System.out.println(numero2 + " é negativo");
            }
        }
        else{
            if (numero1 % 1 == 0) {
                System.out.printf("O número \"%f\" é inteiro.%n", numero1);
            } 
            else {
                System.out.printf("O número \"%f\" é decimal.%n", numero1);
            }
            if (numero2 % 1 == 0) {
                System.out.printf("O número \"%f\" é inteiro.%n", numero2);
            } else {
                System.out.printf("O número \"%f\" é decimal.%n", numero2);
            }
        }
    }
}
