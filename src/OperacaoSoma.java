public class OperacaoSoma extends Operacao {

    @Override
    public Integer calcular(Integer x, Integer y){
        return Math.addExact(x , y);
    }
}
