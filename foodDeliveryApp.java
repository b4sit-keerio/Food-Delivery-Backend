import java.util.Scanner;

class Customer{
   Scanner sc = new Scanner(System.in);

   private int customerId;
   private String customerName;
   private long customerPhoneNumber;
   private String customerAddress;
   static int totalCustomers = 0;
   private boolean accountStatus;

    static Customer customers [] = new Customer[10];

   public Customer(int customerId, String customerName,long customerPhoneNumber,String customerAddress){
    this.customerId = customerId;
    this.customerName = customerName;
    this.customerPhoneNumber =  customerPhoneNumber;
    this.customerAddress = customerAddress;
    this.accountStatus = true;
   }

    public Customer addCustomer(){
        System.out.println(" Please enter the ID of the customer ");
        int customerId = sc.nextInt();
        sc.nextLine();
        this.setCustomerId(customerId);
        System.out.println(" Please enter the Name of the customer ");
        String customerName = sc.nextLine();
        this.setCustomerName(customerName);
        System.out.println(" Please enter the phone number of the customer ");
        long customerPhoneNumber = sc.nextLong();
        sc.nextLine();
        this.setCustomerPhoneNumber(customerPhoneNumber);
        System.out.println(" Please enter the address of customer ");
        String customerAddress = sc.nextLine();
        this.setCustomerAddress(customerAddress);
        Customer.customers[totalCustomers++] = new Customer(customerId, customerName, customerPhoneNumber, customerAddress);
        return Customer.customers[totalCustomers-1];
    }

   public Customer getCustomerById(){
    System.out.println(" Please enter the Id for the Customer ");
    int id = sc.nextInt();
    boolean found = false;
    Customer c = null;
    for(int i=0;i<customers.length;i++){
        if(customers[i].getCustomerId()==id){
            found = true;
            c = customers[i];
        }
    }
    if(!found){
        System.out.println(" Customer Not found ");
    }
    return c;
   }

   public void setCustomerId(int customerId){
    try {
        this.customerId = customerId;
    } catch (Exception e) {
        System.out.println(" Please enter the valid ID ");
    }
   }

   public void setCustomerName(String customerName){
    try {
        this.customerName = customerName;
    } catch (Exception e) {
        System.out.println(" Please enter the valid name ");
    }
   }

   public void setCustomerPhoneNumber(long customerPhoneNumber){
    try {
        this.customerPhoneNumber =  customerPhoneNumber;
    } catch (Exception e) {
        System.out.println(" Please enter the valid phone number ");
    }
   }

   public void setCustomerAddress(String customerAddress){
    try {
        this.customerAddress = customerAddress;
    } catch (Exception e) {
        System.out.println(" Please enter the valid address ");
    }
   }

    public int getCustomerId(){
    return this.customerId;
   }

   public String getCustomerName(){
    return this.customerName;
   }

   public long getCustomerPhoneNumber(){
    return this.customerPhoneNumber;
   }

   public String getCustomerAddress(){
   return this.customerAddress;
   }

   public void changeCustomerName(String newName){
    try {
        this.customerName = newName;
    } catch (Exception e) {
        System.out.println(" Please enter the valid name ");
    }
   }

   public void changeCustomerPhoneNumber(long newNumber){
    try {
        this.customerPhoneNumber = newNumber;
    } catch (Exception e) {
        System.out.println(" Please enter the valid phone number ");
    }
   }

   public void changeCustomerAddress(String newAddress){
    try {
         this.customerAddress = newAddress;
    } catch (Exception e) {
        System.out.println(" Please enter the valid address ");
    }
   
   }

   public void activateCustomerAccount(boolean doActive){
    try {
        this.accountStatus = true;
    } catch (Exception e) {
        System.out.println(" Please do valid Activation ");
    }
   }

   public void deActivateCustomerAccount(boolean deActive){
    try {
        this.accountStatus = false;
    } catch (Exception e) {
        System.out.println(" Please do valid Deactivation ");
    }
   }

   public boolean getAccountStatus(){
    return this.accountStatus;
   }
   
