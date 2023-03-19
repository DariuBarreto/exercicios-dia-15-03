import java.util.Scanner;
public class exercicio21
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double bolinhas, caixas;
        System.out.println("infomre o número de bolinhas que você deseja empacotar: ");
        bolinhas = in.nextDouble();

        caixas = bolinhas/100;
        System.out.println("você precisará de " + (int) Math.ceil(caixas) + " caixas");
    }
}
