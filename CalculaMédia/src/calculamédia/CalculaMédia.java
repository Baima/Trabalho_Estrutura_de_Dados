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
        System.out.println("Sexo:");
        Sexo = scan.nextLine();
        System.out.println("Curso:");
        Curso = scan.nextLine();
        System.out.println("Idade:");
        Idade = scan.nextInt();
        
        aluno cads = new aluno(Nome,Sexo,Curso,Idade);
        EngCom eng = new EngCom(Nome,Sexo,Idade);
        System.out.println(eng.Media(Sexo));
        
      
    }
    
}
