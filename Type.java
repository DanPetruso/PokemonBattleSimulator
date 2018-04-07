public class Type {
    final int NORMAL = 0;
    final int FIRE = 1;
    final int WATER = 2;
    final int ELECTRIC = 3;
    final int GRASS = 4;
    final int ICE = 5;
    final int FIGHTING = 6;
    final int POISON = 7;
    final int GROUND = 8;
    final int FLYING = 9;
    final int PSYCHIC = 10;
    final int BUG = 11;
    final int ROCK = 12;
    final int GHOST = 13;
    final int DRAGON = 14;
    final int DARK = 15;
    final int STEEL = 16;
    final int FAIRY = 17;

    public Type(){
        double[][] chart = new double[18][18];

        //sets the default value for any type vs any other type to be 1 for neutral damage
        for(int i = 0; i < chart.length; i++){
            for (int j = 0; j < chart.length; j++) {
                chart[i][j] = 1;
            }
        }

        //Attacking on left, defending on right
        chart[NORMAL][ROCK] = .5;
        chart[NORMAL][GHOST] = 0;
        chart[NORMAL][STEEL] = .5;

        chart[FIRE][FIRE] = .5;
        chart[FIRE][WATER] = .5;
        chart[FIRE][GRASS] = 2;
        chart[FIRE][ICE] = 2;
        chart[FIRE][BUG] = 2;
        chart[FIRE][ROCK] = 2;
        chart[FIRE][DRAGON] = .5;
        chart[FIRE][STEEL] = 2;

        chart[WATER][FIRE] = 2;
        chart[WATER][WATER] = .5;
        chart[WATER][GRASS] = .5;
        chart[WATER][GROUND] = 2;
        chart[WATER][ROCK] = 2;
        chart[WATER][DRAGON] = .5;

        chart[ELECTRIC][WATER] = 2;
        chart[ELECTRIC][ELECTRIC] = .5;
        chart[ELECTRIC][GRASS] = .5;
        chart[ELECTRIC][GROUND] = 0;
        chart[ELECTRIC][FLYING] = 2;
        chart[ELECTRIC][DRAGON] = .5;

        chart[GRASS][FIRE] = .5;
        chart[GRASS][WATER] = 2;
        chart[GRASS][GRASS] = .5;
        chart[GRASS][POISON] = .5;
        chart[GRASS][GROUND] = 2;
        chart[GRASS][FLYING] = .5;
        chart[GRASS][BUG] = .5;
        chart[GRASS][ROCK] = 2;
        chart[GRASS][DRAGON] = .5;
        chart[GRASS][STEEL] = .5;

    }
}
