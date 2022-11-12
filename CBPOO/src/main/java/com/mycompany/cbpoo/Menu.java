package com.mycompany.cbpoo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Menu {

    ArrayList<String> loginSenha = new ArrayList();
    private String cpf;
    private String nome, dataNascimento, tituloAcademico, instituicaoVinculo, temaTrabalho;
    private String senha;
    //

    ArrayList<String> dadosParticipantev = new ArrayList(); //participantes que aguardam validação.
    String dadosParticipantec[] = {"Joao Carneiro", "Livia soares", "Adalberto Nascimento"}; //alguns participantes já setados para a opção.
    ArrayList<String> dadosOrganizador = new ArrayList(); //dados dos organizadores.
    ArrayList<String> dadosEspecialista = new ArrayList(); //dados dos especialistas.
    String submeterArtigo[];
    ArrayList<String> artigos = new ArrayList();
    ArrayList<String> artigosRejeitados = new ArrayList();
    
    

    //dados do participante
    public void Dados(String cpf, String nome, String dataNascimento, String tituloAcademico, String instituicaoVinculo, String senha,
            String temaTrabalho, String cadastrarComo) {
        
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tituloAcademico = tituloAcademico;
        this.instituicaoVinculo = instituicaoVinculo;
        this.senha = senha;
        
        if(cadastrarComo == "1"){
            this.temaTrabalho = temaTrabalho;
            }
        else{
            this.temaTrabalho = null;}
        
        dadosParticipantev.add(temaTrabalho);
        dadosParticipantev.add(cpf);
        dadosParticipantev.add(nome);
        dadosParticipantev.add(dataNascimento);
        dadosParticipantev.add(tituloAcademico);
        dadosParticipantev.add(instituicaoVinculo);
        dadosParticipantev.add(senha);
        //dadosParticipante.add();
        
    }  
    

    //método para validar o se o login passado está correto:
    public void ValidarLogin( int entrarComo,String cpf, String senha){
        //ArrayList<String> loginSenha = new ArrayList();
        
        String conjunto = entrarComo+';'+ cpf +';'+ senha;
        loginSenha.add(conjunto);
        if(loginSenha.contains(conjunto)){
           System.out.println("seja bem vindo");
           MenuOpcoes(entrarComo);
       }
       else{
            System.out.println("Usuário e/ou Senha incorretos. Tente novamente.");  }

    }
    
    
    //menu de opcções para o usuário:
    public void MenuOpcoes(int entrarComo){
        ArrayList<Integer> opcoesmenu = new ArrayList();
        opcoesmenu.add(1);
        opcoesmenu.add(2);
        opcoesmenu.add(3);
        opcoesmenu.add(4);
        opcoesmenu.add(5);
        opcoesmenu.add(6);
        opcoesmenu.add(7);
        opcoesmenu.add(8);
        opcoesmenu.add(9);
        opcoesmenu.add(10);
        
        boolean sair;
        try{
            while(true){
                Scanner acao = new Scanner (System.in);
                System.out.print("      *----Menu----*      \n\n");
                System.out.print("*-------------------------------*\n");
                System.out.print("Opção 1 - Inscrever Participante\n");
                System.out.print("Opção 2 - Validação de Inscrição dos Participantes\n");
                System.out.print("Opção 3 - Emissão de Certificados para Participante\n");
                System.out.print("Opção 4 - Submenter Artigo\n");
                System.out.print("Opção 5 - Enviar Avaliação dos Artigos\n");
                System.out.print("Opção 6 - Avaliações dos Artigos(aceitar e rejeitar)\n");
                System.out.print("Opção 7 - Artigos Aceitos(e seus dados)\n");
                System.out.print("Opção 8 - Artigos Negados(e seus dados)\n");
                System.out.print("Opção 9 - Lista de Participantes\n");
                System.out.print("Opção 10 - Sair\n");
                System.out.print("|-----------------------------|\n");
                System.out.print("Digite uma opção: ");
                int opcaoEscolhida = acao.nextInt();

                if(opcoesmenu.contains(entrarComo)){
                    //switch (opcaoEscolhida) {
                    if(opcaoEscolhida==1) {
                        System.out.print("\n Opção Inscrever Participante");
                        System.out.print("\n ================================\n");
                        participantes();}

                    //case 2:
                    if(opcaoEscolhida==2){
                        if(entrarComo == 3){
                            System.out.print("\n Opção Validação de inscrições\n");
                            System.out.print("\n ================================\n");}
                        else{
                               System.out.print("\n Opção inválida\n"); }}

                    //case 3:
                    if(opcaoEscolhida==3){
                        if(entrarComo == 3){
                            System.out.print("\n Certificados\n");
                            System.out.print("\n ================================\n");}
                        else{
                               System.out.print("\n Opção inválida\n"); }}

                    //case 4:
                    if(opcaoEscolhida==4){
                        if(entrarComo == 1){
                            System.out.print("\n Submenter Artigo\n");
                            System.out.print("\n ================================\n");}
                            //especial.submenterArtigo();
                        else{
                               System.out.print("\n Opção inválida\n"); }}

                    //case 5:
                    if(opcaoEscolhida==5){
                        if(entrarComo == 1){
                            System.out.print("\n Enviar Avaliação dos Artigos\n");
                            System.out.print("\n ================================\n");}
                        else{
                               System.out.print("\n Opção inválida\n"); }}

                    //case 6:
                    if(opcaoEscolhida==6){
                        System.out.print("\n Avaliações dos Artigos\n");
                        System.out.print("\n ================================\n");
                        dadosArtigoum();}

                    //case 7:
                    if(opcaoEscolhida==7){
                        System.out.print("\n Artigos Aceitos\n");
                        artigosAceitos();
                        System.out.print("\n ================================\n");}

                    //case 8:
                    if(opcaoEscolhida==8){
                        System.out.print("\n Artigos Negados\n");
                        artigosNegados();
                        System.out.print("\n ================================\n");
                    }

                    //case 9:
                    if(opcaoEscolhida==9){
                        System.out.print("\n Lista de Participantes\n");
                        ordenarParticipantes();
                        System.out.print("\n ================================\n");}


                    //case 10:
                    if(opcaoEscolhida==10){
                        System.out.print("\nAté logo!");
                        sair = true;
                        //acao.close(); 
                    if(sair == true){
                        break;}}
                    }
                else{
                    System.out.println("A opção digitada não é válida. Tente novamente.");}
                //default:
                //    System.out.print("\nOpção Inválida!");
            }}
            
        catch(NullPointerException e){
            System.out.println("A opção digitada não é válida");
        }}
    
    public void ordenarParticipantes(){//ordena em ordem alfabética os participantes.
    Arrays.sort(dadosParticipantec);
    System.out.println(Arrays.toString(dadosParticipantec));
    }
    
    public void artigosAceitos(){
        System.out.println(artigos);
    }
     
    public void artigosNegados(){
        System.out.println(artigosRejeitados);}
     
    public void dadosArtigoum(){}
            
    
    public void participantes(){

        Scanner inscricao = new Scanner (System.in);
        
        System.out.println("cpf");
        String cpf = inscricao.next();
        
        System.out.print("nome");
        String nome = inscricao.next();
        
        System.out.print("data de nascimento");
        String dataNascimento = inscricao.next();
        
        System.out.print("titulo academico");
        String titulo = inscricao.next();
        
        System.out.print("instituicaoVinculo");
        String instituicao = inscricao.next();
        
        System.out.print("senha");
        String senhas = inscricao.next();
        
        System.out.print("temaTrabalho");
        String temaTrabalho = inscricao.next();
        
        System.out.print("cadstrar como");
        String cadastrarComo = inscricao.next();
        
        Dados(cpf, nome, dataNascimento, titulo, instituicao, senhas, temaTrabalho, cadastrarComo);
        
        System.out.print("cadstro finalizado");
    }

    //getters and setters:

    public String getUsuario() {
        return cpf;
    }

    public void setUsuario(String usuario) {
        this.cpf = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getInstituicaoVinculo() {
        return instituicaoVinculo;
    }

    public void setInstituicaoVinculo(String instituicaoVinculo) {
        this.instituicaoVinculo = instituicaoVinculo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTemaTrabalho() {
        return temaTrabalho;
    }

    public void setTemaTrabalho(String temaTrabalho) {
        this.temaTrabalho = temaTrabalho;
    }
    
    public void addParticipante(String Participante){
        for(int t = 0; t <= dadosParticipantec.length; t++){
            dadosParticipantec[t] = Participante;
            }
        
    }


}
