package calculamédia;

/**
 *
 * @author Gabriel
 */
public class EngTel extends CadastraAluno //Herança
{
    EngTel (String Nome,String Sexo, int Idade)//Construtor
    {
        super(Nome,"EngTel",Sexo,Idade);
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Curso = "EngTel";
        this.Idade = Idade;       
    }
    
    
    public float Media(String MF)
    {   float N1,N2,N3,N4,N5,N6,N7,N8,media;
        int i = 0;
        N5 = 0;
        N6 = 0;
        N7 = 0;
        N8 = 0;
        
        System.out.println("Digite a primeira nota: "); //N1
        N1 = scan.nextInt();
        i++;
        System.out.println("Digite a segunda nota: "); //N2
        N2 = scan.nextInt();
        i++;
        System.out.println("Digite a terceira nota: "); //N3
        N3 = scan.nextInt();
        i++;
        System.out.println("Digite a quarta nota: "); //N4
        N4 = scan.nextInt();
        i++;
        if (MF == "masculino")
        {
            System.out.println("Digite a nota da prova extra 1: "); //N5
            N5 = scan.nextInt();
            i++;
            System.out.println("Digite a nota da prova extra 2: "); //N6
            N6 = scan.nextInt();
            i++;
        }
        else if (MF == "feminino")
        {
            System.out.println("Digite a nota do trabalho extra 1: "); //N7
            N7 = scan.nextInt();
            System.out.println("Digite a nota do trabalho extra 2: "); //N8
            N8 = scan.nextInt();
        }
        
        media=((N1+N2+N3+N4+N5+N6)/i)+((N7+N8)/10);
        return media;
    }
}