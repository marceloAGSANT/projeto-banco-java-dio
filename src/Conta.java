public abstract class Conta implements IntConta{

    private static final int AGENCIA_PADRAO = 00001;
    private static int  SEQUENCIAL = 1;

    public Conta () {
        this.agencia = AGENCIA_PADRAO;
        ;
        this.numero = SEQUENCIAL++;

    }

    public int getAgecia() {
        return agencia;
    }

    protected int agencia;

    public int getNumero() {
        return numero;
    }

    protected int numero;

    public double getSaldo() {
        return saldo;
    }

    protected double saldo;


    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void ImprimirInfoBasicas() {

        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
