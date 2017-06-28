package com.alessandrovdias.umovmetickets.model;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * Testes unitários para a classe IngressoIdoso
 * 
 * @author Alessandro
 *
 */
public class IngressoIdosoTest {

	@Test
	public void testGetValorIngressoDomingo() {
		IngressoIdoso ingresso = new IngressoIdoso();
        assertEquals(new Double(5.7), ingresso.getValorIngressoDomingo());	
    }

	@Test
	public void testGetValorIngressoSegundaFeira() {
		IngressoIdoso ingresso = new IngressoIdoso();
        assertEquals(new Double(5.4), ingresso.getValorIngressoSegundaFeira());	
	}

	@Test
	public void testGetValorIngressoTercaFeira() {
		IngressoIdoso ingresso = new IngressoIdoso();
        assertEquals(new Double(5.1), ingresso.getValorIngressoTercaFeira());	
	}

	@Test
	public void testGetValorIngressoQuartaFeira() {
		IngressoIdoso ingresso = new IngressoIdoso();
        assertEquals(new Double(3.6), ingresso.getValorIngressoQuartaFeira());	
	}

	@Test
	public void testGetValorIngressoQuintaFeira() {
		IngressoIdoso ingresso = new IngressoIdoso();
        assertEquals(new Double(4.2), ingresso.getValorIngressoQuintaFeira());	
	}

	@Test
	public void testGetValorIngressoSextaFeira() {
		IngressoIdoso ingresso = new IngressoIdoso();
        assertEquals(new Double(6), ingresso.getValorIngressoSextaFeira());	
	}

	@Test
	public void testGetValorIngressoSabado() {
		IngressoIdoso ingresso = new IngressoIdoso();
        assertEquals(new Double(5.7), ingresso.getValorIngressoSabado());	
	}

	@Test
	public void testGetValorIngressoFeriado() {
		IngressoIdoso ingresso = new IngressoIdoso();
        assertEquals(new Double(5.7), ingresso.getValorIngressoFeriado());	
	}

}
