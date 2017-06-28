package com.alessandrovdias.umovmetickets.logic;

import com.alessandrovdias.umovmetickets.model.enums.DiaDaSemana;
import com.alessandrovdias.umovmetickets.model.interfaces.CalculadoraDeIngresso;

public class CalculadoraDeIngressoFacade {
	
	
	/**
	 * Método responsável por chamar o calculo de ingressos, baseado no Dia da Semana e 
	 * no tipo de Ingresso desejado
	 *  
	 * @return Valor final do ingresso 
	 */
	public Double getValorDoIngresso(DiaDaSemana diaDaSemana, CalculadoraDeIngresso calculadoraDeIngresso) {
		if ((diaDaSemana==null) || calculadoraDeIngresso == null){
			throw new IllegalArgumentException("Ingresso ou Dia da Semana nulos");
		}
		switch(diaDaSemana){
			case SEGUNDA_FEIRA:
				return calculadoraDeIngresso.getValorIngressoSegundaFeira();
			case TERCA_FEIRA:
				return calculadoraDeIngresso.getValorIngressoTercaFeira();
			case QUARTA_FEIRA:
				return calculadoraDeIngresso.getValorIngressoQuartaFeira();
			case QUINTA_FEIRA:
				return calculadoraDeIngresso.getValorIngressoQuintaFeira();
			case SEXTA_FEIRA:
				return calculadoraDeIngresso.getValorIngressoSextaFeira();
			case SABADO:
				return calculadoraDeIngresso.getValorIngressoSabado();
			case DOMINGO:
				return calculadoraDeIngresso.getValorIngressoDomingo();
			case FERIADO:
				return calculadoraDeIngresso.getValorIngressoFeriado();
		}
		return null;		
	}

}
