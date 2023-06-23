import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class ex13 {
    public static void main(String[] args) throws Exception {
        String[] diaDaSemana = {"Numero invalido", "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
        List<Integer> verificacaoDias = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Digite o numero do dia da semana que deseja:
                1 - Domingo
                2 - Segunda
                3 - Terca
                4 - Quarta
                5 - Quinta
                6 - Sexta
                7 - Sabado
                """);
        int diaSelecionado = scanner.nextInt();
        scanner.close();

        if (verificacaoDias.contains(diaSelecionado)) {
            System.out.printf("%n %s selecionado(a)!", diaDaSemana[diaSelecionado]);
        }
        else{
            System.out.println(diaDaSemana[0]);
        }
    }
}
