package br.com.ubs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Especialidade implements Serializable{
 
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private int codigo;
	 
	@Column (length = 60)
	private int nome;
	 
	//private Medico[] medico;
	 
	public void incluirEspecialidade() {
	 
	}
	 
	public void alterarEspecialidade() {
	 
	}
	 
	public void excluirEspecialidade() {
	 
	}
	 
	public void consultarEspecialidade() {
	 
	}
	 
}
 
