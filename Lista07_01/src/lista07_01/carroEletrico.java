package lista07_01;

public class carroEletrico extends Veiculo implements Eletrico, Compartilhavel{

    public carroEletrico(String id, double velocidade){
        super(id, velocidade);
    }

  
    @Override
    void mover(){
        System.out.println("O carro está se movendo!");
    }

    @Override
    public void carregarBateria(){
        System.out.println("O carro está carregando!");
    }

    @Override
    public double calcularCusto(double distancia){
        return distancia*2.5;
    }

    
}
