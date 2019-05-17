public class OperacaoPotencia extends Operacao {

    @Override
    public Integer calcular(Integer x, Integer y) {
        return (int) Math.pow((double) x, (double) y);
    }
}
