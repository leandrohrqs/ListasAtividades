import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado");
        double lado1 = scanner.nextDouble();
        System.out.println("Digite o segundo lado");
        double lado2 = scanner.nextDouble();
        System.out.println("Digite o terceiro lado");
        double lado3 = scanner.nextDouble();
        scanner.close();

        boolean equilatero = lado1 == lado2 && lado1 == lado3 && lado2 == lado3;
        boolean isosceles = lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
        boolean escaleno = lado1 != lado2 && lado1 != lado3 && lado2 != lado3;

        if (equilatero){
            System.out.println("O triangulo e equilatero");
        }
        else if (isosceles){
            System.out.println("O triangulo e isosceles");
        }
        else if (escaleno){
            System.out.println("O triangulo e escaleno");
        }
    }
}
