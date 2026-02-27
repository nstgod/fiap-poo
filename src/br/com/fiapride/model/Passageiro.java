package br.com.fiapride.model;

public class Passageiro {

    public String nome;
    public String cpf;
    public double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("O valor da recarga deve ser maior que zero");
            return;
        }
        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("ERRO: O custo da viagem é inválido");
        }
        if (saldo < custo) {
            System.out.println("ERRO: Saldo insuficiente para realizar a viagem");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }

}
