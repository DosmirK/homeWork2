public class Mercedes extends Car{
    private String klass;

    public Mercedes(int release, String name, double engine, String klass) {
        super(release, name, engine);
        this.klass = klass;
    }

    public String getKlass() {
        return klass;
    }

    @Override
    public void print() {
        System.out.println("Year of issue: " + getRelease() +
                "\nName: " + getName() +
                "\nEngine capacity: " + getEngine() +
                "\nClass: " + getKlass() +
                "\n__________" );

    }
}
