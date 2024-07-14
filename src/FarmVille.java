public class FarmVille {

    public static void main(String[] args) {
        Plant domates = new TomatoPlant("Domates", 3);
        Plant havuç = new CarrotPlant("Havuç", 5);
        Farm farm = new Farm();
        farm.addPlant(domates);
        farm.addPlant(havuç);
        farm.simulateDay();
    }
}