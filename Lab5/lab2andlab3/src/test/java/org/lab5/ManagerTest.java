package org.lab5;

import junit.framework.TestCase;

import org.lab5.manager.Manager;

public class ManagerTest extends TestCase {
    public void testManagerObject() {
        Manager manager = new Manager("Apple", 4.99f, 10, 19, 10);
        assertEquals(manager.productName, "Apple");
    }

    public void testAddProduct() {
        Manager manager = new Manager("Apple", 4.99f, 10, 19, 10);
        manager.addProduct("Banana", 2.99f, 10, 29, 10);
        manager.addProduct("Orange", 3.99f, 10, 39, 10);
        assertEquals(manager.products.size(), 3);
    }

    public void testRemoveProduct() {
        Manager manager = new Manager("Apple", 4.99f, 10, 19, 10);
        manager.addProduct("Banana", 2.99f, 10, 29, 10);
        manager.addProduct("Orange", 3.99f, 10, 39, 10);
        manager.removeProduct(1);
        assertEquals(manager.products.size(), 2);
    }

    public void testUpdateProduct() {
        Manager manager = new Manager("Apple", 4.99f, 10, 19, 10);
        manager.addProduct("Banana", 2.99f, 10, 29, 10);
        manager.addProduct("Orange", 3.99f, 10, 39, 10);
        manager.updateProduct(1, "Banana", 2.99f, 10, 29, 10);
        assertEquals(manager.products.size(), 3);
    }

    public void testSortPriceProductByGrowth() {
        Manager manager = new Manager("Apple", 4.99f, 10, 19, 10);
        manager.addProduct("Banana", 2.99f, 10, 29, 10);
        manager.addProduct("Orange", 3.99f, 10, 39, 10);
        manager.sortPriceProductByGrowth();
        assertEquals(manager.products.size(), 3);
    }

    public void testSortPriceProductByDecline() {
        Manager manager = new Manager("Apple", 4.99f, 10, 19, 10);
        manager.addProduct("Banana", 2.99f, 10, 29, 10);
        manager.addProduct("Orange", 3.99f, 10, 39, 10);
        manager.sortPriceProductByDecline();
        assertEquals(manager.products.size(), 3);
    }
}
