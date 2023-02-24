import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        
        System.out.println("Escolha um numero da tabuada entre 1 a 10: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);

        for(int i = 1; i <= 10; ++i){
            System.out.println(tabuada + "x" + i + "= " + (tabuada*i));
        }

    }
}
