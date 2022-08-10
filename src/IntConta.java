public interface IntConta {

    void depositar(double valor);

    void sacar(double valor);

    void tranferir(double valor, Conta contaDestino);

    void imprimirExtrato ();
}
