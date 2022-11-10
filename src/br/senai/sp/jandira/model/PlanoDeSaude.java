package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

public class PlanoDeSaude {

    // atributos
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private Integer codigo;
    private static int contador = 100;

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
    
    public PlanoDeSaude(String operadora, String numero, String categoria, LocalDate validade, Integer codigo) {
        this.operadora = operadora;
        this.numero = numero;
        this.validade = validade;
        this.categoria = categoria;
        this.codigo = codigo;
        this.contador = codigo;
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
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        return validade;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    public String getPlanosSeparadaPorPontoEVirgula() {
        
        return this.codigo+ ";"  + this.operadora + ";" + this.categoria + ";" + this.numero + ";" + this.validade;
    }
}
