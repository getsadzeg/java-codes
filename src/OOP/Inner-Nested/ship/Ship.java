
package ship;


public class Ship {
    private String name;
    private int passengers;
    private double speed;
    private boolean move;
    private boolean danger;
    public Ship() {
        
    }
    public Ship(String name, int passengers) {
        this.name = name;
        this.passengers = passengers;
        this.speed = 0.0;
        this.move = false;
        this.danger = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isMove() {
        return move;
    }

    public boolean isDanger() {
        return danger;
    }
    public class Engine {
        private double power;
        public Engine() {
            
        }
        public Engine(double power) {
            this.power = power;
        }

        public double getPower() {
            return power;
        }

        public void setPower(double power) {
            this.power = power;
        }
        public void stop() {
            System.out.println("Engine has turned off");
            Ship.this.move = false;
            Ship.this.speed = 0.0;
        }
        public void start() {
            System.out.println("Engine has turned on");
            Ship.this.move = true;
            Ship.this.speed = power / 10;
        }
        public void damage() {
            System.out.println("Engine has damaged");
            Ship.this.speed = 0.0;
            Ship.this.move = false;
            Ship.this.danger = true;
        }
    }
    public static class Boat {
        private int amount;
        private int space;

        public Boat(int amount, int space) {
            this.amount = amount;
            this.space = space;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getSpace() {
            return space;
        }

        public void setSpace(int space) {
            this.space = space;
        }
        public void active(int passengers) {
            while(passengers>0 && amount > 0 ) {
                passengers = passengers - space;
                amount--;
                System.out.println("გადაიყვანა " + space + "დარჩა " + passengers);
            }
            if(passengers <=0) {
                System.out.println("Everything is fine - all survived");
            }
            else {
                System.out.println(passengers + "Died");
            }
        }
    }
    public void info() {
            System.out.println("information about Ship " + name);
            System.out.println("Passengers amount: " + passengers);
            if(move) {
                System.out.println("Ship is movin' with speed " + speed);
            }
            else {
                System.out.println("Ship is stopped");
            }
            if(danger) {
                System.out.println("Ship is in danger");
            }
            else {
                System.out.println("Ship isn't in danger");
            }
        }
}
