package br.com.empresa.banco.Sistemas;

import br.com.empresa.banco.Tributos.Tributavel;

public class GerenciadorDeImpostosDeRenda {
    private double total = 0;

    public void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);

        this.total += t.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
}
