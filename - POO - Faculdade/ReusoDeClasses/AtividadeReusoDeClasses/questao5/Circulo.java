
public class Circulo extends ObjetoGeometrico{
    private double r ; 
    Circulo(double x, double y, double r){
        super(x, y);
        this.r = r; 
    }    
    public double Area(){
        return Math.PI*r*r;
    }
    public double Perimetro(){
        return 2 * Math.PI * r;
    }
}
