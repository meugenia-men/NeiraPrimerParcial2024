package models;

import interfaces.Discount;

public class Printer extends ComputerProduct implements Discount {
    private Integer printXMin;

    public Printer(String productName, Integer stock, Double price, String makerName, Integer printXMin) {
        super(productName, stock, price, makerName);
        this.printXMin = printXMin;
    }

    public Integer getPrintXMin() {
        return printXMin;
    }

    public void setPrintXMin(Integer printXMin) {
        this.printXMin = printXMin;
    }

    @Override
    public String toString() {
        return "Caracteristica de la Impresora >>>>> " +
                " Nombre = " + this.getProductName() +
                "- Stock = [" + this.getStock() +
                "] - Precio = $" + this.getPrice() +
                " - Fabricante = " + this.getMakerName() +
                " - Impresiones por minuto = " + printXMin +
                ".";
    }

    @Override
    public void priceUpdate() {
        Double newPrice = this.getPrice() + (this.getPrice() * 0.15);
        System.out.println("Actualizacion de precios de la Impresora '" + this.getProductName() + "' = [Precio sin aumento = $" + this.getPrice() +
                "] - Precio con aumento = $" + newPrice + ".");
    }

    @Override
    public Double discount(Double percent) {
        Double newPrice = this.getPrice() - ((this.getPrice() * percent) / 100);
        return newPrice;
    }
}
