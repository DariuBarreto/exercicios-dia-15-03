import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio20
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double distancia, capacidade, consumoM, abastecidas, distdt;

        System.out.println("informe a distãncia da sua viagem:");
        distancia = in.nextDouble();
        System.out.println("qual a capacidade do tanque do seu carro?");
        capacidade = in.nextDouble();
        System.out.println("quantos km seu carro percorre por litro?");
        consumoM = in.nextDouble();

        distdt = capacidade * consumoM;
        abastecidas = distancia/distdt;
        System.out.println("você precisará abastecer " + (int) Math.ceil(abastecidas) + " vezes");
    }
}
