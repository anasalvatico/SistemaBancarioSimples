
public class Conta {
    Cliente cliente;
    double saldo;

    public void exibirSaldo(){
        System.out.println("Seu saldo atual é: "+this.saldo);
    }

    public void realizarDeposito(double valorDepositado){
        if(valorDepositado > 0){
            saldo = saldo + valorDepositado;
        }else{
            System.out.println("Não foi possível realizar o depósito");
        }

    }

    public void realizarSaque(double valorSacado){
        if(valorSacado > 0 && valorSacado <= saldo){
            saldo = saldo - valorSacado;
        }else{
            System.out.println("Não foi possível realizar o saque");
        }

    }


}


