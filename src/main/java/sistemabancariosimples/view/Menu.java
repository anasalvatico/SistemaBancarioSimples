package sistemabancariosimples.view;

import java.math.BigDecimal;
import java.util.Scanner;


public class Menu {

    Scanner le = new Scanner(System.in);

    public int opcaoMenu() {
        System.out.println("Escolha a operação que quer realizar: ");
        System.out.println("1 - depositar saldo");
        System.out.println("2 - sacar saldo");
        System.out.println("3 - sair da conta");


        int numOperacao = le.nextInt();
        le.nextLine();

        return numOperacao;
    }

    public BigDecimal escolherValor(){
        System.out.println("Escolha um valor: ");
        String entrada = le.nextLine().replace(",", ".");
        BigDecimal valorEscolhido = new BigDecimal(entrada);

        return valorEscolhido;
    }

}