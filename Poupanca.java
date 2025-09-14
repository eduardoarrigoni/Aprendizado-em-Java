package banco;
public class Poupanca extends conta{
    public Poupanca(String numero, pessoa titular, Gerente gerente, data criacao) {
        super(numero, titular, gerente, criacao);
    }
    public double disponivel() {
        return this.saldo;
    }
    public void extrato(){
        System.out.println("*** EXTRATO DE CONTA-POUPANCA***");
        super.extrato();

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
    public void rendimentos(double juro){

        this.saldo += this.saldo*(juro/100);
    }
}
