package sequencial;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        System.out.print("Informe a N1: ");
        n1 = scan.nextDouble();
        System.out.print("Informe a N2: ");
        n2 = scan.nextDouble();
        System.out.print("Informe a N3: ");
        n3 = scan.nextDouble();
        System.out.print("Informe a N4: ");
        n4 = scan.nextDouble();

        media = (n1*2+n2*2+n3*3+n4*3)/10;
        System.out.printf("A Média Ponderada das Notas %.2f, %.2f, %.2f %.2f foi de %.2f", n1, n2, n3, n4, media);



    }
}
