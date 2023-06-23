import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        double numero = scanner.nextDouble();
        scanner.close();

        if (numero == 0){
            System.out.printf("%nO numero %f e neutro", numero);
        }
        else if (numero > 0){
            System.out.printf("%nO numero %f e positivo", numero);
        }
        else{
            System.out.printf("%nO numero %f e negativo", numero);
        }
    }
}