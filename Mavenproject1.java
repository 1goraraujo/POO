/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Avenida Afranio Peixoto", "4", "Casa amarela", "8214-2194", "Salvador", UnidadeFederacao.BAHIA);
        Funcionario funcionario = new Funcionario(2384, "Igor", "127.323.424-42", "282.234.533-45", "8137-3", LocalDate.of(2003, Month.FEBRUARY, 12), Genero.MASCULINO, Setor.JURIDICO, 10.000, "(71 9 83837901)", "igor@hotmail.com", endereco);
        
        System.out.println(funcionario);
       
    }
    
}
