
public class Exercicio {
	public static int somar(int num1, int num2){
	
	int somar = num1 + num2;
	
	return somar;
	
	}
	
	public static int proximo(int num1) {
		int next = num1 + 1;
		return next;
	}
	
	public static int dobro(int num1) {
		
		int mult = num1 * 2;
		return mult;
	}
	public static void main(String[] args) {
		
		int resultado = somar(1,2);
		int resultado2 = proximo(4);
		int resultado3 = dobro(2);
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
	}
}
