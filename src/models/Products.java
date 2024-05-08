package models;

public abstract class Products {
    private String productName;
    private Integer stock;
    private Double price;

    public Products(String productName, Integer stock, Double price) {
        this.productName = productName;
        this.stock = stock;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract void priceUpdate();
}
