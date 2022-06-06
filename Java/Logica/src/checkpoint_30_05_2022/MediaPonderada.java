package checkpoint_30_05_2022;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int, float, double, char, boolean, String
        double n1, n2, n3, n4;
        System.out.print("Digite N1: ");
        n1 = sc.nextDouble();
        System.out.print("Digite N2: ");
        n2 = sc.nextDouble();
        System.out.print("Digite N3: ");
        n3 = sc.nextDouble();
        System.out.print("Digite N4: ");
        n4 = sc.nextDouble();

        System.out.printf(("As notas %.1f, %.1f, %.1f, %.1f\n"), n1,n2,n3,n4);
        System.out.printf("A média ponderada é %.1f", (n1*2+n2*2+n3*3+n4*3)/10);

        sc.close();
    }
}
