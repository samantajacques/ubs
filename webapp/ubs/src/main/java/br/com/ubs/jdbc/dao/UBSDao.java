package br.com.ubs.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import br.com.ubs.cadastro.UBS;
import br.com.ubs.jdbc.ConnectionFactory;

public class UBSDao {
	
	private Connection connection;
	
	public UBSDao() {		
		this.connection = new ConnectionFactory().getConnection();		
	}
	
	public void adiciona(UBS ubs) {
		String sql = "insert into tabela " + // necessário informar a tabela correta
				"(localidade,nome,telefone,responsavel,dt_cadastro,dt_inicio,dt_encerramento)" +
				" values (?,?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, ubs.getLocalidade());
			stmt.setString(2, ubs.getNome());
			stmt.setString(3, ubs.getTelefone());
			stmt.setString(4, ubs.getResponsavel());
			stmt.setDate(5, (java.sql.Date) new Date(ubs.getDt_cadastro().getTimeInMillis()));
			stmt.setDate(6, (java.sql.Date) new Date(ubs.getDt_inicio().getTimeInMillis()));
			stmt.setDate(6, (java.sql.Date) new Date(ubs.getDt_encerramento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
			
		}
		
	}

}
