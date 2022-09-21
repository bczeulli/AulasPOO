package AulaState;

import java.util.ArrayList;

public class Fechado implements Estado{

    Carrinho c;

    public Fechado(Carrinho c) {
        this.c = c;
        System.out.println("Fechado");
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("O carrinho está fechado");
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vazio(c));
    }

    @Override
    public void retornar() {
        System.out.println("O carrinho está fechado");
    }

    @Override
    public void proximoEstado() {
        c.setEstado(new Vazio(c));

    }
}
