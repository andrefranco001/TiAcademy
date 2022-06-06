package condicional;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        double peso, altura;
        String classificacao;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o Peso: ");
        peso = scan.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scan.nextDouble();

        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso Normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35){
            classificacao = "Obesidade Nível I";
        } else if (imc < 40) {
            classificacao = "Obesidade Nível II";
        } else {
            classificacao = "Obesidade Mórbida";
        }

        System.out.printf("\nO seu IMC é %.2f e está classificado como %s.", imc, classificacao);

        scan.close();
    }
}
