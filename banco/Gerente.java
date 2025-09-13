package banco;
import java.util.Scanner;

public class Gerente extends pessoa{
    String matricula;
    private String senha;

    Gerente(String n, char sx, int dia, int mes, int ano, String c, String matricula, String senha){
        super(n, sx, dia, mes, ano, c);

        this.matricula = matricula;
        setSenha(senha);
    }
    Gerente(){
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu matricula: ");
        this.matricula = input.nextLine();
        setSenha();
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setSenha(){
        Scanner pass = new Scanner(System.in);
        this.senha = pass.nextLine();
    }
    public String getSenha(){
        return this.senha;
    }
    public boolean validarAcesso(String s){

        if(s.equals(getSenha())){
            System.out.println("Senha valida!");
            return true;
        }else{
            System.out.println("Senha invalida!");
            return false;
        }
    }
    public boolean validarAcesso(){
        Scanner entrada_senha = new Scanner(System.in);
        String tentativa_senha;

        System.out.println("Digite sua senha: ");
        tentativa_senha = entrada_senha.nextLine();
        if(validarAcesso(tentativa_senha)){
            return true;
        }else{
            return  false;
        }
    }
}
