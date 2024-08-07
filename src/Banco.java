import java.util.ArrayList;
import java.util.List;

public class Banco{

	private String nome;
	private List<Conta> contas;

public Banco() {
        this.contas = new ArrayList<>();
    }

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void imprimirContas() {
        System.out.println("=== Informações Banco ===");
        System.out.println("Banco: " + this.nome);
        for (Conta conta : contas) {
            System.out.println(conta.getTipo()+ " de " + conta.getCliente().getNome());
        }
    }
}
