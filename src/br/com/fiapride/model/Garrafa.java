package br.com.fiapride.model;

public class Garrafa {

    private String cor;
    private String material;
    private double capacidadeEmMl;
    private double liquidoGarrafa;

    public Garrafa(String cor, String material, double capacidadeEmMl){
        this.cor = cor;
        this.material = material;
        this.capacidadeEmMl = capacidadeEmMl;
    }

    public String getCor() {
        return this.cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return this.material;
    }

    private void setMaterial(String material) {
        this.material = material;
    }

    public void adicionarMl(double valor) {
        if (valor <= 0 || valor > this.capacidadeEmMl) {
            System.out.println("O valor para adicionar deve ser maior que 0 ou menor que a capacidade maxima");
            return;
        }
        this.liquidoGarrafa += valor;
        System.out.println("Foram adicionados " + valor + " ml na garrafa");
        System.out.println("A garrafa está com: " + this.liquidoGarrafa + " ml");
    }

    public double getLiquidoGarrafa() {
        return this.liquidoGarrafa;
    }

    private void setLiquidoGarrafa(double liquidoGarrafa) {
        this.liquidoGarrafa = liquidoGarrafa;
    }

    public double getCapacidadeEmMl() {
        return this.capacidadeEmMl;
    }

    private void setCapacidadeEmMl(double capacidadeEmMl) {
        this.capacidadeEmMl = capacidadeEmMl;
    }

    public void beberLiquido(double quantidade){
        if (quantidade <= 0) {
            System.out.println("Erro: Quantidade invalida para beber");
        }
        if (liquidoGarrafa < quantidade) {
            System.out.println("Erro: Quantidade insuficiente para beber");
            return;
        }
        this.liquidoGarrafa -= quantidade;
        System.out.println("Foi bebido: " + quantidade + "ml da garrafa, Sobraram: " + this.liquidoGarrafa + "ml na garrafa" );
    }
}
