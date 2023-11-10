public class BMW extends Car{
    private int speed;

    public BMW(int release, String name, double engine, int speed) {
        super(release, name, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println("Year of issue: " + getRelease() +
                "\nName: " + getName() +
                "\nEngine capacity: " + getEngine() +
                "\nSpeed: " + getSpeed() + " км/ч" +
                "\n__________" );

    }
}
