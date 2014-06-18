package br.com.ubs.cadastro;

public class Funcionario extends Usuario {
	
	public int tipo_funcionario;
	public int codigo_cbo;
	
	public int getTipo_funcionario() {
		return tipo_funcionario;
	}
	public void setTipo_funcionario(int tipo_funcionario) {
		this.tipo_funcionario = tipo_funcionario;
	}
	public int getCodigo_cbo() {
		return codigo_cbo;
	}
	public void setCodigo_cbo(int codigo_cbo) {
		this.codigo_cbo = codigo_cbo;
	}
	
}
