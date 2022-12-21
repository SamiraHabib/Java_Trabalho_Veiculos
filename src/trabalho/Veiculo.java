package trabalho;

public abstract class Veiculo {
    protected String Classificacao;
    protected String Classe;
    protected double Peso;

    public Veiculo(){
        
    }
    
    public Veiculo(String Classificacao, String Classe, double Peso) {
        this.Classificacao = Classificacao;
        this.Classe = Classe;
        this.Peso = Peso;
    }

    public String getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(String Classificacao) {
        this.Classificacao = Classificacao;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
}