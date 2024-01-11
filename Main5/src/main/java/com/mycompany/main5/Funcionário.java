/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main5;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Funcionário {
    
   private int id;
   private String nome;
   private String CPF;
   private String RG;
   private String matricula;        
   private LocalDate nascimento;
   private  Setor setor;
   private  Genero genero;
   private  String telefone;
   private String email;
   private Endereço endereco;
   private int idade;
   private double salario;

    public int getIdade() {
        return idade;
    }

    public Funcionário(int id, String nome, String CPF, String RG, String matricula, LocalDate nascimento, Setor setor, Genero genero, String telefone, String email, Endereço endereco, int idade, double salario) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.matricula = matricula;
        this.nascimento = nascimento;
        this.setor = setor;
        this.genero = genero;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.idade = idade;
        this.salario = salario;
    }
   
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "id=" + id +
               "\nnome:" + nome + 
                "\nCPF:" + CPF + 
                "\nRG:" + RG + 
                "\nmatricula:" + matricula + 
                "\nnascimento:" + nascimento + 
                "\nsetor:" + setor + 
                "\ngenero:" + genero + 
                "\ntelefone:" + telefone + 
                "\nemail:" + email + 
                "\nendereco:" + endereco + 
                "\nidade:" + idade + 
                "\nsalario:" + salario ;
    }

    
   
   
   
}
