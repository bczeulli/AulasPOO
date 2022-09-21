package AulaState;

import java.util.ArrayList;

public class Pagando implements Estado{

    Carrinho c;

    public Pagando(Carrinho c) {
        this.c = c;
        System.out.println("Pagando");
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Não é possível adicionar produtos durante checkout. Volte à tela de compras para isso");
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vazio(c));
    }

    @Override
    public void retornar() {
        c.setEstado(new Carregando(c));
    }

    @Override
    public void proximoEstado() {
        c.setEstado(new Fechado(c));
    }
}
