import java.util.Scanner;
public class exercicio8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double largT, compT, largC, compC, areaT, areaC;
        System.out.println("informe a largura do terreno:");
        largT = in.nextDouble();
        System.out.println("informe o comprimento do terreno:");
        compT = in.nextDouble();
        System.out.println("informe a largura da casa:");
        largC = in.nextDouble();
        System.out.println("informe o comprimento da casa:");
        compC = in.nextDouble();

        areaT = largT * compT;
        areaC = largC * compC;

        System.out.println("area do terreno: " + areaT);
        System.out.println("area da casa: " + areaC);
    }
}
