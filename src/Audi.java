public class Audi extends Car{
    private String driving;

    public Audi(int release, String name, double engine, String driving) {
        super(release, name, engine);
        this.driving = driving;
    }

    public String getDriving() {
        return driving;
    }

    @Override
    public void print() {
        System.out.println("Year of issue: " + getRelease() +
                "\nName: " + getName() +
                "\nEngine capacity: " + getEngine() +
                "\nDrive unit: " + getDriving() +
                "\n__________" );

    }
}
