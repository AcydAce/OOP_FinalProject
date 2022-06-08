package VendiMachineFP;

public enum Coin {;

    private final int value;          // determine the values

    Coin(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    //extracts number in string
    public static int[] parseCoins(String coins) {
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];

        //compares string to an int
        for(int index=0;index<numberCoinsInText.length;index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }


        return result;
    }
}
