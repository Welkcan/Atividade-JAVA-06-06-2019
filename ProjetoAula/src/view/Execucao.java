package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {
	
	public static void main(String[] args) {
		Professor prof = new Professor();
		
		prof.setNome(JOptionPane.showInputDialog(null, "Nome:"));
		prof.setEnd(JOptionPane.showInputDialog(null, "Endereço:"));
		prof.setBairro(JOptionPane.showInputDialog(null, "Bairro:"));
		prof.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "Cep:")));
		prof.setCidade(JOptionPane.showInputDialog(null, "Cidade:"));
		prof.setEstado(JOptionPane.showInputDialog(null, "Estado:"));
		prof.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "RG:")));
		prof.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "CPF:")));
		int cur=0;
		int dis=0;
		
		try {
			dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Disciplinas você possui?"));
			String disciplinas[] = new String[100];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina" + i);
			}
			
			prof.setDisciplinas(disciplinas);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos você possui?"));
			String cursos[] = new String[100];
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso" +  i);
			}
			prof.setCursos(cursos);
		} catch (Exception e) {
			e.printStackTrace();			
		}
		
		System.out.println("Nome:" + prof.getNome());
		System.out.println("Endereço:" + prof.getEnd());
		System.out.println("Bairro:" + prof.getBairro());
		System.out.println("Cidade:" + prof.getCidade());
		System.out.println("Estado:" + prof.getEstado());
		System.out.println("CEP:" + prof.getCep());
		System.out.println("RG:" + prof.getRg());
		System.out.println("CPF:" + prof.getCpf());
		
		for (int g = 0; g < dis; g++) {
			System.out.println("Disciplinas:" + prof.getDisciplinas()[g]);
			
		}
		
		for (int g = 0; g < cur; g++) {
			System.out.println("Cursos:" + prof.getCursos()[g]);
		}
		
		 
		
		
		
		
					
	}

}
