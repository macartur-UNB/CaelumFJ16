package testedeimprimir;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import model.Negocio;
import model.Candlestick;
import model.CandlestickFactory;
public class TestarCandlestickFactoryComUmNegocioApenas {

    public static void main(String args[])
    {
        Calendar  hoje = Calendar.getInstance();
        Negocio negocio1 = new Negocio(40.5, 100, hoje);
        
        List<Negocio> negocios = Arrays.asList(negocio1);
    
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
    
        System.out.println(candle.getAbertura());
        System.out.println(candle.getFechamento());
        System.out.println(candle.getMinimo());
        System.out.println(candle.getMaximo());
        System.out.println(candle.getVolume());
    
    
    }


}