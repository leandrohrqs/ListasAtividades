import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
    System.out.println("Digite a primeira nota");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota");
    double nota2 = scanner.nextDouble();
    System.out.println("Digite a terceira nota");
    double nota3 = scanner.nextDouble();
    scanner.close();

    if (nota1 > 10 || nota2 > 10 || nota3 > 10 || nota1 < 0 || nota2 < 0 || nota3 < 0){
        System.out.println("Alguma das notas está inválida! Digite-as novamente.");
        return;
    }

    double media = (nota1 + nota2 + nota3) / 3;

    if (media == 10){
        System.out.printf("%nAprovado com distinção! média: %.2f", media);
    }
    else if (media >= 7){
        System.out.printf("%nAprovado! média: %.2f", media);
    }
    else{
        System.out.printf("Reprovado! média: ", media);
    }
    
    }
}