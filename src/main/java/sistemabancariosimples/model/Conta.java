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

    public void exibirSaldo(){
        System.out.println("Seu saldo atual é: "+this.saldo.setScale(2, RoundingMode.HALF_UP));
    }

    public void realizarDeposito(BigDecimal valorDepositado){
        if(valorDepositado.compareTo(BigDecimal.ZERO) > 0){
            saldo = saldo.add(valorDepositado);
        }else{
            System.out.println("Não foi possível realizar o depósito");
        }

    }

    public void realizarSaque(BigDecimal valorSacado){
        if(valorSacado.compareTo(BigDecimal.ZERO) > 0 && valorSacado.compareTo(saldo) <= 0){
            saldo = saldo.subtract(valorSacado);
        }else{
            System.out.println("Não foi possível realizar o saque");
        }



    }

}


