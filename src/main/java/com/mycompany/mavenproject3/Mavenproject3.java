/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("JPK-234", "Igor", "191.233.434-56", "823.313.123-31", Genero.MASCULINO, Setor.JURIDICO, 1500, LocalDate.now());
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Carlos", "325.122.676-95", "834.122.566-75", Genero.MASCULINO, Setor.SAUDE, 5000, LocalDate.now());
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Deise", "123.657.768-37", "439.473.584-56", Genero.FEMININO, Setor.SAUDE, 10000, LocalDate.now());
        
        System.out.println(diretor);
        System.out.println(" ");
        System.out.println(gerente);
        System.out.println(" ");
        System.out.println(motoboy);
    }
}
