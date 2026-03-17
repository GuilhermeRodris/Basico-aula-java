public class Exemplo01 {
    public static void main(String[] args){
        double nota1, nota2, nota3, media;
        nota1 = 10;
        nota2 = 9;
        nota3 = 6;
        media = (nota1 + nota2 + nota3) / 3;

        double medArredondada = Math.round(media * 100.0) / 100.0;
        // Math.round Faz aproximação do valor, quanto maior o valor do multiplo de 10 mais casas deixa

        System.out.println("Sua media é: " + media);

        System.out.println("Sua media arredondada é: " + medArredondada);

        System.out.print("");

    }
}
