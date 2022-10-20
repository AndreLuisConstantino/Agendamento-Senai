package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

    // atributos
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private Integer codigo;
    private static int quantidade = 99;

    //metodos construtores
    public PlanoDeSaude(String operadora, String numero, String categoria, LocalDate validade) {
        this.operadora = operadora;
        this.numero = numero;
        this.validade = validade;
        this.categoria = categoria;
        gerarCodigo();

    }

    public PlanoDeSaude() {
        gerarCodigo();
    }

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

    public static int getQuantidade() {
        return quantidade;
    }

    private void gerarCodigo() {
        this.quantidade++;
        this.codigo = quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    
}
