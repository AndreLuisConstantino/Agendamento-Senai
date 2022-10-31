package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

    //Metodos construtores
    public Paciente(String nome, 
            LocalDate dataDeNascimento, 
            String telefone, 
            String rg, 
            String cpf, 
            Endereco endereco, 
            PlanoDeSaude plano) {
        
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.plano = plano;
    }
    
    public Paciente(String nome, 
            LocalDate dataDeNascimento, 
            String telefone, 
            String rg, 
            String cpf){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
    }
    
    public Paciente(){
        gerarCodigo();
    }
    
    
    
    //atributos
    private String nome;
    private LocalDate dataDeNascimento;
    private String telefone;
    private String rg;
    private String cpf;
    private Endereco endereco;
    private PlanoDeSaude plano;
    private Integer codigo;
    private static int contador = 99;
    

    //metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PlanoDeSaude getPlano() {
        return plano;
    }

    public void setPlano(PlanoDeSaude plano1) {
        this.plano = plano1;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Paciente.contador = contador;
    }
    
    private void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
    }

}
