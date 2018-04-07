public class Pokemon {

    int hp, attk, def, spattk, spdef, spd;
    Move move1, move2, move3, move4;

    public Pokemon(int hp, int attk, int def, int spattk, int spdef, int spd,
                        Move move1, Move move2, Move move3, Move move4){
        this.hp = hp;
        this.attk = attk;
        this.def = def;
        this.spattk = spattk;
        this.spdef = spdef;
        this.spd = spd;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public int physDamage(double otherPkmnAttk, double power){
        double damage = 2 * 100 / 50 + 2;
        damage = damage * power * otherPkmnAttk / this.def;
        damage = damage / 50 + 2;
        return (int) damage;
    }

    public int spclDamage(double otherPkmnSpAttk, double power){
        double damage = 2 * 100 / 50 + 2;
        damage = damage * power * otherPkmnSpAttk / this.spdef;
        damage = damage / 50 + 2;
        return (int) damage;
    }

}
