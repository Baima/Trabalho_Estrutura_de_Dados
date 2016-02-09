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
public class Turma {
    String NomeTurma;
    aluno[] alunos; //array com alunos
    int numAlunos; //numero de alunos cadastrado
    int totAlunos; //capacidade de alunos total
    
    public Turma(int numero) {
        numAlunos = 0;
        totAlunos = numero;
        alunos = new aluno[totAlunos];
    }
    
    //checa se existe um aluno com a matrícula
    public boolean checaMatric(String matricula) {
        boolean retorno = false;
        for (int i=0;i<totAlunos;i++) {
           if (alunos[i] == null) continue; 
            if (alunos[i].getMatricula().equals(matricula)) {
                retorno = true;
                break;
            }
        }
        return retorno;
    }
    
    //retorna o índicie do aluno com a matrícula
    public int indexMatric(String matricula) {
        int retorno = 0;
        for (int i=0;i<totAlunos;i++) {
            if (alunos[i] == null) continue; 
            if (alunos[i].getMatricula().equals(matricula)) {
                retorno = i;
                break;
            }
        }
        return retorno;
    }
    
    public void apagarAluno (String matricula) {
        
    }
    
    
    public void novoAluno (String matricula, String Nome,String Sexo,String curso, int Idade) {
        if (checaMatric(matricula)) {
            //erro - aluno já cadastrado
        } else {
            if ("EngCom".equals(curso)) {
                alunos[numAlunos] = new EngCom(Nome,matricula,Sexo,Idade);
                numAlunos++;
            } else if ("EngTel".equals(curso)) {
                alunos[numAlunos] = new EngCom(Nome,matricula,Sexo,Idade);
                numAlunos++;
            }
            
        }
        
    }
    
    
   public aluno getAluno(String matricula) {
       System.out.println(indexMatric(matricula));
       return alunos[indexMatric(matricula)];
   }
    
}
