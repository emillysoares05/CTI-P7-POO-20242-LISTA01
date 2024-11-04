package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		vlr_sal = 1.312;
		qtd_kw = 70;
		vlr_kw = vlr_sal / 5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = (vlr_reais * 15) /100;
		vlr_desc = vlr_reais - desc;
		System.out.println("O valor de cada quilowatt é: " + vlr_kw);
		System.out.println("O valor a ser pago sera de: " + vlr_reais);
		System.out.println("O valor a ser pago com desconto de 15% será de: " + vlr_desc);
		
		

	}

}
