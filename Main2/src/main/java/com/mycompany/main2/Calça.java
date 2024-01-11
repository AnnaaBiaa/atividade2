/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main2;

/**
 *
 * @author Ana Beatriz
 */
public class Calça {
    
     private String marca;
    private String cor;
    private char tamanho;
    private int  preço;

    public Calça(String marca, String cor, char tamanho, int preço) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preço = preço;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    
    
    
    
    
    
}
