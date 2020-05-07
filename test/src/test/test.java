package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testSuma(){

		int resultado=FuncionesMatematicas.suma(5, 5);
		int esperado=10;
		assertEquals(esperado,resultado);

	}
	@Test
	public void testResta() {
		int resultado=FuncionesMatematicas.resta(8, 3);
		int esperado=5;
		assertEquals(esperado,resultado);

	}
	@Test
	public void testMultiplicacion() {
		int resultado=FuncionesMatematicas.multiplicacion(8, 3);
		int esperado=24;
		assertEquals(esperado,resultado);
	}
	@Test
	public void testDivision() {
		int resultado=FuncionesMatematicas.division(8, 2);
		int esperado=4;
		assertEquals(esperado,resultado);
	}

	@Test
	public void testDigitos() {
		int resultado=FuncionesMatematicas.digitos(798);
		int esperado=3;
		assertEquals(esperado,resultado);
	}
	@Test
	public  void esCapicua() {
		boolean resultado=FuncionesMatematicas.esCapicua(797);
		boolean esperado=true;
		assertEquals(esperado,resultado);

	}

	@Test

	public void esPrimo() {
		boolean resultado=FuncionesMatematicas.esPrimo(7);
		boolean esperado=true;
		assertEquals(esperado, resultado);
	}
	@Test
	public void siguientePrimo() {
		int resultado=FuncionesMatematicas.siguientePrimo(7);
		int esperado=11;
		assertEquals(esperado, resultado);
	}

	@Test
	public void Potencia() {
		double resultado=FuncionesMatematicas.potencia(2, 2);
		double esperado=4;
		assertEquals(esperado, resultado, 0);
	}
	@Test
	public void voltea() {
		int resultado=FuncionesMatematicas.voltea(123);
		int esperado=322;
		assertEquals(esperado,resultado);
	}
	@Test
	public void digitoN() {
		int resultado=FuncionesMatematicas.digitoN(798, 2);
		int esperado=8;
		assertEquals(esperado,resultado);
	}
	@Test
	public void quitaPorDetras() {
		int resultado=FuncionesMatematicas.quitaPorDetras(7852, 2);
		int esperado=78;
		assertEquals(esperado,resultado);	
	}
	@Test
	public void quitaPorDelante() {
		int resultado=FuncionesMatematicas.quitaPorDelante(7852, 3);
		int esperado=2;
		assertEquals(esperado,resultado);
	}
	@Test
	public void pegaPorDetras() {
		int resultado=FuncionesMatematicas.pegaPorDetras(100, 1);
		int esperado=1001;
		assertEquals(esperado,resultado);
	}
	@Test
public void pegaPorDelante() {
		int resultado=FuncionesMatematicas.pegaPorDelante(78, 3);
		int esperado=378;
		assertEquals(esperado,resultado);
		
	}
	@Test
	public void trzoDeNumero() {
		int resultado=FuncionesMatematicas.trozoDeNumero(7985, 7, 5);
		int esperado=-1;
		assertEquals(esperado,resultado);
	}
	@Test
	public void juntaNumeros() {
		int resultado=FuncionesMatematicas.juntaNumeros(10, 58);
		int esperado=1058;
		assertEquals(esperado,resultado);
	}
}


