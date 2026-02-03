package sistemabancariosimples.controller;

import sistemabancariosimples.model.Conta;
import sistemabancariosimples.view.Mensagens;
import sistemabancariosimples.view.Menu;

import java.math.BigDecimal;

public class ContaController {
    private Conta conta;
    private Menu menu;
    private Mensagens mensagens;

    public ContaController(Conta conta, Menu menu, Mensagens mensagens) {
        this.conta = conta;
        this.menu = menu;
        this.mensagens = mensagens;
    }

    public void iniciarAplicacao(){
        mensagens.mensagemInicial();

        while(true){
            int numOperacao = menu.opcaoMenu();
            switch(numOperacao) {
                case 1:
                    BigDecimal valorEscolhido = menu.escolherValor();
                    conta.realizarDeposito(valorEscolhido);
                    mensagens.exibirSaldo(conta.getSaldo());
                    break;
                case 2:
                    valorEscolhido = menu.escolherValor();
                    conta.realizarSaque(valorEscolhido);
                    mensagens.exibirSaldo(conta.getSaldo());
                    break;
                case 3:
                    mensagens.mensagemSaidaConta();
                    return;
                default:
                    mensagens.mensagemOpcaoInvalida();

            }
        }
    }
}
