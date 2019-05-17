public class OperacaoRaizQuadrada extends Operacao{

    @Override
    public Integer calcular(Integer x){
        return (int) Math.pow((double)x , 2);
    }

}
