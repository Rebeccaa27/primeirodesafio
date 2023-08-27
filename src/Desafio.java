/*Dados inicias

Nome do cliente:
Tipo de conta:
Saldo inicial:

Menu opções :
1- consultar
2- receber valor
3- tranferencia valor
4- sair
*/

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        // variavel de dados
        String nome = "Tony Stark";
        String tipoDeConta = "Corrente";
        double saldo = 5500.99;

        System.out.println("**********************************");

        System.out.println("\nNome do cliente:    " + nome);
        System.out.println("Tipo de conta:   " + tipoDeConta);
        System.out.println("Saldo atual:   " + saldo);

        System.out.println("\n**********************************");

        // variavel opção
        int opcao = 0;

        String menu = """
                ** Digite sua opção
                1 - Consultar
                2- Transferir valor
                3 - Receber valor
                4 - Sair
                **
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
                opcao = leitura.nextInt();

            } else if (opcao == 2) {
                System.out.println("Quanto deseja transferir? ");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para realizar a transferência");

                } else {
                    saldo -= -valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo : " + saldo);
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
            }
        }
    }
}
