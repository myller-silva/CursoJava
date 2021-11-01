public class Main{
    public static void main(String[] args) {
        
        // composicao é quando usamos uma classe em outra
        // por exemplo, quando usamos "String"

        // por outro lado, herança é quando fazemos uma especie de "subclasse" de outra classe, como o exemplo a seguir

        Pessoa p1 = new Pessoa("mac", "07409271492");
        Funcionario f1 = new Funcionario("mac", "07409271492", 1982.5);

        // ao criar uma nova pessoa, uma mensagem é colocada na tela 
        // ao criar um novo funcionario, uma mensagem é colocada na tela
        // como um funcionario é uma pessoa, tambem é colocado uma mensagem de criacao de uma nova pessoa quando se cria um funcionario

    }
}