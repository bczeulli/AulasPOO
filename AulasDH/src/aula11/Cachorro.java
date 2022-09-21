package aula11;

public class Cachorro extends Animal{

    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "E o cachorro disse: AU AU!!!";
    }

    public String correr(){
        return "Cachorro está correndo!!!!!!";
    }
}
