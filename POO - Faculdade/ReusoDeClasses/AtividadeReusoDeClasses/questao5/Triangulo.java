public class Triangulo extends ObjetoGeometrico {
    double c;
    Triangulo(double l1, double l2, double l3){
        super(l1, l2);
        this.c = l3;
    }
    public double Area(){
        double p = Perimetro()/2;
        return Math.sqrt( p*(p-a)*(p-b)*(p-c) );
    }
    public double Perimetro(){
        return a + b + c;
    }
}
