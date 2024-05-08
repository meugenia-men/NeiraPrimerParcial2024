package models;

import interfaces.Discount;

public class Chair extends Products implements Discount {
    private Integer wheelsNumber;

    public Chair(String productName, Integer stock, Double price, Integer wheelsNumber) {
        super(productName, stock, price);
        this.wheelsNumber = wheelsNumber;
    }

    public Integer getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(Integer wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public String toString() {
        return "Caracteristicas de la Silla >>>>>" +
                " Nombre = " + this.getProductName() +
                " - Stock = [" + this.getStock() +
                "] - Precio = $" + this.getPrice() +
                " - Numero de ruedas = [" + wheelsNumber +
                ']';
    }

    @Override
    public void priceUpdate() {
        Double newPrice = this.getPrice() + (this.getPrice()*0.05);
        System.out.println("Actualizacion de precios de la silla '"+ this.getProductName() +"' = [Precio sin aumento = $"+ this.getPrice() +
                "] - Precio con aumento = $"+ newPrice +".");
    }

    @Override
    public Double discount(Double percent) {
        Double newPrice = this.getPrice() - ((this.getPrice() * percent) / 100);
        return newPrice;
    }
}
