package com.alessandrovdias.umovmetickets.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/** 
 * Testes unitários para a classe IngressoEstudante
 * 
 * @author Alessandro
 *
 */
public class IngressoEstudanteTest {
	
	@Test
	public void testGetValorIngressoSemCarteirinhaDomingo() {
		IngressoEstudante ingresso = new IngressoEstudante(false);
        assertEquals(new Double(8), ingresso.getValorIngressoDomingo());	
    }

	@Test
	public void testGetValorIngressoSemCarteirinhaSegundaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(false);
        assertEquals(new Double(7.2), ingresso.getValorIngressoSegundaFeira());	
	}

	@Test
	public void testGetValorIngressoSemCarteirinhaTercaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(false);
        assertEquals(new Double(7.6), ingresso.getValorIngressoTercaFeira());	
	}

	@Test
	public void testGetValorIngressoSemCarteirinhaQuartaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(false);
        assertEquals(new Double(4), ingresso.getValorIngressoQuartaFeira());	
	}

	@Test
	public void testGetValorIngressoSemCarteirinhaQuintaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(false);
        assertEquals(new Double(5.6), ingresso.getValorIngressoQuintaFeira());	
	}

	@Test
	public void testGetValorIngressoSemCarteirinhaSextaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(false);
        assertEquals(new Double(8), ingresso.getValorIngressoSextaFeira());	
	}

	@Test
	public void testGetValorIngressoSemCarteirinhaSabado() {
		IngressoEstudante ingresso = new IngressoEstudante(false);
        assertEquals(new Double(8), ingresso.getValorIngressoSabado());	
	}

	@Test
	public void testGetValorIngressoSemCarteirinhaFeriado() {
		IngressoEstudante ingresso = new IngressoEstudante(false);
        assertEquals(new Double(8), ingresso.getValorIngressoFeriado());	
	}
	
	@Test
	public void testGetValorIngressoComCarteirinhaDomingo() {
		IngressoEstudante ingresso = new IngressoEstudante(true);
        assertEquals(new Double(8), ingresso.getValorIngressoDomingo());	
    }

	@Test
	public void testGetValorIngressoComCarteirinhaSegundaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(true);
        assertEquals(new Double(5.2), ingresso.getValorIngressoSegundaFeira());	
	}

	@Test
	public void testGetValorIngressoComCarteirinhaTercaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(true);
        assertEquals(new Double(5.2), ingresso.getValorIngressoTercaFeira());	
	}

	@Test
	public void testGetValorIngressoComCarteirinhaQuartaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(true);
        assertEquals(new Double(4), ingresso.getValorIngressoQuartaFeira());	
	}

	@Test
	public void testGetValorIngressoComCarteirinhaQuintaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(true);
        assertEquals(new Double(5.2), ingresso.getValorIngressoQuintaFeira());	
	}

	@Test
	public void testGetValorIngressoComCarteirinhaSextaFeira() {
		IngressoEstudante ingresso = new IngressoEstudante(true);
        assertEquals(new Double(5.2), ingresso.getValorIngressoSextaFeira());	
	}

	@Test
	public void testGetValorIngressoComCarteirinhaSabado() {
		IngressoEstudante ingresso = new IngressoEstudante(true);
        assertEquals(new Double(8), ingresso.getValorIngressoSabado());	
	}

	@Test
	public void testGetValorIngressoComCarteirinhaFeriado() {
		IngressoEstudante ingresso = new IngressoEstudante(true);
        assertEquals(new Double(5.2), ingresso.getValorIngressoFeriado());	
	}
}
