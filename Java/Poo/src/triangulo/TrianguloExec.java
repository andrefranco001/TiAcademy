package triangulo;

import java.util.Scanner;

public class TrianguloExec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, z, area, perimetro;
        String tipo;

        for (int i = 1; i <=2 ;i++) {
            System.out.printf("Digite os lados do %d triângulo: ", i);
            x = scan.nextDouble();
            y = scan.nextDouble();
            z = scan.nextDouble();

            if (Math.abs(x - y) < z && z < (x + y)) {
                if (x == y && y == z) {
                    tipo = "Equilátero";
                }
                else if (x == y || x == z || y == z) {
                    tipo = "Isósceles";
                }
                else {
                    tipo = "Escaleno";
                }
                perimetro = (x + y + z) / 2.0;
                area = Math.sqrt(perimetro * (perimetro - x) * (perimetro - y) * (perimetro - z));

                System.out.printf("\nOs lados %.1f, %.1f e %.1f, formam um triângulo %s.", x, y ,z, tipo);
                System.out.printf("\nO perímetro do triângulo é %.1f.", perimetro);
                System.out.printf("\nA área desse triângulo é %.1f\n\n", area);
            }
            else {
                System.out.println("\nOs lados informados não representam um Triângulo\n\n");
            }
        }
        scan.close();
    }
}