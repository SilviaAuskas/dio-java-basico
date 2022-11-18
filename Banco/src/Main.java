public class Main {

    public static void main(String[] args) {
        Cliente silvia = new Cliente();
        silvia.setNome("Silvia");

        Conta cc = new ContaCorrente(silvia);
        Conta poupanca = new ContaPoupanca(silvia);

        cc.depositar(500);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
