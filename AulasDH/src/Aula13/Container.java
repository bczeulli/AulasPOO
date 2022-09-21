package Aula13;

public class Container implements Comparable<Container>{
    private Integer numero;
    private String descricao;
    private String origem;
    private boolean materiaisPerigosos;

    public Container(Integer numero, String descricao, String origem, boolean materiaisPerigosos) {
        this.numero = numero;
        this.descricao = descricao;
        this.origem = origem;
        this.materiaisPerigosos = materiaisPerigosos;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public boolean isMateriaisPerigosos() {
        return materiaisPerigosos;
    }

    public void setMateriaisPerigosos(boolean materiaisPerigosos) {
        this.materiaisPerigosos = materiaisPerigosos;
    }

    @Override
    public int compareTo(Container o) {
        return 0;
    }
}
