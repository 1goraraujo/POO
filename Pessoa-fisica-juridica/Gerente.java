/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author Aluno
 */
public class Gerente extends FuncionarioAutenticavel{
    private double comissao = 100;

    public Gerente(double comissao, String login, String senha, String nome, String cpf, String rg, double salario) {
        super(login, senha, nome, cpf, rg, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Conta do gerente\n" +
                super.toString()+
                "Informação: " +
                "\nComissão: " + comissao +
                "Salario com comissão" + (super.salario+comissao);
    }
    
}
