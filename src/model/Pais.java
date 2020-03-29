package model;


public class Pais {
	private int id;
	private String nome;
	private int populacao;
	private double area;

	public Pais() {
		
		
	}

	public Pais(int id, String nome, int populacao, double area) {
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getPopulacao() {
		return populacao;
	}

	
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	
	public double getArea() {
		return area;
	}

	
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", populacao=" + populacao + ", area=" + area + "]";
	}

		
	}

