package org.lab5.manager;

import org.lab5.product.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Manager extends Product {
    public Map<Integer, Product> products = new HashMap<Integer, Product>();
    protected Integer productID = 0;

    public Manager(String productName, float productPrice, int productQuantity, int productTotal, int productDiscount) {
        super(productName, productPrice, productQuantity, productTotal, productDiscount);
        products.put(productID, new Product(productName, productPrice, productQuantity, productTotal, productDiscount));
        productID++;
    }

    public void addProduct(String productName, float productPrice, int productQuantity, int productTotal, int productDiscount) {
        Product product = new Product(productName, productPrice, productQuantity, productTotal, productDiscount);
        products.put(productID, product);
        productID++;
    }
    public void showProduct() {
        Collection<Product> values = products.values();
        for (Product product : values) {
            this.printProduct(product);
        }
    }

    private void printProduct(Product product) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Product Name: " + product.productName);
        System.out.println("Product Price: " + product.productPrice);
        System.out.println("Product Quantity: " + product.productQuantity);
        System.out.println("Product Total: " + product.productTotal);
        System.out.println("Product Discount: " + product.productDiscount);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n");
    }

    public void removeProduct(Integer productID) {
        products.remove(productID);
    }

    public void updateProduct(Integer productID, String productName, float productPrice, int productQuantity, int productTotal, int productDiscount) {
        Product product = new Product(productName, productPrice, productQuantity, productTotal, productDiscount);
        products.put(productID, product);
    }

    public void sortPriceProductByGrowth() {
        Collection<Product> values = products.values();
        ArrayList<Product> products = new ArrayList<Product>(values);
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).productPrice > products.get(j).productPrice) {
                    Product temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }

        for (Product product : products) {
            this.printProduct(product);
        }
    }

    public void sortPriceProductByDecline() {
        Collection<Product> values = products.values();
        ArrayList<Product> products = new ArrayList<Product>(values);
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).productPrice < products.get(j).productPrice) {
                    Product temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
        for (Product product : products) {
            this.printProduct(product);
        }
    }
}
