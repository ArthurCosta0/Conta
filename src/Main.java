public class Main {
    public static void main(String[] args) {

        Contacorrente c = new Contacorrente();
        c.depositar(1500);
        c.sacar(200);
        c.verSaldo();

        ContaPoupanca p = new ContaPoupanca();
        p.depositar(100);
        p.sacar(50);
        p.verSaldo();

    }
}