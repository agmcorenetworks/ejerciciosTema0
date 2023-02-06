package ejerciciosTema0;

public class EjerciciosPropuestos {
	
	static double PI=3.14;

	public static void ejercicio3() {
		int numero = 2, cuad = numero * numero;

		System.out.println("el cuad de " + numero + " ees: " + cuad);
	}

	public static void ejercicio4() {
		int num = 4;
		num %= 7 * num % 3 * 7 >> 1;
		System.out.println(num);
	}

	/**
	 * Calcula circunferencia
	 */
	public static void ejercicio5() {
		int radio=3;
		double circunferencia=2*PI*radio;
		System.out.println(circunferencia);
	}

	/**
	 * Calcula area
	 */
	public static void ejercicio6() {
		double radio=5.2;
		double area=PI*radio*radio;
		System.out.println(area);
	}
	
	public static void ejercicio7() {
		
		System.out.println("me gusta la programación\ncada dia mas");
		System.out.println("cada dia mas");
	}

	public static void main(String args[]) {
		ejercicio7();
	}
}
