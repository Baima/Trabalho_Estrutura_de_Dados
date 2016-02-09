package calculamédia;

/**
 *
 * @author Gabriel
 */

//classe aluno - representa todo aluno da turma, suas notas e principais atividades;
public class aluno   //aluno não pode ser abstrata porque tem o método getConceito.
{
    protected String Nome;
    protected String matricula;
    private String Sexo;
    protected String Curso;
    int Idade;
    protected boletim notas;//notas
    protected avaliacao[] avaliacoes; //classes que representam as avaliações do aluno
    
    //método construtor da classe aluno com as informações iniciais
    aluno(String Nome, String matricula,String Sexo, String Curso, int Idade)
    {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.matricula = matricula;
        this.Curso = Curso;
        this.Idade = Idade;
        avaliacoes = new avaliacao[6];
        notas = new boletim(avaliacoes,this); //cria um novo boletim para o aluno
    } 
    
    public float getMedia() {
        return notas.getmedia();
    }
    public String getConceito() {
        return notas.getConceito();  //esse método aqui.
    }
    
    public void fazerAvaliacao(int numeroAvaliacao,float nota) {
        avaliacoes[numeroAvaliacao-1].RealizarAvaliacao(nota);
    }
    
    public String consultarAvaliacoes() {
    String text = "";
        System.out.println("\n Avaliações \n");
        System.out.println("--------------------\n");
    for (int i=0;i<=5;i++) {
            System.out.println (avaliacoes[i].getNum() + "- " + 
                    avaliacoes[i].getTipo() + "- status: " + avaliacoes[i].foiRealizadaS() + "- nota:" + avaliacoes[i].getNota() + "\n");
        }
    return text;
} 
    
    public String getMatricula() {
        return matricula;
    }
    
    public String getSexo() {
        return Sexo;
    }
    
}
