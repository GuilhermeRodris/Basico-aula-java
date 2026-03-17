//Antes do racionamento de energia ser decretado, quase ninguém falava em quilowatts,
//mas agora, todos incorporaram essa palavra em seu vocabulário. Sabendo-se que 100
//quilowatts de energia custa um sétimo do salário mínimo, fazer um programa em Java
//que leia o valor do salário mínimo e a quantidade de quilowatts gasta por uma
//residência. O programa deverá calcular e imprimir no vídeo:
// o valor em reais de cada quilowatt;
// o valor em reais a ser pago pela residência;
// o novo valor a ser pago pela residência considerando um desconto de 10%.

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