package _3Retangulo;
import java.util.Scanner;

public class Main_retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Largura do retangulo: \n");
        float altura = scanner.nextFloat();

        System.out.println("Digite a Altura do retangulo: \n");
        float largura = scanner.nextFloat();

        Retangulo retangulo = new Retangulo(altura, largura);

        double   area = retangulo.calculoArea();
        System.out.println("A área do retangulo é: " + area);
    }
}