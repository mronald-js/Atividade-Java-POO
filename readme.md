<h1>Documentação de atividade</h1>

<h2>Atividade de associação, herança e polimorfismo em Java</h2>

<h2>Autor - discente: Marcello Ronald</h2>
<h3> Resumo </h3>
<p>
    # Atividade desenvolvida a partir de um diagrama de classes que visa
    # a prática de associação, herança e polimorfismo numa dada aplicação Java
    # a aplicação simula uma dada pessoa realizando um ato de compra
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
    <li><a href="#Logistica">Pacote - Logistica</a></li>
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
#Atributos
```java
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