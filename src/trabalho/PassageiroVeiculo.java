package trabalho;

public class PassageiroVeiculo extends Veiculo {
    private String Tipo;
    private String Tracao;
    private int Eixos;
    private int Rodas;
    private int Passageiros;

    public PassageiroVeiculo(){
    }
    
    public PassageiroVeiculo(String classificacao, String classe, double peso, String tipo, String tracao, int eixos, int rodas, int passageiros){
        super(classificacao, classe, peso);
        this.Tipo = tipo;
        this.Tracao = tracao;
        this.Eixos = eixos;
        this.Rodas = rodas;
        this.Passageiros = passageiros;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTracao() {
        return Tracao;
    }

    public void setTracao(String Tracao) {
        this.Tracao = Tracao;
    }

    public int getEixos() {
        return Eixos;
    }

    public void setEixos(int Eixos) {
        this.Eixos = Eixos;
    }

    public int getRodas() {
        return Rodas;
    }

    public void setRodas(int Rodas) {
        this.Rodas = Rodas;
    }

    public int getPassageiros() {
        return Passageiros;
    }

    public void setPassageiros(int Passageiros) {
        this.Passageiros = Passageiros;
    }    
}
