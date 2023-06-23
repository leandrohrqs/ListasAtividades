import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<String> qtdRepostas = new ArrayList<>();

        System.out.println("Responda com apenas [S] SIM ou [N] NÃO para as perguntas a baixo:");

        System.out.println("Telefonou para a vítima?");
        String resposta1 = scanner.nextLine().toUpperCase();
        if (!resposta1.equals("S") && !resposta1.equals("N")){
            System.out.println("Resposta inválida, digite apenas [S] SIM ou [N] NÃO");
            System.exit(0);
        }
        qtdRepostas.add(resposta1);

        System.out.println("Esteve no local do crime?");
        String resposta2 = scanner.nextLine().toUpperCase();
        if (!resposta2.equals("S") && !resposta2.equals("N")){
            System.out.println("Resposta inválida, digite apenas [S] SIM ou [N] NÃO");
            System.exit(0);
        }
        qtdRepostas.add(resposta2);

        System.out.println("Mora perto da vítima?");
        String resposta3 = scanner.nextLine().toUpperCase();
        if (!resposta3.equals("S") && !resposta3.equals("N")){
            System.out.println("Resposta inválida, digite apenas [S] SIM ou [N] NÃO");
            System.exit(0);
        }
        qtdRepostas.add(resposta3);

        System.out.println("Devia para a vítima?");
        String resposta4 = scanner.nextLine().toUpperCase();
        if (!resposta4.equals("S") && !resposta4.equals("N")){
            System.out.println("Resposta inválida, digite apenas [S] SIM ou [N] NÃO");
            System.exit(0);
        }
        qtdRepostas.add(resposta4);

        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = scanner.nextLine().toUpperCase();
        scanner.close();
        if (!resposta5.equals("S") && !resposta5.equals("N")){
            System.out.println("Resposta inválida, digite apenas [S] SIM ou [N] NÃO");
            System.exit(0);
        }
        qtdRepostas.add(resposta5);

        int contador = 0;
        for (String resposta : qtdRepostas) {
            if (resposta.equals("S")) {
                contador++;
            }
        }
        
        String classificacao = "Inocente";
        if (contador == 2){
            classificacao = "Suspeito";
        }
        else if (contador >= 3 || contador <= 4){
            classificacao = "Cúmplice";
        }
        else if (contador == 5){
            classificacao = "Assassino";
        }
        
        System.out.println("O participante é: "+ classificacao);

    }
}
