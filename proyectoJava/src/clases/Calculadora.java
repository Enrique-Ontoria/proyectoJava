package clases;

/*
 * Clase donde se realizan calculos basicos de matematicas
 * @author Pascual Enrique Ontoria Bello
 * 
 */
public class Calculadora {
	/*
	 * Constructor vacio sin parametros
	 */
	public Calculadora(){}
	
	/**
	 * Metodo donde se suman los dos parametros introducidos por pantalla.
	 * @param int a, primer parametro que se pasa para calcular suma.
	 * @param int b, segundo parametro que se pasa para calcular suma.
	 * @return Devuelve la suma de a + b
	 * @throws Develve ArithmeticException si se introduce numero negativo.
	 */
	public int suma(int a, int b) {
		if (a < 0 || b < 0) throw new ArithmeticException("solo numeros mayores que 0");
		return a + b;
	}
	
	/**
	 * Metodo donde se restan los dos parametros introducidos por pantalla.
	 * @param int a, primer parametro que se pasa para calcular resta.
	 * @param int b, segundo parametro que se pasa para calcular resta.
	 * @return Devuelva la resta de a - b
	 * @throws Devuelve ArithmeticException si se introduce numero negativo.
	 */
	public int resta(int a, int b) {
		if (a < 0 || b < 0) throw new ArithmeticException("solo numeros mayores que 0");
		return a - b;
	}
	/**
	 * Metodo donde se multiplican los dos parametros introducidos por pantalla.
	 * @param int a, primer parametro que se pasa para calcular multiplicacion.
	 * @param int b, segundo parametro que se pasa para calcular multiplicacion.
	 * @return Devuelve la multiplicacion de a * b
	 * @throws Devuelve ArithmeticException si se introducie numero negativo. 
	 */
	public int multiplicacion(int a, int b) {
		if (a < 0 || b < 0) throw new ArithmeticException("solo numeros mayores que 0");
		return a * b;

	}
}
