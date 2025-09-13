package banco;
public class Main {

    public static void main(String[] args) {

        pessoa p1 = new pessoa("maria",'F', 19,07,2005,"123.456.789-00");
        pessoa p2 = new pessoa("joao", 'M', 18, 07, 2005, "234.567.890-00");
        pessoa p3 = new pessoa();
        pessoa p4 = new pessoa();

        Gerente g1 = new Gerente("joao", 'M', 18, 07, 2005, "234.567.890-00", "123", "vrum");
        Gerente g2 = new Gerente();

        data d1 = new data(1, 2, 2025);
        data d2 = new data(1, 3, 2025);

        Contacorrente c1 = new Contacorrente("1234-5", p1, g1, d1);
        Contacorrente c2 = new Contacorrente("1234-6", p2, g1, d1);

        Poupanca pou1 = new Poupanca("1234-5", p3, g2, d2);
        Poupanca pou2 = new Poupanca("1234-5", p4, g2, d2);

        c1.depositar(300);
        c2.depositar(300);
        pou1.depositar(300);
        pou2.depositar(300);

        c1.sacar(130);
        c2.sacar(120);
        pou1.sacar(300);
        pou2.sacar(250);

        c1.transferir(100, pou1);
        c2.transferir(100, pou2);

        c1.extrato();
        c2.extrato();
        pou1.extrato();
        pou2.extrato();

        for (int i = 1; i <= 30; i++){
            c1.chequeEspecial(0.5);
            System.out.println("Saldo apos " + i + " dia: " + c1.saldo);
        }
        for (int i = 1; i <= 30; i++){
            pou1.rendimentos(0.5);
            System.out.println("Saldo apos " + i + " dia: " + pou1.saldo);
        }
    }
}
