package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		// Criar um objeto do tipo Paciente
		Paciente p1 = new Paciente();
		p1.setNome("ana maria");
		p1.cpf = "999.888.666-77";
		p1.setAltura(1.63);
		p1.setPeso(75.490);
		p1.telefone = "(11)96523-8888";
		p1.dataNascimento = LocalDate.of(2003, 8, 16);
		
		Paciente p2 = new Paciente();
		p2.setNome("vitor miguel");
		p2.cpf = "999.888.666-77";
		p2.setAltura(1.72);
		p2.setPeso(72);
		p2.telefone = "(11)99367-9608";
		p2.dataNascimento = LocalDate.of(2009, 2, 7);
		
		p1.mostrarDados();
		p2.mostrarDados();
		
		String teste = p1.getNome();
		System.out.println(teste.toLowerCase());
		System.out.println(p2.getNome());
		
	}

}
