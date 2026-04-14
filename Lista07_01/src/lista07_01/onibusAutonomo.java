package lista07_01;

public class onibusAutonomo extends Veiculo implements Autonomo {

    public onibusAutonomo(String id, double velocidade) {
        super(id, velocidade);
    }

    @Override
    void mover() {
        System.out.println("O Onibus esta se movendo!");
    }

    @Override
    public void dirigirSozinho() {
        System.out.println("O Onibus esta dirigindo sozinho!");
    }
    
    
}
