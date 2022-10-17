package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    // atributos
    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descricao;

    // Construtor da classe
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();

    }

    public Especialidade() { //Construtor defaut
        gerarCodigo();

    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }
    // métodos de acesso aos atributos

    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " Não é um nome válido!\n deve ter pelo menos 3 letras");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null,
                    descricao + " Não é uma descrição valida!\n deve ter pelo menos 3 letras");
        }

    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getContador() {
        return contador;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
