
import java.io.Serializable;

public class Coreografo implements Serializable {
    private String Nome;
    private int idade;
    private double salario;
    private float cc;
    private String genero;

    public Coreografo(String nome,float cc){

        this.Nome= nome;
        this.cc=cc;
        this.idade = 0;
        this.salario= .0;
        this.genero="";

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


    @Override
    public String toString() {
        return "Coreografo:{" +
                "Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", cc=" + cc +
                ", genero='" + genero + '\'';
    }
    public boolean equals(Object obj) {
        //para fazer depois
        return Todfiodfdkfje;

    }

}
