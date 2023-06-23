import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite deste modo (dd/mm/aaaa): ");
        String data = scanner.nextLine();
        scanner.close();
        String partes[] = data.split("/");

        if (partes.length != 3){
            System.out.println("Data inválida!");
            System.exit(0);
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        boolean bissexto = ano % 4 == 0;

        boolean dataValida = true;

        if (dia < 1 || mes < 1 || mes > 12 || ano < 1) {
            dataValida = false;
        }
        else if (mes == 2){
            if (bissexto && dia > 29){
                dataValida = false;
            }
            else if (!bissexto && dia > 28){
                dataValida = false;
            }
        }
        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dataValida = false;
        } 
        else if (dia > 31) {
            dataValida = false;
        }

        if (dataValida) {
            System.out.println("Data válida.");
        } 
        else {
            System.out.println("Data inválida.");
        }

        
    }
}
