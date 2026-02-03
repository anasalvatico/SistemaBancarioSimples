package sistemabancariosimples.controller;

import sistemabancariosimples.model.Conta;
import sistemabancariosimples.view.Mensagens;
import sistemabancariosimples.view.Menu;

public class ContaController {
    private Conta conta;
    private Menu menu;
    private Mensagens mensagens;

    public ContaController(Conta conta, Menu menu){
        this.conta = conta;
        this.menu = menu;
        this.mensagens = mensagens;
    }

    public void iniciarAplicacao(){
        mensagens.mensagemInicial();
    }
}
