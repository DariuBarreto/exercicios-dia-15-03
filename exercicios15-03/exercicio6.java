import java.util.Scanner;
public class exercicio6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double c;
        System.out.println("informe a temperatura em fahrenheit:");
        int f = in.nextInt();
        c = 5.0/9 * (f - 32);
        System.out.println("sua temperatura em celsius: " + c);
    }
}
