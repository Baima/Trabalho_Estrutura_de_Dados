package calculamédia;

/**
 *
 * @author Gabriel
 */
public class EngCom extends aluno //herança de classes
{
    EngCom(String Nome,String Sexo, int Idade)//construtor
    {
        super(Nome,Sexo,"EngCom",Idade);   
        avaliacoes[0] = new avaliacao(1,"prova");
        avaliacoes[1] = new avaliacao(2,"prova");
        avaliacoes[2] = new avaliacao(3,"prova");
        avaliacoes[3] = new avaliacao(4,"trabalho");
        if (Sexo == "masculino")
        {
            avaliacoes[5] = new avaliacao(5, "prova");
            avaliacoes[6] = new avaliacao(6, "prova");  
        }
        else if (Sexo == "feminino")
        {
            avaliacoes [5] = new avaliacao (5, "trabalho");
            avaliacoes [6] = new avaliacao (6, "trabalho");
        }
    }
    
    public void calculaNota() 
    {   
        
    }
   
    
    public void adicionarNota() 
    {
        
    }
    
}
