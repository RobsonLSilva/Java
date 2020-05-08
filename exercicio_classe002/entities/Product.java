package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock() {

        return quantity * price;

    }

    public void AddProducts(int qtde) {

        quantity += qtde;

    }

    public void RemoveProducts(int qtde) {

        quantity -= qtde;

    }

    public void Print(){

        System.out.printf("\nProduto: %s\nQtde. estoque: %d\nPreço: %.2f\nValor total do estoque: %.2f\n\n", name,
        quantity, price, TotalValueInStock());
    }

}