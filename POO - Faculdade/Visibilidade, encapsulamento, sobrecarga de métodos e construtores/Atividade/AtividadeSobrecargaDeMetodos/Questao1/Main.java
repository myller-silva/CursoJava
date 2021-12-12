public class Main {
    public static void main(String[] args) {
        Funcionario f;
        f = new Funcionario();

        f.setNome("mac myller da silva carlos");
        f.setSalario(2971.56);
        f.setDataAdmissao( new Data(12, 2, 2013) ); 

        // System.out.printf("")
        f.tirarFerias();

        f.tirarFerias(45);


    }
}
