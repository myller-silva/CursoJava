package view;

import java.util.ArrayList;
import model.Produto;
import model.Livro;


public class Tela {

    public static void menu() {
        System.out.println("[1] Cadastrar produto");        
        System.out.println("[2] Listar produtos");   
        System.out.println("[3] Cadastrar livro");   
        System.out.println("[4] Listar livros");   
        System.out.println("[5] Imprimir tudo");   
        System.out.println("[0] Sair");
    }
    public static void listarLivros(ArrayList<Produto> produtos) {
        int c=0;
        Livro l = new Livro("", "", 0, "", "", "");
        System.out.println(">>> Lista de Livros <<<");
        for(Produto p: produtos){
            if(p.getClass() == l.getClass()){
                System.out.printf("%dº ", ++c);
                System.out.println(p.toString());
            }
        }
    }
    public static void listarProdutos(ArrayList<Produto> produtos){
        int c=0;
        System.out.println(">>> Lista de Produtos <<<");
        for(Produto p : produtos ){
            System.out.printf("%dº ", ++c);
            System.out.println( p.toString() );
        }
    }
}
