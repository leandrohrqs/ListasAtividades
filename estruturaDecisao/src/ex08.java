import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto");
        double produto1 = scanner.nextDouble();
        
        System.out.println("Digite o valor do segundo produto");
        double produto2 = scanner.nextDouble();

        System.out.println("Digite o valor do terceiro produto");
        double produto3 = scanner.nextDouble();
        scanner.close();
    
        if (produto1 < produto2 && produto1 < produto3){
            System.out.println("nVoce deve comprar o primeiro produto!");
        }
        else if (produto2 < produto1 && produto2 < produto3){
            System.out.println("Voce deve comprar o segundo produto!");
        }
        else{
            System.out.println("nVoce deve comprar o terceiro produto!");
        }
    }
}