public class OperacaoDivisao extends Operacao {

    @Override
    public Integer calcular(Integer x, Integer y) {
        Integer resultado = (int) Math.ceil(x/y);
        return resultado;
    }
}
