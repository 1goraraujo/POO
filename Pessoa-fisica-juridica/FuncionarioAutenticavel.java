/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author Aluno
 */
public abstract class FuncionarioAutenticavel extends Funcionario{
    protected String login;
    protected String senha;

    public FuncionarioAutenticavel(String login, String senha, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login da conta: " +
                "\nLogin: " + login +
                "\nSenha: " + senha ;
    }
    
    
}
