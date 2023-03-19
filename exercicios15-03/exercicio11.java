import java.util.Scanner;
public class exercicio11 {
    public static void main(String args[]) {
        System.out.println("insira um numero inteiro de quatro digitos:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int a = num%10;
        int b = (num/10)%10;
        int c = (num/100)%10;
        int d = (num/1000)%10;

        int res = 0;
        a = a*(1000);
        b = b*(100);
        c = c*(10);
        res = a + b + c + d;

        System.out.println("ordem inversa: " + res);
    }
}
