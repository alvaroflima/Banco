import java.util.ArrayList;


public class Banco {

    //declarar a lista de contas bancarias
    ArrayList<ContaBancaria> contas = new ArrayList();

    public Banco() {
    }
    
    public void adicionar(ContaBancaria conta) {
        //incluir o codigo para adicionar uma conta na lista
        contas.add(conta);
    }
    
     public ContaBancaria deposito(int numero, double valor) {
        //incluir o codigo de consultar o algoritmo: localizar conta
        //algoritmo
        ContaBancaria contaEncontrada = null;
        
         for(int i=0; i < contas.size(); i++){
            
            ContaBancaria contaEmAnalise = contas.get( i );
            
            if(contaEmAnalise.getNumero() == numero){
                contaEncontrada = contaEmAnalise;
                contaEncontrada.depositar(valor);
                break;
            }
            
        }
        return contaEncontrada;
    }
    

    public ContaBancaria consultar(int numero, int senha) {
        //incluir o codigo de consultar o algoritmo: localizar valor
        //algoritmo
        ContaBancaria contaEncontrada = null;
        
         for(int i=0; i < contas.size(); i++){
            
            ContaBancaria contaEmAnalise = contas.get( i );
            
            if(contaEmAnalise.getNumero() == numero && contaEmAnalise.getSenha()== senha){
                contaEncontrada = contaEmAnalise;
                break;
            }
            
        }
        return contaEncontrada;
    }
    
}