   public void displayCustomerDetails(){
   System.out.println("+=======================================+");
   System.out.println(" Name : "+this.getCustomerName());
   System.out.println(" ID : "+this.getCustomerId());
   System.out.println(" Phone Number : "+this.getCustomerPhoneNumber());
   System.out.println(" Address : "+this.getCustomerAddress());
   System.out.println(" Account Status : "+this.getAccountStatus());
   System.out.println("+=======================================+");
   }

//    public void customerCreation(){
//     System.out.println(" Please enter the ID of the customer ");
//     int customerId = sc.nextInt();
//     sc.nextLine();
//     this.setCustomerId(customerId);
//     System.out.println(" Please enter the Name of the customer ");
//     String customerName = sc.nextLine();
//     this.setCustomerName(customerName);
//     System.out.println(" Please enter the phone number of the customer ");
//     long customerPhoneNumber = sc.nextLong();
//     sc.nextLine();
//     this.setCustomerPhoneNumber(customerPhoneNumber);
//     System.out.println(" Please enter the address of customer ");
//     String customerAddress = sc.nextLine();
//     this.setCustomerAddress(customerAddress);
//    }
}

class Restaurant{

    Scanner sc = new Scanner(System.in);

  private int restaurantId;
  private String restaurantName;
  private String restaurantLocation;
  private long restaurantContactNumber;
  private double restaurantRating;
  private boolean restaurantIsOpen;
  static int totalRestaurants = 0 ;

  static Restaurant [] restaurants = new Restaurant [10]; 

  public Restaurant(int restaurantId,String restaurantName,String restaurantLocation,long restaurantContactNumber,double restaurantRating,boolean restaurantIsOpen){
  this.restaurantId = restaurantId;
  this.restaurantName = restaurantName;
  this.restaurantLocation = restaurantLocation;
  this.restaurantContactNumber = restaurantContactNumber;
  this.restaurantRating = restaurantRating;
  this.restaurantIsOpen = restaurantIsOpen;
  }

  public void setRestaurantId(int restaurantId){
   this.restaurantId = restaurantId;
  }

  public void setRestaurantName(String restaurantName){
    try {
        this.restaurantName = restaurantName;
    } catch (Exception e) {
        System.out.println(" Please enter Restaurant name in correct format ");
    }
  }

  public void setRestaurantLocation(String restaurantLocation){
        try {
         this.restaurantLocation = restaurantLocation;
    } catch (Exception e) {
        System.out.println(" Please enter Restaurant location in correct format ");
    }
  }

      public void setRestaurantContactNumber(long restaurantContactNumber){
           try {
         this.restaurantContactNumber = restaurantContactNumber;
    } catch (Exception e) {
        System.out.println(" Please enter Restaurant contact number in correct format ");
    }
  }

  public void setRestaurantRating(double restaurantRating){
               try {
                if((restaurantRating>=0.0) && (restaurantRating<=5.0))
                  this.restaurantRating = restaurantRating;
                else 
                     System.out.println(" Please enter Restaurant rating in correct limit ");
    } catch (Exception e) {
        System.out.println(" Please enter Restaurant rating in correct format ");
    }
  }

  public void setRestaurantStatus(boolean restaurantIsOpen){
    this.restaurantIsOpen = restaurantIsOpen;
  }

    public int getRestaurantId(){
   return this.restaurantId;
  }

  public String getRestaurantName(){
   return this.restaurantName;
  }

  public String getRestaurantLocation(){
   return this.restaurantLocation;
  }

  public long getRestaurantContactNumber(){
    return this.restaurantContactNumber;
  }

  public double getRestaurantRating(){
    return this.restaurantRating;
  }

  public boolean getRestaurantStatus(){
    return this.restaurantIsOpen;
  }

  public void openRestaurant(){
    this.restaurantIsOpen = true;
  }

  public void closeRestaurant(){
    this.restaurantIsOpen = false;
  }

  public void changeRestaurantName(String newName){
        try {
        this.restaurantName = newName;
    } catch (Exception e) {
        System.out.println(" Please enter Restaurant's new name in correct format ");
    }
  }

  public void changeRestaurantLocation(String newLocation){
            try {
         this.restaurantLocation = newLocation;
    } catch (Exception e) {
        System.out.println(" Please enter Restaurant's new location in correct format ");
    }
  }

   public void updateRestaurantRating(double newRating){
                   try {
                if((newRating>=0.0) && (newRating<=5.0))
                  this.restaurantRating = newRating;
                else 
                     System.out.println(" Please enter Restaurant,s new rating in correct limit ");
    } catch (Exception e) {
        System.out.println(" Please enter Restaurant's new rating in correct format ");
    }
   }

   public int getTotalRestaurants(){
    return  totalRestaurants;
   }

