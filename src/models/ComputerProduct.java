package models;

public class ComputerProduct extends Products{
    private String makerName;

    public ComputerProduct(String productName, Integer stock, Double price, String makerName) {
        super(productName, stock, price);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    @Override
    public void priceUpdate() {

    }
}
