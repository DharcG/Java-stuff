
package lista07_01;

abstract public class Veiculo {
    String id;
    double velocidade;

    public Veiculo(String id, double velocidade) {
        this.id = id;
        this.velocidade = velocidade;
    }
    
    void exibirInfo(){
        System.out.println("ID:" + id);
        System.out.println("Velocidade:" + velocidade);
    }
    
    abstract void mover();
    
}
