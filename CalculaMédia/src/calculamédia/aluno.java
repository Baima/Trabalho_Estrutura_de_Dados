package calculamédia;

/**
 *
 * @author Gabriel
 */

//classe aluno - representa todo aluno da turma, suas notas e principais atividades;
public abstract class aluno 
{
    protected String Nome;
    protected String Sexo;
    protected String Curso;
    int Idade;
    protected boletim notas;//notas
    protected avaliacao[] avaliacoes; //classes que representam as avaliações do aluno
    
    //método construtor da classe aluno com as informações iniciais
    aluno(String Nome,String Sexo, String Curso, int Idade)
    {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Curso = Curso;
        this.Idade = Idade;
        notas = new boletim(); //cria um novo boletim para o aluno
    } 
    
    public String getConceito() {
        return notas.getConceito();
    }
    
}
