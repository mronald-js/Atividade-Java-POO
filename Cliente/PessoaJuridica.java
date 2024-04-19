package Cliente;

public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public PessoaJuridica(String nome, String nacionalidade, String telefone, String endereco, String cnpj, double saldo) {
        super(nome, nacionalidade, telefone, endereco, saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Nome = " + super.getNome() + "\n" +
               "Nacionalidade = " + super.getNacionalidade() + "\n" +
               "Telefone = " + super.getTelefone() + "\n" +
               "Endereço = " + super.getEndereco() + "\n" +
               "Saldo = " + super.getSaldo() + "\n" +
               "cnpj = " + cnpj + '\n';

    }

}
