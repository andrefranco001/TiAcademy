package checkpoint_06_06_2022.aplicacao;

import checkpoint_06_06_2022.entidades.Veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pas;
        double tanque, consumo, km, valor;

        System.out.print("\nInforme a Quantidade de Passageiros: ");
        pas = scan.nextInt();
        System.out.print("Informe a capacidade do tanque: ");
        tanque = scan.nextDouble();
        System.out.print("O consumo por litro: ");
        consumo = scan.nextDouble();
        System.out.print("Distancia em Km: ");
        km = scan.nextDouble();
        System.out.print("Valor do Combustível: ");
        valor = scan.nextDouble();

        Veiculo veiculo = new Veiculo(pas, tanque, consumo);
        System.out.println(veiculo.tostring());

        double tanques = veiculo.tanqueViagem(km);
        double rateio = veiculo.dividDespesas(km,valor);
        System.out.printf("\nPara a viagem vamos precisar de %.1f tanque(s) e cada passageiro contribuirá R$ %.2f", tanques, rateio);

        scan.close();
    }
}
