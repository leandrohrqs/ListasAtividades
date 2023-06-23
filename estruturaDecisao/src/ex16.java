import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o A");
        double a = scanner.nextDouble();
        if (a == 0){
            System.out.println("A = 0 não forma uma equação de segundo grau. %nEncerrando...");
            scanner.close();
            System.exit(0);
        }
        
        System.out.println("Digite o B");
        double b = scanner.nextDouble();
        System.out.println("Digite o C");
        double c = scanner.nextDouble();
        scanner.close();

        double delta = (Math.pow(b, 2)) - 4 * a * c;

        if (delta < 0){
            System.out.println("A equação não possui raízer reais. %nEncerrando...");
            System.exit(0);
        }
        else if (delta == 0){
            double raiz =  -b / (2 * a);
            System.out.printf("%nA equação possui apenas uma raíz real: %.2f", raiz);
        }
        else{
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("%nA equação possui duas raízes reais: %f e %f", raiz1, raiz2); 
        }

    }
}
