package br.com.ubs;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Calendar;

import br.com.ubs.cadastro.Estoquista;
import br.com.ubs.cadastro.Pedido;
import br.com.ubs.cadastro.Produto;

public class Main {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//Connection connection = new ConnectionFactory().getConnection();
		//System.out.println("Conexão aberta! Chata!");
		//connection.close();
		
		Produto p = new Produto();
		p.setNome("Vassoura");
		
		Estoquista est = new Estoquista();
		est.setNome("Fellipe");
		
		Pedido pedido1 = new Pedido();
		pedido1.setEstoquista(est);
		pedido1.setProduto(p);
		
		Calendar c = Calendar.getInstance();
		c.set(2014,Calendar.JUNE,23);
		pedido1.setDt_solicitacao(c);
		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Data Pedido com formatação: "+ formataData.format(pedido1.getDt_solicitacao().getTime()));
		
		//System.out.println(pedido1.getDt_solicitacao());		
		
		System.out.println(pedido1.getEstoquista().getNome());
		
		
	}
}
