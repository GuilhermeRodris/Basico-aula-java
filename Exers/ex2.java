//Escreva um programa que leia uma temperatura em graus Celsius e apresente no vídeo
//a sua equivalente em graus Fahrenheit. A fórmula de conversão é:
//𝐹𝐹 = 𝐶𝐶 ∗
//        9
//        5 + 32
//onde C é a temperatura em graus Celsius e F a temperatura em graus Fahrenheit.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        double c , f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");
        c = sc.nextDouble();
        f = c * (9/5) + 32;
        System.out.println("A temperatura em Fahrenheit: " + f);
    }
}
