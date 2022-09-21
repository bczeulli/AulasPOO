package AulaFactory;

public class ProdutoFactory {
    private static ProdutoFactory instance;

    private ProdutoFactory(){}

    public static ProdutoFactory getInstance(){
        if (instance == null){
            instance = new ProdutoFactory();
        }
        return instance;
    }

    public Produto criarProduto(String tipo, double peso){

        if(tipo.equals("CAIXA10X10")){
            Caixa caixa = new Caixa(peso);
            caixa.setAltura(0.10);
            caixa.setLargura(0.10);
            return caixa;
        } else if (tipo.equals("FUTEBOL")){
            Bola bolaFutebol = new Bola(peso);
            bolaFutebol.setRaio(0.11);
            return bolaFutebol;
        } else if (tipo.equals("BOLATENIS")){
            Bola bolaTenis = new Bola(peso);
            bolaTenis.setRaio(0.32);
            return bolaTenis;
        }

        return null;
    }
}
