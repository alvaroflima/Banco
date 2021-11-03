
public class ContaBancaria {

    private final String nome;
    private double saldo;
    private final int numero;
    private final int senha;

    public ContaBancaria(String nome, int numero, int senha) {
        this.nome = nome; 
        this.numero = numero;
        this.senha = senha;
    }

    public void depositar(double valor) {
        //double novoSaldo = saldo + valor;
        this.saldo += valor;
    }

    public void sacar(double valor) {
        //double novoSaldo = saldo - valor;
        this.saldo -= valor;
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        //retirando da conta de origem
        this.saldo -= valor;

        //colocando na conta destino
        contaDestino.saldo += valor;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

}
