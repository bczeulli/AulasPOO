package aula01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);

        String nome, sobrenome, iniciais;
        int dia, mes, ano;


        System.out.println("Informe seu nome: ");
        nome = scan.next();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = scan.next();
        System.out.println("Informe o dia do seu aniversário: ");
        dia = scan.nextInt();
        System.out.println("Informe o mes do seu aniversário: ");
        mes = scan.nextInt();
        System.out.println("Informe o ano do seu aniversário: ");
        ano = scan.nextInt();
        iniciais = nome.substring(0,1) + sobrenome.substring(0,1);
        System.out.println(nome + " " + sobrenome + " " + " " + iniciais + " seu aniversário é em: " + dia + "/ " + mes + "/ " + ano);

    }
}
