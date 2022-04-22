package atividade;

// import List.NodeList;

public class Calcular {
  
  public static String expressaoInfixa(String expressao) {
    return "nao implementado";
  }
  
	public static String expressaoPosfixa(String expressao) {
    // verificar
    if (expressao==null) return "string nula";
		if(!isPosfix(expressao)) return "expressao invalida";
		
    // calcular
    Fila fila = Converter.paraFila(expressao);
		if(fila==null) return null;
    Node f = fila.primeiro;
    Pilha pilha = new Pilha();
    double n1, n2, res;
    String calculo="";

    while (f!=null) {
      if (isOper(f.value)) {
        String str1 = pilha.primeiro.next.value.replaceAll(",", ".");
        String str2 = pilha.primeiro.value.replaceAll(",", ".");
        n1 = Double.parseDouble(str1);
        n2 = Double.parseDouble(str2);
        switch (f.value) {
          case "+":
            res = n1 + n2;
            break;        
          case "-":
            res = n1 - n2;
            break; 
          case "*":
            res = n1 * n2; 
            break;
          case "/":
            res = n1 / n2;
            break;
          default:
            return "";
        }
        pilha.pop(); pilha.pop();
        pilha.push(String.format("%.2f", res));
      }else{
        pilha.push(f.value);
      }
      f=f.next;
    }
    calculo=pilha.primeiro.value;

    return calculo;
  }
	
  
  
  
  public static boolean isOper(String c) {
    if(c.equals("+")) return true;
    if(c.equals("-")) return true;
    if(c.equals("*")) return true;
    if(c.equals("/")) return true;
    return false;
  }
  
  public static boolean isPosfix(String str) {
    if (str==null) return false;

    Fila lista = Converter.paraFila(str);
		
		if(lista==null) return false;
		
    if(lista.length<3) return false;

    if( isOper(lista.primeiro.value) ) return false;
		
    // if( isOper(lista.primeiro.proximo.value) ) return false;
    if( !posfixaEmOrdem(lista) ) return false; //erro
		
    return true;
  }
  
  public static boolean posfixaEmOrdem(Fila lista) {
    int aux=0;
    Node p = lista.primeiro;
    while (p!=null) {
      if(p.value.equals(" ")) continue;			
      if(Check.isOper(p.value)){
        aux--;
      }else if(Check.isDouble(p.value)){
        aux++;
      }else{
        return false;
      }			
      p=p.next;
    }
		return ( aux==1 ? true : false ) ;
  }  
  
	public static boolean posfixaEmOrdem(String expressao){
		Fila filaExp = Converter.paraFila(expressao);
		return posfixaEmOrdem(filaExp);		
	}
}
