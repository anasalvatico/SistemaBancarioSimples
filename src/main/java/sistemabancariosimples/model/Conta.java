package sistemabancariosimples.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conta {
    private Cliente cliente;
    private BigDecimal saldo = BigDecimal.ZERO;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = saldo;

    }

    //public void exibirSaldo(){
        //System.out.println("Seu saldo atual é: "+this.saldo.setScale(2, RoundingMode.HALF_UP));
    //}

    public void realizarDeposito(BigDecimal valorEscolhido){
        if(valorEscolhido.compareTo(BigDecimal.ZERO) > 0){
            saldo = saldo.add(valorEscolhido);
        }else{
            System.out.println("Não foi possível realizar o depósito");
        }

    }


    public void realizarSaque(BigDecimal valorEscolhido){
        if(valorEscolhido.compareTo(BigDecimal.ZERO) > 0 && valorEscolhido.compareTo(saldo) <= 0){
            saldo = saldo.subtract(valorEscolhido);
        }else{
            System.out.println("Não foi possível realizar o saque");
        }

    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}


