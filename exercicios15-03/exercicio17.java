import java.util.Scanner;
public class exercicio17
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    double raio1, raio2, altura1;
    double altura2, altura3, volumecl1, volumecl2, volumekn, total;
    System.out.println("informe o valor do raio 1: ");
    raio1 = in.nextDouble();
    System.out.println("informe o valor do raio 2: ");
    raio2 = in.nextDouble();
    System.out.println("informe o valor da altura 1: ");
    altura1 = in.nextDouble();
    System.out.println("informe o valor da altura 2: ");
    altura2 = in.nextDouble();
    System.out.println("informe o valor da altura 3: ");
    altura3 = in.nextDouble();

    volumecl1 = Math.PI * Math.pow(raio2, 2) * altura2;
    volumekn = Math.PI * (Math.pow(raio1, 2) + raio1*raio2+Math.pow(raio2, 2))*altura3/3;
    volumecl2 = Math.PI* Math.pow(raio1, 2) * altura1;

    total = volumecl1 + volumecl2 + volumekn;

    System.out.println("o volume total é: " + total);


    }
}
