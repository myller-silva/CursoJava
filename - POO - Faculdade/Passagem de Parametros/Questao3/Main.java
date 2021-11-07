class Data{
    int dia;
    int mes;
    int ano;
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano; 
    }
    public String toString(){
        return String.format("%2d/%2d/%4d", this.dia, this.mes, this.ano);
    }
}
public class Main {
    public static void main(String[] args) {
        Data d = new Data(12, 02, 1999);

        System.out.println(d); //antes : 12/ 2/1999
        alterarData(d, 15, 3, 2003);
        System.out.println(d); //depois: 15/ 3/2003  

    }
    public static void alterarData(Data d, int dia, int mes, int ano){
        d.dia = dia;
        d.mes = mes;
        d.ano = ano;
    }
}
