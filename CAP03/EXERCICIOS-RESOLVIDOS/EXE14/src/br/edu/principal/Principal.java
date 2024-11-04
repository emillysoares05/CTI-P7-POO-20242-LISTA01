package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int ano_atual, ano_nascimento, idade_atual, idade_2050;
		ano_atual = 2024;
		ano_nascimento = 2007;
		idade_atual = ano_atual - ano_nascimento;
		idade_2050 = 2050 - ano_nascimento;
		System.out.println("Idade em "+ano_atual+" : "+idade_atual);
		System.out.println("Idade em 2050: " +idade_2050);

	}

}
