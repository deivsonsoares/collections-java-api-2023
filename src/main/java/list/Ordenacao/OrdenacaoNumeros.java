package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numeros> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new Numeros(numero));
    }
    public List<Numeros> ordemCrescente(){
        List<Numeros> numerosCrescentes = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosCrescentes);
            return numerosCrescentes;
        }else{
            throw  new RuntimeException("A lista está vazia!");
        }
    }
    public List<Numeros> ordemDecrescente(){
        List<Numeros> numerosDecrescentes = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()){
            numerosDecrescentes.sort(Collections.reverseOrder());
            return numerosDecrescentes;
        }else{
            throw  new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(6);

        System.out.println("Números em ordem Crescente:");
        System.out.println(ordenacaoNumeros.ordemCrescente());

        System.out.println("Números em ordem Decrescente:");
        System.out.println(ordenacaoNumeros.ordemDecrescente());

    }
}
