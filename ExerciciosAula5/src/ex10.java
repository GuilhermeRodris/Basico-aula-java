import java.util.Scanner;
import java.lang.Math;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double convertido, quarto, terceiro, segundo, primeiro;
        int bi;
        System.out.println("Digite a sequencia de quatro digitos formado por 0s e 1s: ");
        bi = sc.nextInt();
        quarto = bi % 10;
        terceiro = (bi /10) % 10;
        segundo = (bi / 100) % 10;
        primeiro = (bi /1000) % 10;

        convertido = primeiro * Math.pow(2,3) + segundo * Math.pow(2,2) + terceiro * Math.pow(2,1) + quarto * Math.pow(2,0);

        System.out.println("O valor convertido do binario é: " + convertido);


    }
}
