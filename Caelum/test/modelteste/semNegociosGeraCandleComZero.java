package modelteste;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import model.Candlestick;
import model.Negocio;
import model.CandlestickFactory;

public class semNegociosGeraCandleComZero {
    
    @Test
    public void TestaCandleComAberturaZero(){
        Calendar hoje = Calendar.getInstance();
        List<Negocio> negocios = Arrays.asList();
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);

        assertEquals(0, candle.getAbertura(),00001);
    }
    
    @Test    
    public void TestaCandleComFechamentoZero(){
        Calendar hoje = Calendar.getInstance();
        List<Negocio> negocios = Arrays.asList();
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);

        assertEquals(0, candle.getFechamento(),00001);
    }
    
    @Test
    public void testaCandleComMinimoZero(){
        Calendar hoje = Calendar.getInstance();
        List<Negocio> negocios = Arrays.asList();
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
 
        assertEquals(0, candle.getMinimo(),00001);
    }
    
    @Test
    public void testaCandleComMaximoZero(){
        Calendar hoje = Calendar.getInstance();
        List<Negocio> negocios = Arrays.asList();
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
 
        assertEquals(0, candle.getMaximo(),00001);
    }
    
    @Test  
    public void testaCandleComVolumeZero(){
        Calendar hoje = Calendar.getInstance();
    
        List<Negocio> negocios = Arrays.asList();
        
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
 
        assertEquals(0, candle.getVolume(),00001);
    }
}