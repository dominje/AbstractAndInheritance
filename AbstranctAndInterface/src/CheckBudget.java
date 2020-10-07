import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckBudget implements TransportationMode {

    private int planePrice;
    private int carPrice;
    private int busPrice;
    private int trainPrice;
    private int budget;
    private List<Integer> priceList;


    CheckBudget(int trainPrice, int carPrice, int busPrice, int planePrice, int budget){
        this.planePrice = planePrice;
        this.carPrice = carPrice;
        this.busPrice = busPrice;
        this.trainPrice = trainPrice;
        this.budget = budget;
    }

    public void addToPriceList(){
        priceList = new ArrayList<>();
        priceList.add(busPrice);
        priceList.add(carPrice);
        priceList.add(planePrice);
        priceList.add(trainPrice);
    }

    @Override
    public String toBeijing() {
        addToPriceList();
        for (int i = 0; i < priceList.size(); i++) {
            if(priceList.get(i) <=budget){
                switch (i) {
                    case 0:
                        System.out.println("You can travel by Bus");
                        break;
                    case 1:
                        System.out.println("You can travel by Car");
                        break;
                    case 2:
                        System.out.println("You can travel by Plane");
                        break;
                    case 3:
                        System.out.println("You can travel by Train");
                        break;
                }
            }else{
                System.out.println("Budget is below minimum mode of transporation.");
                break;
            }
        }
        return null;
    }

}
