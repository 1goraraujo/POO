/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

/**
 *
 * @author Aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
       Motoboy motoboy = new Motoboy("721-wqd", "André", "822.421.214-22", "122.412.412-24", 2000);
       Gerente gerente = new Gerente(100, "juvemal@hotmail.com", "gsu123", "Juvenal", "123.241.435-32", "123.324.455-56", 7000);
       Diretor diretor = new Diretor("isaoi@gmail.com", "1233445", "Jonas", "823.214.412-32", "281.212.122-", 1000);
       
        System.out.println(motoboy);
        System.out.println("\n");
        System.out.println(gerente);
        System.out.println("\n");
        System.out.println(diretor);
    }
}
