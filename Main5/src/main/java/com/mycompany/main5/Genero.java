/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.main5;

/**
 *
 * @author Ana Beatriz
 */
public enum Genero {
    
    FEMININO ("feminino"),
    MASCULINO("masculino");
    
    private final String texto;

    private Genero(String descricao) {
        this.texto = descricao;
    }

    public String getDescricao() {
        return texto;
    }
    
}
