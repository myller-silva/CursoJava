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

    return tratarExpressaoMatematica(fila);
  }
  public static Fila tratarExpressaoMatematica(Fila fila) {
    if (fila==null) return null;
    Fila novaFila = new Fila();
    Node p = fila.primeiro;
    while (p!=null) {
      novaFila.push(p.value);
      boolean isDouble = Check.isDouble(p.value) ;
        if( isDouble || p.value.equals(")")){
          try{
            if(p.next.value.equals("(")) novaFila.push("*");
          }catch(java.lang.NullPointerException e){}
        }
      p=p.next;
    }
    return novaFila;
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

  
}
