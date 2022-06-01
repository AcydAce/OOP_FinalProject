package VendiMachineFP;

public enum Product {               //enum type is a data type that
    TWIC(1,100), COKE(2,50), WATER(3,30), SANDWICH(4,150);    //enables defining a set of constant

    private int id;
    private int price;

    Product(int id, int price){
        this.id = id;               // The Constructor
        this.price = price;
    }

    public int getId(){
        return this.id;
    }

    public int getPrice(){          // Methods
        return this.price;
    }

    public static Product valueOf(int productSelected){
        for(Product product: Product.values(this.selectedProduct));
    }
}
