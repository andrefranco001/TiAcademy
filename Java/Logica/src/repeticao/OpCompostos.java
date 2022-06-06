package repeticao;

public class OpCompostos {
    public static void main(String[] args) {

        int x = 3, y = 5;

        System.out.println(x += 7); // x = x + 7 x=10
        System.out.println(x -= 4); // x = x - 4 x=6
        System.out.println(y *= x); // y = y * x 5*6=30
        System.out.println(y /= 10); // y = y /10 y=3
        System.out.println(y %= x); // y = y % x; 3%6=3
    }
}
