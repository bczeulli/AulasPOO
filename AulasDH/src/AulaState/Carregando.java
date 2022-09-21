package AulaState;

import java.util.ArrayList;

public class Carregando implements Estado{

    Carrinho c;



    public Carregando(Carrinho c) {
        this.c = c;
        System.out.println("Carregando");
    }

    @Override
    public void adicionarProduto(Produto produto) {
        c.adicionarProduto(produto);
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vazio(c));
    }

    @Override
    public void retornar() { c.setEstado(new Vazio(c));

    }

    @Override
    public void proximoEstado() {
        c.setEstado(new Pagando(c));
    }
}
