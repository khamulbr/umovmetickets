package com.alessandrovdias.umovmetickets.model.interfaces;

/**
 * Interface que contrata os métodos para obtencao de valores de ingressos 
 * para todos os dias da semana e feriados 
 * 
 * @author Alessandro
 *
 */
public interface CalculadoraDeIngresso {
	
	/**
	 * Método que retorna o valor do ingresso para Domingo
	 * 
	 * @return
	 */
	Double getValorIngressoDomingo();
	
	/**
	 * Método que retorna o valor do ingresso para Segunda
	 * 
	 * @return
	 */
    Double getValorIngressoSegundaFeira();
    
	/**
	 * Método que retorna o valor do ingresso para Terça
	 * 
	 * @return
	 */
    Double getValorIngressoTercaFeira();
    
	/**
	 * Método que retorna o valor do ingresso para Quarta
	 * 
	 * @return
	 */
    Double getValorIngressoQuartaFeira();
	
    /**
	 * Método que retorna o valor do ingresso para Quinta
	 * 
	 * @return
	 */
    Double getValorIngressoQuintaFeira();
    
	/**
	 * Método que retorna o valor do ingresso para Sexta
	 * 
	 * @return
	 */
    Double getValorIngressoSextaFeira();
	
    /**
	 * Método que retorna o valor do ingresso para Sábado
	 * 
	 * @return
	 */
    Double getValorIngressoSabado();
    
    /**
	 * Método que retorna o valor do ingresso para Feriado
	 * 
	 * @return
	 */
    Double getValorIngressoFeriado();
}
