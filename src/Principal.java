import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() throws Exception {
        try{
            Menu menu = new Menu();
            menu.menu();
        } catch (Exception e) {
            String msgErroPadrao = "Erro ao carregar aplicação.";
            String msgErroException = "";
            if(e.getMessage() != null){
                msgErroException = e.getMessage();
            }
            System.out.println();
            System.out.println("=======================================================================");
            System.out.println(msgErroPadrao + "\nError JAVA: " + msgErroException);
            System.out.println("Voltando para o MENU");
            System.out.println("=======================================================================");
            System.out.println();
        } finally {
            menu();
        }
    }
}
