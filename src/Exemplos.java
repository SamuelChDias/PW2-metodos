
public class Exemplos {
	public static void main(String[] args) {

		ehMaiorIdade(15);
		
		classificar(30);
		classificar(0);
		classificar(-35);
	}

	public static void ehMaiorIdade(int idade) {
		if (idade >= 18) {
			System.out.println("maior de idade");
		} else {
			System.out.println("menor de idade");

		}
	}

	public static void classificar(int num) {
		if (num < 0) {

			System.out.println("negativo");

		} else {
			if (num > 0) {
				System.out.println("positivo");

			} else {
				if (num == 0) {
					System.out.println("zero");
				}
			}
		}
	}

}
