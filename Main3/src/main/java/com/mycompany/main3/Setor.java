/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main3;

/**
 *
 * @author Ana Beatriz
 */
public enum Setor {
    
    FINANCEIRO ("financeiro"),
    RECURSOS_HUMANOS ("Recursos Humanos"),
    VENDAS ("Vendas"),
    MARKETING ("Marketing");
    
    private final String desc;

    private Setor(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
      
}
