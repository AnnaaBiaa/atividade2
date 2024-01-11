/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main2;

/**
 *
 * @author Ana Beatriz
 */
public class Main2 {

    public static void main(String[] args) {
        Camisa cam = new Camisa("Polo", "branca", 'G', 35);
        Calça cal = new Calça ("Gucci", "Preta", 'M', 45);
        Sapato sap = new Sapato("Beira Rio", "Nude",37 , 80);
        
        
        System.out.println("Informações da Camisa:");
        System.out.println("Marca:" + cam.getMarca());
        System.out.println("Cor:" + cam.getCor());
        System.out.println("tamanho:" + cam.getTamanho());
        System.out.println("Preço :" + cam.getPreço());
        
        System.out.println("Informações da Calça");
        System.out.println("Marca:" + cal.getMarca());
        System.out.println("Cor:" + cal.getCor());
        System.out.println("tamanho:" + cal.getTamanho());
        System.out.println("preço:" + cal.getPreço());
        
        System.out.println("Informações do Sapato");
        System.out.println("Marca:" + sap.getMarca());
        System.out.println("Cor:" + sap.getCor());
        System.out.println("Tamanho:" + sap.getTamanho());
        System.out.println("Preço:" + sap.getPreço ());
       
    }
}
