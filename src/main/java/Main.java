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


        while(true) {
            System.out.println("Escolha a operação que quer realizar: 1 - depositar saldo, 2 - Sacar saldo, 3 - Sair da conta");
            int opcao = le.nextInt();
            le.nextLine();


            if (opcao == 1) {
                System.out.println("Valor a ser depositado: ");
                double valorDepositado = le.nextDouble();
                le.nextLine();
                conta.realizarDeposito(valorDepositado);
                conta.exibirSaldo();
            } else if (opcao == 2) {
                System.out.println("Valor a ser sacado: ");
                double valorSacado = le.nextDouble();
                le.nextLine();
                conta.realizarSaque(valorSacado);
                conta.exibirSaldo();
            } else if (opcao == 3){
                System.out.println("Saindo da conta");
                break;
            }else{
                System.out.println("opção inválida");
            }

        }


        }
    }

