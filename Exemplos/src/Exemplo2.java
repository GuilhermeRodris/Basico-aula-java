import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite seu nota primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite seu nota segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite seu nota terceira nota nota: ");
        nota3 = sc.nextDouble();
        System.out.println("<-------------------------------------------------------->");

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua media arredondada é: %.2f", media);

    }

}
