public class testaCondicional2 {

	public static void main(String[] args) {
		System.out.println();
		
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2 ;
		
		if (idade>=18  && acompanhado) {
			System.out.println("Você tem maior que 18 anos!");
			System.out.println("seja bem vindo!");
		}
			else {
			System.out.println("Infelizmente você não pode entrar!");
		}
		
	}

	}
