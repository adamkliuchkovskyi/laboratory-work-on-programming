package org.lab5;

import org.lab5.description.School;
import org.lab5.manager.Manager;

public class App 
{
    public static void main( String[] args )
    {
        School.main(args);
        Manager manager = new Manager("Apple", 4.99f, 10, 19, 10);
        manager.addProduct("Banana", 2.99f, 10, 29, 10);
        manager.addProduct("Orange", 3.99f, 10, 39, 10);
//        manager.showProduct();
        manager.sortPriceProductByGrowth();
        manager.sortPriceProductByDecline();
    }
}
