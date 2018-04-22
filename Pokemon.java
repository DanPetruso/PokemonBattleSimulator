public class Pokemon {

    String name;
    int maxHp, hp, attk, def, spattk, spdef, spd, type;
    Move move1, move2, move3, move4;

    public Pokemon(String name, int hp, int attk, int def, int spattk, int spdef, int spd,
                        int type, Move move1, Move move2, Move move3, Move move4){
        this.name = name;
        this.maxHp = hp;
        this.hp = hp;
        this.attk = attk;
        this.def = def;
        this.spattk = spattk;
        this.spdef = spdef;
        this.spd = spd;
        this.type = type;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public void takeHit(int damage){
        this.hp -= damage;
    }

    public int physDamage(double otherPkmnAttk, Move move){
        Type t = new Type();
        double damage = 2 * 100 / 50 + 2;
        damage = damage * move.power * otherPkmnAttk / this.def;
        damage = damage / 50 + 2;
        if(this.type == move.type)
            damage *= 1.5;
        damage *= t.chart[move.type][this.type];
        return (int) damage;
    }

    public int spclDamage(double otherPkmnSpAttk, Move move){
        Type t = new Type();
        double damage = 2 * 100 / 50 + 2;
        damage = damage * move.power * otherPkmnSpAttk / this.spdef;
        damage = damage / 50 + 2;
        if(this.type == move.type)
            damage *= 1.5;
        damage *= t.chart[move.type][this.type];
        return (int) damage;
    }

}
