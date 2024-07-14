public class CarrotPlant extends Plant {
    private int waterLevel=0;
    public CarrotPlant(String name, int growthTime) {
        super(name, growthTime);
    }

    @Override
    public void grow() {
        System.out.println(getName()+" yetişiyor. Yetişme süresi: "+waterLevel+"/"+getGrowthTime());

    }

    @Override
    public void water() {
        waterLevel+=1;
    }

    @Override
    public void harvest() {
        if (waterLevel % getGrowthTime()==0) {
            System.out.println(getName() + " hasat edilmeye hazır.");
            System.out.println(getName() + " başarı ile hasat edildi.");
            waterLevel=0;
        } else if (waterLevel != getGrowthTime())
            System.out.println(getName() + " hasat edilmeye hazır değil.");

    }
}

