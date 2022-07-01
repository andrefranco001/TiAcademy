package veiculo.aplicacao;

import veiculo.entidades.Veiculo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int passageiros;
        double tanque, consumo, kms, valorCombus;

        System.out.print("Informe a Quantidade de Passageiros: ");
        passageiros = scan.nextInt();
        System.out.print("Informe a capacidade do tanque (em Litros): ");
        tanque = scan.nextDouble();
        System.out.print("O consumo em (Km/L): ");
        consumo = scan.nextDouble();
        System.out.print("Distância a ser percorrida (em Km): ");
        kms = scan.nextDouble();
        System.out.print("Valor do Combustível (em R$): ");
        valorCombus = scan.nextDouble();

        Veiculo carro = new Veiculo(passageiros, tanque, consumo);

        double tanques = carro.tanqueViagem(kms);
        double racha = carro.dividirDespesas(kms, valorCombus);

        System.out.print("A Viagem é apenas de ida? (Sim ou não): ");
        String resp = scan.next().toUpperCase();
        if (resp.startsWith("N")) {
            racha *= 2;
            tanques *= 2;
            kms *= 2;
        }
        System.out.println(carro.informacoes());
        System.out.printf("\nDistância Total da viagem é de %.0f kms e valor total da viagem é de R$ %.2f", kms, racha * passageiros);
        System.out.printf("\nPara a viagem vamos precisar de %.2f tanque(s) e cada passageiro deverá pagar R$ %.2f\n\n", tanques, racha);

        scan.close();
    }
}
