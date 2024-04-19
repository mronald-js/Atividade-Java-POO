import Cliente.*;
import Logistica.*;

public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica1 = new PessoaFisica("Karlos", 24, "Masculino", "brasileiro", "(62) 99358-8756", "Rua 5, 356, Setor Sul, Goiânia - Go", "123.456.789-10", 850.50);
        System.out.println(pessoaFisica1);

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Júlia", "Chilena", "+123 09 1234-5782", "Rua 7, 303, Rua Z, Santiago Chile", "123.456.789/0001-10", 1000.00);
        System.out.println(pessoaJuridica1);

        Item item1 = new Item(1);
        item1.produto.setNome("Coca-Cola");
        item1.produto.setPreco(8.75);
        item1.produto.setQuantidade(50);

        pessoaFisica1.realizarPedido(item1, 5);
        pessoaFisica1.efetuarCompra(pessoaFisica1.getPedidos());

    }
    

}

