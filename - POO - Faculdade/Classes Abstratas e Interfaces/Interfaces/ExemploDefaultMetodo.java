public interface ExemploDefaultMetodo{
    default void imprimirSomaDoisNumeros(int n1, int n2){
        System.out.println(n1 + n2);
    }
}

class Exemplo1 implements ExemploDefaultMetodo{

}

class Exemplo2 implements ExemploDefaultMetodo{
    public void imprimirSomaDoisNumeros(int n1, int n2){
        System.out.printf("%d + %d = %d",n1, n2, n1 + n2);
    }
}
// com o default methods o programador pode ou nao modificar o comportamento padrao do metodo definido na interface e com isso evitar a repeticao de codigo