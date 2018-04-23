public class Move {
    String name;
    int power;
    int accuracy;
    int type;
    boolean isPhysical;

    @Override
    public String toString() {
        return this.name;
    }

    public Move(String name, int type, int power, int accuracy, boolean isPhysical){
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.isPhysical = isPhysical;
    }
}
