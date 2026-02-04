import sistemabancariosimples.controller.ContaController;
import sistemabancariosimples.model.Cliente;
import sistemabancariosimples.model.Conta;
import sistemabancariosimples.view.Mensagens;
import sistemabancariosimples.view.Menu;


public class Main {
    public static void main(String[] args) {

        Mensagens mensagens = new Mensagens();
        Cliente cliente = new Cliente(mensagens.mensagemCriarContaNome(), mensagens.mensagemCriarContaCpf());
        Conta conta = new Conta(cliente);
        Menu menu = new Menu();
        ContaController contaController = new ContaController(conta, menu, mensagens);

        contaController.iniciarAplicacao();

        }
    }

