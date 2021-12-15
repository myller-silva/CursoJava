package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cadastro;
import model.Produto;
import view.Tela;

public class Principal {
    public static void main(String[] args) {
        int esc=0;     
        Scanner scan = new Scanner(System.in); 
        ArrayList<Produto> produtos = new ArrayList<Produto>() ; 
        
        // Tela tela = new Tela();
        // Cadastro cadastro = new Cadastro();

        do{
            Tela.menu();
            esc = scan.nextInt();
            switch (esc) {
                case 1:
                    produtos.add( Cadastro.cadastrarProduto() ); 
                    break;
                case 2:
                    Tela.listarProdutos(produtos);
                    break;  
                case 3:
                    produtos.add( Cadastro.cadastrarLivro() );   
                case 4:
                    Tela.listarLivros(produtos);
                default:
                    break;
            }
        }while(esc!=0);
    }
}
