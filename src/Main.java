public class Main {

    public static void main(String[] args) {
		Cliente agnaldo = new Cliente();
		agnaldo.setNome("Agnaldo");

        Banco churiBanco = new Banco("Banco Churi");

		Conta cc = new ContaCorrente(agnaldo);
		Conta poupanca = new ContaPoupanca(agnaldo);

        churiBanco.adicionarConta(cc);
        churiBanco.adicionarConta(poupanca);
        

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

        churiBanco.imprimirContas();
	}
}
