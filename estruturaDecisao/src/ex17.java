import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano");
        int ano = scanner.nextInt();
        scanner.close();

        if (ano % 4 == 0){
            System.out.printf("%nO ano de %d é bissexto", ano);
        }
        else{
            System.out.printf("%nO ano de %d não é bissexto", ano);
        }
    }
}
