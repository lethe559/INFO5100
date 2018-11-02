package Assignment_7;


class Tool {
    protected int strength;
    protected char type;

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean fight(Tool t) {
        int diff = t.type - this.type;
        switch (diff) {
            case -3:
            case 2:
            case 1:
                return this.strength * 2 >= t.strength;
            case 3:
            case -2:
            case -1:
                return this.strength >= t.strength * 2;
            case 0:
            default:
                return this.strength >= t.strength; //same type case
        }
    }
}

class Scissors extends Tool {
    Scissors(int strength) {
        super.setStrength(strength);
        this.type = 's';
    }
}

class Paper extends Tool {
    Paper(int strength) {
        super.setStrength(strength);
        this.type = 'p';
    }
}

class Rock extends Tool {
    Rock(int strength) {
        super.setStrength(strength);
        this.type = 'r';
    }
}

class RockPaperScissorsGame {
    public static void main(String args[]) {
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15); 
        System.out.println(s.fight(p) + " , "+ p.fight(s) );
        System.out.println(p.fight(r) + " , "+ r.fight(p) );
        System.out.println(r.fight(s) + " , "+ s.fight(r) );
    }
}