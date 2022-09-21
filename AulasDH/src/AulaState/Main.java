package AulaState;

public class Main {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        Produto bola = new Produto("Bola de futebol", 5);
        Produto cola = new Produto("Cola do Mateus", 20);
        Produto bolacha = new Produto("Bolacha Trakinas", 3);
        Produto mochila = new Produto("Mochila escolar", 80);

        carrinho.adicionarProduto(bola);
        carrinho.proximoEstado();
        carrinho.proximoEstado();
        carrinho.retornar();
        carrinho.adicionarProduto(cola);
        carrinho.proximoEstado();
        carrinho.proximoEstado();
        carrinho.adicionarProduto(bolacha);

    }
}
