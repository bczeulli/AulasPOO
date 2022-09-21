package Aula13;

import java.util.ArrayList;
import java.util.Collections;



public class Porto {

    private ArrayList<Container> listaContainers = new ArrayList<>();
    private Object Collections;

    public Porto(ArrayList<Container> listaContainers) {
        this.listaContainers = listaContainers;
    }

    public void entradaContainer(Container container){
        listaContainers.add(container);
    }



    public void mostraContainer(){
        java.util.Collections.sort(listaContainers);

        for (Container container: listaContainers ) {
            System.out.println("Numero: " + container.getNumero());
        }

    }

    public int containerPerigosoEDesconhecido(){


        return 0;
    }

    public ArrayList listaContainer(){

        return null;
    }


    public ArrayList<Container> getListaContainers() {
        return listaContainers;
    }

    public void setListaContainers(ArrayList<Container> listaContainers) {
        this.listaContainers = listaContainers;
    }
}
