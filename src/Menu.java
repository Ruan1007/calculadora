import java.util.Scanner;

public class Menu {
    private OperacaoSoma operacaoSoma = new OperacaoSoma();
    private OperacaoSubtracao operacaoSubtracao = new OperacaoSubtracao();
    private OperacaoDivisao operacaoDivisao = new OperacaoDivisao();
    private OperacaoMultiplicacao operacaoMultiplicacao = new OperacaoMultiplicacao();
    private OperacaoRaizQuadrada operacaoRaizQuadrada = new OperacaoRaizQuadrada();
    private OperacaoPotencia operacaoPotencia = new OperacaoPotencia();

    private Scanner s = new Scanner(System.in);
    private Integer menu = 0;
    private Integer x = 0;
    private Integer y = 0;

    public void menu() throws Exception {
        System.out.println("================================");
        System.out.println("============= MENU =============");
        System.out.println("================================");
        System.out.println("Digite um número para acessar as operações");
        System.out.println("1 - Soma.");
        System.out.println("2 - Substração.");
        System.out.println("3 - Divisão.");
        System.out.println("4 - Multiplicação.");
        System.out.println("5 - Raiz Quadrada.");
        System.out.println("6 - Potência.");
        System.out.println("7 - Sair.");
        menu = s.nextInt();
        switch (menu) {
            case 1:
                soma();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                divisao();
                break;
            case 4:
                multiplicacao();
                break;
            case 5:
                raizQuadrada();
                break;
            case 6:
                potencia();
                break;
            case 7:
                System.out.println("Fechando a aplicação.");
                break;
            default:
                System.out.println("Este não é um valor válido");
                voltarMenu();
                break;
        }
    }

    public void soma() throws Exception {
        System.out.println("Soma entre x e y:");
        System.out.printf("Digite o valor de x: ");
        this.x = s.nextInt();
        System.out.printf("Digite o valor de y: ");
        y = s.nextInt();
        System.out.println("Resultado: " + operacaoSoma.calcular(x, y));
        voltarMenu();
    }

    public void subtracao() throws Exception {
        System.out.println("Subtracao entre x e y:");
        System.out.printf("Digite o valor de x: ");
        this.x = s.nextInt();
        System.out.printf("Digite o valor de y: ");
        y = s.nextInt();
        System.out.println("Resultado: " + operacaoSubtracao.calcular(x, y));
        voltarMenu();
    }

    public void divisao() throws Exception{
        System.out.println("Divisão entre x e y:");
        System.out.printf("Digite o valor de x: ");
        this.x = s.nextInt();
        System.out.printf("Digite o valor de y: ");
        y = s.nextInt();
        System.out.println("Resultado: " + operacaoDivisao.calcular(x, y));
        voltarMenu();
    }

    public void multiplicacao() throws Exception{
        System.out.println("Multiplicação entre x e y:");
        System.out.printf("Digite o valor de x: ");
        this.x = s.nextInt();
        System.out.printf("Digite o valor de y: ");
        y = s.nextInt();
        System.out.println("Resultado: " + operacaoMultiplicacao.calcular(x, y));
        voltarMenu();
    }

    public void raizQuadrada() throws Exception{
        System.out.println("Raiz quadrada de x:");
        System.out.printf("Digite o valor de x: ");
        this.x = s.nextInt();
        System.out.println("Resultado: " + operacaoRaizQuadrada.calcular(x));
        voltarMenu();
    }

    public void potencia() throws Exception{
        System.out.println("Potencia de x é y:");
        System.out.printf("Digite o valor de x: ");
        this.x = s.nextInt();
        System.out.printf("Digite o valor de y: ");
        y = s.nextInt();
        System.out.println("Resultado: " + operacaoPotencia.calcular(x, y));
        voltarMenu();
    }

    public void voltarMenu() throws Exception {
        System.out.println("Press Enter to continue...");
        System.in.read();
        System.out.println("Voltando para menu.");
        clearConsole();
        menu();
    }

    public static void clearConsole() {
        for (int i = 0; i < 100; ++i)
            System.out.println();
    }
}
