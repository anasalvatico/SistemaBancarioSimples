package sistemabancariosimples.view;

import java.math.BigDecimal;

public class Mensagens {

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

    public void mensagemErroOperacao(){
        System.out.println("Não foi possível realizar a operação");
    }


}
