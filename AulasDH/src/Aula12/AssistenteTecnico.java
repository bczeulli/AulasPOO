package Aula12;

public class AssistenteTecnico extends Funcionario{

    private Double bonus;

    public AssistenteTecnico(String nome, Double salario, Double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public Double ganhoAnual() {
        Double salarioAnual = getSalario() * 12;
        salarioAnual = salarioAnual + bonus;
        return salarioAnual;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
