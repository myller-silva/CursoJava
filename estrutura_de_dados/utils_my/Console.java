package utils_my;

import java.io.IOException;

public class Console {
  
  public static void clear() throws IOException, InterruptedException{
    if (System.getProperty("os.name").contains("Windows"))
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    else
      Runtime.getRuntime().exec("clear");
  }

  public static void limparTela(){
    try{
      Console.clear();
    }catch(Exception e){
      System.err.println(e);
    }
  }

}
