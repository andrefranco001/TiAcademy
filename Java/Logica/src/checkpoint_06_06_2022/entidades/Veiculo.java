package checkpoint_06_06_2022.entidades;

public class Veiculo {
        private int passageiros;
        private double capacidade;
        private double consumo;

        public Veiculo(int p, double ca, double co) {
                passageiros = p;
                capacidade = ca;
                consumo = co;
        }

        public double tanqueViagem(double quilometro) {
                return quilometro/(consumo*capacidade);
        }

       public double dividDespesas(double quilometro, double combustivel) {
               return (quilometro / capacidade * combustivel) / passageiros;
       }
        public int getPassageiros() {
                return passageiros;
        }

        public void setPassageiros(int passageiros) {
                this.passageiros = passageiros;
        }

        public double getCapacidade() {
                return capacidade;
        }

        public void setCapacidade(double capacidade) {
                this.capacidade = capacidade;
        }

        public double getConsumo() {
                return consumo;
        }

        public void setConsumo(double consumo) {
                this.consumo = consumo;
        }

        public String tostring(){
                return "\nO Veiculo comporta " + passageiros +
                        " pessoas, tem uma capacidade de " + capacidade +
                        " de combustível, e faz " + consumo +
                        " por litro.";
        }
}
