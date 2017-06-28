package com.alessandrovdias.umovmetickets.model;

import com.alessandrovdias.umovmetickets.model.interfaces.CalculadoraDeIngresso;
import com.alessandrovdias.umovmetickets.model.interfaces.Ingresso;
import com.alessandrovdias.umovmetickets.util.Utils;

/**
 * Classe que define um Ingresso para o público de Estudantes e 
 * fornece métodos para calcular o valor do mesmo
 * 
 * @author Alessandro
 *
 */
public class IngressoEstudante implements Ingresso, CalculadoraDeIngresso{

	private Double PRECO = 8d;
	
	private Boolean estaComCarteirinha = false;
	
	public IngressoEstudante(Boolean estaComCarteirinha) {
		super();
		this.estaComCarteirinha = estaComCarteirinha;
	}

	public Boolean getEstaComCarteirinha() {
		return estaComCarteirinha;
	}

	/**
	 * Método que retorna o valor padrao com desconto para estudante com carteirinha
	 * 
	 * @return
	 */
	private Double getValorIngressoEstudanteComCarteirinha() {
		return Utils.roundUp(PRECO * 0.65);
	}

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
		return getEstaComCarteirinha() ? getValorIngressoEstudanteComCarteirinha() : Utils.roundUp((PRECO * 0.9));
	}

	/**
	 * Método que retorna o valor do ingresso para Terca
	 * 
	 * @return
	 */
	public Double getValorIngressoTercaFeira() {
		return getEstaComCarteirinha() ? getValorIngressoEstudanteComCarteirinha() : Utils.roundUp((PRECO * 0.95));
	}

	/**
	 * Método que retorna o valor do ingresso para Quarta - 
	 * levando em consideração que o desconto é maior do que se usar carteirinha
	 * 
	 * @return
	 */
	public Double getValorIngressoQuartaFeira() {
		return Utils.roundUp((PRECO * 0.5));
	}

	/**
	 * Método que retorna o valor do ingresso para Quinta
	 * 
	 * @return
	 */
	public Double getValorIngressoQuintaFeira() {
		return getEstaComCarteirinha() ? getValorIngressoEstudanteComCarteirinha() : Utils.roundUp((PRECO * 0.7));
	}

	/**
	 * Método que retorna o valor do ingresso para Sexta
	 * 
	 * @return
	 */
	public Double getValorIngressoSextaFeira() {
		return getEstaComCarteirinha() ? getValorIngressoEstudanteComCarteirinha() : Utils.roundUp((PRECO));
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
		return getEstaComCarteirinha() ? getValorIngressoEstudanteComCarteirinha() : Utils.roundUp(PRECO);
	}
}
