import  java.util.Scanner;
public class exercicio10
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int seg;
        int hora;
        int min;
        int segres;
        int seg2;
        System.out.println("coloque um valor em segundos abaixo:");
        seg = in.nextInt();

        hora = seg/3600;
        segres = seg%3600;
        min = segres/60;
        seg2 = segres%60;


        System.out.println("hora: "+ hora + " minuto: " +min + " segundo: " + seg2);

    }
}
