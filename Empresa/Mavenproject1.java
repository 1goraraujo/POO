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
        Motoboy motoboy = new Motoboy("2947924", "Carlos", "831.324.532-76", "294.244.454-54", 1.300);
        Engenheiro engenheiro = new Engenheiro("9329244", "Jorge", "421.555.435-43", "394.233.143-45", 8.000);
        Medico medico = new Medico("8358325", "Mathes", "345.436.643-64", "239.557.547-34", 10.000);
        System.out.println(motoboy);
        System.out.println("");
        System.out.println(engenheiro);
        System.out.println("");
        System.out.println(medico);
    }
    
}

