
package country;


public class Runner {
    public static void main(String[] args) {
        City Capital = new City("Tbilisi", 1000000, 350);
        City Cities[] = new City[4];
        int areaCount = 0;
        int populationCount = 0;
        Cities[0] = new City("Gori", 54700, 17);
        Cities[1] = new City("Kutaisi", 200611, 82);
        Cities[2] = new City("Batumi", 154100, 65);
        Cities[3] = new City("Rustavi", 122900, 60);
        Country Georgia = new Country("Georgia", Capital, Cities);
        for(int i=0; i<4; i++) {
            areaCount = Georgia.areaCount(i, areaCount);
            populationCount = Georgia.populationCount(i, populationCount);
        }
        System.out.println("Country Area: " + (areaCount + Capital.getArea()));
        System.out.println("Country Population: " + (populationCount + Capital.getPopulation()));
    }
}
