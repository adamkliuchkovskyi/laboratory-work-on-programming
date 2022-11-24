package product;

public class Product {
    public String productName;
    public float productPrice;
    public int productQuantity;
    public int productTotal;
    public int productDiscount;

    public Product(String productName, float productPrice, int productQuantity, int productTotal, int productDiscount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productTotal = productTotal;
        this.productDiscount = productDiscount;
    }
}
