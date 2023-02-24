import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantidade;
        int par = 0;
        int impar = 0;
        int contador = 0;

        System.out.println("Deseja digitar quantos numeros? ");
        quantidade = scan.nextInt();

        do{
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();

            if(numero%2 == 0){
                ++par;
            }else{
                ++impar;
            }

            ++contador;
        } while(contador < quantidade);

        System.out.println("Total de numeros pares: " + par);
        System.out.println("Total de numero impares: " + impar);
    }
}