   public void displayRestaurantDetails(){
    System.out.println("+=======================================+");
    System.out.println(" Name "+this.restaurantName);
    System.out.println(" Id "+this.restaurantId);
    System.out.println(" Location "+this.restaurantLocation);
    System.out.println(" Contact Number "+this.restaurantContactNumber);
    System.out.println(" Status "+this.restaurantIsOpen);
    System.out.println(" Rating "+this.restaurantRating);
     System.out.println("+=======================================+");
   }

   public Restaurant addRestaurant(){
    System.out.println(" Please enter the ID of the restaurant ");
    int restaurantId = sc.nextInt();
    sc.nextLine();
    this.setRestaurantId(restaurantId);
    System.out.println(" Please enter the name of the restaurant ");
    String restaurantName = sc.nextLine();
    this.setRestaurantName(restaurantName);
    System.out.println(" Please enter the Location of the restaurant ");
    String restaurantLocation = sc.nextLine();
    this.setRestaurantLocation(restaurantLocation);
    System.out.println(" Please enter Contact number of the restaurant ");
    long restaurantContactNumber = sc.nextLong();
    sc.nextLine();
    this.setRestaurantContactNumber(restaurantContactNumber);
    boolean restaurantIsOpen = true;
    this.setRestaurantStatus(restaurantIsOpen);
    System.out.println(" Please enter the rating of the restaurant ");
    double restaurantRating = sc.nextDouble();
    sc.nextLine();
    this.setRestaurantRating(restaurantRating);
    restaurants[totalRestaurants++] = new Restaurant(restaurantId, restaurantName, restaurantLocation, restaurantContactNumber, restaurantRating, restaurantIsOpen);
    return restaurants[totalRestaurants-1];
}

    public Restaurant getRestaurantById(){
    System.out.println(" Please enter the Id for the restaurant ");
    int id = sc.nextInt();
    boolean found = false;
    Restaurant r = null;
    for(int i=0;i<restaurants.length;i++){
        if(Restaurant.restaurants[i].getRestaurantId()==id){
            found = true;
            r = restaurants[i];
        }
    }
    if(!found){
        System.out.println(" Restaurant Not found ");
    }
    return r;
   }
}

class MenuItem{
    
    Scanner sc = new Scanner(System.in);
  
    private int itemId;
    private String itemName;
    private double itemPrice;
    private boolean itemAvailability;
    private String itemDescription;
    private String itemCategory;
    private int itemPreparationTime;
    static int totalMenuItems = 0 ;

    static MenuItem [] menuItems = new MenuItem [10];

