import sistemabancariosimples.model.Cliente;
import sistemabancariosimples.model.Conta;
import sistemabancariosimples.view.Menu;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);


        System.out.println("Bem vindo ao sistema bancário");


        String nome = "";
        while (nome.isBlank()) {
            System.out.println("Digite o seu nome para começar a criar sua conta:");
            nome = le.nextLine();
        }
        String cpf = "";
        while(cpf.isBlank()){
            System.out.println("Digite o seu cpf");
            cpf = le.nextLine();
        }

        Cliente cliente = new Cliente(nome, cpf);
        Conta conta = new Conta(cliente);
        Menu menu = new Menu();

       while(true) {
            menu.imprimirMenu();
            int numOperacao = le.nextInt();
            le.nextLine();
            if (numOperacao == 1) {
                System.out.println("Valor a ser depositado: ");
                String entrada = le.nextLine().replace(",", ".");
                BigDecimal valorDepositado = new BigDecimal(entrada);
                conta.realizarDeposito(valorDepositado);
                conta.exibirSaldo();
            } else if (numOperacao == 2) {
                System.out.println("Valor a ser sacado: ");
                String entrada = le.nextLine().replace(",", ".");
                BigDecimal valorSacado = new BigDecimal(entrada);
                conta.realizarSaque(valorSacado);
                conta.exibirSaldo();
            } else if (numOperacao == 3){
                System.out.println("Saindo da conta");
                break;
            }else{
                System.out.println("opção inválida");
            }

        }


        }
    }

