import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextDouble();
        scanner.close();

        double mediaNotas = (nota1 + nota2) / 2;

        if (mediaNotas == 10){
            System.out.printf("%nAprovado com distincao!");
        }
        else if (mediaNotas >=7){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
}