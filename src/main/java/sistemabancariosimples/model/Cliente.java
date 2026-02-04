package sistemabancariosimples.model;

public class Cliente {
    private String nome;
    private String cpf;



    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = nome;
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio ou composto apenas por espaços.");
        }
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio ou composto apenas por espaços.");
        }
    }



    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
