package br.com.mgs;

public class Empregado {
    private String id;
    private String nome;
    private int idade;
    private String alergias;
    private String problemasMedicos;
    private String telefone;
    private String email;

    public Empregado(String id, String nome, int idade, String alergias, String problemasMedicos, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", alergias='" + alergias + '\'' +
                ", problemasMedicos='" + problemasMedicos + '\'' +
                ", telefoneContato='" + telefone + '\'' +
                ", emailContato='" + email + '\'' +
                '}';
    }
}
