/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Ana Beatriz
 */
public class Main {

    public static void main(String[] args) {
        Armazenamento amaze = new Armazenamento("Lenovo","Dell Inspiron 3880" , "128 GB");
        Memória men = new Memória("HyperX", " Atkinson-Shiffrin", "Disco rígido (HD)");
        PlacaMãe placa = new PlacaMãe("Biostar", "ATX", "LGA 1200");
        Processador proc = new Processador("Intel", "Core i9-11900K", "2.9 GHz");
        
        
        System.out.println("informação Armazenamento:" );
        System.out.println("marca:" + amaze.getMarca());
        System.out.println("modelo:" + amaze.getModelo());
        System.out.println("capacidade " + amaze.getCapacidade());
        
        System.out.println("informação da Memória:" );
        System.out.println("marca:" + men.getMarca());
        System.out.println("modelo:" + men.getModelo());
        System.out.println("armazenamento" + men.getArmazenamento());
        
        System.out.println("informação Placa Mãe:" );
        System.out.println("marca:" + placa.getMarca());
        System.out.println("modelo:" + placa.getModelo());
        System.out.println("soquete" + placa.getSoquete());
        
        System.out.println("informação Processador:" );
        System.out.println("marca:" + proc.getMarca());
        System.out.println("modelo:" + proc.getModelo());
        System.out.println("capacidade" + proc.getFrequencia());
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
