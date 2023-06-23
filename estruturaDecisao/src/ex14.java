import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a primeira nota");
        double nota2 = scanner.nextDouble();
        scanner.close();

        double media = (nota1 + nota2) / 2;

        String conceito = "Sem conceito";
        String resultado = "Sem resultado";

        if (media >= 9 && media <= 10){
            conceito = "A";
            resultado = "Aprovado!";
        }
        else if (media >= 7.5 && media < 9){
            conceito = "B";
            resultado = "Aprovado!";
        }
        else if (media >= 6 && media < 7.5){
            conceito = "C";
            resultado = "Aprovado!";
        }
        else if (media >= 4 && media < 6){
            conceito = "D";
            resultado = "Reprovado!";
        }
        else if (media < 4 && media >= 0){
            conceito = "E";
            resultado = "Reprovado!";
        }
        else{
            System.out.printf("%nA media \" %f \" nao está dentro da tabela! Verifique se as notas foram digitadas corretamente.", media);
        }

        System.out.printf("%nMedia das notas %.2f e %.2f: %.2f", nota1, nota2, media);
        System.out.printf("%nConceito: %s", conceito);
        System.out.printf("%nResultado: %s", resultado);
    }
}
