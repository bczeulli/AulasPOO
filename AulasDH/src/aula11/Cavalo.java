package aula11;

public class Cavalo extends Animal{

    public Cavalo(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "E o cavalo disse: Hiin in in!!!";
    }

    public String correr(){
        return "Cavalo está galopando!!!!!!";
    }
}
