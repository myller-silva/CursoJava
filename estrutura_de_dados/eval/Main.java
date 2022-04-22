package eval;
import java.util.Scanner;
import utils_my.Console;

public class Main {
  public static void main(String[] args) {
    Console.limparTela();
    Scanner scan = new Scanner(System.in);
    int n=0;
    String[] expressoes = {
      "(2+3)*(4+5)","( 2 + 3 ) * ( 4 + 5 )",
      "(( 2 + 3) * ( 4 + 5 )","(2+3))*(4+5)","( 2 +3 ) +* (4 + 5)",
    };
    
    for (int i = 0; i < expressoes.length; i++) {
      System.out.printf("Expr[%d]: %s\n", i, expressoes[i]);
    }
    System.out.print("\nDigite o numero de uma expressao\n>>> ");
    try{
      n = scan.nextInt();
      eval(expressoes[n]);
      // eval2(expressoes[n]);
    }catch(Exception e){
      System.err.println("erro\n"+e);
      scan.close();
      return;
    }
    scan.close();
  }

  public static void eval(String s) {
    for (int i = 0; i < s.length(); i++) {
      char c =  s.charAt(i);
      if(c==' ')continue;
      if(c =='+' || c =='-' || c =='*' || c =='/' ){
        System.out.println("DELIM: " + c );
      }else if(c=='('){
        System.out.println("PUSH: "+c);
      }else if(c==')'){
        System.out.println("POP(num) POP(num)"+c);
      }else if(isDigit(c)){
        System.out.println("Digito: "+ c);
      }
    }
  }

  public static void eval2(String s) {
    for (int i = 0; i < s.length(); i++) {
      char c =  s.charAt(i);
      switch (c) {
        case ' ':
          continue;
        case '+': case '-': case '*': case '/':
          System.out.println("DELIM: " + c );
          break;
        case '(':
          System.out.println("PUSH: "+c);
          break;
        case ')':
          System.out.println("POP(num) POP(num)"+c);
          break;
        default:
          if( isDigit(c) ) System.out.println("Digito: "+ c);
          else System.out.println(c);
          break;
      }
    }
  }
  
  public static boolean isDigit(char c) {
    char[] digitos = {'1', '2', '3', '4', '5', '6','7','8','9','0'};
    boolean isDigit = false;
    for (char c2 : digitos) {
      if(c2==c){
        isDigit=true;
      }
    }
    return isDigit;
  }

}
