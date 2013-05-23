package model;

import java.util.Calendar;
import java.util.List;



public final class CandlestickFactory {
	
	public Candlestick constroiCandleParaData(Calendar data, List<Negocio> negocios){
		
                           
            double maximo  = (negocios.isEmpty()) ? 0 :negocios.get(0).getPreco();
            double minimo=  (negocios.isEmpty()) ? 0 :negocios.get(0).getPreco();
            double volume = 0;
            if(!negocios.isEmpty()){
                for (Negocio negocio : negocios) {
                        volume += negocio.getVolume();                            
                        if(negocio.getPreco() > maximo){
                                maximo = negocio.getPreco();
                                }
                        else if(negocio.getPreco()< minimo){
                                minimo = negocio.getPreco();
                        }
                }
            }
            
            double abertura = (negocios.isEmpty()) ? 0 : negocios.get(0).getPreco();
   
            double fechamento = (negocios.isEmpty()) ? 0 :negocios.get(negocios.size()-1).getPreco();
            
            return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
   
        }
}
