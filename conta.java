package banco;
import java.util.Scanner;

public class conta{
    private String numero;
    pessoa titular;
    double saldo = 0;
    Gerente ger;
    data criacao;

    public conta(String numero, pessoa titular, Gerente gerente, data criacao){

        this.criacao = criacao;
        this.ger = gerente;
        setNumero(numero);
        this.titular = titular;

    }
    conta(Gerente gerente){
        this.ger = gerente;
        Scanner info = new Scanner(System.in);
        criacao = new data();
        System.out.print("Digite o numero da conta: ");
        numero = info.nextLine();
        titular = new pessoa();
    }
    public void setNumero(String num){
        this.numero = num;
    }
    public String getNumero(){
        return numero;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void extrato(){
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Titular: " + this.titular.getCpf());
        System.out.println("Saldo disponivel para saque: " + this.disponivel());

    }
    public double disponivel() {
        return this.saldo;
    }

    public boolean sacar(double valor){
        if (valor <= this.disponivel()){
            this.saldo -= valor;
            System.out.println("Saque na conta " + this.getNumero() + " realizado com sucesso. Novo saldo: " + this.saldo);
            return true;
        }else{
            System.out.println("ERRO: Saque na conta " + this.getNumero() + " nao foi realizado. Valor disponivel: " + this.saldo);
            return false;
        }

    }
    public boolean transferir(double valor, conta destino){

        if (this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferencia de " + valor + " da conta " + this.getNumero() + " para a conta " + destino.getNumero() + " foi realizado com sucesso.");
            return true;
        }else{
            System.out.println("ERRO: Nao foi possivel transferir " + valor + " da conta " + getNumero() + " para a conta " + destino.getNumero() + ". Valor disponivel: " + this.disponivel());
            return false;
        }
    }

}