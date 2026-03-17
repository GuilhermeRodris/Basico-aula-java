//5. Elaborar um programa em Java para calcular o valor do salário líquido mensal de um
//professor do ensino fundamental. Para o cálculo do salário mensal do professor são
//necessários os seguintes dados: valor da hora-aula, número de horas trabalhadas no
//mês e a porcentagem de desconto do INSS. O cálculo do salário leva em consideração
//os seguintes passos:
//a) calcula-se o valor do salário bruto (valor da hora-aula multiplicada pelo número de
//horas trabalhadas).
//b) A partir do salário bruto, calcula-se o valor que será descontado referente ao INSS.
//c) Calcula-se o salário líquido mensal (valor do salário bruto menos o valor do
//desconto do INSS.
//d) Exibir o valor do salário líquido com apenas duas casas decimais.

import java.util.Scanner;

import static java.lang.Math.round;

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