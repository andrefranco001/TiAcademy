package repeticao;

public class OpDecInc {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(x++); // x é 5 mas se torna 6 Pos Incremento
        System.out.println(x); // 6
        System.out.println(x--); // x é 6 mas se torna 5 Pos Decremento
        System.out.println(x); // 5
        System.out.println(++x); // x virou 6 Pré Incremento
        System.out.println(--x); // x virou 5 Pré Decremento
    }
}
