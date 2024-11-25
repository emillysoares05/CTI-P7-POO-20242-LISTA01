package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salCarlos, salJoao, meses = 0;

        System.out.println("Digite o salário de Carlos:");
        salCarlos = sc.nextDouble();

        salJoao = salCarlos / 3;

        while (salJoao < salCarlos) {
            salCarlos = salCarlos + salCarlos * 2 / 100;
            salJoao = salJoao + salJoao * 5 / 100;
            meses++;
        }

        System.out.println("Número de meses para igualar ou ultrapassar o valor de Carlos: " + meses);
    }
}