package testedeimprimir;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import model.Negocio;

public class TestaCandlestickFactoryOrdenacao {
    
    
    public static void main(String args[]){
    Calendar hoje = Calendar.getInstance();
       
       Negocio negocio1 = new Negocio(40.5, 2, hoje);
       Negocio negocio2 = new Negocio(45.0, 2, hoje);
       Negocio negocio3 = new Negocio(50.0, 2, hoje);
       Negocio negocio4 = new Negocio(50.5, 2, hoje);
       Negocio negocio5 = new Negocio(45.5, 2, hoje);
       
       List<Negocio> negocios = Arrays.asList(negocio1,negocio2,negocio3,negocio4,negocio5);
                    
       Collections.sort(negocios);//ordenar lista de negocios
     
       for(Negocio negocio:negocios){
           System.out.println("["+ negocio.getPreco() +"]");
       }
       
       Collections.reverse(negocios);//inverter ordem de negocios
       
       for(Negocio negocio:negocios){
           System.out.println("["+ negocio.getPreco() +"]");
       }
    }
}
