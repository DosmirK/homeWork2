public abstract class Car implements Printable{
    private int release;
    private String name;
    private double engine;

    public Car(int release, String name, double engine) {
        this.release = release;
        this.name = name;
        this.engine = engine;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}
