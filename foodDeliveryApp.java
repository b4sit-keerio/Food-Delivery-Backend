class Customer{

   private int customerId;
   private String customerName;
   private long customerPhoneNumber;
   private String customerAddress;
   private static int totalCustomers;
   private boolean accountStatus;

   public Customer(int customerId, String customerName,long customerPhoneNumber,String customerAddress){
    this.customerId = customerId;
    this.customerName = customerName;
    this.customerPhoneNumber =  customerPhoneNumber;
    this.customerAddress = customerAddress;
    this.accountStatus = true;
    totalCustomers++;
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
}

class Restaurant{

  private int restaurantId;
  private String restaurantName;
  private String restaurantLocation;
  private long restaurantContactNumber;
  private double restaurantRating;
  private boolean restaurantIsOpen;
  static int totalRestaurants;

  public Restaurant(int restaurantId,String restaurantName,String restaurantLocation,long restaurantContactNumber,double restaurantRating,boolean restaurantIsOpen){
  this.restaurantId = restaurantId;
  this.restaurantName = restaurantName;
  this.restaurantLocation = restaurantLocation;
  this.restaurantContactNumber = restaurantContactNumber;
  this.restaurantRating = restaurantRating;
  this.restaurantIsOpen = restaurantIsOpen;
  totalRestaurants++;
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
}

class MenuItem{
  
    private int itemId;
    private String itemName;
    private double itemPrice;
    private boolean itemAvailability;
    private String itemDescription;
    private String itemCategory;
    private int itemPreparationTime;
    static int totalMenuItems;

    public MenuItem(int itemId, String itemName, double itemPrice, boolean itemAvailability,String itemDescription,
        String itemCategory,int itemPreparationTime){
    this.itemId = itemId;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemAvailability = itemAvailability;
    this.itemDescription = itemDescription;
    this.itemCategory = itemCategory;
    this.itemPreparationTime = itemPreparationTime;
    totalMenuItems++;
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
    return this.itemId;
    }

    public String getItemName(){
    return this.itemName;
    }

    public double getItemPrice(double itemPrice){
    return this.itemPrice;
    }

    public boolean getItemAvailability(boolean itemAvailability){
    return this.itemAvailability;
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
    
}

class Main {
    public static void main (String[]args){

       
    }

}