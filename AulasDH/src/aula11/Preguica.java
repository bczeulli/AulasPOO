package aula11;

public class Preguica extends Animal{

    public Preguica(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Ai que sono!!!";
    }

    public String subirEmArvore(){
        return "Preguiça está subindo em uma árvore bem lentamente...";
    }
}
