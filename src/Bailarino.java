import java.io.Serializable;

//import java.io.Serializable;

public class Bailarino implements Serializable{

    private String Nome;
    private int idade;
    private double salario;
    private float cc;
   

    
    public Bailarino(String nome,float cc, int idade,double salario){

        this.Nome= nome;
        this.cc=cc;
        this.idade = idade;
        this.salario= salario;
      

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

   
    @Override
    public String toString() {
        return "Bailarino\n" +
                "Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", cc=" + cc +
                
                '\n';
    }


}
