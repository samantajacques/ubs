package br.com.ubs.cadastro;

import java.util.Date;

public class UBS {

	public int codigo;
	public String localidade;
	public String nome;
	public String telefone;
	public String responsavel;
	public Date dt_cadastro;
	public Date dt_inicio;
	public Date dt_encerramento;

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public Date getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public Date getDt_encerramento() {
		return dt_encerramento;
	}

	public void setDt_encerramento(Date dt_encerramento) {
		this.dt_encerramento = dt_encerramento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void incluirUBS() {

	}

	public void alterarUBS() {

	}

	public void excluirUBS() {

	}

	public void consultarUBS() {

	}

}
