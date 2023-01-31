
public class testaEscopoVariavel {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		boolean acompanhado = quantidadePessoas >= 2;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 && acompanhado) {
			System.out.println("Você tem maior que 18 anos!");
			System.out.println("seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}

	}

}
