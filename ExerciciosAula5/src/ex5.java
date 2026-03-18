
import java.util.Scanner;

import java.lang.Math;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double slm, sb, vha, nht, desINSS, pINSS;

        //a)
        System.out.println("Digite o valor da hora aula: ");
        vha = sc.nextDouble();
        System.out.println("Informe o número de horas trabalhadas: ");
        nht = sc.nextDouble();
        sb = vha * nht;
        System.out.println("O salário bruto é: " + sb);

        //b)
        System.out.println("Informe qual o valor da porcentagem de desconto do INSS: ");
        pINSS = sc.nextDouble();
        desINSS = sb * (pINSS / 100);
        desINSS =  Math.round(desINSS * 100.0) / 100.0;
        System.out.println("Valor a ser descontado do sálario bruto: " + desINSS);

        //c) e d)
        slm = sb - desINSS;
        System.out.println("O valor do sálario liquido mensal é de: "  + slm);





    }
}