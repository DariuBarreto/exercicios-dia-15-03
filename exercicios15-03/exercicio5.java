import java.util.Scanner;

public class exercicio5 {
    public static void main(String args[]){
        double val1, quadrado, cubo, quarta;

        Scanner in = new Scanner(System.in);
        System.out.println("informe um número para elevarmos ao quadrado, cubo e na quarta:");
        val1 = in.nextDouble();

        quadrado = Math.pow(val1, 2);
        cubo = Math.pow(val1, 3);
        quarta = Math.pow(val1, 4);

        System.out.println("valor ao quadrado:" + quadrado);
        System.out.println("valor ao cubo:" + cubo);
        System.out.println("valor elevado na quarta:" + quarta);
    }
}
