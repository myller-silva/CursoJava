package aula3;
public class SwitchCase {
    public static void main(String[] args){
        int pos=7;
        switch(pos){
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
                System.out.println("Segundo lugar");
                break;
            case 3:
                System.out.println("Terceiro lugar");
                break;
            case 4: case 5: case 6:
                System.out.println("Premio de participacao");
            default:
                System.out.println("Nao ganha premio");
        }
    }
}
