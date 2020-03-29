package aula02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Pais;
import service.PaisService;


public class Teste {

	public static void main(String[] args) {
		
		String menu = "O que deseja fazer: \r\n" + ""
				+ "1 - Procurar País\r\n" + 
				"2 - Cadastrar País\r\n" + 
				"3 - Deletar País\r\n" + 
				"4 - Atualizar País\r\n" + 
				"5 - Maior população\r\n" + 
				"6 - Menor Área\r\n" + 
				"7 - Vetor de 3\r\n"
				+ "8 - Sair";
		while(true) {
			int resposta = Integer.parseInt(JOptionPane.showInputDialog(menu));
			PaisService c = new PaisService();
			switch(resposta) {
			case 1 : 
				String nomePais = JOptionPane.showInputDialog("Digite o nome do País procurado: ");
				JOptionPane.showMessageDialog(null, c.procurar(nomePais));
				break;
			case 2 :
				Pais novo = new Pais();
				novo.setNome(JOptionPane.showInputDialog("Digite o nome do País: "));
				novo.setPopulacao(Integer.parseInt(JOptionPane.showInputDialog("Digite a população do País: ")));
				novo.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite a área do País: ")));
				try{
					c.criar(novo);
					JOptionPane.showMessageDialog(null, "País criado com sucesso!");
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
					
				}
				break;
			case 3 :
				String nomeADeletar = JOptionPane.showInputDialog("Digite o nome do País a ser deletado: ");
				Pais p = c.procurar(nomeADeletar);
				try {
					c.deletar(p);
					JOptionPane.showMessageDialog(null, "País deletado com sucesso!");
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
				break;
			
			case 4 :
				String nomeAtualizar = JOptionPane.showInputDialog("Digite o nome do País a ser atualizado: ");
				Pais l = c.procurar(nomeAtualizar);
				l.setNome(JOptionPane.showInputDialog("Digite o novo nome: "));
				l.setPopulacao(Integer.parseInt(JOptionPane.showInputDialog("Digite nova população: ")));
				l.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite a nova area: ")));
				
				try {
					c.atualizar(l);
					JOptionPane.showMessageDialog(null, "País atualizado com sucesso!");
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
		


