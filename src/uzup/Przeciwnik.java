package uzup;

public class Przeciwnik {
    private int HP;
    private int Def;
    private int of;

    public Przeciwnik(int HP , int Def, int of){
        this.HP=HP;
        this.Def=Def;
        this.of=of;
    }

    public int getOf() {
        return of;
    }

    public int getHP() {
        return HP;
    }

    public int getDef() {
        return Def;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
