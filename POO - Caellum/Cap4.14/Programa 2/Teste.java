public class Teste {
    public static void main(String[] args) {
        Porta p1 = new Porta();
        p1.cor = "verde";
        p1.dimX = 21.4;
        p1.dimY = 29.5;
        p1.dimZ = 0.5;

        System.out.printf("\n\nMomento 1\n");
        System.out.printf( p1.dadosFormatados() );

        p1.abre();
        System.out.printf("\nMomento 2\n");
        System.out.printf( p1.dadosFormatados() );

        p1.fecha();
        p1.pinta("azul");
        p1.dimZ = .4;
        System.out.printf("\nMomento 3\n");
        System.out.printf( p1.dadosFormatados() );
    }
}
