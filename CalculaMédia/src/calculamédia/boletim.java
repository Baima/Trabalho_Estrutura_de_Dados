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
    private float[] notas = {0,0,0,0,0,0};
    private String conceito;
    private float media;
    
    public void addNota(int indicie, float nota) {
        if ((nota>=0)&(nota<11)) {
          notas[indicie] = nota;  
        } 
       calculaMedia();
       calculaConceito();
    }
    
    public void calculaMedia () {
        float soma=0;
        int i;
        for (i=0;i<=6;i++) {
            soma =+ notas[i];   
        }
        media = soma/6;
    }
    
    public void calculaConceito () {
        if (media<5) {
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
        return conceito;
    }
}
