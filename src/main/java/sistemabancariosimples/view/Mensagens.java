package sistemabancariosimples.view;

import java.math.BigDecimal;
import java.util.Scanner;

public class Mensagens {
    Scanner le = new Scanner(System.in);

    public void mensagemInicial(){
        System.out.println("Bem vindo ao sistema bancário");
    }

    public void mensagemSaidaConta(){
        System.out.println("Saindo da conta");
    }

    public void mensagemOpcaoInvalida(){
        System.out.println("Opção inválida");
    }

    public void exibirSaldo(BigDecimal saldo) {
        System.out.println("Saldo: " + saldo.setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    public String mensagemErroOperacao(){
        String erroOperacao = "Não foi possível realizar a operação";
        System.out.println(erroOperacao);
        return erroOperacao;
    }

    public String mensagemCriarContaNome(){
        System.out.println("Digite o seu nome para começar a criar sua conta:");
        String nome = le.nextLine();
        return nome;
    }

    public String mensagemCriarContaCpf(){
        System.out.println("Digite o seu cpf");
        String cpf = le.nextLine();
        return cpf;
    }


}
