class Customer{

   private int customerId;
   private String customerName;
   private long customerPhoneNumber;
   private String customerAddress;

   public Customer(int customerId, String customerName,long customerPhoneNumber,String customerAddress){
    this.customerId = customerId;
    this.customerName = customerName;
    this.customerPhoneNumber =  customerPhoneNumber;
    this.customerAddress = customerAddress;
   }

   public void setCustomerId(int customerId){
    this.customerId = customerId;
   }

   public void setCustomerName(String customerName){
    this.customerName = customerName;
   }

   public void setCustomerPhoneNumber(long customerPhoneNumber){
    this.customerPhoneNumber =  customerPhoneNumber;
   }

   public void setCustomerAddress(String customerAddress){
    this.customerAddress = customerAddress;
   }

    public int getCustomerId(){
    return customerId;
   }

   public String getCustomerName(){
    return customerName;
   }

   public long getCustomerPhoneNumber(){
    return customerPhoneNumber;
   }

   public String getCustomerAddress(){
   return customerAddress;
   }


}

class Restaurant{

  private int restaurantId;
  private String restaurantName;
  private String restaurantLocation;

  public Restaurant(int restaurantId, String restaurantName, String restaurantLocation){
  this.restaurantId = restaurantId;
  this.restaurantName = restaurantName;
  this.restaurantLocation = restaurantLocation;
  }

  public void setRestaurantId(int restaurantId){
   this.restaurantId = restaurantId;
  }

  public void setRestaurantName(String restaurantName){
   this.restaurantName = restaurantName;
  }

  public void setRestaurantLocation(String restaurantLocation){
   this.restaurantLocation = restaurantLocation;
  }

    public int getRestaurantId(){
   return restaurantId;
  }

  public String getRestaurantName(){
   return restaurantName;
  }

  public String getRestaurantLocation(){
   return restaurantLocation;
  }

}

class MenuItem{
  
    private int itemId;
    private String itemName;
    private double itemPrice;
    private boolean itemAvailability;

    public MenuItem(int itemId, String itemName, double itemPrice, boolean itemAvailability){
    this.itemId = itemId;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemAvailability = itemAvailability;
    }

    public void setItemId(int itemId){
    this.itemId = itemId;
    }

    public void setItemName(String itemName){
    this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice){
    this.itemPrice = itemPrice;
    }

    public void setItemAvailability(boolean itemAvailability){
    this.itemAvailability = itemAvailability;
    }

    public int getItemId(){
    return itemId;
    }

    public String getItemName(){
    return itemName;
    }

    public double getItemPrice(double itemPrice){
    return itemPrice;
    }

    public boolean getItemAvailability(boolean itemAvailability){
    return itemAvailability;
    }

}

class Order{

    private int orderId;
    private Customer customer;
    private MenuItem menuItem;
    private Restaurant restaurant;
    private int orderQuantity;

    public Order(int orderId, Customer customer, MenuItem menuItem, Restaurant restaurant,int orderQuantity){
    this.orderId = orderId;
    this.customer = customer;
    this.menuItem = menuItem;
    this.restaurant = restaurant;
    this.orderQuantity = orderQuantity;
    }

    public void setOrderId(int orderId){
    this.orderId = orderId;
    }

    public void setCustomer(Customer customer){
    this.customer = customer;
    }

    public void setMenuItem(MenuItem menuItem){
    this.menuItem = menuItem;
    }

    public void setRestaurant(Restaurant restaurant){
    this.restaurant = restaurant;
    }

    public void setOrderQuantity(int orderQuantity){
    this.orderQuantity = orderQuantity;
    }

    public int getOrderId(){
    return orderId;
    }

    public Customer getCustomer(){
    return customer;
    }

    public MenuItem getMenuItem(MenuItem menuItem){
    return menuItem;
    }

    public Restaurant getRestaurant(Restaurant restaurant){
    return restaurant;
    }

    public int getOrderQuantity(int orderQuantity){
    return orderQuantity;
    }
    
}

class Main {
    public static void main (String[]args){

        var customer1 = new Customer(0, null, 0, null);
        var restaurant1 = new Restaurant(0, null, null);
        var menuItem1 = new MenuItem(0, null, 0, false);
        var order1 = new Order(0, customer1, menuItem1, restaurant1, 0);

    }

}