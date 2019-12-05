
import java.io.Serializable;

public class Tecnico implements Serializable{
    private String Nome;
    private int idade;
    private double salario;
    private float cc;
    private String genero;
    private String especificacao;
    

    
    public Tecnico(String nome,float cc){

        this.Nome= nome;
        this.cc=cc;
        this.idade = 0;
        this.salario= .0;
        this.genero="";
        this.especificacao="";

    }
    
    
    
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public float getCc() {
        return cc;
    }

    public void setCc(float cc) {
        this.cc = cc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", cc=" + cc +
                ", genero='" + genero + '\'' +
                ", especificacao='" + especificacao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        
    //para fazer depois
        return Todfiodfdkfw;


}
    
}
