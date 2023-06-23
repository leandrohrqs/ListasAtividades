import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro menor que 1000");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1000 || numero < 0){
            System.out.println("Numero Inválido!");
            return;
        }

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;
        
        String nomeCentena = "centena";
        String nomeDezena = "dezena";
        String nomeUnidade = "unidade";
        
        if (numero / 100 > 1){
            nomeCentena = "centenas";
        }
        if (numero / 10 > 11){
            nomeDezena = "dezenas";
        }
        if (numero % 10 > 1) {
            nomeUnidade = "unidades";
        }

        int numQtdDigitos = Integer.toString(numero).length();

        if (numQtdDigitos == 1){
            System.out.printf("%n %d %s", unidade, nomeUnidade);
        }
        else if (numQtdDigitos == 2){
            System.out.printf("%n %d %s", dezena, nomeDezena);
            System.out.printf("%n %d %s", unidade, nomeUnidade);
        }
        else{
            System.out.printf("%n %d %s", centena, nomeCentena);
            System.out.printf("%n %d %s", dezena, nomeDezena);
            System.out.printf("%n %d %s", unidade, nomeUnidade);
        }

    }
}
