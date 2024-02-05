import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 3);
        Item item3 = new Item("drip coffe", 2.2);
        Item item4 = new Item("capuccino",3.5);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noa");
       

        order1.addItem(item1);
        order1.addItem(item2);
        order1.getOrderTotal();
        System.out.println(order1.getStatusMessage());
         System.out.println();
     

        order3.addItem(item1);
        order3.addItem(item2);
        // order3.getOrderTotal();
        // System.out.println(order3.getStatusMessage());
        order3.display();
        System.out.println();
    


        order5.addItem(item3);
        order5.getOrderTotal();
        System.out.println(order5.getStatusMessage());
         System.out.println();
        
       

 















        // System.out.printf("Order1: %s\n", order1);
        // System.out.printf("Total order1: %s\n", order1.total);

        // order2.items.add(item1);
        // order2.total += item1.price;
        // System.out.printf("Total order2: %s\n", order2.total);
        
        // order3.items.add(item4);
        // order3.total += item4.price;
        // System.out.printf("Total order3: %s\n", order3.total);

        // order4.items.add(item2);
        // order4.total += item2.price;
        // System.out.printf("Total order4: %s\n", order4.total);

        // System.out.printf("Ready before update: %s\n", order1.ready);
        // order1.ready = true;
        // System.out.printf("Ready after update: %s\n", order1.ready);
    
        // order4.items.add(item2);
        // order4.total += item2.price;
        // order4.items.add(item2);
        // order4.total += item2.price;

        // System.out.printf("Total order4: %s\n", order4.total);

        // System.out.printf("Ready Before update: %s\n", order2.ready);
        // order2.ready = true;
        // System.out.printf("Ready after update: %s\n", order2.ready);

























        // for(Item item : order4.items){
        //     System.out.printf("Item: %s\n", item.name);
        //     System.out.printf("Item: %s\n", item.price);
        //     System.out.println();
        // }

        // System.out.printf("Ready: %s\n", order2.items.get(0).name);





        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        // System.out.printf("Ready: %s\n", order2.items);
        
    }
}