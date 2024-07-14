import java.util.ArrayList;

public class Farm {
    private ArrayList<Plant> plants;

    public Farm() {
        plants=new ArrayList<>();
    }



    public void simulateDay() {
        for (int i = 0; i < 6; i++) {
            System.out.println("----GÜN"+(i+1)+"----");
            for (Plant p : plants) {
                p.water();
                p.grow();
                p.harvest();
            }
        }
    }

    public void addPlant(Plant p) {
         plants.add(p);
    }

}
