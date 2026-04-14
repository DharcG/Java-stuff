package lista07_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista07_01 {

    public static void main(String[] args) {
        
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        int input;
        
        do{
            System.out.println("--- O que deseja realizar? ---");
            System.out.println("1 - Cadastrar Carro eletrico");
            System.out.println("2 - Cadastrar Patinete");
            System.out.println("3 - Cadastrar Onibus autonomo");
            System.out.println("4 - Atualizar veiculo");
            System.out.println("5 - Listar veiculos");
            
            input = scan.nextInt();
            switch(input){
                case 1:
                        int id = listaVeiculos.size();
                        String idStr = String.valueOf(id);
                        
                        System.out.println("Digite a Velocidade do Carro eletrico");
                        int vel = scan.nextInt();
                        
                        listaVeiculos.add(new carroEletrico(idStr, vel));
                        
                        System.out.println("Veiculo cadastrado com sucesso!");
                        
                        break;
                
                case 2:
                        id = listaVeiculos.size();
                        idStr = String.valueOf(id);
                        
                        System.out.println("Digite a Velocidade do Patinete");
                        vel = scan.nextInt();
                        
                        listaVeiculos.add(new Patinete(idStr, vel)); 
                        
                        System.out.println("Veiculo cadastrado com sucesso!");
                        
                        break;
                case 3:
                        id = listaVeiculos.size();
                        idStr = String.valueOf(id);
                        
                        System.out.println("Digite a Velocidade do Onibus autonomo");
                        vel = scan.nextInt();
                        
                        listaVeiculos.add(new onibusAutonomo(idStr, vel));   
                        
                        System.out.println("Veiculo cadastrado com sucesso!");
                        
                        break; 
                case 4:
                    
                        System.out.println("Qual ID deseja atualizar?");
                        id = scan.nextInt();
                        
                        System.out.println("Digite a Velocidade do Veiculo");
                        vel = scan.nextInt();
                        
                        if()
                        
                        listaVeiculos.set(id, new)
                       
                        
                        
                        System.out.println("Veiculo atualizado com sucesso!");
                        
                        break;
            }
        }while(input != 0);
            
    }
    
}
