package AulaFactory;

import java.util.Date;

public class Bola extends Produto{

    double raio;

    public Bola(double peso) {
        super(peso);
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        return (((4 * 3.14) * (raio * raio * raio))/3);
    }
}
