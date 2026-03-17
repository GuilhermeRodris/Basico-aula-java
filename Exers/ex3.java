//Escreva um programa em Java que calcule a quantidade de litros de combustível gasta
//em uma viagem, utilizando um automóvel que faz 10,5 km/l (quilômetros por litro).
//Para realizar o cálculo, o usuário deve fornecer o tempo gasto e a velocidade média.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidade, tempo, litros, kmh;
        System.out.println("Diga o tempo gasto em horas: ");
        tempo = sc.nextDouble();
        System.out.println("Indique a velocidade media: ");
        velocidade = sc.nextDouble();

        kmh = velocidade * tempo;
        litros = kmh * 10.5;

        System.out.println("A quantidade de litros foi: " + litros);


    }
}
