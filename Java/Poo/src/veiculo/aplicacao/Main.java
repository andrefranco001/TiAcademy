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
        System.out.print("Dist�ncia a ser percorrida (em Km): ");
        kms = scan.nextDouble();
        System.out.print("Valor do Combust�vel (em R$): ");
        valorCombus = scan.nextDouble();

        Veiculo carro = new Veiculo(passageiros, tanque, consumo);

        double tanques = carro.tanqueViagem(kms);
        double racha = carro.dividirDespesas(kms, valorCombus);

        System.out.print("A Viagem � apenas de ida? (Sim ou n�o): ");
        String resp = scan.next().toUpperCase();
        if (resp.startsWith("N")) {
            racha *= 2;
            tanques *= 2;
            kms *= 2;
        }
        System.out.println(carro.informacoes());
        System.out.printf("\nDist�ncia Total da viagem � de %.0f kms e valor total da viagem � de R$ %.2f", kms, racha * passageiros);
        System.out.printf("\nPara a viagem vamos precisar de %.2f tanque(s) e cada passageiro dever� pagar R$ %.2f\n\n", tanques, racha);

        scan.close();
    }
}
