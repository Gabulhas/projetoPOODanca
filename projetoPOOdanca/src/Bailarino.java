public class Bailarino {

    private String Nome;
    private int idade;
    private double salario;
    private float cc;
    private String genero;

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
        return "Bailarino\n" +
                "Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", cc=" + cc +
                ", genero='" + genero + '\'' +
                '\n';
    }


}
