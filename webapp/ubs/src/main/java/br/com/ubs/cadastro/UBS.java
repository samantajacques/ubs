package br.com.ubs.cadastro;

import java.util.Calendar;

import br.com.ubs.jdbc.dao.UBSDao;

public class UBS {

	public int codigo;
	public String localidade;
	public String nome;
	public String telefone;
	public String responsavel;
	public Calendar dt_cadastro;
	public Calendar dt_inicio;
	public Calendar dt_encerramento;

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

	public Calendar getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Calendar dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public Calendar getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(Calendar dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public Calendar getDt_encerramento() {
		return dt_encerramento;
	}

	public void setDt_encerramento(Calendar dt_encerramento) {
		this.dt_encerramento = dt_encerramento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void incluirUBS() {
		
		UBS ubs = new UBS();
		UBSDao bd = new UBSDao();
		bd.adiciona(ubs);

	}

	public void alterarUBS() {

	}

	public void excluirUBS() {

	}

	public void consultarUBS() {

	}

}
