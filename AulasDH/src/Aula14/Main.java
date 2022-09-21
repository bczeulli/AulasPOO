package Aula14;

public class Main {
    public static void main(String[] args) throws Exception {
        Selecao selecao = new Selecao("Brasil");
        Jogador jogador1 = new Jogador(9, "Zeulli", "Atacante");
        Jogador jogador2 = new Jogador(11, "Anjos", "Goleiro");
        Jogador jogador3 = new Jogador(23, "Barros", "Meio Campista");
        Jogador jogador4 = new Jogador(5, "James", "Defensor");
        Jogador jogador5 = new Jogador(1, "Fauth", "Goleiro");


        selecao.addJogador(jogador1);
        selecao.addJogador(jogador2);
        selecao.addJogador(jogador3);
        selecao.addJogador(jogador4);
        selecao.addJogador(jogador5);

        System.out.println(selecao.obterReservas());
        System.out.println(selecao.quantJogadores("Goleiro"));
        System.out.println(selecao.quantJogadores("Gandula"));

    }
}
