package banco;
import java.util.Scanner;

public class conta{
    String numero;
    pessoa titular;
    double saldo = 0;
    Gerente ger;
    data criacao;

    public conta(String numero, pessoa titular, Gerente gerente, data criacao){

        this.criacao = criacao;
        this.ger = gerente;
        this.numero = numero;
        this.titular = titular;

    }
    conta(Gerente gerente){
        this.ger = gerente;
        Scanner info = new Scanner(System.in);
        criacao = new data();
        numero = info.nextLine();
        titular = new pessoa();
    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void extrato(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.getCpf());
        System.out.println("Saldo disponivel para saque: " + this.disponivel());

    }
    public double disponivel() {
        return this.saldo;
    }

    public boolean sacar(double valor){
        if (valor <= this.disponivel()){
            this.saldo -= valor;
            System.out.println("Saque na conta " + this.numero + " realizado com sucesso. Novo saldo: " + this.saldo);
            return true;
        }else{
            System.out.println("ERRO: Saque na conta " + this.numero + " nao foi realizado. Valor disponivel: " + this.saldo);
            return false;
        }

    }
    public boolean transferir(double valor, conta destino){

        if (this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferencia de " + valor + " da conta " + this.numero + " para a conta " + destino.numero + " foi realizado com sucesso.");
            return true;
        }else{
            System.out.println("ERRO: Nao foi possivel transferir " + valor + " da conta " + this.numero + " para a conta " + destino.numero + ". Valor disponivel: " + this.disponivel());
            return false;
        }
    }

}