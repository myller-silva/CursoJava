package aula4;

import java.util.Scanner;
public class Parte2 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in); 
        String nome="";

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();
        
        System.out.printf("Ola, %s! Seja bem-vindo\n\n", nome);

    }
}
