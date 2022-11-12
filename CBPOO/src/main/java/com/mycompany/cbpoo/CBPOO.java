package com.mycompany.cbpoo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CBPOO {
    
    public static void main(String[] args) {
    //polimorfismo - chamar as classes filhas ao menu principal.
    Especialista especialidade = new Especialista();
    Menu menu_especialista = especialidade;
    ////////////////////////////////////////////////////////////
        
        boolean opcaoCorreta;
        //adicionando as opçoes de entrada na lista
        ArrayList<Integer> opcoes = new ArrayList();
        opcoes.add(1);
        opcoes.add(2);
        opcoes.add(3);
        
        while(true){
        //Para ter login e senha
        try{
        
        Menu m = new Menu();
        
        
        Scanner acesso = new Scanner (System.in);
        System.out.println("*-----------------------------*\n" );
        System.out.println("     Bem Vindo ao CBPOO!    ");
        System.out.print("*-----------------------------*\n");
        System.out.print(" Antes de continuar, faça Login. Ou se você deseja se increver, digite a opção 4    \n");
        System.out.print(" 1 - Especialista\n");
        System.out.print(" 2 - Participante\n");
        System.out.print(" 3 - Organizador\n");
        System.out.print(" 4 - Inscrever-se\n");
        System.out.print(" Insira opção válida:         \n");
        System.out.print("*-----------------------------*\n");
        int entrarComo = acesso.nextInt();
        
        if(entrarComo == 4){
            System.out.println("inscrever-se ");
            m.participantes();
            
            opcaoCorreta = true;
            break;}         

        else if(opcoes.contains(entrarComo)){
            System.out.print(" Usuário:         \n");
            String usuario = acesso.next();
            m.setUsuario(usuario);

            System.out.print(" Senha:          \n");
            String senha = acesso.next();
            m.setSenha(senha); 
            m.ValidarLogin(entrarComo,usuario, senha );
            opcaoCorreta = true;
            break;}

        else{
            System.out.print("opção inválida");}  
            //m.ValidarLogin(usuario, senha, entrarComo);
        
            }
        catch(NullPointerException e){
            System.out.println("A opção digitada não é válida");}
        }}}


        
    


