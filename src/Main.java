import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.next();
        System.out.println("Ola " + nome);
        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        System.out.println("Você tem "  + idade+ " anos. ");

        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro numero");
        int num2 = scan.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        System.out.println("Resultado da Soma: " +soma);
        System.out.println("Resultado da Subtração: " +sub);
        System.out.println("Resultado da Multiplicação: " +mult);
        System.out.println("Resultado da Divisão: " +div);

        System.out.print("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        double pi = 3.14;

        double resultado = pi * raio * raio;
        System.out.println(resultado);
        scan.close();

    }
}