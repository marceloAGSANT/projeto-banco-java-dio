public class contaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança==");
        super.ImprimirInfoBasicas();
    }
}
