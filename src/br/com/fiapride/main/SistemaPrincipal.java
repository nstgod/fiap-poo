package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- Iniciando o Sistema FiapRide --- \n");

        Passageiro passageiro1 = new Passageiro("Ana silva", "222.222.222-22");
        System.out.println("Recarga passageiro 1: ");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Nelson Troccoli", "333.333.333-33");
        System.out.println("Recarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);


        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$" + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());

        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$" + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());

        System.out.println("Pagando passagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando passagem do passageiro 2");
        passageiro2.pagarViagem(20);
        }
}
