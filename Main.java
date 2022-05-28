package VendiMachineFP;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = null;

        vendingMachine.displayProducts();

        String selectedProduct = scanner.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProduct);

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();

        int[] enteredCoins = {}; //T0D0

        vendingMachine.enterCoins(enteredCoins);
        vendingMachine.displayChangeMessage();
    }
}
