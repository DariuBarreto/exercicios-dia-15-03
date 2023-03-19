import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        double raio, area;
        Scanner in = new Scanner(System.in);

        System.out.println("qual o valor do raio da esfera?");
        raio = in.nextDouble();

        area = 4.0 * Math.PI * Math.pow(raio,2);
        System.out.println("Área:" + area);
    }
}