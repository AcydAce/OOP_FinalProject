package VendiMachineFP;

    //encapsulation
public class InteractVendingMachine implements VendingMachine{

    private int selectedProduct;
    private CoinGroup change;

    //The Welcome massage
    @Override
    public void displayProducts() {
        System.out.println("--------------------------------------");
        System.out.println("---------- VENDING  MACHINE ----------");
        System.out.println("--------------------------------------");

        System.out.println("Available Products:");
        System.out.println("\n");

        for (Product product: Product.values()){
            System.out.println("    " + product.getId() + "  " + product.name() + " - Price: " + product.getPrice());
        }

        System.out.println("Select Product:");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println("Please enter coins as instructed");
        System.out.println("5 cents , 10 cents , 20 cents , 50 cents , 100 cents");
        System.out.println("   0          0          0          0           0");
        System.out.println("Example: If you would like to enter 3 twenty cents coins please enter 0,0,3,0,0");
        System.out.println("Please enter coins as instructed above:");
    }

    @Override
    public void enterCoins(int... coins) {
        Calculator calculator = new SecondCalculator();
        Product product = Product.valueOf(this.selectedProduct);
        int total = calculator.calculateTotal(new CoinGroup(coins));

        assert product != null;
        int changeAmount = total - product.getPrice();
        this.change = calculator.calculateChange(changeAmount);
    }

    @Override
    public void displayChangeMessage() {
        System.out.println("Your change is :" + change.getTotal() + " cents are split as follows: ");
        System.out.println(" 100 cents coins: " + change.number100CentsCoins);
        System.out.println(" 50 cents coins: " + change.number50CentsCoins);
        System.out.println(" 20 cents coins: " + change.number20CentsCoins);
        System.out.println(" 10 cents coins: " + change.number10CentsCoins);
        System.out.println(" 5 cents coins: " + change.number5CentsCoins);
        System.out.println("Thank you for purchasing in the vending machine!");
    }
}
