
package ship;


public class Runner {
    public static void main(String[] args) {
        Ship ship = new Ship("Titanic", 3547);
        Ship.Engine engine = ship.new Engine(390);
        Ship.Boat boats = new Ship.Boat(20, 60);
        ship.info();
        engine.start();
        ship.info();
        engine.damage();
        ship.info();
        boats.active(ship.getPassengers());
    }
}