    public MenuItem(int itemId, String itemName, double itemPrice, boolean itemAvailability,String itemDescription,
        String itemCategory,int itemPreparationTime){
    this.itemId = itemId;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemAvailability = itemAvailability;
    this.itemDescription = itemDescription;
    this.itemCategory = itemCategory;
    this.itemPreparationTime = itemPreparationTime;
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

    public void setItemDescription(String itemDescription){
        this.itemDescription = itemDescription;
    }    

    public void setItemCategory(String itemCategory){
        this.itemCategory = itemCategory;
    }

    public void setItemPreparationTime(int itemPreparationTime){
        this.itemPreparationTime = itemPreparationTime;
    }

    public int getItemId(){
    return this.itemId;
    }

    public String getItemName(){
    return this.itemName;
    }

    public double getItemPrice(){
    return this.itemPrice;
    }

    public boolean getItemAvailability(){
    return this.itemAvailability;
    }

    public String getItemDescription(){
        return this.itemDescription;
    }

    public String getItemCategory(){
        return this.itemCategory;
    }

    public int getItemPreparartionTime(){
        return this.itemPreparationTime;
    }

    public int getTotalMenuItems(){
        return totalMenuItems;
    }

    public void changeItemName(String itemNewName){
        try {
            this.itemName = itemNewName;
        } catch (Exception e) {
           System.out.println(" Please enter Item's name in correct String format ");
        }
    }

    public void changeItemDescription(String itemNewDescription){
        try {
             this.itemDescription = itemNewDescription;
        } catch (Exception e) {
            System.out.println(" Please enter Item's Description in correct String Format ");
        }
    }

    public void updatePrice(double itemNewPrice){
        try {
             this.itemPrice = itemNewPrice;
        } catch (Exception e) {
            System.out.println(" Please enter Item's price in correct double format ");
        }
    }

    public void changeItemCategory(String itemNewCategory){
        try {
             this.itemCategory = itemNewCategory;
        } catch (Exception e) {
            System.out.println(" Please enter Item's Category in correct String Format ");
        }
    }

    public void markItemAvailable(){
        this.itemAvailability = true;
    }

    public void markItemUnAvailable(){
        this.itemAvailability = false;
    }

    public void changePreparationTime(int newItemPreparationTime){
        try {
            this.itemPreparationTime = newItemPreparationTime;
        } catch (Exception e) {
            System.out.println(" Please enter in correct Integer format Item's preparation time ");
        }
    }

    public void displayMenuItem(){
        System.out.println(" Item Id "+ this.itemId);
        System.out.println(" Item Name "+this.itemName);
        System.out.println(" Item Availability "+this.itemAvailability);
        System.out.println(" Item Price "+this.itemPrice);
        System.out.println(" Item Category "+this.itemCategory);
        System.out.println(" Item Preparation Time "+this.itemPreparationTime);
        System.out.println(" Item Description "+ this.itemDescription);
    }
    
    public MenuItem addMenuItem(){
        System.out.println( " Please enter the Item id ");
        int itemId = sc.nextInt();
        sc.nextLine();
        this.setItemId(itemId);
        System.out.println(" Please enter the name of the Item ");
        String itemName = sc.nextLine();
        this.setItemName(itemName);
        boolean itemAvailability = true;
        this.setItemAvailability(itemAvailability);
        System.out.println(" Please enter the price of an item ");
        double itemPrice = sc.nextDouble();
        sc.nextLine();
        this.setItemPrice(itemPrice);
        System.out.println(" Please enter the Item category ");
        String itemCategory = sc.nextLine();
        this.setItemCategory(itemCategory);
        System.out.println(" Please enter the preparation time of Item ");
        int itemPreparationTime = sc.nextInt();
        sc.nextLine();
        this.setItemPreparationTime(itemPreparationTime);
        System.out.println(" Please enter the Item description ");
        String itemDescription = sc.nextLine();
        this.setItemDescription(itemDescription);
        menuItems[totalMenuItems++] = new MenuItem(itemId, itemName, itemPrice, itemAvailability, itemDescription, itemCategory, itemPreparationTime);
        return menuItems[totalMenuItems-1];
    }

    public MenuItem getMenuItemById(){
    System.out.println(" Please enter the Id for the MenuItem ");
    int id = sc.nextInt();
    boolean found = false;
    MenuItem mt = null;
    for(int i=0;i<menuItems.length;i++){
        if(MenuItem.menuItems[i].getItemId()==id){
            found = true;
            mt = menuItems[i];
        }
    }
    if(!found){
        System.out.println(" Item Not found in menu ");
    }
    return mt;
   }

}

class Order{

    Scanner sc = new Scanner(System.in);

    private int orderId;
    private Customer customer;
    private MenuItem menuItem;
    private Restaurant restaurant;
    private int orderQuantity;
    private double orderTotalAmount;
    private String orderStatus;
    static int totalOrders;

    static Order [] orders = new Order [10];

    public Order(int orderId, Customer customer, MenuItem menuItem, Restaurant restaurant,int orderQuantity,
        double orderTotalAmount,String orderStatus){
    this.orderId = orderId;
    this.customer = customer;
    this.menuItem = menuItem;
    this.restaurant = restaurant;
    this.orderQuantity = orderQuantity;
    this.orderTotalAmount = orderTotalAmount;
    this.orderStatus = orderStatus;
    }

    public void setOrderId(int orderId){
    this.orderId = orderId;
    }

    public void setCustomer(Customer customer){
        if(customer==null){
            System.out.println(" Customer cannot be null ");
        }
        else {
          this.customer = customer;
        }
    }

    public void setMenuItem(MenuItem menuItem){
        if(menuItem==null){
            System.out.println(" Menu item cannot be null ");
        }
        else{
         this.menuItem = menuItem;
        }
    }

    public void setRestaurant(Restaurant restaurant){
        if(restaurant ==null){
        System.out.println(" Restaurant cannot be null ");
        }
        else {
          this.restaurant = restaurant;
        }
    }

    public void setOrderQuantity(int orderQuantity){
        if(orderQuantity>0){
          this.orderQuantity = orderQuantity;
        }
       else {
        System.out.println(" Order quatity should be greater than 0 ");
       }
    }

    public void setOrderTotalAmount(double orderTotalAmount){
        this.orderTotalAmount = orderTotalAmount;
    }

    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }

