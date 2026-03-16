package br.com.fiapride.model;

public class Veiculo {

    private String placa;
    private String modelo;


    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.modelo = modelo;
        System.out.println("🚗 Registro inicial: Um " + this.modelo + " nasceu com a placa " + this.placa);
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void atualizarPlaca(String novaPlaca) {
        System.out.println("🔄 Solicitada atualização de placa no Detran para o veículo " + this.modelo + "...");
        this.setPlaca(novaPlaca); // Chama o método privado que contém a regra de segurança
    }

    private void setPlaca(String novaPlaca) {
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
            System.out.println("✅ Sucesso: A placa agora é " + this.placa);
        } else {
            System.out.println("❌ Erro de Validação: A placa informada é inválida!");
        }
    }

    // Obs: O modelo do carro é IMUTÁVEL na vida real (um Fiat Uno não se transforma em um Corolla).
    // Portanto, a regra de negócio exige que NÃO exista um método setModelo()!
}