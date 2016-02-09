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
        Turma EngTeleco2015 = new Turma(50);
        EngTeleco2015.novoAluno(Nome,"201506840033", Sexo, Curso, Idade);
        EngTeleco2015.getAluno("201506840033").consultarAvaliacoes();
}
    
}