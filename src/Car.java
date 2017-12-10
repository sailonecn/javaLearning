/**
 * Created by netli on 2017/11/5.
 */

class Engine {
    public void start (){System.out.println("Engine Start.");}
    public void rev(){}
    public void stop(){}
}

class CarWheel {
    public void inflate(int psi){
        System.out.println("CarWheel Inflate.");
    }
}

class CarWindow {
    public void rollup(){System.out.println("window roll up.");}
    public void rolldown(){}
}

class Door{
    public CarWindow window = new CarWindow();
    public void open(){}
    public void close(){}
}


public class Car {
    public Engine engine = new Engine();
    public CarWheel[] wheel = new CarWheel[4];
    public Door left = new Door(), right = new Door();
    public Car() {
        for(int i = 0; i < 4; i++) {
            wheel[i] = new CarWheel();
        }
        System.out.println("New Car.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rolldown();
        car.wheel[0].inflate(72);
    }
}
