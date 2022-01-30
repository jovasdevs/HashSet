package br.com.jovas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>();

   hashSetCarros.add(new Carro("Fiat"));
   hashSetCarros.add(new Carro("Ford"));
   hashSetCarros.add(new Carro("Zia"));
   hashSetCarros.add(new Carro("Ferrari"));
   hashSetCarros.add(new Carro("Alta Romeu"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Zia"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Alta Romeu"));

        System.out.println(treeSetCarros);

    }
}
