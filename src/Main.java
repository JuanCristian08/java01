import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        exemploFor(scan);
    }
    public static  void exemploFor(Scanner scan){
        int[] numeros = new int[4];
        numeros[0] = new Random().nextInt(11);
        numeros[1] = new Random().nextInt(11);
        numeros[2] = new Random().nextInt(11);
        numeros[3] = new Random().nextInt(11);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void exemploLoop(Scanner scan){
       // int contador = 0;
       // while(contador < 10){
       //     contador++;
       //     System.out.println(contador);
      //  }
       // do{

       // }while(contador < 10);

       // String senhaLocal = "123";
       // String senha = "";
       // while(!senha.equals(senhaLocal)){
       //     System.out.println("Digite sua senha: ");
        //    senha = scan.next();
      //  }

        while (true){
            System.out.println("1-Oi\n2-Tchau\n0-Sair\nOpção");
            int op = scan.nextInt();
            switch (op){
                case 1:
                    System.out.println("Oi");
                    break;
                case 2:
                    System.out.println("Tchau");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                case 0:
                    System.out.println("Opção");
                    break;
            }
        }
    }

    public static void exMedia(Scanner scan){

        double[] notas = new double[4];
        System.out.println("Digite as 4 notas: ");

        notas[0] = scan.nextDouble();
        notas[1] = scan.nextDouble();
        notas[2] = scan.nextDouble();
        notas[3] = scan.nextDouble();

//        ArrayList<Double> listaNotas =  new ArrayList<>();
//        listaNotas.add(8.90);
//        listaNotas.add(10.0);
//        listaNotas.add(7.5);
//        listaNotas.add(6.90);

        double media = (notas[0] + notas[1] + notas[2] +notas[3]) / 4 ;
        System.out.println("Media final: "+media);

        if(media == 10){
            System.out.println("Aluno passou de ano com êxito");
        }else if(media >=7){
            System.out.println("Aluno passou de ano");
        }else {
            System.out.println("Aluno reprovou");
        }

        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");

    }
    public static void verificarIdade(Scanner scan){
        System.out.println("Digite sua idade: ");
        System.out.println(scan.nextInt() >= 18 ? "Pode" : "Nao pode");
    }


    public static void exemplos(Scanner scan){


        System.out.println("Qual seu nome?");
        String nome = scan.next();
        System.out.println("Bem vindo(a), " + nome);

        System.out.println("Qual sua idade?");
        int idade = scan.nextInt();
        System.out.println("Você têm " + idade+ " anos.");

        System.out.println("Digite um numero: ");
        double num1 = scan.nextDouble();

        System.out.println("Digite outro numero: ");
        double num2 = scan.nextDouble();

        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;

        System.out.println("Resultado da soma: "+soma);
        System.out.println("Resultado da subtração: "+sub);
        System.out.println("Resultado da multiplicação: "+mult);
        System.out.println("Resultado da divisão: "+div);

        System.out.println("Qual o raio do circul? ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.println("Area: "+area+"m²");
    }
}