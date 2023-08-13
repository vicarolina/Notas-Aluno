package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Informe a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("\nNota final: %.2f%n \n", aluno.notaFinal());
		
		if(aluno.notaFinal() < 60) {
			System.out.println("Reprovado! \n");
			System.out.printf("Pontos necessários para alcançar a nota: %.2f%n", aluno.pontosNecessarios());
		}
		else {
			System.out.println("Aprovado!");
			
			sc.close();
		}
	}

}
