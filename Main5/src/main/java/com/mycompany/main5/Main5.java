/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main5;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ana Beatriz
 */
public class Main5 {

    public static void main(String[] args) {
    Endereço endereco = new Endereço("637362", "78382", "Casa", "78291", "Aracaju", UnidadeFederativa.SERGIPE);
    Funcionário func = new Funcionário(435, "Luna", "1459622", "85472", "748512", LocalDate.of(2000, Month.JULY, 25), Setor.SAUDE, Genero.FEMININO, "6378272", "Luna@gmail.com", endereco, 23, 4.568);
    
        System.out.println(func.toString());
    
    
    
    }
}
