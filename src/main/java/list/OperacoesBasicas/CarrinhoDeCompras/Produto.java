package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

public class Produto {
    //atributo
    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }
    //metodo get para saber a descricao da tarefa

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }
}
