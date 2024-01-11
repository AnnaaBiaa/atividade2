/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main4;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Pessoa {
    int id;
    String nome;
    String CPF;
    String rg;
    String matricula;
    LocalDate data;
    Genero genero;
    double salario;
    String telefone;
    String email;
    Endereço endereco;

    public Pessoa(int id, String nome, String CPF, String rg, String matricula, LocalDate data, Genero genero, double salario, String telefone, String email, Endereço endereco) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.rg = rg;
        this.matricula = matricula;
        this.data = data;
        this.genero = genero;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    @Override
    public String toString() {
        return "id:" + id + 
                "\nnome:" + nome + 
                "\nCPF:" + CPF + 
                "\nrg:" + rg + 
                "\nmatricula:" + matricula + 
                "\ndata:" + data + 
                "\ngenero:" + genero + 
                "\nsalario:" + salario + 
                "\ntelefone:" + telefone + 
                "\nemail:" + email + 
                "\nendereco:" + endereco;
    }
    

}