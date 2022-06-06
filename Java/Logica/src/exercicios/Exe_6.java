package exercicios;

import java.util.Scanner;

public class Exe_6 {
    public static void main(String[] args) {
        /* De forma geral, a área de um triângulo consiste na metade da multiplicação da base pela altura.
        * Faça um programa que calcule a área de um triângulo, porém, não permita que as entradas de
        * dados (base e altura) sejam menores ou iguais a zero*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a base do Triângulo: ");
        double base = scan.nextDouble();
        while (base <= 0) {
            System.out.print("Informe a base do Triângulo: ");
            base = scan.nextDouble();
        }

        System.out.print("Informe a altura do Triângulo: ");
        double altura = scan.nextDouble();
        while (altura <= 0) {
            System.out.print("Informe a altura do Triângulo: ");
            altura = scan.nextDouble();
        }

        double areaTriangulo = (altura * base) / 2;
        System.out.printf("\n\nA área do Triângulo de base %.2f e altura %.2f é %.2f ", base, altura, areaTriangulo );

        scan.close();
    }
}
