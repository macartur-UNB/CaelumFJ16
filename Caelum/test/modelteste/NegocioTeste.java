/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelteste;

import java.util.Calendar;
import model.Negocio;
import org.junit.Test;
import static org.junit.Assert.*;

public class NegocioTeste {
    
     @Test
     public void dataDoNegocioEhImutavel() {
         Calendar calendario = Calendar.getInstance();
         calendario.set(Calendar.DAY_OF_MONTH, 15);
         Negocio negocio = new Negocio(10, 5, calendario);
         negocio.getData().set(Calendar.DAY_OF_MONTH, 20);
         assertEquals(15, negocio.getData().get(Calendar.DAY_OF_MONTH));
     }
     
     @Test(expected = IllegalArgumentException.class)
     public void naoCriarNegocioComDataNula(){
         Negocio negocio = new Negocio(25, 2, null);
     }
     
     @Test(expected = IllegalArgumentException.class)
     public void naoCriarNegocioComPrecoMenorOuZero(){
         Calendar data = Calendar.getInstance();
         Negocio negocio = new Negocio(-1, 2,data );
     }
     @Test(expected = IllegalArgumentException.class)
     public void naoCriarNegocioComQuantidadeMenorOuZero(){
         Calendar data = Calendar.getInstance();
         Negocio negocio = new Negocio(25, -1, data);
     }  
     
}