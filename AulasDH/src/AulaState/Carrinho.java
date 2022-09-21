package AulaState;

import java.util.ArrayList;

public class Carrinho implements Estado{

    private Estado estado;
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Carrinho() {
        this.setEstado(new Vazio(this));
    }

    @Override
    public void adicionarProduto(Produto produto) {
        
        listaProdutos.add(produto);
        System.out.println("o produto " + produto.getDescricao() + " foi adicionado ao carrinho.");
    }

    @Override
    public void cancelar() {
        getEstado().cancelar();
    }

    @Override
    public void retornar() {
        getEstado().retornar();
    }

    @Override
    public void proximoEstado() {
        getEstado().proximoEstado();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
