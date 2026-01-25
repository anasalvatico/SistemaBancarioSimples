public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimirDadosCliente(String nome, String cpf){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
