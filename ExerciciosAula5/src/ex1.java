import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        double area, altura, base, perimetro ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a altura");
        altura = sc.nextDouble();
        System.out.println("Informe a base");
        base = sc.nextDouble();

        area = base * altura;
        perimetro = (2 * base) + (2 * altura);

        System.out.println("A área é: " + area);
        System.out.println("O perimetro é: " + perimetro);

    }
}