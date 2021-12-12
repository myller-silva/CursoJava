// Classe:	Casa
// Atributos:	cor,	porta1,	porta2,	porta3
// Método:	void	pinta(String	s),	
// int	quantasPortasEstaoAbertas()
class Casa{
    String cor;
    Porta porta1 = new Porta(), porta2 = new Porta(), porta3 = new Porta();

    

    void pinta(String nova_cor){
        this.cor = nova_cor;
    }

    int quantasPortasEstaoAbertas(){
        int qtd=0;

        if(porta1.estaAberta()){
            qtd++;
        }
        if(porta2.estaAberta()){
            qtd++;
        }
        if(porta3.estaAberta()){
            qtd++;
        }
        
        return qtd;
    }

}