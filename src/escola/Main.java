package escola;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Aluno i = new Aluno("Fulana de tal", "987.765.543-21", new Date());
		System.out.println("Veja como os atributos foram preenchidos\n\nNome:" + i.nome);
		System.out.println("CPF: " + i.CPF);
		System.out.println("Data de nascimento: " + i.data_nascimento.toString());
		i.matricula = "JAVA";
		System.out.println("Matricula: " + i.matricula);
		
		Professor prf = new Professor("Mariana Mian", "123.344.543-21", new Date());
		System.out.println("Veja como os atributos nome do professor foram preenchidos\n\nNome:" + prf.nome);
		System.out.println("CPF: " + prf.CPF);
		System.out.println("Data de nascimento: " + prf.data_nascimento.toString());
		prf.disciplina = "prof.JAVA";
		prf.salario = 100.000;
		System.out.println("Disciplina: " + prf.disciplina);
		System.out.println("Salario: " + prf.salario);
		
		
		Funcionario func = new Funcionario("funcionario top", "678.987.456-09", new Date());
		System.out.println("Veja como os atributos nome dos funcionarios foram preenchidos\n\nNome:" + prf.nome);
		System.out.println("CPF: " + func.CPF);
		System.out.println("Data de nascimento: " + func.data_nascimento.toString());
		prf.salario = 12.000D;
		func.cargo = "Diretora";
		System.out.println("salario: " + func.salario );
		System.out.println("cargo: " + func.cargo);
		
		

	}

}