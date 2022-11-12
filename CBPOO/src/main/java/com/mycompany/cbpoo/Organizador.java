package com.mycompany.cbpoo;

public class Organizador extends Menu{
    private boolean generalChair;
    private boolean programChair;
    
    public void validarInscricao(){
    if(isProgramChairs()){
        
        }
    }
    
    public void invalidarInscricao(){
        if(isProgramChairs()){
        
        }}

    public void emitirCertificado(){
        if(isGeneralChair()){
        for (int i = 0; i <= dadosParticipantec.length; i++) {
            System.out.println("certificado emitido e disponível para " + dadosParticipantec[i]);
            }
        }
        else{
            System.out.println("usuário não tem permissão para emitir certificados");}
    }
    
    public void aceitarArtigo(){ // pode aceitar ou rejeitar o artigo, com base nas palavras-chave e tema do artigo.
        for(String p : submeterArtigo)
            {
                if(p.contains("POO")){
                    artigos.add(p);}
                else{
                    artigosRejeitados.add(p);}

            }
    }
    
    
    public void verAvaliacao(){}
     
    
    //getters and setters das variáveis.
    public boolean isGeneralChair() {
        return generalChair;
    }

    public void setGeneralChair(boolean generalChair) {
        this.generalChair = generalChair;
    }

    public boolean isProgramChairs() {
        return programChair;
    }

    public void setProgramChairs(boolean programChairs) {
        this.programChair = programChairs;
    }
    
    
}
