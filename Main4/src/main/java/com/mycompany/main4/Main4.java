/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main4;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Main4 {

    public static void main(String[] args) {
        Endereço endereco = new Endereço("6372", "234", "casa", "53627", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa pessoa = new Pessoa(42, "Luara", "435262", "52617", "780", LocalDate.of(2022, 7, 8), Genero.FEMININA, 4.678, "71959345", "Luara@gmail.com", endereco);
        
        System.out.println(pessoa.toString());
    }
}
