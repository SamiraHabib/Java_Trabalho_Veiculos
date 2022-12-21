package trabalho;
import java.util.ArrayList;
import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ArrayList<Veiculo> VeiculoList = new ArrayList<Veiculo>();
        ArrayList<Proprietario> ProprietarioList = new ArrayList<Proprietario>();
        
        int entrada = 0;
        
        do {
            System.out.print("1 - Inserir veículo\n"
                    + "2 - Inserir proprietário\n"
                    + "3 - Listar os dados de um proprietário com os dados do seu veículo (baseado na placa)\n"
                    + "4 - Excluir proprietário\n"
                    + "5 - Editar proprietário\n"
                    + "6 - Listar veículos por classificação\n"
                    + "7 - Finalizar programa\n"
            );
            
            System.out.print("Escolha a opção: ");
            entrada = s.nextInt();
            s.nextLine();
            
            switch(entrada) {
                case 1:
                    System.out.println("1 - Veículo de Passageiros | 2 - Veículo de Carga");
                    System.out.print("Digite a classificação de veículo: ");
                    int escolhaClassificacao = s.nextInt();
                    s.nextLine();
                    
                    if(escolhaClassificacao == 1){
                        System.out.print("Digite a classificação do veículo: ");
                        String classificacao = s.nextLine();                      
                        
                        System.out.print("Digite o peso do veículo em toneladas: ");
                        double peso = s.nextDouble();
                        s.nextLine();
                        String classe = "";
                        
                        if(peso < 2){
                            classe = "Leve";
                        }
                        else if(peso > 2 && peso < 6){
                            classe = "Médio";
                        }
                        else{
                            classe = "Pesado";
                        }
                        
                        System.out.print("Digite o tipo do veículo: ");
                        String tipo = s.nextLine();
                        
                        System.out.print("Digite a tração do veículo: ");
                        String tracao = s.nextLine();
                        
                        System.out.print("Digite os eixos do veículo: ");
                        int eixo = s.nextInt();
                        s.nextLine();
                        
                        System.out.print("Digite a quantidade de rodas do veículo: ");
                        int rodas = s.nextInt();
                        s.nextLine();
                        
                        System.out.print("Digite a quantidade de passageiros: ");
                        int passageiros = s.nextInt();
                        s.nextLine();
                        
                        PassageiroVeiculo passageiroVeiculo = new PassageiroVeiculo(classificacao, classe, peso, tipo, tracao, eixo, rodas, passageiros);
                        VeiculoList.add(passageiroVeiculo);
                    }
                    else if(escolhaClassificacao == 2){
                        System.out.print("Digite a classificação do veículo: ");
                        String classificacao = s.nextLine();
                        
                        System.out.print("Digite a classe do veículo: ");
                        String classe = s.nextLine();
                        
                        System.out.print("Digite o peso do veículo: ");
                        double peso = s.nextDouble();
                        s.nextLine();
                        
                        System.out.print("Digite o tipo do veículo: ");
                        String tipo = s.nextLine();
                        
                        System.out.print("Digite a tração do veículo: ");
                        String tracao = s.nextLine();
                        
                        System.out.print("Digite os eixos do veículo: ");
                        int eixo = s.nextInt();
                        s.nextLine();
                        
                        System.out.print("Digite a quantidade de rodas do veículo: ");
                        int rodas = s.nextInt();
                        s.nextLine();
                        
                        System.out.print("Digite a quantidade de passageiros: ");
                        int passageiros = s.nextInt();
                        s.nextLine();
                        
                        CargaVeiculo cargaVeiculo = new CargaVeiculo(classificacao, classe, peso, tipo, tracao, eixo, rodas, passageiros);
                        VeiculoList.add(cargaVeiculo);
                    }
                    else{
                        System.out.print("Opção inválida!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do proprietário: ");
                    String Nome = s.nextLine();
                    int i = 1;
                    
                    for(Veiculo vec : VeiculoList){
                        System.out.print("Veículo " + i + "\n" + 
                                "Classificação: " + vec.getClassificacao() + "\n" +
                                "Classe: " + vec.getClasse() + "\n" +
                                "Peso: " + vec.getPeso() + "\n"
                        );
                        i++;
                    }
                    System.out.print("Digite a posição de ordem da inserção do veículo para inserir: ");
                    int ProcuraVeiculo = s.nextInt()-1;
                    s.nextLine();
                    
                    System.out.print("Digite a placa: ");
                    String Placa = s.nextLine();
                    
                    System.out.print("Digite o valor: ");
                    double Valor = s.nextDouble();
                    
                    var Veic = VeiculoList.get(ProcuraVeiculo);
                    
                    Proprietario prop = new Proprietario(Nome, Veic, Placa, Valor);
                    ProprietarioList.add(prop);
                    
                    break;
                case 3:
                    System.out.print("Digite a placa: ");
                    String comparaPlaca = s.nextLine();
                    
                    for(Proprietario proprietario : ProprietarioList){
                        if(comparaPlaca.equals(proprietario.getPlaca())){
                            System.out.print("Dados do proprietário\n");
                            System.out.print("Nome: " + proprietario.getNome() + "\n");
                            System.out.print("Placa: " + proprietario.getPlaca() + "\n");
                            System.out.print("Veículo\n" + "Classificação: " + proprietario.getVeiculo().getClassificacao() + "\n" + 
                                    "Classe: " + proprietario.getVeiculo().getClasse() + "\n" +
                                    "Peso: " + proprietario.getVeiculo().getPeso() + "\n"
                            );
                            System.out.print("Valor: " + proprietario.getValor() + "\n");
                        }
                    }     
                    break;
                case 4:
                    System.out.print("Digite a placa do proprietário para excluir: ");
                    String PlacaExclue = s.nextLine();
                    
                    for(Proprietario proprietario : ProprietarioList){
                        if(PlacaExclue.equals(proprietario.getPlaca())){
                            ProprietarioList.remove(proprietario);
                        }
                    }     
                    break;
                case 5:
                    System.out.print("Digite a placa do proprietário para editar: ");
                    String PlacaEdita = s.nextLine();
                    for(Proprietario proprietario : ProprietarioList){
                        if(PlacaEdita.equals(proprietario.getPlaca())){
                            System.out.print("Digite o novo nome do proprietário: ");
                            Nome = s.nextLine();
                            proprietario.setNome(Nome);
                            System.out.print("Digite a nova placa do proprietário: ");
                            Placa = s.nextLine();
                            proprietario.setPlaca(Placa);
                            System.out.print("Digite o novo valor do proprietário: ");
                            Valor = s.nextDouble();
                            s.nextLine();
                            proprietario.setValor(Valor);
                            
                            System.out.print("Digite a nova classificação do veículo: ");
                            String Classificacao = s.nextLine();
                            proprietario.getVeiculo().setClassificacao(Classificacao);
                            System.out.print("Digite a nova classe do veículo: ");
                            String Classe = s.nextLine();
                            proprietario.getVeiculo().setClasse(Classe);
                            System.out.print("Digite o novo peso do veículo: ");
                            double Peso = s.nextDouble();
                            proprietario.getVeiculo().setPeso(Peso);
                            s.nextLine();
                        }
                    }     
                    break;
                case 6:
                    System.out.print("Digite a classificação: ");
                    var Classificacao = s.nextLine();
                    int cont = 1;
                    
                    for(Veiculo veic : VeiculoList){
                        if(Classificacao.equals(veic.getClassificacao())){                           
                            System.out.print("Veículo " + cont + "\n" + 
                                "Classificação: " + veic.getClassificacao() + "\n" +
                                "Classe: " + veic.getClasse() + "\n" +
                                "Peso: " + veic.getPeso() + "\n");
                            cont++;
                        }
                    }     
                    
                    break;
            }
        } while (entrada<7);
        
    }
    
}
