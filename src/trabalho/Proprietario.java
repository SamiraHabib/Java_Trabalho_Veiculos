package trabalho;

public class Proprietario {
    private String Nome;
    private Veiculo veiculo;
    private String Placa;
    private double Valor;
    
    public Proprietario(){      
    }

    public Proprietario(String Nome, Veiculo veiculo, String Placa, double Valor) {
        this.Nome = Nome;
        this.veiculo = veiculo;
        this.Placa = Placa;
        this.Valor = Valor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    
    public void ImprimeProprietario(String Placa){
        
    }
}
