import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qui, valorq, precores, sm = 1.621;

        // a)
        System.out.println("Digite a quantidade de quilowatts consumida:");
        qui = sc.nextDouble();
        valorq = sm/7;
        System.out.println("O valor em reais de cada quilowatt é " + valorq);

        //b)
        precores = valorq * qui;
        System.out.println("O valor que a residencia vai pagar é de: " + precores);


        precores = precores * 0.9;
        System.out.println("O valor com desconto é: " + precores);
    }
}