package condicional;

public class OperadorLogico {
    public static void main(String[] args) {

        int x = 5;

        System.out.println(x <= 15 && x == 10);
        System.out.println(x >=0 && x != 6);
        System.out.println(x <= 15 && x == 10 && x!= 6);
        System.out.println(x <= 15 || x == 10);
        System.out.println(x < 0 || x!= 5);
        System.out.println(x <= 0 || x != 5 || x > 3);
        System.out.println(!(x == 15));
        System.out.println(!(x < 0 || x != 5));

    }
}
