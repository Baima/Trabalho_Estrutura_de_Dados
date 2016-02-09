/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculamédia;

/**
 *
 * @author paulo
 */

public class boletim {
    private String conceito;
    private float media;
    private avaliacao[] avaliacoes;
    private aluno aluno;
    
    public boletim (avaliacao[] av, aluno al) {
        avaliacoes = av;
        this.aluno = al;
    }

    
    public void calculaMedia () {
        float soma = 0,med = 0;
        if (todasAvaliacoesRealizadas()) {
            for (int i=0;i<=5;i++) {
            soma = soma + avaliacoes[i].getNota();   
            }
        med = soma/6;
        if (aluno.getSexo().equals("feminino")) {
            med = med + (med*0.1f); //adicionando os 10% para as muliéres (.^.)
        }
        
        } else med = 0;
      media = med;  
    }
    
    public void calculaConceito () {
        if (todasAvaliacoesRealizadas() == false) {
            conceito = "SN";
        } else if (media<5) {
            conceito = "INS";
        } else if (media<7) {
            conceito = "REG";
        } else if (media<9) {
            conceito = "BOM";
        } else if (media<=10) {
            conceito = "EXC";
        }
    }
    
    public String getConceito() {
        calculaMedia(); 
        calculaConceito ();
        return conceito;
    }
    
    //checa se o aluno realizou todas as avaliações
    public boolean todasAvaliacoesRealizadas() {
        boolean valor = false;
        for (int i=0;i<=5;i++) {
            if (avaliacoes[i].foiRealizada() == false) {
                valor = false;
                break;
            }  else valor = true; 
        }
        return valor;
    }
    
    public float getmedia() {
        return media;
    }
}
