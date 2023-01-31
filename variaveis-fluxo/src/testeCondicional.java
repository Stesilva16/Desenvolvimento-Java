
public class testeCondicional {

	public static void main(String[] args) {
		System.out.println();
		
		int idade = 16;
		int quantidadeDePessoas = 3;
		
		if (idade>=18) {
			System.out.println("Você tem maior que 18 anos!");
			System.out.println("seja bem vindo!");
		}
		else {
			if(quantidadeDePessoas >=2) {
				System.out.println("voce nao tem 18, mas pode entrar, " 
						+ "pois está acompanhado");
			}
			else {
			System.out.println("Infelizmente você não pode entrar!");
		}
		
	}

}
	}
