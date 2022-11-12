package com.mycompany.cbpoo;

import java.util.Scanner;


public class Especialista extends Menu{
    private boolean autor;
    private boolean revisor;
    
    public void submenterArtigo(){
        if(isAutor()){
            int n = 0;
            Scanner input = new Scanner (System.in);
            System.out.println("Qual o tema do seu artigo? (incluir palavras-chave): ");
            String temaArtigo = input.next();
            submeterArtigo[n + 1] = temaArtigo;
        }
    }
    
    public void avaliarArtigo(){
    }
    
    public void verAvaliacao(){}
    
    
    //getters and setters:

    public boolean isAutor() {
        return autor;
    }

    public void setAutor(boolean autor) {
        this.autor = autor;
    }

    public boolean isRevisor() {
        return revisor;
    }

    public void setRevisor(boolean revisor) {
        this.revisor = revisor;
    }
    
}
