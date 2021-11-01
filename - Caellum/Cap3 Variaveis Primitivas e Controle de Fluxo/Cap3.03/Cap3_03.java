public class Cap3_03{
    public static void main(String[] args){
        // trimestre
        double janeiro = 15000;
        double fevereiro = 23000;
        double marco = 17000;
        double despesa_total = janeiro+fevereiro+marco;
        double media_mensal_de_gastos = despesa_total/3;

        System.out.printf("Despesa total: %.2f\nMedia mensal de gastos: %.2f\n", despesa_total, media_mensal_de_gastos);
        
    }
}