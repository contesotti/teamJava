/**
* A classe calculadora é responsável por executar as
operações matemáticas básicas
* @author Matheus Contesotti
* @see java.lang.Math
* @since 1.0
*/

package Calculadores;

/**
* O método ({@code somar} faz a soma de dois números
*
* @param a valor do primeiro número a ser somado.
* @param b valor do segundo número a ser somado.
* @return valor da soma de a e b
* @see Math
*/

import java.util.Scanner;


public class Calculadora {
public double somar(double a, double b) {
 return a + b;
}
public double subtrair(double a, double b){
 return a - b;
}
public double dividir(double a, double b) {
 return a / b;
}
public double multiplicar(double a , double
b) {
 return a * b;
}
}
