class Porta{
    boolean aberta;
    String cor;
    double dimX;
    double dimY;
    double dimZ;

    void abre(){
        this.aberta = true;
    }
    void fecha(){
        this.aberta = false;
    }
    void pinta(String nova_cor){
        this.cor = nova_cor;
    }
    boolean estaAberta(){
        return this.aberta;
    }
    String dadosFormatados(){
        return String.format("Situacao: %s\nCor: %s\nDimencoes: (%.2f, %.2f, %.2f)\n", estaAberta() ? "aberta" : "fechada", this.cor, this.dimX, this.dimY, this.dimZ);
    }
}