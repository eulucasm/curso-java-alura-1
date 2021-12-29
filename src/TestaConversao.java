
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1250.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		long numeroGrande = 5646546546544l;
		short valorPqueno = 32000;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
