import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);


        System.out.println("Bem vindo ao sistema bancário");
        System.out.println("Digite o seu nome para começar a criar sua conta");
        String nome = le.nextLine();
        System.out.println("Digite o seu cpf");
        String cpf = le.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        Conta conta = new Conta(cliente);

        Menu menu = new Menu();


        while(true) {
            menu.imprimirMenu();
            int numOperacao = le.nextInt();
            le.nextLine();
            if (numOperacao == 1) {
                System.out.println("Valor a ser depositado: ");
                BigDecimal valorDepositado = le.nextBigDecimal();
                le.nextLine();
                conta.realizarDeposito(valorDepositado);
                conta.exibirSaldo();
            } else if (numOperacao == 2) {
                System.out.println("Valor a ser sacado: ");
                BigDecimal valorSacado = le.nextBigDecimal();
                le.nextLine();
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

