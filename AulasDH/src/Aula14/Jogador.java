package Aula14;

public class Jogador implements Comparable<Jogador> {

    int numCamisa;
    String sobrenome, posicao;


    public Jogador(int numCamisa, String sobrenome, String posicao) {
        this.numCamisa = numCamisa;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
    }


    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public int compareTo(Jogador o) {
        if (o.numCamisa == this.numCamisa){
            // System.out.println("Os jogadores são iguais");
            return 0; //se iguais retorna 0
        }else if (o.numCamisa < this.numCamisa){
            //System.out.println("Um jogador é menor que o outro");
            return -1; // retorna um numero menor que 0
        }else{
            // System.out.println("Um é jogador maior que o outro");
            return 1; // retorna um numero maior que 0
        }
    }
}
