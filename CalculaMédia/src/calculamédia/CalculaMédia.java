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
       
        EngCom aluno1 = new EngCom(Nome,Sexo,Idade);
        EngTel anulo2 = new EngTel(Nome,Sexo,Idade);
        
        System.out.println(aluno1.consultarAvaliacoes());
        System.out.println(aluno1.getConceito());
        aluno1.fazerAvalliacao(1, 8);
        aluno1.fazerAvalliacao(2, 5);
        aluno1.fazerAvalliacao(3, 6);
        aluno1.fazerAvalliacao(4, 9);
        aluno1.fazerAvalliacao(5, 8);
        aluno1.fazerAvalliacao(6, 9);
        System.out.println(aluno1.consultarAvaliacoes());
        System.out.println(aluno1.getConceito());
     System.out.println(aluno1.getMedia());
    
}
    
}