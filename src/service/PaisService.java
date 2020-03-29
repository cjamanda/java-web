package service;

import java.util.ArrayList;

import model.Pais;
import model.dao.PaisDAO;

public class PaisService {
	PaisDAO dao;

	public PaisService() {
		dao = new PaisDAO();
		
		}
	public void criar(Pais p) {
		dao.criarPais(p);
	}
	
	public void atualizar(Pais p) {
		dao.atualizarPais(p);
	}
	public void deletar(Pais p) {
		dao.deletarPais(p);
	}
	public Pais procurar(String nome) {
		return dao.procurarPais(nome);
	}
	public Pais maiorPopulacao() {
		return dao.maiorPopulacao();
	}
	public Pais menorArea() {
		return dao.menorArea();
	}
	public ArrayList<Pais> vetorPaises(){
		return dao.vetorPaises();
	}
	
	
}
