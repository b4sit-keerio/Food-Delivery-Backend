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
    static int updatedMenuItems = 0;

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
            System.out.println(" Please enter the order ID ");
            int orderId = sc.nextInt();
            sc.nextLine();
            System.out.println(" Please enter the order quantity ");
            int orderQuantity = sc.nextInt();
            sc.nextLine();
            double orderTotalAmount = 0.0;
            for(int i=0;i<MenuItem.totalMenuItems;i++){
                if(MenuItem.menuItems[i].getItemId()==this.menuItem.getItemId()){
                 orderTotalAmount = this.menuItem.getItemPrice()*orderQuantity;
                }
            }
            if(this.menuItem.getItemAvailability()==false){
                    System.out.println(" The order cannot be placed because Item is not available ");
                }
                else {
                     System.out.println(" Dear Customer your order has placed ");
                     this.orders[totalOrders++] =
                      new Order(orderId, this.customer, this.menuItem, this.restaurant, orderQuantity, orderTotalAmount, "Pending");
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
           Scanner sc = new Scanner(System.in);
         System.out.println(" ======================================================== ");
         System.out.println("                  WELCOME TO THE QUICKBITE                ");
         System.out.println("                  1. Customer Management                  ");
         System.out.println("                  2. Restaurant Management ");
         System.out.println("                  3. Menu Management                      ");
         System.out.println("                  4. Order Management                     ");
         System.out.println("                  5. Exit                                 ");
         System.out.println(" ======================================================== ");
         System.out.println(" Choose an option : ");
         int optionCustomer;
         int optionRestaurant;
         int optionMenuItem;
         int optionOrder;
         int option1 = sc.nextInt();
         sc.nextLine();
         if(option1==1){
             do{
            System.out.println(" ======================================================== ");
            System.out.println("               1. Register Customer                       ");
            System.out.println("               2. Veiw All Customers                      ");
            System.out.println("               3. Search Customer By Id                   ");
            System.out.println("               4. Update Customer                         ");
            System.out.println("               5. Deactivate Customer                     ");
            System.out.println("               6. Back                                    ");
            System.out.println(" ======================================================== ");
            System.out.println(" Choose an option : ");
             optionCustomer = sc.nextInt();
             sc.nextLine();
             if(optionCustomer==1){
                 Customer.customers[Customer.totalCustomers] = new Customer(0,null,0,null);  
                Customer.customers[Customer.totalCustomers].addCustomer();
                Customer.customers[Customer.totalCustomers] = new Customer(0,null,0,null);  
                Customer.customers[Customer.totalCustomers].addCustomer();
             }
             else if(optionCustomer==2){
                for(int i=0;i<Customer.totalCustomers;i++){
                    Customer.customers[i].displayCustomerDetails();
                    System.out.println();
                }
             }
             else if(optionCustomer==3){
                System.out.println(" Please enter the customer ID ");
                int customerIdForSearch = sc.nextInt();
                sc.nextLine();
                boolean customerFound = false;
                for(int i=0;i<Customer.totalCustomers;i++){
                   if(Customer.customers[i].getCustomerId()==customerIdForSearch){
                     customerFound = true;
                     Customer.customers[i].displayCustomerDetails();
                    }
                }
                  if(!customerFound){
                        System.out.println(" The entered Id is not found ");
                    }
             }
             else if(optionCustomer==4){
                System.out.println(" Please enter the customer ID which you want to update ");
                int idToUpdateCustomer = sc.nextInt();
                sc.nextLine();
                boolean customerFound = false;
                 for(int i=0;i<Customer.totalCustomers;i++){
                   if(Customer.customers[i].getCustomerId()==idToUpdateCustomer){
                     customerFound = true;
                     System.out.println(" Please select which thing you want to update ");//name,phone,address
                     System.out.println(" ======================================================== ");
                     System.out.println("               1. Customer's Name                         ");
                     System.out.println("               2. Customer's Phone Number                 ");
                     System.out.println("               3. Customer's Address                      ");
                     System.out.println(" ======================================================== ");
                     System.out.println(" Please choose an option ");
                     int option14 = sc.nextInt();
                     sc.nextLine();
                     if(option14==1){
                        System.out.println(" Please enter new name ");
                        String customerNewName = sc.nextLine();
                        Customer.customers[i].changeCustomerName(customerNewName);
                     }
                     else if(option14==2){
                        System.out.println(" Please enter new phone number ");
                        long customerNewPhone = sc.nextInt();
                        sc.nextLine();
                        Customer.customers[i].changeCustomerPhoneNumber(customerNewPhone);
                     }
                     else if(option14==3){
                        System.out.println(" Please enter new Address  ");
                        String customerNewAddress = sc.nextLine();
                        Customer.customers[i].changeCustomerAddress(customerNewAddress);
                     }

                    } 
             }
             if(!customerFound){
                       System.out.println(" The Customer doesn't exists "); 
                    }
         }
         else if(optionCustomer==5){
            System.out.println(" Please enter the customer ID which you want to deactivate ");
                int idToDeactivateCustomer = sc.nextInt();
                sc.nextLine();
                boolean customerFound = false;
                   for(int i=0;i<Customer.totalCustomers;i++){
                   if(Customer.customers[i].getCustomerId()==idToDeactivateCustomer){
                     customerFound = true;
                     Customer.customers[i].deActivateCustomerAccount(false);
                    }
                }
                  if(!customerFound){
                        System.out.println(" The entered Id is not found ");
                    }
         }

        }while(optionCustomer!=6);
        
         }

        else if(option1==2){
            do{
            System.out.println(" ======================================================== ");
            System.out.println("                  1. Register Restaurant                  ");
            System.out.println("                  2. Veiw All Restaurants                 ");
            System.out.println("                  3. Search Restaurant                    ");
            System.out.println("                  4. Update Restaurant                    ");
            System.out.println("                  5. Open Restaurant                      ");
            System.out.println("                  6. Close Restaurant                     ");
            System.out.println("                  7. Back                                 ");
            System.out.println(" ======================================================== ");
            optionRestaurant = sc.nextInt();
            sc.nextLine();
            if(optionRestaurant==1){
                              Restaurant.restaurants[Restaurant.totalRestaurants] = new Restaurant(0,null,null,0,0.0,false);
                              Restaurant.restaurants[Restaurant.totalRestaurants].addRestaurant(); //creating a restaurant : 1


                              Restaurant.restaurants[Restaurant.totalRestaurants] = new Restaurant(0,null,null,0,0.0,false);
                              Restaurant.restaurants[Restaurant.totalRestaurants].addRestaurant(); //creating a restaurant : 2
            }
            else if(optionRestaurant==2){
                for(int i=0;i<Restaurant.totalRestaurants;i++){
                    Restaurant.restaurants[i].displayRestaurantDetails();
                    System.out.println();
                }
            }
            else if(optionRestaurant==3){
                System.out.println(" Please enter the Id of the Restaurant ");
                int restaurantId = sc.nextInt();
                sc.nextLine();
                boolean restaurantFound = false;
                   for(int i=0;i<Restaurant.totalRestaurants;i++){
                    if(Restaurant.restaurants[i].getRestaurantId()==restaurantId){
                           restaurantFound = true;
                           Restaurant.restaurants[i].displayRestaurantDetails();
                    }
                }
                if(!restaurantFound){
                    System.out.println(" You have entered INVALID restaurant ID ");
                }
            }
             else if(optionRestaurant==4){
                System.out.println(" Please enter the Restaurant ID which you want to update ");
                boolean restaurantFound = false;
                int restaurantIdforUpdate = sc.nextInt();
                sc.nextLine();
                for(int i=0;i<Restaurant.totalRestaurants;i++){
                    if(Restaurant.restaurants[i].getRestaurantId()==restaurantIdforUpdate){
                        restaurantFound = true;
                    
                        System.out.println(" Please enter which thing you want to update ");
                        System.out.println(" ======================================================== ");
                        System.out.println("               1. Restaurant's Name                         ");
                        System.out.println("               2. Restaurant's Rating                       ");
                        System.out.println("               3. Restaurant's Address                      ");
                        System.out.println(" ========================================================= ");
                        System.out.println(" Please choose an option ");
                        int option41 = sc.nextInt();
                        sc.nextLine();
                        if(option41==1){
                            System.out.println(" Please enter the new name of the restaurant ");
                            String newName = sc.nextLine();
                            Restaurant.restaurants[i].changeRestaurantName(newName);
                        }
                        else if(option41==2){
                            System.out.println(" Please enter the new Rating of the restaurant ");
                            double newRating = sc.nextDouble();
                            Restaurant.restaurants[i].updateRestaurantRating(newRating);
                        }
                        else if (option41==3){
                            System.out.println(" Please enter the new Address of the restaurant ");
                            String newLocation = sc.nextLine();
                            Restaurant.restaurants[i].changeRestaurantLocation(newLocation);
                        }
                    }
                }
                if(!restaurantFound){
                    System.out.println(" The Restaurant has not found in the records ");
                }
             }
             else if(optionRestaurant==5){
                System.out.println(" Please enter the Restaurant ID which you want to open ");
                boolean restaurantFound = false;
                int restaurantIdForOpen = sc.nextInt();
                sc.nextLine();
                for(int i=0;i<Restaurant.totalRestaurants;i++){
                    if(Restaurant.restaurants[i].getRestaurantId()==restaurantIdForOpen){
                        restaurantFound = true;
                        Restaurant.restaurants[i].openRestaurant();
             }
            }
            if(!restaurantFound){
                System.out.println(" The restaurant has not found in the records ");
            }

        }
        else if(optionRestaurant==6){
            System.out.println(" Please enter the Restaurant ID which you want to close ");
                boolean restaurantFound = false;
                int restaurantIdForClose = sc.nextInt();
                sc.nextLine();
                for(int i=0;i<Restaurant.totalRestaurants;i++){
                    if(Restaurant.restaurants[i].getRestaurantId()==restaurantIdForClose){
                        restaurantFound = true;
                        Restaurant.restaurants[i].closeRestaurant();
             }
            }
            if(!restaurantFound){
                System.out.println(" The restaurant has not found in the records ");
            }
        }
    }while(optionRestaurant!=7);
         }
         else if(option1==3){ 
                             System.out.println(" ======================================================== ");
                             System.out.println("                  1. Add Menu Item                        ");
                             System.out.println("                  2. Veiw MenuItem                        ");
                             System.out.println("                  3. Update Price                         ");
                             System.out.println("                  4. Mark Available/UnAvailable           ");
                             System.out.println("                  5. Remove MenuItem                      ");
                             System.out.println("                  6. Back                                 ");
                             System.out.println(" ======================================================== ");
                             System.out.println(" Choose an option ");
                             optionMenuItem = sc.nextInt();
                             sc.nextLine();
                             if(optionMenuItem==1){
                               MenuItem.menuItems[MenuItem.totalMenuItems] = new MenuItem(0,null,0.0,false,null,null,0);
                               MenuItem.menuItems[MenuItem.totalMenuItems].addMenuItem();//creating a MenuItem
                             }
                             else if(optionMenuItem==2){
                                System.out.println(" Please enter the ID of the Item  ");
                                boolean menuItemFound = false;
                                 int menuID = sc.nextInt();
                                 sc.nextLline();
                                 for(int i=0;i<MenuItem.totalMenuItems;i++){
                                    if(MenuItem.menuItems[i].getItemId()==menuID){
                                        menuItemFound = true;
                                        MenuItem.menuItems[i].displayMenuItem();
                                    }
                                 }
                                 if(!menuItemFound){
                                    System.out.println(" You have entered InValid Item ID ");
                                 }
                             }
                             else if(optionMenuItem==3){
                                   System.out.println(" Please enter the ID of the Item for update the Price  ");
                                 boolean menuItemFound = false;
                                 int menuID = sc.nextInt();
                                 sc.nextLline();
                                 for(int i=0;i<MenuItem.totalMenuItems;i++){
                                    if(MenuItem.menuItems[i].getItemId()==menuID){
                                        menuItemFound = true;
                                        System.out.println(" Please enter the new Price of an Item ");
                                        double itemNewPrice = sc.nextDouble();
                                        sc.nextLine();
                                        MenuItem.menuItems[i].updatePrice(itemNewPrice);
                                        System.out.println(" Item's Price Updated successfully ");
                                    }
                                 }
                                 if(!menuItemFound){
                                    System.out.println(" You have entered InValid Item ID ");
                                 }
                             }
                             else if(optionMenuItem==4){
                              System.out.println(" Please enter select an option ");
                              System.out.println(" 1. Mark Available ");
                              System.out.println(" 2. Mark Unavailable ");
                              int optionForAvailability = sc.nextInt();
                              sc.nextLine();
                              if(optionForAvailability==1){
                                System.out.println(" Please enter the ID of an item ");
                                boolean itemFound = false; 
                                int itemID = sc.nextInt();
                                sc.nextLine();
                                for(int i=0;i<MenuItem.totalMenuItems;i++){
                                    if(MenuItem.menuItems[i].getItemId()==itemID){
                                        MenuItem.menuItems[i].markItemAvailable();
                                        itemFound = true; 
                                    }
                                }
                                if(!itemFound){
                                    System.out.println(" You have entered Invalid Item ID ");
                                }
                              }
                              else if(optionForAvailability==2){
                                System.out.println(" Please enter the ID of an item ");
                                boolean itemFound = false; 
                                int itemID = sc.nextInt();
                                sc.nextLine();
                                for(int i=0;i<MenuItem.totalMenuItems;i++){
                                    if(MenuItem.menuItems[i].getItemId()==itemID){
                                        MenuItem.menuItems[i].markItemUnAvailable();
                                        itemFound = true; 
                                    }
                                }
                                if(!itemFound){
                                    System.out.println(" You have entered Invalid Item ID ");
                                }
                              }
                             }
                             else if(optionMenuItem==5){
                                System.out.println(" Please enter the ID of an item Which you want to remove ");
                                boolean itemFound = false; 
                                int itemID = sc.nextInt();
                                sc.nextLine();
                                for(int i=0;i<MenuItem.totalMenuItems;i++){
                                    if(MenuItem.menuItems[i].getItemId()==itemID){
                                        MenuItem.menuItems[i] = null;
                                        itemFound = true; 
                                    }
                                }
                                 for(int i=0;i<MenuItem.totalMenuItems-1;i++){
                                    if(MenuItem.menuItems[i]==null){
                                        MenuItem.menuItems[i] = MenuItem.menuItems[i+1];
                                    }
                                }
                                  for(int i=0;i<MenuItem.totalMenuItems-1;i++){
                                    if(MenuItem.menuItems[i]!=null){
                                        MenuItem.menuItems[i] = MenuItem.menuItems[i+1];
                                          MenuItem.updatedMenuItems++;
                                    }
                                }
                                 MenuItem.totalMenuItems = MenuItem.updatedMenuItems;
                                if(!itemFound){
                                    System.out.println(" You have entered Invalid Item ID ");
                                }
                             }

         }while(optionMenuItem!=6); 

        else if(option1==4){
            do{
             System.out.println(" ======================================================== ");
             System.out.prinln("                       1. Place Order                         ");
             System.out.println("                    2. Veiw All Orders                     ");
             System.out.println("                    3. Search Order                        ");
             System.out.println("                    4. Confrim Order                       ");
             System.out.println("                    5. Cancel Order                        ");
             System.out.println("                    6. Back                                ");
             System.out.println(" ======================================================== ");
             System.out.println(" Choose an Option : ");
             optionOrder = sc.nextInt();
             sc.nextLine();
             if(optionOrder==1){
                 Order.orders[Order.totalOrders] = 
            new Order(0, Customer.customers[Customer.totalCustomers-1], MenuItem.menuItems[MenuItem.totalMenuItems-1], 
                Restaurant.restaurants[Restaurant.totalRestaurants-1] ,0, 0.0,null);
                Order.orders[Order.totalOrders].placeOrder();
                //  Order.orders[Order.totalOrders-1].displayOrderDetails();
             }
        }while(optionOrder!=6);
    }
        
    
       
        MenuItem.menuItems[MenuItem.totalMenuItems] = new MenuItem(0,null,0.0,false,null,null,0);
        MenuItem.menuItems[MenuItem.totalMenuItems].addMenuItem();
        MenuItem.menuItems[MenuItem.totalMenuItems] = new MenuItem(0,null,0.0,false,null,null,0);
        MenuItem.menuItems[MenuItem.totalMenuItems].addMenuItem();
        MenuItem.menuItems[MenuItem.totalMenuItems] = new MenuItem(0,null,0.0,false,null,null,0);
        MenuItem.menuItems[MenuItem.totalMenuItems].addMenuItem();
        Restaurant.restaurants[Restaurant.totalRestaurants-1].displayRestaurantDetails();

            for(int i=0;i<MenuItem.totalMenuItems;i++){
             MenuItem.menuItems[i].displayMenuItem();
            }

            for (int i=0;i<Restaurant.totalRestaurants;i++) {
                Restaurant.restaurants[i].displayRestaurantDetails();
            }
         
       
    }

}