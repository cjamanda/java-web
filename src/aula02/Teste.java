package aula02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Pais;
import service.PaisService;


public class Teste {

	public static void main(String[] args) {
		
		String menu = "O que deseja fazer: \r\n" + ""
				+ "1 - Procurar Pa�s\r\n" + 
				"2 - Cadastrar Pa�s\r\n" + 
				"3 - Deletar Pa�s\r\n" + 
				"4 - Atualizar Pa�s\r\n" + 
				"5 - Maior popula��o\r\n" + 
				"6 - Menor �rea\r\n" + 
				"7 - Vetor de 3\r\n"
				+ "8 - Sair";
		while(true) {
			int resposta = Integer.parseInt(JOptionPane.showInputDialog(menu));
			PaisService c = new PaisService();
			switch(resposta) {
			case 1 : 
				String nomePais = JOptionPane.showInputDialog("Digite o nome do Pa�s procurado: ");
				JOptionPane.showMessageDialog(null, c.procurar(nomePais));
				break;
			case 2 :
				Pais novo = new Pais();
				novo.setNome(JOptionPane.showInputDialog("Digite o nome do Pa�s: "));
				novo.setPopulacao(Integer.parseInt(JOptionPane.showInputDialog("Digite a popula��o do Pa�s: ")));
				novo.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite a �rea do Pa�s: ")));
				try{
					c.criar(novo);
					JOptionPane.showMessageDialog(null, "Pa�s criado com sucesso!");
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
					
				}
				break;
			case 3 :
				String nomeADeletar = JOptionPane.showInputDialog("Digite o nome do Pa�s a ser deletado: ");
				Pais p = c.procurar(nomeADeletar);
				try {
					c.deletar(p);
					JOptionPane.showMessageDialog(null, "Pa�s deletado com sucesso!");
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
				break;
			
			case 4 :
				String nomeAtualizar = JOptionPane.showInputDialog("Digite o nome do Pa�s a ser atualizado: ");
				Pais l = c.procurar(nomeAtualizar);
				l.setNome(JOptionPane.showInputDialog("Digite o novo nome: "));
				l.setPopulacao(Integer.parseInt(JOptionPane.showInputDialog("Digite nova popula��o: ")));
				l.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite a nova area: ")));
				
				try {
					c.atualizar(l);
					JOptionPane.showMessageDialog(null, "Pa�s atualizado com sucesso!");
					}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
				break;
				
				
			case 5 :
				JOptionPane.showMessageDialog(null, c.maiorPopulacao());
				
				break;
			
			case 6 :
				JOptionPane.showMessageDialog(null, c.menorArea());
				
				break;
			
			case 7 :
				ArrayList<Pais> lista = c.vetorPaises();
				String info = "";
				for(Pais n : lista) {
					info = info + n.toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, info);
				
				break;
				
				default: System.exit(0);
				
				break;
			}
			
		}

	}
		
}
		


