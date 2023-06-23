import java.util.Scanner;



public class ex04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um caractere:");
        String caractere = scanner.nextLine().toUpperCase();
        scanner.close();

        String vogais = "AEIOU";
        
        if (vogais.contains(caractere)){
            System.out.printf("%nO caractere \"%s\" e uma vogal", caractere);
        }
        else{
            System.out.printf("%nO caractere \"%s\" nao e uma vogal!", caractere);
        }
    }
}
