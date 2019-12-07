
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Espetaculo implements Serializable{
    private String local;
    private String nome;
    private int lotacao;
    private Date data;
    private float preço;
    private String estiloDanca;
    private float bruto;
    private float investimento;
    private ArrayList<Bailarino> bailarinosEspetaculo = new ArrayList<Bailarino>();
    private Coreografo coreografoEspetaculo;
    private ArrayList<Tecnico> tecnicosEspetaculo = new ArrayList<Tecnico>();


    public Espetaculo(String nome,String local,int lotacao,Date data,float preço, String estiloDanca,float bruto, float investimento ) {
        this.local = local;
        this.nome = nome;
        this.lotacao = lotacao;
        this.data = data;
        this.preço = preço;
        this.estiloDanca = "";
        this.bruto = bruto;
        this.investimento = investimento;
    }
    

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
    public ArrayList<Bailarino> getBailarinos(){
        return bailarinos
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
        final Espetaculo other = (Espetaculo) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
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
