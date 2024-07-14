public abstract class Plant implements IPlantActions{
    private String name;
    private int growthTime;
    private boolean isHarvestable;
    public Plant (String name,int growthTime){
        this.name=name;
        this.growthTime=growthTime;
    }
    public abstract void grow();
    public boolean isHarvestable(){
        return isHarvestable;
    }

    public String getName() {
        return name;
    }

    public void setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
    }

    public void setHarvestable(boolean harvestable) {
        isHarvestable = harvestable;
    }

    public int getGrowthTime() {
        return growthTime;
    }
}
