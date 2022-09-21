package Aula14;

import java.util.ArrayList;

public class Selecao {
    private String nome;

    private ArrayList<Jogador> listaJogadores = new ArrayList<>();


    public Selecao(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);
    }

    public ArrayList obterReservas() {
        ArrayList<Jogador> reservas = new ArrayList<>();

        for (Jogador jogador : listaJogadores) {


            if (jogador.numCamisa >= 19) {
                reservas.add(jogador);
            }
        }

        return reservas;
    }

    public int quantJogadores(String posicao) throws Exception {
        int quantidade = 0;
        if (posicao == "Goleiro" || posicao == "Defensor" || posicao == "Meio Campista" || posicao == "Atacante"){
            for (Jogador jogador : listaJogadores){
                if (jogador.posicao == posicao){
                    quantidade++;
                }
            }
        } else {
            throw new RuntimeException("Não é uma posição válida!!");
        }

        return quantidade;
    }




}
