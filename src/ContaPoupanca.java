public class ContaPoupanca extends Conta{

    //Overriding
    public void depositar(double valor){
        super.depositar(valor);
        this.juro();

    }
    private void juro(){
        this.saldo -= 1;
    }
}
