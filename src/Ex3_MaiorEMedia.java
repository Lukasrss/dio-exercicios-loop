import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int contador = 1;
        double media = 0;

        do {
            System.out.println("Digite o " + contador + "°: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;

            media += numero;
            ++contador;
        } while(contador < 6);

        media /= 5;

        System.out.println("Maior numero: " + maior);
        System.out.println("Media: " + media);
    }
}
