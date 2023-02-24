import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.println("Deseja ver o fatorial de qual numero? ");
        fatorial = scan.nextInt();

        for(int i=fatorial;i > 1; --i){
            fatorial = fatorial * (i-1);
        }

        System.out.println(fatorial);
    }
}
