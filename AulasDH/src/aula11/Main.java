package aula11;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", 2);
        Cavalo cavalo1 = new Cavalo("Spirit", 3);
        Preguica preguica1 = new Preguica("Flecha", 18);

        System.out.println(cachorro1.emitirSom());
        System.out.println(cavalo1.emitirSom());
        System.out.println(preguica1.emitirSom());

        System.out.println(cachorro1.correr());
        System.out.println(cavalo1.correr());
        System.out.println(preguica1.subirEmArvore());
    }
}
