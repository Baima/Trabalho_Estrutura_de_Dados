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
public class avaliacao {
    int numero;
    float nota;
    String tipo;
    boolean realizada; //variavel para dizer se a avaliação já foi realizada
    
    public avaliacao (int numero,String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
}
