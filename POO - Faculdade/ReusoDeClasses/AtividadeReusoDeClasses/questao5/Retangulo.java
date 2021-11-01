public class Retangulo extends ObjetoGeometrico {
    Retangulo(double l1, double l2){
        super(l1, l2);
    }
    public double Perimetro(){
        return 2*a + 2*b;
    }
}
