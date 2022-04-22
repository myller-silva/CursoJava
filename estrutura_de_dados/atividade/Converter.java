package atividade;

public class Converter {

  public static String toPosfix(String exp){
    Pilha opStack = new Pilha();

    Fila postFixList = new Fila();
    Fila tokenList = paraFila(exp);
    if(!Check.isInfix(tokenList)){
      return "expressao invalida";
    }
    
    Node token = tokenList.primeiro; 
    while (token!=null) {
      if(token.value==""){
        token=token.next;
      }
      if( Check.isDouble(token.value) ) {
        postFixList.push(token.value);
      }else if( token.value.equals("(") ){
        opStack.push(token.value);
      }else if( token.value.equals(")") ){
        String topToken = opStack.primeiro.value;
        opStack.pop();
        // obs:
        while( !topToken.equals("(") ) {
          postFixList.push(topToken);
          topToken = opStack.primeiro.value;
          opStack.pop();
        }
      }else{
        while( !opStack.isEmpty() && (precedencia(opStack.primeiro.value) >= precedencia(token.value)) ){
          postFixList.push(opStack.primeiro.value);
          opStack.pop();
        }
        opStack.push(token.value);
      }
      token=token.next;
    }
    while(! opStack.isEmpty() ){
      postFixList.push(opStack.primeiro.value);
      opStack.pop();
    }
    String str="";
    Node item = postFixList.primeiro;
    while(item!=null){
      str += (item.value + " ");
      item = item.next;
    }
    return str;
  }

  // public static String transformar(String exp) {
  //   String newExp = "";
  //   int tam = exp.length();
  //   char c = ' '; char prox = ' ';
  //   for (int i = 0; i < tam-1; i++) {
  //     c = exp.charAt(i);
  //     prox = exp.charAt(i+1);
      
  //     if(c==')' && prox=='('){
  //       newExp += c+"*"+prox;
  //       i++;
  //       continue;
  //     }
  //     newExp+=c;
  //   }
  //   if (prox!=' ') {
  //     newExp+=prox;
  //   }
  //   return newExp;
  // }
  



  
	public static Fila paraFila(String expressao) {
    if(expressao==null) return null;
    
    Fila fila = new Fila();
		
    String num = "";
		int tam = expressao.length();
		
    for (int i = 0; i < tam; i++) {
      char c = expressao.charAt(i);
      if(Character.isDigit(c) || c=='.'){
        num+=c;
        continue;
      }
      if(!num.equals("")){
        fila.push(num);
        num="";
      }
			if(c==' ') continue;
      fila.push(String.format("%c", c));
    }

    if(!num.equals("")){
      fila.push(num);
    }
    
    return fila;
  }
	
  private static int precedencia(String op) { 
    switch (op) {
      case "*":
      case "/":
        return 3;
      case "+":
      case "-":
        return 2;
      case "(":
        return 1;
    
      default:
        return -1;
    }
  }

  /*
  private static String[] split(String str) {//ok 
    String temp="";
    String num="";
    int tam =  str.length();
    for (int i = 0; i < tam; i++) {
      char c = str.charAt(i);
      if (c==' ') {continue;}
      if(Character.isDigit(c) || c=='.'){
        num+=c;
      }else{
        if(!num.equals("")){
          temp += num+" "; 
          num = "";
        }
        temp += c+" ";
      }
    }
    if(!num.equals("")){
      temp += num+" "; 
    }
      
    return temp.split(" ");
  }
*/
  
}
