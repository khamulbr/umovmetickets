package com.alessandrovdias.umovmetickets.model.interfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.alessandrovdias.umovmetickets.logic.CalculadoraDeIngressoFacade;
import com.alessandrovdias.umovmetickets.model.IngressoEstudante;
import com.alessandrovdias.umovmetickets.model.IngressoIdoso;
import com.alessandrovdias.umovmetickets.model.IngressoInfantil;
import com.alessandrovdias.umovmetickets.model.enums.DiaDaSemana;

/** 
 * Testes unitários para a classe CalculadoraDeIngressoFacade
 * 
 * @author Alessandro
 *
 */
public class CalculadoraDeIngressoFacadeTest {
	@Rule
    public ExpectedException thrown = ExpectedException.none();
		
	@Test
	public void testGetPrecoFinalInfantilSegunda() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		assertEquals(new Double(4.95), cdif.getValorDoIngresso(DiaDaSemana.SEGUNDA_FEIRA, new IngressoInfantil()));
	}
	
	@Test
	public void testGetPrecoFinalIdosoTerca() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		assertEquals(new Double(5.1), cdif.getValorDoIngresso(DiaDaSemana.TERCA_FEIRA, new IngressoIdoso()));
	}
	
	@Test
	public void testGetPrecoFinalEstudanteSemCarteirinhaTerca() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		assertEquals(new Double(7.6), cdif.getValorDoIngresso(DiaDaSemana.TERCA_FEIRA, new IngressoEstudante(false)));
	}
	
	@Test
	public void testGetPrecoFinalEstudanteComCarteirinhaQuarta() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		assertEquals(new Double(4), cdif.getValorDoIngresso(DiaDaSemana.QUARTA_FEIRA, new IngressoEstudante(true)));
	}
	
	@Test
	public void testGetPrecoFinalInfantilQuarta() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		assertEquals(new Double(3.85), cdif.getValorDoIngresso(DiaDaSemana.QUARTA_FEIRA, new IngressoInfantil()));
	}
	
	@Test
	public void testGetPrecoFinalIdosoSemDescontoSexta() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		assertEquals(new Double(6), cdif.getValorDoIngresso(DiaDaSemana.SEXTA_FEIRA, new IngressoIdoso()));
	}
	
	@Test
	public void testGetPrecoFinalEstudanteComCarteirinhaDomingo() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		assertEquals(new Double(8), cdif.getValorDoIngresso(DiaDaSemana.DOMINGO, new IngressoEstudante(true)));
	}
	
	@Test
	public void testGetPrecoFinalIdosoSabado() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		assertEquals(new Double(5.7), cdif.getValorDoIngresso(DiaDaSemana.SABADO, new IngressoIdoso()));
	}
	
	@Test
	public void testGetPrecoFinalUmValorNulo() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Ingresso ou Dia da Semana nulos");
		cdif.getValorDoIngresso(null, new IngressoInfantil());
	}
	
	@Test
	public void testGetPrecoFinalValoresNulo() {
		CalculadoraDeIngressoFacade cdif = new CalculadoraDeIngressoFacade();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Ingresso ou Dia da Semana nulos");
		cdif.getValorDoIngresso(null, null);
	}

}
