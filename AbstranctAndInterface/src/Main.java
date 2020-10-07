class Main {
    public static void main(String args[]) {

        Poultry poultry = new BuyPoultry(12,4,84);
        System.out.println(poultry.buyChickens());

        TransportationMode transportationMode = new CheckBudget(400,500,300,1000,500);
        transportationMode.toBeijing();

    }
} 