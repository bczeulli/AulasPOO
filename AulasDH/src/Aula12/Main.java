package Aula12;

public class Main {
    public static void main(String[] args) {
        AssistenteAdministrativo assistente3 = new AssistenteAdministrativo("Administrativo", 1200.0, true);
        assistente3.exibeDados();

        Assistente assistente1 = new Assistente("bob", 1200.0, 12345);
        assistente1.exibeDados();

        AssistenteTecnico assistenteT1 = new AssistenteTecnico("Bia", 1500.0, 200.0);
        System.out.println(assistenteT1.getNome() + " ganhou um bônus no valor de R$" + assistenteT1.getBonus() + " com isso o valor anual foi de R$" + assistenteT1.ganhoAnual());

    }

}
