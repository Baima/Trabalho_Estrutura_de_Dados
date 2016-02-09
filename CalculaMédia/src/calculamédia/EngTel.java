package calculamédia;

/**
 *
 * @author Gabriel
 */
public class EngTel extends aluno //Herança
{
    EngTel (String Nome,String Sexo, int Idade)//Construtor
    {
        super(Nome,"EngTel",Sexo,Idade);
        
        //são 4 provas - criando as avaliações do tipo prova
        avaliacoes[1] = new avaliacao(1,"prova");
        avaliacoes[2] = new avaliacao(2,"prova");
        avaliacoes[3] = new avaliacao(3,"prova");
        avaliacoes[4] = new avaliacao(4,"prova");
        
    }
   
    
    
    
    
}