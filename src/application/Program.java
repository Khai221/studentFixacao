package application;

import java.util.Locale;
import java.util.Scanner;

import student.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Nome: ");
		student.name = sc.nextLine();
		System.out.print("Primeira nota: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Segunda nota: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Terceira nota: ");
		student.nota3 = sc.nextDouble();
		
		double notaTotal = student.nota1 + student.nota2 + student.nota3;
		System.out.println("A nota total do aluno foi: " + notaTotal);
		
		if (student.pass() == true) {
			System.out.printf("O aluno %s passou de ano", student.name);
		} else {
			System.out.printf("O aluno %s reprovou", student.name);
		}
		
		sc.close();
	}
}
