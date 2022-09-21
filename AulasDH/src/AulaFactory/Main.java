package AulaFactory;

public class Main {
    public static void main(String[] args) {

        Armazem armazem = new Armazem("Armazem");
        ProdutoFactory produto = ProdutoFactory.getInstance();

        armazem.addProduto(produto.criarProduto("CAIXA10X10", 5));
        armazem.addProduto(produto.criarProduto("FUTEBOL", 5));
        armazem.addProduto(produto.criarProduto("BOLATENIS", 5));

        armazem.calcularEspacoNecessario();
    }
}
