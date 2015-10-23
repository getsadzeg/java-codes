
package table;


public class Surface {
    private String material;
    private double length;
    private double width;
    private int price;
    public Surface() {
        
    }
    public Surface(String material, double length, double width, int price) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.price = price;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
