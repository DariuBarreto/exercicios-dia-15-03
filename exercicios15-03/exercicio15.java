import java.util.Scanner;
public class exercicio15
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("insira um horário no formato HH:MM:SS");
        String horario = in.nextLine();


        String[] partes = horario.split(":");
        int dia = 86400;
        int hora = Integer.parseInt(partes[0]);
        int minuto = Integer.parseInt(partes[1]);
        int segundo = Integer.parseInt(partes[2]);
        int totalseg = hora*3600 + minuto*60 +segundo;


        System.out.println("Horário do evento:");
        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + minuto);
        System.out.println("Segundo: " + segundo);
        System.out.println("horário em segundos: " + totalseg);

        System.out.println("Faltam " + (dia - totalseg) + " para acabar o dia:");




    }
}