    public int getOrderId(){
    return this.orderId;
    }

    public Customer getCustomer(){
    return this.customer;
    }

    public MenuItem getMenuItem(MenuItem menuItem){
    return this.menuItem;
    }

    public Restaurant getRestaurant(Restaurant restaurant){
    return this.restaurant;
    }

    public int getOrderQuantity(int orderQuantity){
    return this.orderQuantity;
    }

    public double getOrderTotalAmount(){
        return this.orderTotalAmount;
    }

    public String getOrderStatus(){
        return this.orderStatus;
    }

    public void changeOrderStatus(String newOrderStatus){
     this.orderStatus = newOrderStatus;
    }
 
    public void placeOrder(){  
        //    var customer = new Customer(0,null,0,null);  
        //    var restaurant = new Restaurant(0,null,null,0,0.0,false);
        //    var menuItem = new MenuItem(0,null,0.0,false,null,null,0);
            System.out.println(" Please enter the order ID ");
            int orderId = sc.nextInt();
            sc.nextLine();
            customer.addCustomer();
            menuItem.addMenuItem();
            restaurant.addRestaurant();
            System.out.println(" Please enter the order quantity ");
            int orderQuantity = sc.nextInt();
            sc.nextLine();
            System.out.println( " Please enter order total amount ");
            double orderTotalAmount = sc.nextDouble();
            sc.nextLine();
            for(int i=0;i<MenuItem.menuItems.length;i++){
                if(MenuItem.menuItems[i].getItemAvailability()==false){
                    System.out.println(" The order cannot be placed because Item is not available ");
                }
                else {
                     System.out.println(" Dear Customer your order has placed ");
                     orders[totalOrders++] =
                      new Order(orderId, this.customer, this.menuItem, this.restaurant, orderQuantity, orderTotalAmount, "Pending");
                }
            }
        
    }

    public static int getTotalOrders(){  // static
    return totalOrders;
    }   

    public void changeQuantity(int newQuantity){
        this.orderQuantity = newQuantity;
    }

    public double calculateTotal(){
        return this.orderQuantity*this.menuItem.getItemPrice();
    }

    public void confrimOrder(){
        this.orderStatus = "Confrimed";
    }

    public void cancelOrder(){
        if((this.orderStatus=="delivered")||(this.orderStatus=="Delivered")){
            System.out.println(" The order cannot be cancelled because it has delivered ");
        }
        else {
            System.out.println(" The order has cancelled ");
            this.orderStatus = "Cancelled ";
        }
    }

    public void displayOrderDetails(){
        System.out.println(" Order Id "+ this.orderId);
        System.out.println(" Order Total Amount "+this.orderTotalAmount);
        System.out.println(" Ordered by customer "+this.getCustomer().getCustomerName());
        System.out.println(" Order Quantity "+this.orderQuantity);
        System.out.println(" Order Status "+this.orderStatus);
    }

}

class Main {
    public static void main (String[]args){
   
         System.out.println(" ======================================================== ");
         System.out.println("                  WELCOME TO THE QUICKBITE                ");
         System.out.println(" ======================================================== ");
        Customer.customers[Customer.totalCustomers] = new Customer(0,null,0,null);
        Restaurant.restaurants[Restaurant.totalRestaurants] = new Restaurant(0,null,null,0,0.0,false);
        MenuItem.menuItems[MenuItem.totalMenuItems] = new MenuItem(0,null,0.0,false,null,null,0);
        Customer.customers[Customer.totalCustomers].addCustomer();

        Restaurant.restaurants[Restaurant.totalRestaurants].addRestaurant();
        MenuItem.menuItems[MenuItem.totalMenuItems].addMenuItem();

        Restaurant.restaurants[Restaurant.totalRestaurants-1].displayRestaurantDetails();

            for(int i=0;i<MenuItem.totalMenuItems;i++){
             MenuItem.menuItems[MenuItem.totalMenuItems-1].displayMenuItem();
            }

            Order.orders[Order.totalOrders] = 
            new Order(0, Customer.customers[Customer.totalCustomers-1], MenuItem.menuItems[MenuItem.totalMenuItems-1], 
                Restaurant.restaurants[Restaurant.totalRestaurants-1] ,0, 0.0,null);
                Order.orders[Order.totalOrders].placeOrder();

                 Order.orders[Order.totalOrders-1].displayOrderDetails();

            
         }
         
       
    }

