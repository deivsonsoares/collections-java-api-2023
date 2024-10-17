package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Produto>produtoList;

    public CarrinhoDeCompras() {
        this.produtoList = new ArrayList<>();
    }

    public void adicionarProduto(String descricao){
        produtoList.add(new Produto(descricao));
    }

    public void removerProduto(String descricao){
        List<Produto> produtosParaRemover = new ArrayList<>();
        for (Produto p : produtoList){
            if(p.getDescricao().equalsIgnoreCase(descricao)){
                produtosParaRemover.add(p);
            }

        }
        produtoList.removeAll(produtosParaRemover);
    }
    public int obterNumeroTotalProdutos(){
        return produtoList.size();
    }
    public void obterDescricoesProdutos(){
        System.out.println(produtoList);
    }

    public static void main(String[] args) {
        //ListaProduto listaProduto = new ListaProduto();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O número total de produtos no carrinho é " + carrinhoDeCompras.obterNumeroTotalProdutos());

        carrinhoDeCompras.adicionarProduto("Produto 1");
        carrinhoDeCompras.adicionarProduto("Produto 1");
        carrinhoDeCompras.adicionarProduto("Produto 2");
        System.out.println("O número total de produtos no carrinho é " + carrinhoDeCompras.obterNumeroTotalProdutos());

        carrinhoDeCompras.removerProduto("Produto 1");
        System.out.println("O número total de produtos no carrinho é " + carrinhoDeCompras.obterNumeroTotalProdutos());

        carrinhoDeCompras.obterDescricoesProdutos();
    }
}
