package geometria;

public class Triangulo {
    public double x;
    public double y;
    public double z;

    public boolean validar(){
        return Math.abs(x - y) < z && z < (x + y);
    }

    public String classificar() {
        String tipo;
        if (x == y && y == z) {
            tipo = "Equilátero";
        }
        else if (x == y || x == z || y == z) {
            tipo = "Isósceles";
        }
        else {
            tipo = "Escaleno";
        }
        return tipo;
    }

    public double perimetro(){
        return (x + y + z) / 2.0;
    }

    public double area(){
        return Math.sqrt(perimetro() * (perimetro() - x) * (perimetro() - y) * (perimetro() - z));
    }

    public String toString() {
       return  "\nOs lados " + x + ", " + y + " e " + z + " formam um triângulo " + classificar() + "." +
               "\nO perimetro do triângulo é " + String.format("%.2f",perimetro()) + "." +
               "\nA área desse triângulo é " + String.format("%.2f",area()) + ".";
    }
}
