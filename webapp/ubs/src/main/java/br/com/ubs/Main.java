package br.com.ubs;

import br.com.ubs.cadastro.Pessoa;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa eu = new Pessoa();
		
		eu.adicionarPessoa("12345678910");
		
		System.out.println(eu.getCpf());

	}

}
