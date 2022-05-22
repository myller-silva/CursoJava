import java.io.File;

public class Main {
    public static void main(String[] args) {
        String str ="C:\\Users\\mylle\\OneDrive\\Área de Trabalho\\vol 7";
        File dir = new File(str);
        if (dir.exists()) {
            File[] files = dir.listFiles();
            if (files.length > 0) {
                for (File file : files) {
                    String f = file.getName();
                    String newNameStr = "SM_"+pegarParteNumerica(f)+".pdf";
                    File newName = new File(newNameStr);
                    if (file.renameTo(newName)) {
                        System.out.println("OK");
                    } else {
                        System.out.println("Erro"+" "+f);
                    }
                }
            } else {
                System.out.println("dir vazio");
            }
        } else {
            System.out.println("dir não existe");
        }
    }

    public static String pegarParteNumerica(String nome) {
        String str ="";
        int len = nome.length();
        for (int i = 0; i < len; i++) {
            char c = nome.charAt(i);
            if(Character.isDigit(c)){
                str+=c;
            }
        }
        return str;
    }

}