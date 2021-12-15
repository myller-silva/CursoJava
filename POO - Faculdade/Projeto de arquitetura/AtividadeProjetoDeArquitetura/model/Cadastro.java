package model;

import java.util.Scanner;
public class Cadastro {
    public static Produto cadastrarProduto(){
        String nome ;
        String descricao ;
        double preco ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = scan.nextLine();

        System.out.print("Descricao: ");
        descricao = scan.nextLine();
        
        System.out.print("Preco: ");
        preco = scan.nextDouble();
        scan.nextLine();
        
        Produto p = new Produto(nome, descricao, preco);
        return p;        
    }    

    public static Livro cadastrarLivro(){
        String nome ;
        String descricao ;
        double preco ;
        String autores;
        String isbn;
        String editora; 

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = scan.nextLine();

        System.out.print("Descricao: ");
        descricao = scan.nextLine();

        System.out.print("Preco: ");
        preco = scan.nextDouble();
        scan.nextLine();

        System.out.print("Autores: ");
        autores = scan.nextLine();

        System.out.print("ISBN: ");
        isbn = scan.nextLine();

        System.out.print("Editora: ");
        editora = scan.nextLine();
        
        Livro livro = new Livro(nome, descricao, preco, autores, isbn, editora);
        return livro;        
    }
}
