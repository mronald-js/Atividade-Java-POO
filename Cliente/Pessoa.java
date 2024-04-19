package Cliente;
import Logistica.Item;
import Logistica.Produto;
public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;
    private String nacionalidade;
    private String telefone;
    private String endereco;
    private double saldo;
    private Produto pedidos[] = new Produto[10];

    int quantidadeP = 0;

    public Pessoa(String nome, int idade, String sexo, String nacionalidade, String telefone, String endereco, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.saldo = saldo;
    }

    public Pessoa(String nome, String nacionalidade, String telefone, String endereco, double saldo) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getSexto(){
        return sexo;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public Produto[] getPedidos(){
        return pedidos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void realizarPedido(Item item, int quantidade){
       
        //verificar se a quantidade é válida
        if(quantidade <= item.produto.getQuantidade()){
            System.out.println("Pedido realizado com sucesso!");
            pedidos[quantidadeP] = item.produto;
            quantidadeP++;
        }else {
            System.out.println("\n");
            System.out.println("Quantidade inválida!");
        }
    }

    public void efetuarCompra(Produto pedidos[]){
        if(pedidos.length > 0){
            for(int i = 0; i < quantidadeP; i++){
                if(pedidos[i].getQuantidade() > 0){
                    saldo -= pedidos[i].getPreco();
                    pedidos[i].setQuantidade(pedidos[i].getQuantidade() - 1);
                }else{
                    System.out.println("Produto esgotado!");
                    return;
                }
                System.out.println(nome + ", sua compra de foi realizada com sucesso!\nSaldo atual: " + saldo + "\n");
            }
        }else{
            System.out.println("Nenhum pedido realizado!");
        }
    }

    @Override
    public String toString() {
        return "nome = " + nome + '\n' +
                "idade = " + idade + '\n' +
                "sexo = " + sexo + '\n' +
                "nacionalidade = " + nacionalidade + '\n' +
                "telefone = " + telefone + '\n' +
                "endereco = " + endereco + '\n' +
                "saldo = " + saldo + '\n';
    }

}
