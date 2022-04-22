public class Pessoa {
  String nome;
  Pessoa(String nome){
    this.nome=nome;
  }
}
// jar --create --file classes.jar Foo.class Bar.class
// jar --create --file teste.jar Pessoa.class Main.class
// jar cfm NOME_DO_ARQUIVO.jar manifest.txt pacoteJar*.*
// jar cfm teste.jar *.class
// java -jar NOME_DO_ARQUIVO.jar

// jar cf jar-file inputfiles - Utilizado para criar novos arquivos JAR.
// jar tf jar-file - Utilizado para visualizar todos os arquivos presentes em um JAR.
// jar xf jar-file - Utilizado para extrair os arquivos de um arquivo JAR.
// java -jar app.jar - Comando utilizado para executar um arquivo Jar, se o arquivo manifest estiver presente dentro do Jar. O arquivo manifest contém a informação do arquivo que possui o método main.