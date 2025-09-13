package banco;
import java.util.Scanner;

public class Contacorrente extends conta{
    Double limite;

    Contacorrente(String numero, pessoa titular, Gerente gerente, data criacao){
        super(numero, titular, gerente, criacao);
        this.limite = 200.0;
    }
    public double disponivel() {
        return this.saldo + this.limite;
    }

    public void chequeEspecial(double juros){

        if(this.saldo < 0){
            this.saldo += this.saldo*(juros/100);
        }else{
            System.out.println("O saldo esta positivo!");
        }
    }
    public void alterarLimite(String pwd, double l){
        if (ger.validarAcesso(pwd)){
            this.limite = l;
            System.out.println("Limite atualizado!");
        }
    }

    @Override
    public void extrato() {
        System.out.println("*** EXTRATO DE CONTA-CORRENTE***");
        super.extrato();


    }

    public void alterarLimite(){

        if(ger.validarAcesso()){
            System.out.println("Limite alterado!");
        }
    }
}
