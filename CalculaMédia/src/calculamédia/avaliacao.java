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
public class avaliacao 
{
    private int numero;
    private float nota;
    private String tipo;
    private boolean realizada; //variavel para dizer se a avaliação já foi realizada
    
    public avaliacao (int numero,String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        realizada = false;
    }
    
    //porque o trabalho vale 1 décimo?
    /*
   public void calculaNota()
   {
    if(tipo == "prova")
    {
        this.nota = nota;
    }
    else if (tipo == "trabalho")
        this.nota = nota/10;
   }*/
   
   
   
   public void RealizarAvaliacao(float nota) {
       if ((nota>=0)&(nota<=10)) {   
          this.nota = nota; 
          realizada = true;
        } 
   }
   
   public float getNota() {
       return nota;
   }
   
   public boolean foiRealizada() {
       return realizada;
   }
   
   public String foiRealizadaS() {
       String retorno;
       if (realizada) {
           retorno = "realizada";
       } else retorno = "pendente";
      return retorno;
   }
   
   public String getTipo() {
       return tipo;
   }
   
   public int getNum() {
       return numero;
   }
   
}
