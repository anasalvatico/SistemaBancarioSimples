public class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = saldo;

    }

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

    public Cliente getCliente() {
        return cliente;
    }
}


