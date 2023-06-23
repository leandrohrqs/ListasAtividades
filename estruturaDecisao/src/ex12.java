import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quanto voce ganha por hora");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite as horas inteiras trabalhadas");
        int qtdHorasTrabalhadas = scanner.nextInt();
        scanner.close();

        double salarioBruto = valorHora * qtdHorasTrabalhadas;
        
        double descontoIR = 0;
        int porcentagemDescontoIR = 0;

        if (salarioBruto <= 900){
            descontoIR = 0;
            porcentagemDescontoIR = 0;
        }
        else if (salarioBruto <= 1500){
            descontoIR = 0.05;
            porcentagemDescontoIR = 5;
        }
        else if (salarioBruto <= 2500){
            descontoIR = 0.1;
            porcentagemDescontoIR = 10;
        }
        else {
            descontoIR = 0.2;
            porcentagemDescontoIR = 20;
        }
        
        
        double descontoSindicato = salarioBruto * 0.03;
        double descontoFGTS = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.1;
        descontoIR = salarioBruto * descontoIR;
        double descontoTOTAL = descontoSindicato + descontoINSS + descontoIR;
        double salarioLiquido = salarioBruto - descontoTOTAL;

        System.out.printf("Salario Bruto: (%.2f * %d): R$ %.2f", valorHora, qtdHorasTrabalhadas, salarioBruto);
        System.out.printf("%n  - IR (%d%%): R$ %.2f ", porcentagemDescontoIR, descontoIR);
        System.out.printf("%n  - INSS (10%%): R$ %.2f", descontoINSS);
        System.out.printf("%n  - Sindicato (3%%): R$ %.2f", descontoSindicato);
        System.out.printf("%n    FGTS (11%%): R$ %.2f", descontoFGTS);
        System.out.printf("%n    Total de descontos: R$ %.2f", descontoTOTAL);
        System.out.printf("%nSalario Liquido: R$ %.2f", salarioLiquido);




    }
}
