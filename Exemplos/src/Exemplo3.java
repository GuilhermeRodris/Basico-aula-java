import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media, ver = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        while ( ver != 1  ) {
            if (nota1 < 0 || nota1 > 10){
                System.out.println ("Nota invalida");
                System.out.println("Digite a primeira nota: ");
                nota1 = sc.nextDouble();
            }
            else {
                ver = ver + 1;
            }
        }

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        while ( ver != 2 ) {
            if (nota2 > 10 || nota2 < 0){
                System.out.println("Nota invalida");
                System.out.println("Digite a segunda nota: ");
                nota2 = sc.nextDouble();

            }
            else {
                ver = ver + 1;
            }
        }

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        while ( ver != 3 ) {
            if (nota3 > 10 || nota3 < 0){
                System.out.println("Nota invalida");
                System.out.println("Digite a terceira nota: ");
                nota3 = sc.nextDouble();
            }
            else {
                ver = ver + 1;
            }
        }
        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua media arredondada é: %.2f", media);
    }
}
