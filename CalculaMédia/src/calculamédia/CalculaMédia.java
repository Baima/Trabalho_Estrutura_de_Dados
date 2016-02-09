package calculamédia;

import java.util.Scanner;


public class CalculaMédia 
{

   
    public static void main(String[] args) 
    {
     
     String Nome,Sexo,Curso;
     int Idade;
     
     Scanner scan = new Scanner(System.in);
     
        System.out.println("Digite o nome do aluno:");
        Nome = scan.nextLine();
        System.out.println("Digite o sexo do aluno:");
        Sexo = scan.nextLine();
        System.out.println("Digite o nome do curso:");
        Curso = scan.nextLine();
        System.out.println("Digite a idade do aluno:");
        Idade = scan.nextInt();
        
        aluno cads = new aluno(Nome,Sexo,Curso,Idade);
        EngCom eng = new EngCom(Nome,Sexo,Idade);
        EngTel tel = new EngTel(Nome,Sexo,Idade);
        
        if (Curso == "Eng. Computação")
        {
           eng.calculaNota();
        }
        else if (Curso == "Eng. Telecom")
        {
           tel.calculaNota();
        }
      
    }
    
}
