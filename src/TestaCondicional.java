
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Pode entrar pois esta acompanhado");
			} else {
				System.out.println("infelizmente voce nao pode entrar");
			}
		}
	}
}
