package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Garrafa;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro("Ana silva", "222");
        System.out.println("Recarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Nelson Troccoli", "123");
        System.out.println("Recarga passageiro 2");
        passageiro2.adicionarSaldo(15.0);


        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo + " | CPF: " + passageiro1.cpf);

        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo + " | CPF: " + passageiro2.cpf);

        System.out.println("Pagando passagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando passagem do passageiro 2");
        passageiro2.pagarViagem(20);



        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?

        /*Garrafa minhaGarrafa = new Garrafa();
        minhaGarrafa.Cor = "Rosa";
        minhaGarrafa.Material = "Plastico";
        minhaGarrafa.capacidadeEmMl = 100;

        Garrafa guilhermeGarrafa = new Garrafa();
        guilhermeGarrafa.Cor = "Vermelha";
        guilhermeGarrafa.Material = "Metal";
        guilhermeGarrafa.capacidadeEmMl = 50;

        System.out.println("Minha garrafa é: " + minhaGarrafa.Cor);
        System.out.println("A garrafa do guilherme é: " + guilhermeGarrafa.Cor);*/
        }
}
