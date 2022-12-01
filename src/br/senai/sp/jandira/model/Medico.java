package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico {

    private String nome;
    private ArrayList<Especialidade> especialidade;
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

    public Medico( 
            String crm,
            String nome, 
            String telefone, 
            LocalDate dataDeNascimento, 
            Integer codigo, 
            String email,
            ArrayList<Especialidade> especialidade) {
        gerarCodigo();
        this.nome = nome; 
        this.telefone = telefone;
        this.crm = crm;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = codigo;
        this.contador = codigo;
        this.email = email;
        this.especialidade = especialidade;
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

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidade;
    }

    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
        this.especialidade = especialidade;
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

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public String getMedicosSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" +this.dataDeNascimento + ";" + converteArrayParaString(this.especialidade);
    }

    public String converteArrayParaString(ArrayList<Especialidade> lista){
        ArrayList<String> codigos = new ArrayList<>();
        for(Especialidade e: lista){
            codigos.add(e.getCodigo().toString());
        }
        return String.join(";", codigos);
    }
}
