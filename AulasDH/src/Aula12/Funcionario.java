package Aula12;

public abstract class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Double addAumento(){
        return this.salario + 0.1;
    }

    public Double ganhoAnual() {
        return salario;
    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nome + " Salário: " + this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


}
