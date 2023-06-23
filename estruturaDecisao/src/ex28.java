import java.util.Scanner;


public class ex28 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Digite o tipo de carne que deseja:
                [1] - File Duplo
                [2] - Alcatra
                [3] - Picanha
                """);
        String tipoCarne = scanner.nextLine();

        if (!tipoCarne.equals("1") && !tipoCarne.equals("2") && !tipoCarne.equals("3")){
            System.out.println("""
                O tipo de carne selecionado é inválido. Digite:
                [1] - File Duplo
                [2] - Alcatra
                [3] - Picanha
                    """);
            scanner.close();
            System.exit(0);
        }

        System.out.println("Digite a quantidade em KG de Carne que deseja comprar:");
        double qtdKgCarne = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("O pagamento será no cartão tabajara? Digite [S] para sim ou [N] para não");
        String pagamentoCartao = scanner.nextLine().toUpperCase();


        boolean cartaoTabajara = false;
        if (pagamentoCartao.equals("S")){
            cartaoTabajara = true;
        }
        if (pagamentoCartao.equals("N")){
            cartaoTabajara = false;
        }
        if (!pagamentoCartao.equals("S") && pagamentoCartao.equals("N")){
            System.out.println("Digite apenas [S] para sim ou [N] para não\"");
            scanner.close();
            System.exit(0);
        }


        scanner.close();

        double valorKgFileDuplo = 5.8;
        double valorKgAlcatra = 6.8;
        double valorKgPicanha = 7.8;
        double valorTotalCompra = 0;
        double valorDescontoCartao = 0;
        String nomeCarne = "Sem Nome";

        if (tipoCarne.equals("1")){
            nomeCarne = "File Duplo";
            if (qtdKgCarne > 5) {
                valorKgFileDuplo = 4.9;
                valorTotalCompra = qtdKgCarne * valorKgFileDuplo;
            }
            valorTotalCompra = qtdKgCarne * valorKgFileDuplo;
        }
        if (tipoCarne.equals("2")){
            nomeCarne = "Alcatra";
            if (qtdKgCarne > 5) {
                valorKgAlcatra = 5.9;
                valorTotalCompra = qtdKgCarne * valorKgAlcatra;
            }
            valorTotalCompra = qtdKgCarne * valorKgAlcatra;
        }
        if (tipoCarne.equals("3")){
            nomeCarne = "Picanha";
            if (qtdKgCarne > 5) {
                valorKgPicanha = 6.9;
                valorTotalCompra = qtdKgCarne * valorKgPicanha;
            }
            valorTotalCompra = qtdKgCarne * valorKgPicanha;
        }

        if (cartaoTabajara){
            valorDescontoCartao = valorTotalCompra * 0.05;
            valorTotalCompra = valorTotalCompra - (valorTotalCompra * 0.05);
        }

        System.out.printf("""
                Carne comprada: %s
                KG(s) comprados: %f
                Utilizou Cartão Tabajara: %s
                Desconto Cartão Tabajara: R$ %.2f
                Valor Total Compra: R$ %.2f
                """, nomeCarne, qtdKgCarne, cartaoTabajara?"Sim":"Não", valorDescontoCartao, valorTotalCompra);

    }
}
