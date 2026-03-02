package br.com.fiapride.model;

public class Garrafa {

    private String Cor;
    private String Material;
    private double capacidadeEmMl;
    private double liquidoGarrafa;

    public Garrafa(String Cor, String Material, double capacidadeEmMl){
        this.Cor = Cor;
        this.Material = Material;
        this.capacidadeEmMl = capacidadeEmMl;
        this.liquidoGarrafa = 0.0;
    }

    public String getCor() {
        return this.Cor;
    }

    private void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getMaterial() {
        return this.Material;
    }

    private void setMaterial(String Material) {
        this.Material = Material;
    }

    public void adicionarMl(double valor) {
        if (valor <= 0 || valor > this.capacidadeEmMl) {
            System.out.println("O valor para adicionar deve ser maior que 0 ou menor que a capacidade maxima");
            return;
        }
        this.liquidoGarrafa += valor;
        System.out.println("Foram adicionados " + this.liquidoGarrafa + "ml na garrafa");
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
}
