package Aula12;

public class AssistenteAdministrativo extends Funcionario{

    private boolean trabalhaNoturno;
    private Double adicionalNoturno = 360.5;

     public AssistenteAdministrativo(String nome, Double salario, boolean trabalhaNoturno) {
         super(nome, salario);
         this.trabalhaNoturno = trabalhaNoturno;
     }



    @Override
    public Double ganhoAnual() {
        Double salarioAnual = getSalario() * 12;
        if (trabalhaNoturno){
            return salarioAnual + adicionalNoturno;
        } else  { return salarioAnual; }
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + getNome() + " ganha anualmente : " + ganhoAnual());
    }
}
