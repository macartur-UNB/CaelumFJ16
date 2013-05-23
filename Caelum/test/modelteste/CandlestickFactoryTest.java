package modelteste;

import model.Candlestick;
import model.Negocio;
import model.CandlestickFactory;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;

public class CandlestickFactoryTest {
    
   @Test
   public void sequenciaSimplesDeNegocios(){
        Calendar hoje = Calendar.getInstance();
	
	Negocio negocio1 = new Negocio(40.5, 100, hoje);
	Negocio negocio2 = new Negocio(45.0, 100, hoje);
	Negocio negocio3 = new Negocio(39.8, 100, hoje);
	Negocio negocio4 = new Negocio(42.3, 100, hoje);
	
	List<Negocio> negocios = Arrays.asList(negocio1, negocio2, negocio3, negocio4);
	
	model.CandlestickFactory fabrica = new model.CandlestickFactory();
	Candlestick candle = fabrica.constroiCandleParaData(hoje,negocios);
        
        Assert.assertEquals(40.5, candle.getAbertura(),0.0001);
        Assert.assertEquals(42.3, candle.getFechamento(),0.0001);
        Assert.assertEquals(39.8, candle.getMinimo(),0.0001);
        Assert.assertEquals(45.0, candle.getMaximo(),0.0001);
        Assert.assertEquals(16760.0, candle.getVolume(),0.0001);
        
   }
   
   
   @Test
   public void semNegociosGeraCandleComZeros() {
        Calendar hoje = Calendar.getInstance();
        
        List<Negocio> negocios = Arrays.asList();

        model.CandlestickFactory fabrica = new model.CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
        Assert.assertEquals(0.0, candle.getVolume(), 0.00001);
   }
   
   @Test
   public void negociosEmOrdemCrescenteDeValor(){
       Calendar hoje = Calendar.getInstance();
       
       Negocio negocio1 = new Negocio(40.5, 2, hoje);
       Negocio negocio2 = new Negocio(45.0, 2, hoje);
       Negocio negocio3 = new Negocio(50.0, 2, hoje);
       Negocio negocio4 = new Negocio(50.5, 2, hoje);
       Negocio negocio5 = new Negocio(45.5, 2, hoje);
       
       List<Negocio> negocios = Arrays.asList(negocio1,negocio2,negocio3,negocio4,negocio5);
                    
       Collections.sort(negocios);
       
       Assert.assertEquals(negocio1,negocios.get(0));
       Assert.assertEquals(negocio2, negocios.get(1));
       Assert.assertEquals(negocio3,negocios.get(2));
       Assert.assertEquals(negocio4, negocios.get(3));
       Assert.assertEquals(negocio5,negocios.get(4));
       
   }
   
   public void negociosEmOrdemDecrescenteDeValor(){
       Calendar hoje = Calendar.getInstance();
       
       Negocio negocio1 = new Negocio(40.5, 2, hoje);
       Negocio negocio2 = new Negocio(45.0, 2, hoje);
       Negocio negocio3 = new Negocio(50.0, 2, hoje);
       Negocio negocio4 = new Negocio(50.5, 2, hoje);
       Negocio negocio5 = new Negocio(45.5, 2, hoje);
       
       List<Negocio> negocios = Arrays.asList(negocio1,negocio2,negocio3,negocio4,negocio5);
                    
       Collections.sort(negocios);
       Collections.reverse(negocios);
       
       Assert.assertEquals(negocio5,negocios.get(0));
       Assert.assertEquals(negocio4, negocios.get(1));
       Assert.assertEquals(negocio3,negocios.get(2));
       Assert.assertEquals(negocio2, negocios.get(3));
       Assert.assertEquals(negocio1,negocios.get(4));
       
   }
        
}