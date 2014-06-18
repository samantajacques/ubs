package br.com.ubs.cadastro;

import java.util.Date;

public class Pessoa {

	public int codigo;
	public String cpf;
	public String rg;
	public String nome;
	public Date dt_nascimento;
	public String logradouro;
	public String cidade;
	public String bairro;
	public String uf;
	public String cep;
	public String telefone;
	
	
	public int getCodigo() {
		return codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void adicionarPessoa(String cpf) {
		
		setCpf(cpf);
		
	}
	
	public void alterarPessoa() {
		
	}
	
	public void excluirPessoa() {
		
	}
	
	public void consultarPessoa() {
		
	}
}