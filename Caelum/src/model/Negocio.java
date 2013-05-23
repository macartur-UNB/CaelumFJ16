package model;

import java.util.Calendar;

public final class Negocio {
	
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negocio(double preco, int quantidade, Calendar data){
                validarParametros(preco,quantidade,data);
                this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}
        
        private void validarParametros(double preco,int quantidade,Calendar data){
            verificarDataNula(data);
            verificarPrecoMenorOuIgualAZero(preco);
            verificarQuantidadeMenorOuIgualAZero(quantidade);
        }
        
        private void verificarPrecoMenorOuIgualAZero(double preco){
            if(preco <=  0.00){
                throw new IllegalArgumentException("Preço não pode ser 0.00");
            }
        }
     
        private void verificarQuantidadeMenorOuIgualAZero(int quantidade){
            if(quantidade <=  0){
                throw new IllegalArgumentException("Preço não pode ser 0");
            }
        }
        private void verificarDataNula(Calendar data){
             if(data == null){
                    throw  new IllegalArgumentException("Data não pode ser nula.");
            }
        }
        
	public double getPreco(){
            return preco;
	}

	public int getQuantidade(){
            return quantidade;
	}

	public Calendar getData(){
            return (Calendar) this.data.clone();
	}

	public double getVolume(){
		return preco * quantidade;
	}
}
