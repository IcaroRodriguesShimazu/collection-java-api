import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

private String nome;
    private double preco;
    public static void main(String[] args) {
        CarrinhoDeCompra produto1 = new CarrinhoDeCompra("Caderno", 10.99);
        CarrinhoDeCompra produto2 = new CarrinhoDeCompra("Caneta", 0.50);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(produto1);
        carrinho.adicionarItem(produto2);

        System.out.println("Itens no carrinho de compras:");
        carrinho.mostrarItens();

        System.out.println("Total: R$" + carrinho.calcularTotal());


    }        
    public CarrinhoDeCompra(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class CarrinhoDeCompras {
    private List<CarrinhoDeCompra> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(CarrinhoDeCompra produto) {
        itens.add(produto);
    }

    public void removerItem(CarrinhoDeCompra produto) {
        itens.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (CarrinhoDeCompra produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }

    public void mostrarItens() {
        for (CarrinhoDeCompra produto : itens) {
            System.out.println(produto.getNome() + ": R$" + produto.getPreco());
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        CarrinhoDeCompra produto1 = new CarrinhoDeCompra("Camiseta", 29.99);
        CarrinhoDeCompra produto2 = new CarrinhoDeCompra("Calça Jeans", 59.99);
        CarrinhoDeCompra produto3 = new CarrinhoDeCompra("Tênis", 99.99);

        carrinho.adicionarItem(produto1);
        carrinho.adicionarItem(produto2);
        carrinho.adicionarItem(produto3);

        System.out.println("Itens no carrinho:");
        carrinho.mostrarItens();

        System.out.println("Total: R$" + carrinho.calcularTotal());
    }
}



