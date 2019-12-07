
import java.io.Serializable;
import java.util.Objects;

public class Tecnico implements Serializable{
    private String Nome;
    private int idade;
    private double salario;
    private float cc;
    private String especificacao;
    

    
    public Tecnico(String nome,float cc,String especificacao,double salario,int idade){

        this.Nome= nome;
        this.cc=cc;
        this.idade = idade;
        this.salario= salario;    
        this.especificacao=especificacao;

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
               
                ", especificacao='" + especificacao + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tecnico other = (Tecnico) obj;
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return true;
    }

 
    
}
