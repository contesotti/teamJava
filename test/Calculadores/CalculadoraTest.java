/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadores;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aula2
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        double resposta = calc.somar(10, 50);
        assertEquals(60,resposta,0);
        
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        double resposta = calc.subtrair(10, 50);
        assertEquals(-40,resposta,0);
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        double resposta = calc.dividir(10, 50);
        assertEquals(0.2, resposta , 0);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        double resposta = calc.multiplicar(10, 50);
        assertEquals(500, resposta, 0);
    }
    
}
