import java.util.Scanner;
public class exercicio14 {
    public static void main(String args[]) {
        int a; int b; int c; int d; int e;
        int g; int h; int j; int k; int m; int n; int p; int r;
          Scanner in = new Scanner(System.in);
          System.out.println("informe o ano que você quer saber que dia ocorreu a páscoa:");
          int ano = in.nextInt();


            a = ano%19;
            b = ano/100;
            c = ano%100;
            d = b/4;
            e = b%4;
            g = (8 * b + 13)/25;
            h = (19 * a + b - d - g + 15)%30;
            j = c/4;
            k = c%4;
            m = (a + 11 * h)/319;
            r = (2 * e + 2 * j-k-h+m + 32)%7;
            n = (h - m + r + 90)/25;
            p = (h - m + r + n + 19)%32;

            System.out.println("dia: " + p + " mês: " + n);

    }
}
