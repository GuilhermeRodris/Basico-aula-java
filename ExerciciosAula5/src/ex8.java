import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dezena;
        System.out.println("Digite um numero de 3 digitos: ");
        num = sc.nextInt();
        dezena = (num /10) % 10;
        System.out.println("O valor da dezena é: " + dezena);


    }
}
