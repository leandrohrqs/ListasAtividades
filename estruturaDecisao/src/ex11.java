import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salario:");
        double salario = scanner.nextDouble();
        scanner.close();

        int ajuste = 0; 
        double salarioNovo = 0;

        if (salario < 280){
            salarioNovo = salario * 1.2;
            ajuste = 20;
        }
        else if (salario >= 280 && salario < 700){
            salarioNovo = salario * 1.15;
            ajuste = 15;
        }
        else if (salario >= 700 && salario < 1500){
            salarioNovo = salario * 1.1;
            ajuste = 10;
        }
        else{
            salario *= 1.05;
            ajuste = 5;
        }
        System.out.printf("""
                %nSalario antigo: R$ %.2f
                %nPercentual de aumento: %d%%
                %nValor do aumento: R$ %.2f
                %nSalario Novo : R$ %.2f
                """, salario, ajuste, salarioNovo - salario, salarioNovo);
    }
}
