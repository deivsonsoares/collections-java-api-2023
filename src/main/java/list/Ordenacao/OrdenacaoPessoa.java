package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoa {
    //atributos
    private List<Pessoa> pessoaList;

    //criando constructor sem receber dados, array vazio

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    //implementando os métodos
    //adicionar pessoas
    public void adicionarPessoa(String nome, int idade, double altura){
        //chamar  pessoa list, adicionar new pessoa
        pessoaList.add(new Pessoa(nome, idade, altura));

    }
    //ordenar por idade
    public List<Pessoa> ordenarPorIdade(){
        //new arraym list não vai iniciar vazia, ira iniciar com todos os elementos da lista pessoa pessoaList
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        //neste momento a lista esta duplicada mas ainda nao ordenada
        //é quando usamos a interface collection com metodo sort
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    //comparacao por altura
    public List<Pessoa> ordenarPorAltura(){
        //duplicando a lista de pessoas por altura, isso se deve por usar o collections.sort
       List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
       Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
       return pessoasPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1 ", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2 ", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3 ", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4 ", 17, 1.56);

       // System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.print(ordenacaoPessoa.ordenarPorAltura());

    }
}
