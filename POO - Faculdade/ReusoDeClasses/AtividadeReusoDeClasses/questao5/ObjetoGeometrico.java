class ObjetoGeometrico{
    double a, b;

    ObjetoGeometrico(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void exibirValores() {
        System.out.printf("a: %f\n", this.a);
        System.out.printf("b: %f\n", this.b);
    }

    public double Area(){
        return this.a * this.b;
    }
    public double Perimetro(){
        return this.a + this.b;
    }

} 