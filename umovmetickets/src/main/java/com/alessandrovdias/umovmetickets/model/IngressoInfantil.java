package com.alessandrovdias.umovmetickets.model;

import com.alessandrovdias.umovmetickets.model.interfaces.CalculadoraDeIngresso;
import com.alessandrovdias.umovmetickets.model.interfaces.Ingresso;
import com.alessandrovdias.umovmetickets.util.Utils;

/**
 * Classe que define um Ingresso para o público Infantil
 * 
 * @author Alessandro
 *
 */
public class IngressoInfantil implements Ingresso, CalculadoraDeIngresso {
	
	private Double PRECO = 5.5d;

	/**
	 * Método que retorna o valor do ingresso para Domingo
	 * 
	 * @return
	 */
	public Double getValorIngressoDomingo() {
		return Utils.roundUp(PRECO);
	}
	
	/**
	 * Método que retorna o valor do ingresso para Segunda
	 * 
	 * @return
	 */
	public Double getValorIngressoSegundaFeira() {
		return Utils.roundUp((PRECO * 0.9));
	}

	/**
	 * Método que retorna o valor do ingresso para Terca
	 * 
	 * @return
	 */
	public Double getValorIngressoTercaFeira() {
		return Utils.roundUp((PRECO * 0.85));
	}

	/**
	 * Método que retorna o valor do ingresso para Quarta - 
	 * levando em consideração que o desconto é maior do que se usar carteirinha
	 * 
	 * @return
	 */
	public Double getValorIngressoQuartaFeira() {
		return Utils.roundUp((PRECO * 0.7));
	}

	/**
	 * Método que retorna o valor do ingresso para Quinta
	 * 
	 * @return
	 */
	public Double getValorIngressoQuintaFeira() {
		return Utils.roundUp(PRECO);
	}

	/**
	 * Método que retorna o valor do ingresso para Sexta
	 * 
	 * @return
	 */
	public Double getValorIngressoSextaFeira() {
		return Utils.roundUp((PRECO * 0.89));
	}

	/**
	 * Método que retorna o valor do ingresso para Sábado
	 * 
	 * @return
	 */
	public Double getValorIngressoSabado() {
		return Utils.roundUp(PRECO);
	}

	/**
	 * Método que retorna o valor do ingresso para Feriado
	 * 
	 * @return
	 */
	public Double getValorIngressoFeriado() {
		return Utils.roundUp(PRECO);
	}
}
