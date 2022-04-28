package atvs.entregaveis.filas_de_prioridade;

import atvs.entregaveis.filas_de_prioridade.classes.ListaCircularPrograma;

public class Main{
	public static void main(String args[]){
		ListaCircularPrograma lista = new ListaCircularPrograma();
		
		lista.add(21, 300, true);
		lista.add(22, 350, false);
		lista.add(23, 400, true);

		System.out.println(lista);
		System.out.println(lista.length);
	}	
}

