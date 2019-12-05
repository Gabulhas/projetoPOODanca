import java.util.Date;

public class Espetaculo {
    private String local;
    private String nome;
    private int lotacao;
    private Date data;
    private float preço;
    private String estiloDanca;
    private float bruto;
    private float investimento;

    public Espetaculo(String nome) {
        this.local = "";
        this.nome = nome;
        this.lotacao = 0;
        this.data = data;
        this.preço = 0;
        this.estiloDanca = "";
        this.bruto = 0;
        this.investimento = 0;
    }
    
    
    public Espetaculo(String nome,)

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public String getEstiloDanca() {
        return estiloDanca;
    }

    public void setEstiloDanca(String estiloDanca) {
        this.estiloDanca = estiloDanca;
    }

    public float getBruto() {
        return bruto;
    }

    public void setBruto(float bruto) {
        this.bruto = bruto;
    }

    public float getInvestimento() {
        return investimento;
    }

    public void setInvestimento(float investimento) {
        this.investimento = investimento;
    }

    @Override
    public String toString() {
        return "Espetaculo{" +
                "local='" + local + '\'' +
                ", nome='" + nome + '\'' +
                ", lotacao=" + lotacao +
                ", data=" + data +
                ", preço=" + preço +
                ", estiloDanca='" + estiloDanca + '\'' +
                ", bruto=" + bruto +
                ", investimento=" + investimento +
                '}';
    }
}
