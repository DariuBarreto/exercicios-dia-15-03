import java.util.Scanner;
public class exercicio9
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double alt;
        double centimetros;
        double milimetros;

        System.out.println("informe sua altura em metros");
        alt = in.nextDouble();

        centimetros = alt*100;
        milimetros = centimetros*10;
        System.out.println("sua altura em centímetros: " + centimetros);
        System.out.println("e em milímetros: " + milimetros);
    }
}
