package veiculo.entidades;

public class Veiculo {
    private double capacidade; // tanque
    private int passageiro;
    private double consumo; // km/litro

    public Veiculo(double capacidade, int passageiro, double consumo) {
        this.capacidade = capacidade;
        this.passageiro = passageiro;
        this.consumo = consumo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double tanqueViagem(double quilometro){
        return quilometro * 2;
    }

    public double dividirDespesas(double combustivel) {
        return combustivel;
    }
}
