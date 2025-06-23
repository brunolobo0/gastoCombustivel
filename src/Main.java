import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int tempoViagem = sc.nextInt();
        int velocidade = sc.nextInt();
        double combustivel;

        combustivel = (double) (tempoViagem * velocidade) / 12;

        System.out.printf("%.3f%n", combustivel);

    }

}