package VendiMachineFP;

public enum Product {                                                                                 //enum type is a data type that
    CHOCOLATE(1,100), COKE(2,50), WATER(3,30), CHIPS(4,150);       //enables defining a set of constant

    private final int id;
    private final int price;

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
        for (Product product: Product.values()){
            if(productSelected == product.getId()) {
                return product;
            }
        }
        return null;
    }
}
