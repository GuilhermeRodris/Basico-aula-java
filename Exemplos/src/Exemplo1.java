public class Exemplo1 {
    public static void main(String[] args){
        double nota1, nota2, nota3, media;
        nota1 = 10;
        nota2 = 9;
        nota3 = 6;
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua media é: " + media);

        System.out.printf("Sua media arredondada é: %.2f", media);

    }
}
