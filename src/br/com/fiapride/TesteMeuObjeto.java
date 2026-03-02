package br.com.fiapride;

import br.com.fiapride.model.Garrafa;

public class TesteMeuObjeto {
    public static void main(String[] args){

        Garrafa minhaGarrafa = new Garrafa("Rosa", "Plastico", 1000);
        System.out.println("Adicionando liquido minha garrafa: ");
        minhaGarrafa.adicionarMl(50);
        Garrafa guilhermeGarrafa = new Garrafa("Vermelha", "Metal", 1000);
        System.out.println("Adicionando liquido na garrafa do guilherme: ");
        guilhermeGarrafa.adicionarMl(1000);

        System.out.println("--- Sistema FiapRide ---");

        System.out.println("Minha garrafa é: " + minhaGarrafa.getCor() + " || O material é: " + minhaGarrafa.getMaterial() + " || E a capacidade em ml é: " + minhaGarrafa.getCapacidadeEmMl() + "ml" + " || A quantidade de liquido em ml na garrafa é: " + minhaGarrafa.getLiquidoGarrafa());

        System.out.println("A garrafa do guilherme é: " + guilhermeGarrafa.getCor() + " || O material dela é: " + guilhermeGarrafa.getMaterial() + " || E a capacidade em ml é: " + guilhermeGarrafa.getCapacidadeEmMl() + "ml" + " || A quantidade de liquido em ml na garrafa é: " + guilhermeGarrafa.getLiquidoGarrafa());
    }
}
