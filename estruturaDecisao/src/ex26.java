import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Digite qual Gasolina utilizou:
                [A] - Álcool
                [G] - Gasolina
                """);
        String tipoGasolina = scanner.nextLine().toUpperCase();

        if (!tipoGasolina.equals("G") && !tipoGasolina.equals("A")){
            System.out.println("Tipo de gasolina inválida! Digite [A] para álcool ou [G] para Gasolina.");
            scanner.close();
            System.exit(0);
        }

        System.out.println("Digite quantos litros foi necessário para abastecer:");
        double qtdLitrosAbastecidos = scanner.nextDouble();
        scanner.close();

        if (qtdLitrosAbastecidos < 0){
            System.out.println("Não é possível abastecer um valor negativo!");
            System.exit(0);
        }

        double valorGasolinaL = 2.5;
        double valorAlcoolL = 1.9;
        double valorGasto = 0;
        int descontoPorLitro;

        if (tipoGasolina.equals("A")){

            if (qtdLitrosAbastecidos > 20){
                valorAlcoolL = valorAlcoolL - (valorAlcoolL * 0.05);
                valorGasto = qtdLitrosAbastecidos * valorAlcoolL;
                descontoPorLitro = 5;
            }
            else {
                valorAlcoolL = valorAlcoolL - (valorAlcoolL * 0.03);
                valorGasto = qtdLitrosAbastecidos * valorAlcoolL;
                descontoPorLitro = 3;
            }
            System.out.printf("""
                *TABELA ÁLCOOL*%n
                Litros abastecids: %f %n
                Desconto por Litro: %d%% %n
                Valor total gasto: %f
                """, qtdLitrosAbastecidos, descontoPorLitro, valorGasto);
        }
        else{
            if (qtdLitrosAbastecidos > 20){
                valorGasolinaL = valorGasolinaL - (valorGasolinaL * 0.06);
                valorGasto = qtdLitrosAbastecidos * valorGasolinaL;
                descontoPorLitro = 6;
            }
            else {
                valorGasolinaL = valorGasolinaL - (valorGasolinaL * 0.04);
                valorGasto = qtdLitrosAbastecidos * valorGasolinaL;
                descontoPorLitro = 4;
            }
            System.out.printf("""
                *TABELA GASOLINA*%n
                Litros abastecido: %f %n
                Desconto por Litro: %d%% %n
                Valor total gasto: %.2f
                """, qtdLitrosAbastecidos, descontoPorLitro, valorGasto);
        }


        
    }
}
