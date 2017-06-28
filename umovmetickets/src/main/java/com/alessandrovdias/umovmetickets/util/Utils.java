package com.alessandrovdias.umovmetickets.util;

/**
 * Classe com métodos e funções utilitárias
 * 
 * @author Alessandro
 *
 */
public class Utils {

	/** 
	 * Método para arredondar valores Double para cima
	 *  
	 * @param d Número
	 * @return
	 */
	public static Double roundUp(Double d) {
		return Math.ceil(d * 100) / 100;
    }
}
