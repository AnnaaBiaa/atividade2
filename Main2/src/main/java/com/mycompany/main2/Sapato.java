/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main2;

/**
 *
 * @author Ana Beatriz
 */
public class Sapato {
    
    private String marca;
    private String cor;
    private int tamanho;
    private int  preço;

    public Sapato(String marca, String cor, int tamanho, int preço) {
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

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    
    
    
    
}
