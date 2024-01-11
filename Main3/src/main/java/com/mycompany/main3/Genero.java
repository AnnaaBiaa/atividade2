/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main3;

/**
 *
 * @author Ana Beatriz
 */
public enum Genero {
    
   FEMININO ("feminino"),
    MASCULINO("masculino");
    
    private final String descricao;

    private Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
}
