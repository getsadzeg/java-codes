
package table;


public class Foot {
    private String material;
    private double height;
    private int amount;
    private int price;
    
    public Foot() {
        
    }
    public Foot(String material, double height, int amount, int price) {
        this.material = material;
        this.height = height;
        this.amount = amount;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
