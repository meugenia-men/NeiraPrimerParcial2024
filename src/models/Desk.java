package models;

import interfaces.Discount;

public class Desk extends Products {
    private Double high;
    private Double broad;

    public Desk(String productName, Integer stock, Double price, Double high, Double broad) {
        super(productName, stock, price);
        this.high = high;
        this.broad = broad;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getBroad() {
        return broad;
    }

    public void setBroad(Double broad) {
        this.broad = broad;
    }

    @Override
    public String toString() {
        return "Caracteristicas del Escritorio >>>>>" +
                " Nombre = "+ this.getProductName() +
                " - Stock = ["+ this.getStock() +
                "] - Precio = $"+this.getPrice() +
                " - Alto = [" + high +
                "] - Ancho= [" + broad +
                ']';
    }

    @Override
    public void priceUpdate() {
        Double newPrice = this.getPrice() + (this.getPrice()*0.1);
        System.out.println("Actualizacion de precios del escritorio '"+ this.getProductName() +"' = [Precio sin aumento = $"+ this.getPrice() +
                "] - Precio con aumento = $"+ newPrice +".");
    }

}

