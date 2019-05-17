public class OperacaoSubtracao extends Operacao {

    @Override
    public Integer calcular(Integer x, Integer y){
        return Math.subtractExact(x, y);
    }
}
