
import java.util.Scanner;
public class exercicio7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int val1, val2, soma, diferenca, media, distancia, maior, menor;
        val1 = 10;
        val2 = 20;

        soma = val1 + val2;
        System.out.println("soma:" + soma);

        diferenca = val1 - val2;
        System.out.println("diferença:" + diferenca);

        media = (val1 + val2)/2;
        System.out.println("média:" + media);

        distancia = val2 - val1;
        System.out.println("distância:" + distancia);

        maior = val1 + val2 + Math.abs(val1 - val2);
        System.out.println("o maior:" + maior);

        menor = val1 + val2 - Math.abs(val1 - val2);
        System.out.println("o menor:" + menor);


    }
}
