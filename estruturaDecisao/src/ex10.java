import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite [M] para matutino ou [V] Vespertino ou [N] Noturno. ");
        String turno = scanner.nextLine().toUpperCase();
        scanner.close();

        if (turno.equals("M")){
            System.out.println("Bom dia!");
        }
        else if (turno.equals("V")){
            System.out.println("Boa tarde!");
        }
        else if (turno.equals("N")){
            System.out.println("Boa noite!");
        }
        else{
            System.out.println("Valor invalido!");
        }
    }
}
