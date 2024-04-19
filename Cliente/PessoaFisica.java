package Cliente;

public class PessoaFisica extends Pessoa  {

    private String cpf;

    public PessoaFisica(String nome, int idade, String sexo, String nacionalidade, String telefone, String endereco, String cpf, double saldo) {
        super(nome, idade, sexo, nacionalidade, telefone, endereco, saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + "cpf = " + cpf + '\n';
    }
}
