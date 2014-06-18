package br.com.ubs.cadastro;

public class Usuario extends Pessoa {
	
	public String login;
	public String senha;
	public char ind_paciente;
	public char ind_funcionario;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public char getInd_paciente() {
		return ind_paciente;
	}
	public void setInd_paciente(char ind_paciente) {
		this.ind_paciente = ind_paciente;
	}
	public char getInd_funcionario() {
		return ind_funcionario;
	}
	public void setInd_funcionario(char ind_funcionario) {
		this.ind_funcionario = ind_funcionario;
	}
	
	public void efetuarLogin() {
		
	}

}
