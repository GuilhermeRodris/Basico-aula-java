import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nota primeira nota: ");
        double nota11 = sc.nextDouble();
        System.out.print("Digite seu nota segunda nota: ");
        double nota12 = sc.nextDouble();
        System.out.print("Digite seu nota terceira nota nota: ");
        double nota13 = sc.nextDouble();

        double media2 = (nota11 + nota12 + nota13) / 3;
        double medArredondada2 = Math.round(media2 * 100.0) / 100.0;

        System.out.println("Sua media arredondada é: " + medArredondada2);

        sc.close();
    }

}
