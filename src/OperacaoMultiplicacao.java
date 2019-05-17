public class OperacaoMultiplicacao extends Operacao{

    @Override
    public Integer calcular(Integer x, Integer y) {
        return Math.multiplyExact(x, y);
    }
}
