package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import factory.ConnectionFactory;
import model.Pais;

public class PaisDAO {

		public Pais procurarPais(String nome) {
			String sql = "SELECT * FROM paises WHERE nome = ?";
			
			try(Connection conexao = ConnectionFactory.obtemConexao();
				PreparedStatement pst = conexao.prepareStatement(sql)){
				
			pst.setString(1, nome);
			ResultSet rs = pst.executeQuery();
			Pais resultado = new Pais();
			if(rs.next()) {
				
				resultado.setId(rs.getInt("idpaises"));
				resultado.setNome(rs.getString("nome"));
				resultado.setPopulacao(rs.getInt("populacao"));
				resultado.setArea(rs.getDouble("area"));
			}
			return resultado;
			
			}catch(Exception e) {
				System.out.println(e);
			return null;
		}
	}
		public void criarPais(Pais p) {
			String sql = "INSERT INTO paises (nome,populacao,area) VALUES (?,?,?)";
			
			try(Connection conexao = ConnectionFactory.obtemConexao();
					PreparedStatement pst = conexao.prepareStatement(sql)){
				
				pst.setString(1, p.getNome());
				pst.setInt(2, p.getPopulacao());
				pst.setDouble(3, p.getArea());
				try {
					pst.execute();
					System.out.println("País inserido com sucesso!");
				}
				catch(Exception e){
					System.out.println(e);
				}
				
				
				
				}catch(Exception e) {
					System.out.println(e);
				
			}
		}
		public void atualizarPais(Pais p) {
			String sql = "UPDATE paises SET nome = ?, populacao = ?, area = ? WHERE idpaises = ?";
			try(Connection conexao = ConnectionFactory.obtemConexao();
					PreparedStatement pst = conexao.prepareStatement(sql)){
				
				pst.setString(1, p.getNome());
				pst.setLong(2, p.getPopulacao());
				pst.setDouble(3, p.getArea());
				pst.setInt(4, p.getId());
				
				
				try {
					pst.executeUpdate();
					System.out.println("País atualizado com sucesso!");
				}
				catch(Exception e){
					System.out.println(e);
				}
				
				
				
				}catch(Exception e) {
					System.out.println(e);
				
			}
		}
		
		public void deletarPais(Pais p) {
			String sql = "DELETE FROM paises WHERE idpaises = ?";
			try(Connection conexao = ConnectionFactory.obtemConexao();
					PreparedStatement pst = conexao.prepareStatement(sql)){
				
				pst.setInt(1, p.getId());
				
				
				
				try {
					pst.execute();
					System.out.println("País deletado com sucesso!");
				}
				catch(Exception e){
					System.out.println(e);
				}
				
				
				
				}catch(Exception e) {
					System.out.println(e);
				
			}
		}
		
		public Pais maiorPopulacao() {
			String sql = "SELECT * FROM paises ORDER BY populacao DESC LIMIT 1"; 
			try(Connection conexao = ConnectionFactory.obtemConexao();
					PreparedStatement pst = conexao.prepareStatement(sql)){
					
				ResultSet rs = pst.executeQuery();
				Pais resultado = new Pais();
				if(rs.next()) {
					
					resultado.setId(rs.getInt("idpaises"));
					resultado.setNome(rs.getString("nome"));
					resultado.setPopulacao(rs.getInt("populacao"));
					resultado.setArea(rs.getDouble("area"));
				}
				return resultado;
				
				}catch(Exception e) {
					System.out.println(e);
				return null;
			}
		}
		public Pais menorArea() {
			String sql = "SELECT * FROM paises ORDER BY area ASC LIMIT 1"; 
			try(Connection conexao = ConnectionFactory.obtemConexao();
					PreparedStatement pst = conexao.prepareStatement(sql)){
					
				ResultSet rs = pst.executeQuery();
				Pais resultado = new Pais();
				if(rs.next()) {
					
					resultado.setId(rs.getInt("idpaises"));
					resultado.setNome(rs.getString("nome"));
					resultado.setPopulacao(rs.getInt("populacao"));
					resultado.setArea(rs.getDouble("area"));
				}
				return resultado;
				
				}catch(Exception e) {
					System.out.println(e);
				return null;
			}
		}
		
		public ArrayList<Pais> vetorPaises(){
			String sql = "SELECT * FROM paises LIMIT 3";
			ArrayList<Pais> trindade = new ArrayList<Pais>();
			try(Connection conexao = ConnectionFactory.obtemConexao();
					PreparedStatement pst = conexao.prepareStatement(sql)){
					
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					Pais resultado = new Pais();
					resultado.setId(rs.getInt("idpaises"));
					resultado.setNome(rs.getString("nome"));
					resultado.setPopulacao(rs.getInt("populacao"));
					resultado.setArea(rs.getDouble("area"));
					trindade.add(resultado);
				}
				return trindade;
				
				}catch(Exception e) {
					System.out.println(e);
				return null;
			}
		}
		
			
		}
		

				
			
		
		
