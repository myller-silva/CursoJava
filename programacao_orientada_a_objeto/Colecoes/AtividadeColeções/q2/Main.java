package q2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        String resp;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Digite um numero: ");
            resp = scan.nextLine();
            if(resp.equals("fim")){
                break;
            }
            try{
                int number = Integer.parseInt(resp);
                lista.add(number);
            }
            catch (NumberFormatException e){
                System.out.println("Valor invalido");
            }
        }while(true);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
