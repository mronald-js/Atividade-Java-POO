<h1>Documentação de atividade</h1>

<h2>Atividade de associação, herança e polimorfismo em Java</h2>

<h2>Autor - discente: Marcello Ronald</h2>
<h3> Resumo </h3>
<p>
    Atividade desenvolvida a partir de um diagrama de classes que visa
    a prática de associação, herança e polimorfismo numa dada aplicação Java
    a aplicação simula uma dada pessoa realizando um ato de compra
</p>
<h3> Descrição </h3>
<p> 
A partir de uma classe abstrata <b>PESSOA</b> duas classes filhas são criadas
<i>Pessoa Física</i> e <i>Pessoa jurídica</i>, essas duas classes herdam os atributos de pessoa e apartir disso dispõem-se de métodos e atributos próprios, Os métodos e atributos da atividade foram definidas pelo autor.
A Classe pessoa deve poder realizar um pedido, esse pedido possui um item e este item se refere à um produto
</p>

<h2>Tópicos</h2>
<ol>
    <li><a href="#cliente">Pacote - Cliente</a></li>
    <li><a href="#logistica">Pacote - Logistica</a></li>
    <li><a href="#main">Main - Execução</a></li>
</ol>
<h2 id="cliente">Pacote - Cliente</h2>
<p>
    O pacote Cliente, possui as classes referentes ao cliente, sendo eles:
    #Pessoa.java
    #PessoaFisica.java
    #PessoaJuridica.java
</p>
<h3>Classe Pessoa</h3>
<h4>Atributos</h4>

```
java
    private String nome;
    private int idade;
    private String sexo;
    private String nacionalidade;
    private String telefone;
    private String endereco;
    private double saldo;
    private Produto pedidos[] = new Produto[10];
```

<p>
    Esses atributos são comuns a todas as classes filhas, sendo que a classe pessoa é abstrata e não pode ser instanciada diretamente<br>
    Todos os atributos são privados e possuem métodos de acesso e modificação, a maioria dos
    atributos listados são de identificação, com excessão de saldo e do atributo pedidos
    O saldo diz respeito ao dinheiro que a pessoa possui, e o atributo pedidos é um vetor de produtos, esse vetor é utilizado para armazenar os produtos que a pessoa deseja comprar
    no caso 10 é uma quantia representativa, mas pode ser alterada para um valor maior ou menor
</p>

<p>
    Após a definição dos atributos, é criado o constructor de Pessoa, no código em questão é criado dois constructores, um referente a Pessoa Física, e o outro referente a Pessoa Jurídica<br>
    Constructor para Pessoa Física  
    
    java
        public Pessoa(String nome, int idade, String sexo, String nacionalidade, String telefone, String endereco, double saldo) {
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
            this.nacionalidade = nacionalidade;
            this.telefone = telefone;
            this.endereco = endereco;
            this.saldo = saldo;
        }
        
Construtor para Pessoa Juridica
    
    java
        public Pessoa(String nome, String nacionalidade, String telefone, String endereco, double saldo) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.saldo = saldo;
    }
</p>
Eles são muito similares, a única diferença nótavel é que o constructor de Pessoa Juridica não tem sexo.
<h3>Getters e Setters</h3>
<p>
    Para cada Atributo é criado um Getter e um Setter, assim permite que cada atributo seja modificado através de um setter e seja consultado através de um Getter.
</p>

<p>A Classe Pessoa possui dois métodos especiais referentes a compra, que são o de <b>Realizar o Pedido</b> e o de <b>Efetuar Compra</b> em si. Cada um desses métodos será melhor detalhado na parte de Execução, mas de maneira resumida, o método de realizar pedido adiciona algum dado item, numa quantidade X, ao possivel carrinho da pessoa, e o efetuar compra, faz a compra dos produtos adicionados.</p>

<h3>função de realizarPedido:</h3>

```
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
```
<h3>função de efetuarCompra:</h3>

```
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
```

<h3>Classe PessoaJuridica</h3>
<p>A classe PessoaJuridica é uma classe filha de Pessoa, e como tal herda seus atributos e métodos.</p>
<h4>Constructor</h4>

```
    public PessoaJuridica(String nome, String nacionalidade, String telefone, String endereco, String cnpj, double saldo) {
            super(nome, nacionalidade, telefone, endereco, saldo);
            this.cnpj = cnpj;
        }
```

<p>A pessoa Juridica é em essência uma "Pessoa" com cnpj.</p>

<h3>Classe PessoaFisica</h3>
<p>A classe da PessoaFisica também segue a mesma lógica da PessoaJuridica, ela é uma classe filha de Pessoa, mas possui CPF</p>
<h4>Constructor</h4>

```
public PessoaFisica(String nome, int idade, String sexo, String nacionalidade, String telefone, String endereco, String cpf, double saldo) {
        super(nome, idade, sexo, nacionalidade, telefone, endereco, saldo);
        this.cpf = cpf;
    }
```

<h2 id="logistica">Pacote - Logistica</h2>
<p>
    <ul>
        <li>Classe - Produto</li>
        <li>Classe - Item</li>
    </ul>
</p>
<h2>Item</h2>
<p>
    A classe de item descreve um item génerico, que é gerado a partir de um ID único.
    
    public class Item {
    private int id;
    
    public Item(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Produto produto = new Produto("Produto", 0.0, 0);
    }
    ```
    
    A classe é relativamente simples, ela tem um atributo único que se caracteriza pelo ID do produto, e possui uma associação de produto que é também uma classe<br>
    Cada vez que um Item é instanciado ele automaticamente cria uma intância de Produto, e alguns valores padrões são passados como padrão.
</p>
<h2>Produto</h2>



