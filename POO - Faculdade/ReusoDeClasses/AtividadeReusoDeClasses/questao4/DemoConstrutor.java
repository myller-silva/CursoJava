public class DemoConstrutor{

    private int a, b;
    public DemoConstrutor(){
        System.out.println("Sem argumentos...");
        DemoConstrutor(0, 0);
        
    }
    public DemoConstrutor(int xa, int xb){
        System.out.println("Com argumentos...");
        a = xa; b = xb;

    }
}

