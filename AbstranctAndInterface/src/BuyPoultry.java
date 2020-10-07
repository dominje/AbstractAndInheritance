class BuyPoultry extends Poultry {

    private int priceOfRooster;
    private int priceOfHen;
    private int priceOfChicks;
    private int noOfRooster;
    private int noOfHen;
    private int noOfChicks;

    BuyPoultry(int noOfRooster, int noOfHen, int noOfChicks) {
        super();
        this.noOfRooster = noOfRooster;
        this.noOfHen = noOfHen;
        this.noOfChicks = noOfChicks;
    }

    @Override
    public String buyChickens() {

        priceOfRooster = noOfRooster * 5;
        priceOfHen = noOfHen * 3;
        priceOfChicks = (noOfChicks/3);
        int totalPrice = priceOfRooster + priceOfHen + priceOfChicks;

        if(totalPrice == 100){
            return "total cost of chickens is 100";
        } else if(totalPrice < 100) {
            return ("total cost of chickens is below 100: " + (priceOfRooster + priceOfHen + priceOfChicks));
        } else  {
            return ("total cost of chickens is above 100: " + (priceOfRooster + priceOfHen + priceOfChicks));
        }
    }
}
