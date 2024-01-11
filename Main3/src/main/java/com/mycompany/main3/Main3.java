/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main3;

/**
 *
 * @author Ana Beatriz
 */
public class Main3 {

    public static void main(String[] args) {
       Funcionário func = new Funcionário(2893, "Clara", 1.589, Setor.FINANCEIRO, Genero.FEMININO, 23);
       Funcionário func2 = new Funcionário(2894, "João", 1.239, Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 26);
    
        System.out.println("informações do Funcionário:");
        System.out.println("Id:" + func.getId());
        System.out.println("nome:" + func.getNome());
        System.out.println("Salário:" + func.getSalario());
        System.out.println("Setor:" + func.getSetor());
        System.out.println("Gênero:" + func.getGenero());
        System.out.println("Idade:" + func.getIdade());
         
         
     }
 }
