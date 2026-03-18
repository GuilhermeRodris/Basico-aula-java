import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidade, tempo, litros, km;
        System.out.println("Diga o tempo gasto em horas: ");
        tempo = sc.nextDouble();
        System.out.println("Indique a velocidade media: ");
        velocidade = sc.nextDouble();

        km = velocidade * tempo;
        litros = km * 10.5;

        System.out.println("A quantidade de litros foi: " + litros);


    }
}