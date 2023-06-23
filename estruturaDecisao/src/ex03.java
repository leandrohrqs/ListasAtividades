import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite [F] para feminino ou [M] para masculino");
        String genero = scanner.nextLine().toUpperCase();
        scanner.close();

        if ("F".equals(genero)){
            System.out.println("Sexo FEMININO selecionado.");
        }
        else if ("M".equals(genero)){
            System.out.println("Sexo MASCULINO selecionado.");
        }
        else{
            System.out.println("Sexo INVALIDO!");
        }
    }
    
}
