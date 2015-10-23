
package table;

public class Table {
    private final String brand;
    private Foot foot;
    private Surface surface;
    private SmallThings smallthings;
    public Table() {
        brand = null;
    }
    public Table(String brand, Foot foot, Surface surface, SmallThings smallthings) {
        this.brand = brand;
        this.foot = foot;
        this.surface = surface;
        this.smallthings = smallthings;
    }

    public String getBrand() {
        return brand;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public Surface getSurface() {
        return surface;
    }

    public void setSurface(Surface surface) {
        this.surface = surface;
    }

    public SmallThings getSmallthings() {
        return smallthings;
    }

    public void setSmallthings(SmallThings smallthings) {
        this.smallthings = smallthings;
    }
    
}
