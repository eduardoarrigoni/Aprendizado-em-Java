package banco;
import java.util.Scanner;

public class pessoa {
    String nome;
    private data dtNasc;
    char sexo;
    private String cpf;

    pessoa(String n, char sx, int dia, int mes, int ano, String c){

        setDtNasc(dia, mes, ano);
        this.nome = n;
        this.sexo = sx;
        setCpf(c);
    }
    pessoa(){
        Scanner input = new Scanner(System.in);
        this.dtNasc = new data();
        System.out.println("Digite seu nome: ");
        this.nome = input.nextLine();
        System.out.println("Digite seu sexo: ");
        this.sexo = input.nextLine().charAt(0);
        System.out.println("Digite seu cpf: ");
        cpf = input.nextLine();
        setCpf(cpf);
    }
    public void setDtNasc(int dia, int mes, int ano) {
        this.dtNasc = new data(dia, mes, ano);
    }
    
    public data getdtNasc(){

        return dtNasc;

    }
    public void setCpf(String c){
        this.cpf = c;
    }
    public String getCpf(){
        return cpf;
    }
    public int idade_hoje(int d, int m, int a){

        int idade = 0;
        if (m >= this.dtNasc.getMes()){
            if (d >= this.dtNasc.getDia()){
                idade = a - this.dtNasc.getAno();
            }
        }else{
            idade = a - this.dtNasc.getAno() - 1;
        }
        
        return idade;

    }
}

