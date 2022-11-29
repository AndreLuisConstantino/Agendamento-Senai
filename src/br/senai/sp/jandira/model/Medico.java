package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private static int contador = 99;
    private Integer codigo;

    public Medico(String nome, String telefone, String crm, String email) {
        gerarCodigo();
        this.nome = nome;
        this.telefone = telefone;
        this.crm = crm;
        this.email = email;
    }

    public Medico( String crm,String nome, String telefone, LocalDate dataDeNascimento, Integer codigo, String email) {
        gerarCodigo();
        this.nome = nome; 
        this.telefone = telefone;
        this.crm = crm;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = codigo;
        this.contador = codigo;
        this.email = email;
    }

    public Medico() {
        gerarCodigo();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public String getMedicosSeoaradoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" +this.dataDeNascimento;
    }

}
