import java.util.Scanner;
public class exercicio12
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int val, cem, cinquenta, vinte, dez, cinco, dois, um, resto;

        System.out.println("informe a quantidade de dinheiro desejada para sacar: ");
        val = in.nextInt();

        cem = val/100;
        resto = val%100;
        cinquenta = resto/50;
        resto = resto%50;
        vinte = resto/20;
        resto = resto%20;
        dez = resto/10;
        resto = resto%10;
        cinco = resto/5;
        resto = resto%5;
        dois = resto/2;
        resto = resto%2;
        um = resto/1;

        System.out.println("notas de R$100,00: " + cem + " notas de R$50,00: " + cinquenta + " notas de R$20,00: " +vinte);
        System.out.print(" notas de dez:" + dez + " notas de R$5,00: " + cinco + " notas de R$2,00: " + dois +" notas de R$1,00: " + um );
    }

}
