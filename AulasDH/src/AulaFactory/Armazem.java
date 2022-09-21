package AulaFactory;



import java.util.ArrayList;

public class Armazem {

    String nome;

    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Armazem(String nome) {
        this.nome = nome;
    }

    public void addProduto(Produto produto){
        listaProdutos.add(produto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularEspacoNecessario(){
        double espacoTotal = 0;

        for (Produto produto: listaProdutos ){
            espacoTotal += produto.calcularEspaco();
        }
        System.out.println("O espaço total necessário é " + espacoTotal);
        return espacoTotal;
    };
}
