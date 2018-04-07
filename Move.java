public class Move {
    String name;
    int power;
    int accuracy;
    boolean isPhysical;

    public Move(String name, int power, int accuracy, boolean isPhysical){
        this.name = name;
        this.power = power;
        this.accuracy = accuracy;
        this.isPhysical = isPhysical;
    }
}
