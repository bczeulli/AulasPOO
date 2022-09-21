package AulaState;

import java.util.ArrayList;

public interface Estado {




    void adicionarProduto(Produto produto);

    void cancelar();
    void retornar();
    void proximoEstado();


}
