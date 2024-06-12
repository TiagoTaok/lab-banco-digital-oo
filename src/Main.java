public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva");
        Cliente cliente2 = new Cliente("Maria Oliveira");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta cp1 = new ContaPoupanca(cliente1);

        Conta cc2 = new ContaCorrente(cliente2);
        Conta cp2 = new ContaPoupanca(cliente2);

        Banco banco = new Banco("Meu Banco");
        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);
        banco.adicionarConta(cc2);
        banco.adicionarConta(cp2);

        cc1.depositar(100);
        cc1.transferir(50, cp1);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        cc2.depositar(200);
        cp2.depositar(150);

        cc2.imprimirExtrato();
        cp2.imprimirExtrato();
    }
}