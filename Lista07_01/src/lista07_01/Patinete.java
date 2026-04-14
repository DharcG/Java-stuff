package lista07_01;

public class Patinete extends Veiculo implements Eletrico, Compartilhavel{
    
    public Patinete(String id, double velocidade){
        super(id, velocidade);
    }

  
    @Override
    void mover(){
        System.out.println("O patinete está se movendo!");
    }

    @Override
    public void carregarBateria(){
        System.out.println("O patinete está carregando!");
    }

    @Override
    public double calcularCusto(double distancia){
        return distancia*1.0;
    }
}
