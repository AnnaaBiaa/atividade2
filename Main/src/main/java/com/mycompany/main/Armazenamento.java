/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Ana Beatriz
 */
public class Armazenamento {
    
    private String marca;
    private String modelo;
    private String Capacidade;

    public Armazenamento(String marca, String modelo, String Capacidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.Capacidade = Capacidade;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(String Capacidade) {
        this.Capacidade = Capacidade;
    }
         
    
}
