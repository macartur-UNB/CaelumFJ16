package model;

import java.util.Calendar;

public final class Candlestick {
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	public Candlestick(double abertura, double fechamento,
			double minimo, double maximo, double volume, Calendar data){
                verificarParametros(abertura,fechamento,minimo,maximo,volume,data);
                this.abertura = abertura;
		this.minimo = minimo;
		this.fechamento = fechamento;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
		
	}
        private void verificarParametros(double abertura, double fechamento,
                                         double minimo, double maximo, 
                                         double volume, Calendar data){
            verificarMaximoMaiorQueMinimo(maximo, minimo);
            verificarAberturaNegativa(abertura);
            verificarDataNula(data);
            verificarFechamentoNegativo(fechamento);
            verificarMaximoNegativo(maximo);
            verificarMinimoNegativo(minimo);
            verificarVolumeNegativa(volume);
        }
        private void verificarMaximoMaiorQueMinimo(double maximo,double minimo){
            if(maximo < minimo){
                throw new IllegalArgumentException("O maximo não pode ser menor que o minimo.");
            }
        }
        private void verificarAberturaNegativa(double abertura){
            if(abertura < 0.00){
                throw new IllegalArgumentException("Abertura não pode ser negativa.");
            }
        }
        private void verificarMinimoNegativo(double minimo){
            if(minimo < 0.00){
                throw new IllegalArgumentException("Minimo não pode ser negativa.");
            }
        }
        private void verificarMaximoNegativo(double maximo){
            if(maximo < 0.00){
                throw new IllegalArgumentException("Maximo não pode ser negativo.");
            }
        }
        private void verificarFechamentoNegativo(double fechamento){
            if(fechamento < 0.00){
                throw new IllegalArgumentException("Fechamento não pode ser negativo.");
            }
        }
        
        private void verificarVolumeNegativa(double volume){
            if(volume < 0.00){
                throw new IllegalArgumentException("Volume não pode ser negativo.");
            }
        }
        private void verificarDataNula(Calendar data){
            if(data == null){
                throw  new IllegalArgumentException("Data não pode ser nula");
            }
        }
        
	public double getAbertura() {
		return abertura;
	}
	public double getFechamento() {
		return fechamento;
	}
	public double getMinimo() {
		return minimo;
	}
	public double getMaximo() {
		return maximo;
	}
	public double getVolume() {
		return volume;
	}
	public Calendar getData() {
		return data;
	}
	
	
	

}
