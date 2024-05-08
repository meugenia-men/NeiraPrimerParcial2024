package models;

public class Notebook extends ComputerProduct{
    private Integer memory;

    public Notebook(String productName, Integer stock, Double price, String makerName, Integer memory) {
        super(productName, stock, price, makerName);
        this.memory = memory;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Caracteristica de la Notebook >>>>> " +
                " Nombre = "+ this.getProductName() +
                "- Stock = ["+ this.getStock() +
                "] - Precio = $"+ this.getPrice() +
                " - Fabricante = "+ this.getMakerName() +
                " - Memoria = " + memory +
                ".";
    }

    @Override
    public void priceUpdate() {
        Double newPrice = this.getPrice() + (this.getPrice()*0.2);
        System.out.println("Actualizacion de precios de la Notebook '"+ this.getProductName()+ "' = [Precio sin aumento = $"+ this.getPrice() +
                "] - Precio con aumento = $"+ newPrice +".");
    }
}
