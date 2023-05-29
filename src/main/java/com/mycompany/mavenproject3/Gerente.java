/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao.GERENTE, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }

    
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * bonificacao.getValor();
        salarioFinal += super.salarioBase;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Gerente: \n" + 
                super.toString()+
                "\nSalario: " + this.getSalarioFinal();
    }
    
    
}
