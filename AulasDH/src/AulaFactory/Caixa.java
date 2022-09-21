package AulaFactory;

public class Caixa extends Produto{
    private double comprimento;
    private double altura;
    private double largura;

    public Caixa(double peso) {
        super(peso);
    }

    @Override
    public double calcularEspaco() {
        return (this.comprimento * this.altura * this.largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
