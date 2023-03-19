import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio3 {
        public static void main(String args[]){
            double valorDaCompra = 19.93;
            double pagamento = 20.0;
            double diferenca = pagamento - valorDaCompra;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Diferenca = " + df.format(diferenca));
        }
}
