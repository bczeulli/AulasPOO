package AulaState;

public class Vazio implements Estado{
    Carrinho c;

    public Vazio(Carrinho c) {
        this.c = c;

        System.out.println("Vazio");
    }

    @Override
    public void adicionarProduto(Produto produto) {
        c.adicionarProduto(produto);
    }

    @Override
    public void cancelar() {
        System.out.println("O carrinho já está vazio");
    }

    @Override
    public void retornar() {
        System.out.println("O carrinho está vazio. Não foi possível recuperar os produtos do carrinho anterior.");
    }

    @Override
    public void proximoEstado() {
        c.setEstado(new Carregando(c));
    }

}
