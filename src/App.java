import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //9- Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
    
    //Entrada
    Double f, c;
    Scanner teclado;

    System.out.println("Por favor, digite uma temperatura em Fahrenheit ");
    teclado = new Scanner(System.in);
    f = teclado.nextDouble();
    teclado.close();

    //Processamento
    c = 5 * ((f-32) / 9);

    //Saída
    System.out.println("A temperatura digitada, em Celsius, equivale a: " + c);
    
    }
}
