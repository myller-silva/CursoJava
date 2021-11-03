package pacote;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }

    public String toString( ){
        return String.format("%2d/%2d/%4d", dia, mes, ano);        
    }

    
}
