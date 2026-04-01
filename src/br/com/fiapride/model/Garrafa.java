package br.com.fiapride.model;

public class Garrafa {

    private String material;
    private double capacidadeEmMl;
    private double liquidoGarrafa;
    private Tampa tampaUtilizada;

    public Garrafa(Tampa tampaUtilizada, String material, double capacidadeEmMl){
        this.tampaUtilizada = tampaUtilizada;
        this.material = material;
        this.capacidadeEmMl = capacidadeEmMl;
    }

    public Tampa getTampa() {
        return this.tampaUtilizada;
    }

    public String getMaterial() {
        return this.material;
    }

    public void adicionarMl(double valor) {
        if (valor <= 0 || (this.liquidoGarrafa + valor) > this.capacidadeEmMl) {
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
        if (capacidadeEmMl <= 0 || capacidadeEmMl > 3000) {
            System.out.println("A capacidade precisa ser maior que 0ml e menor ou igual a 3000ml");
            return;
        }
        this.capacidadeEmMl = capacidadeEmMl;
    }

    public void beberLiquido(double quantidade){
        if (quantidade <= 0) {
            System.out.println("Erro: Quantidade invalida para beber");
            return;
        }
        if (liquidoGarrafa < quantidade) {
            System.out.println("Erro: Quantidade insuficiente para beber");
            return;
        }
        this.liquidoGarrafa -= quantidade;
        System.out.println("Foi bebido: " + quantidade + "ml da garrafa, Sobraram: " + this.liquidoGarrafa + "ml na garrafa" );
    }
}
