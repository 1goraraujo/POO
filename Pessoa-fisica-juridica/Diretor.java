/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author Aluno
 */
public class Diretor extends FuncionarioAutenticavel{
    private double PREMIO =  0.2;

    public Diretor(String login, String senha, String nome, String cpf, String rg, double salario) {
        super(login, senha, nome, cpf, rg, salario);
        this.PREMIO = PREMIO;
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return  "Conta do direto:\n"+
                super.toString()+
                "\nBônus: 20% " +
                "\nSalario: " + super.salario +
                "\nPremiação:  " + salario*getPREMIO()+
                "\nSalario com premio: " + (super.salario+salario*getPREMIO());
    }

    
}
