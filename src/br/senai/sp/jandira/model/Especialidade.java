package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	//atributos
	private String nome;
	private String descricao;
	
	//métodos de acesso aos atributos
	public void setNome(String nome){
		if(nome.length() >= 3) {
			this.nome = nome;
		}else {
			JOptionPane.showMessageDialog(null, nome +" Não é um nome válido!\n deve ter pelo menos 3 letras");
		}
		
		
	}
	public String getNome(){
		return nome;
	}
	
	public void setDescricao(String descricao) {
		if(descricao.length() >= 10) {
			this.descricao = descricao;
		} else {
			JOptionPane.showMessageDialog(null, descricao+" Não é uma descrição valida!\n deve ter pelo menos 3 letras");
		}
		
	}
	
	public String getDescricao() {
		return descricao;
	}
}
