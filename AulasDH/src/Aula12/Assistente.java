package Aula12;

public class Assistente extends Funcionario{

    private Integer matricula;

    public Assistente(String nome, Double salario, Integer matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + getNome() + " Salário: " + getSalario() + " Matrícula: " + this.matricula);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}

