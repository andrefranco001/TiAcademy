package veiculo.aplicacao;

import veiculo.entidades.Veiculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Veiculo a = new Veiculo(90,16,9);
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a distancia da viagem: ");
        double distancia = scan.nextDouble();
        a.tanqueViagem(distancia);

        // Veiculo b = new Veiculo(56,5,9);

    }
    public static void entrada(){

    }
}
