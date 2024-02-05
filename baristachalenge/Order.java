import java.util.ArrayList;
class Order {
   //member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items; 
    
    //constructor
	public Order() {
		setName("Guest");
        setReady(false);
        this.items = new ArrayList<Item>();
	}
    public Order(String name) {
		this.name=name;
        setReady(true);
        this.items = new ArrayList<Item>();
	}
    // CODE
    public void addItem(Item item){
     // System.out.println(item.getName());
      this.items.add(item);
    //System.out.println(getItems());
        return;
        }
     
      public String getStatusMessage(){
       // System.out.println(isReady());
        if(isReady()){
            return "Your order is ready.";
        }
            return "thank you for waiting. Your order will be ready soon.";  
        }

     public void getOrderTotal(){
        //System.out.println(getItems().size() + "****");
        double sum1 = 0;
        for (int j = 0; j <= ((getItems().size())-1); j++){
             sum1 =  sum1 + (getItems().get(j).getPrice());
             }
         System.out.println(getName()+ " Your total is: " + sum1);
        return ;
    }

      void display(){
        System.out.println("Customer name: " + getName());
            for (int j = 0; j <= ((getItems().size())-1); j++){
             System.out.println(getItems().get(j).getName()+" : " +getItems().get(j).getPrice());
             }
         getOrderTotal();       
    }


    //GETTERS AND SETTERS
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isReady() {
		return ready;
	}
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	//private ArrayList<Item> items = new ArrayList<Item>();
   


    //methods
}