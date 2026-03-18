import java.util.Scanner;
import java.lang.Math;

public class ex6 {
    public static void main(String[] args) {
        double x, y, yaren;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        x = sc.nextDouble();

        y = Math.sqrt(Math.cbrt(x - 0.5));
        yaren =  Math.round(y * 1000.0) / 1000.0;

        System.out.println("O valor de y é: " + yaren);


    }
}
