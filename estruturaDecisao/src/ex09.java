import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero");
        double numero3 = scanner.nextDouble();
        scanner.close();
        
        double maiorNumero = 0;
        double medioNumero = 0;
        double menorNumero = 0;

        if (numero1 > numero2 && numero1 > numero3){
            maiorNumero = numero1;
        }
        else if (numero2 > numero1 && numero2 > numero3){
            maiorNumero = numero2;
        }
        else{
            maiorNumero = numero3;
        }

        if (numero1 < numero2 && numero1 < numero3){
            menorNumero = numero1;
        }
        else if (numero2 < numero1 && numero2 < numero3){
            menorNumero = numero2;        
        }
        else{
            menorNumero = numero3;        
        }
        
        if (numero1 < maiorNumero && numero1 > menorNumero){
            medioNumero = numero1;
        }
        else if (numero2 < maiorNumero && numero2 > menorNumero){
            medioNumero = numero2;
        }
        else{
            medioNumero = numero3;
        }
        System.out.printf("""
                %nMaior: %f
                %nMedio: %f
                %nMenor: %f
                """, maiorNumero, medioNumero, menorNumero);
    }
}