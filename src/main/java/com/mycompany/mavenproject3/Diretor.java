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
public class Diretor extends CargoDeConfianca {

    private final double PREMIO = 0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao.DIRETOR, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
    
 @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * bonificacao.getValor();
        salarioFinal += super.salarioBase*this.PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }


    @Override   
    public String toString() {
        return
                "Diretor: \n" +
                super.toString()+
                "\nPrêmio: " + PREMIO;
    }

  
    

}
