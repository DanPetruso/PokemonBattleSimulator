public class Type {
    final static int NORMAL = 0;
    final static int FIRE = 1;
    final static int WATER = 2;
    final static int ELECTRIC = 3;
    final static int GRASS = 4;
    final static int ICE = 5;
    final static int FIGHTING = 6;
    final static int POISON = 7;
    final static int GROUND = 8;
    final static int FLYING = 9;
    final static int PSYCHIC = 10;
    final static int BUG = 11;
    final static int ROCK = 12;
    final static int GHOST = 13;
    final static int DRAGON = 14;
    final static int DARK = 15;
    final static int STEEL = 16;
    final static int FAIRY = 17;

    static double [][] chart;

    public Type(){
        chart = new double[18][18];

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

        chart[ICE][FIRE] = .5;
        chart[ICE][WATER] = .5;
        chart[ICE][GRASS] = 2;
        chart[ICE][ICE] = .5;
        chart[ICE][GROUND] = 2;
        chart[ICE][FLYING] = 2;
        chart[ICE][DRAGON] = 2;
        chart[ICE][STEEL] = .5;

        chart[FIGHTING][NORMAL] = 2;
        chart[FIGHTING][ICE] = 2;
        chart[FIGHTING][POISON] = .5;
        chart[FIGHTING][FLYING] = .5;
        chart[FIGHTING][PSYCHIC] = .5;
        chart[FIGHTING][BUG] = .5;
        chart[FIGHTING][ROCK] = 2;
        chart[FIGHTING][GHOST] = 0;
        chart[FIGHTING][DARK] = 2;
        chart[FIGHTING][STEEL] = 2;
        chart[FIGHTING][FAIRY] = .5;

        chart[POISON][GRASS] = 2;
        chart[POISON][POISON] = .5;
        chart[POISON][GROUND] = .5;
        chart[POISON][ROCK] = .5;
        chart[POISON][GHOST] = .5;
        chart[POISON][STEEL] = 0;
        chart[POISON][FAIRY] = 2;

        chart[GROUND][FIRE] = 2;
        chart[GROUND][ELECTRIC] = 2;
        chart[GROUND][GRASS] = .5;
        chart[GROUND][POISON] = 2;
        chart[GROUND][FLYING] = 0;
        chart[GROUND][BUG] = .5;
        chart[GROUND][ROCK] = 2;
        chart[GROUND][STEEL] = 2;

        chart[FLYING][ELECTRIC] = .5;
        chart[FLYING][GRASS] = 2;
        chart[FLYING][FIGHTING] = 2;
        chart[FLYING][BUG] = 2;
        chart[FLYING][ROCK] = .5;
        chart[FLYING][STEEL] = .5;

        chart[PSYCHIC][FIGHTING] = 2;
        chart[PSYCHIC][POISON] = 2;
        chart[PSYCHIC][PSYCHIC] = .5;
        chart[PSYCHIC][DARK] = 0;
        chart[PSYCHIC][STEEL] = .5;

        chart[BUG][FIRE] = .5;
        chart[BUG][GRASS] = 2;
        chart[BUG][POISON] = .5;
        chart[BUG][FIGHTING] = .5;
        chart[BUG][FLYING] = .5;
        chart[BUG][PSYCHIC] = 2;
        chart[BUG][GHOST] = .5;
        chart[BUG][DARK] = 2;
        chart[BUG][STEEL] = .5;
        chart[BUG][FAIRY] = .5;

        chart[ROCK][FIRE] = 2;
        chart[ROCK][ICE] = 2;
        chart[ROCK][FIGHTING] = .5;
        chart[ROCK][GROUND] = .5;
        chart[ROCK][FLYING] = 2;
        chart[ROCK][BUG] = 2;
        chart[ROCK][STEEL] = .5;

        chart[GHOST][NORMAL] = 0;
        chart[GHOST][PSYCHIC] = 2;
        chart[GHOST][GHOST] = 2;
        chart[GHOST][DARK] = .5;

        chart[DRAGON][DRAGON] = 2;
        chart[DRAGON][STEEL] = .5;
        chart[DRAGON][FAIRY] = 0;

        chart[DARK][FIGHTING] = .5;
        chart[DARK][PSYCHIC] = 2;
        chart[DARK][GHOST] = 2;
        chart[DARK][DARK] = .5;
        chart[DARK][FAIRY] = .5;

        chart[STEEL][FIRE] = .5;
        chart[STEEL][WATER]= .5;
        chart[STEEL][GRASS] = .5;
        chart[STEEL][ICE] = 2;
        chart[STEEL][ROCK] = 2;
        chart[STEEL][STEEL] = .5;
        chart[STEEL][FAIRY] = 2;

        chart[FAIRY][FIRE] = .5;
        chart[FAIRY][FIGHTING] = 2;
        chart[FAIRY][POISON] = .5;
        chart[FAIRY][DRAGON] = 2;
        chart[FAIRY][DARK] = 2;
        chart[FAIRY][STEEL] = .5;


    }
}
