package banco;
import java.util.Scanner;

public class data {
    private int dia;
    private int mes;
    private int ano;

    public data(int d, int m, int a){
        setDia(d);
        setMes(m);
        setAno(a);
    }
    data(){
        Scanner input = new Scanner(System.in);
        System.out.print("Dia: ");
        dia = input.nextInt();
        System.out.print("Mes: ");
        mes = input.nextInt();
        System.out.print("Ano: ");
        ano = input.nextInt();
    }
    public void setDia(int dia){
        this.dia = dia;
    } 
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getDia(){
        return this.dia;
    } 
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    public void imprimir(){

        System.out.println(getDia()+'/'+getMes()+'/'+getAno());
    }
    public boolean maior(data d2){

        if(this.ano >= d2.ano){
            if (this.ano == d2.ano){
                if(this.mes >= d2.mes){
                    if(this.dia > d2.dia){
                        return true;
                    }else{
                        return false;
                    }
                }else return false;
            }else return true;
        }else return false;
    }
}
