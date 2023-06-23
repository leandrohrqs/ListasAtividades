import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        scanner.close();

        if(numero1 > numero2){
            System.out.printf("%nO maior é o %f", numero1);
        }
        else{
            System.out.printf("%nO maior é o %f", numero2);
        }
        
    }
}
