public class Main {
    public static void main(String[] args) {
        Pai pai = new Pai();
        Filha1 f1 = new Filha1();
        Filha2 f2 = new Filha2();

        testeDePolimorfismo(pai);
        testeDePolimorfismo(f1);
        testeDePolimorfismo(f2);

    }
    public static void testeDePolimorfismo(Pai p) {
        p.metodo();        
    }
}
