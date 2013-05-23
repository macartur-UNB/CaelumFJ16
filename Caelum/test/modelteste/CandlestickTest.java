package modelteste;

import model.Candlestick;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class CandlestickTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void precoMaximoNaoPodeSerMenorQueMinimo(){
        new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());    
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void candlestickComDataNula(){
        new Candlestick(10, 20, 10, 20, 10000, null);    
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void candlestickComAberturaNegativa(){
        new Candlestick(-10, 20, 10, 20, 10000, Calendar.getInstance());    
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void candlestickComFechamentoNegativo(){
        new Candlestick(10, -20, 10, 20, 10000, Calendar.getInstance());    
    }
    @Test(expected=IllegalArgumentException.class)
    public void candlestickComMaximoNegativo(){
        new Candlestick(10, 20, -10, 20, 10000, Calendar.getInstance());    
    }
    
     @Test(expected=IllegalArgumentException.class)
    public void candlestickComMinimoNegativo(){
        new Candlestick(10, 20, 10, -20, 10000, Calendar.getInstance());    
    }
     
    @Test(expected=IllegalArgumentException.class)
    public void candlestickComVolumeNegativo(){
        new Candlestick(10, 20, 10, 20, -10000, Calendar.getInstance());    
    }
 
}