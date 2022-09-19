package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

	// atributos
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;

	// metodos
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public LocalDate getValidade() {
		return validade;
	}
}
