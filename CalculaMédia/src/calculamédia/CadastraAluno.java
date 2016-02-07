package calculamédia;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class CadastraAluno 
{
    String Nome,Sexo,Curso;
    int Idade;
    
    Scanner scan = new Scanner(System.in);
    CadastraAluno(String Nome,String Sexo, String Curso, int Idade)
    {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Curso = Curso;
        this.Idade = Idade;
    }  
}
