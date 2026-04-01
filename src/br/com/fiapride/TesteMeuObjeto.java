package br.com.fiapride;

import br.com.fiapride.model.Garrafa;
import br.com.fiapride.model.Tampa;

public class TesteMeuObjeto {
    public static void main(String[] args){

        Tampa tampaTermica = new Tampa("Preta", "Rosca");

        Garrafa minhaGarrafa = new Garrafa(tampaTermica, "Aço Inox", 1000.0);

        System.out.println("--- DADOS DA ASSOCIAÇÃO ---");

        System.out.println("Garrafa criada com material: " + minhaGarrafa.getMaterial());
        System.out.println("A cor da tampa associada é: " + minhaGarrafa.getTampa().getCor());


        System.out.println("\n--- TESTANDO AÇÕES E LIMITES ---");

        // Testando o limite da capacidade
        minhaGarrafa.adicionarMl(800);
        minhaGarrafa.adicionarMl(300);

        System.out.println("---------------------------------");

        // Testando os limites de beber
        minhaGarrafa.beberLiquido(200);
        minhaGarrafa.beberLiquido(900);

    }
}
